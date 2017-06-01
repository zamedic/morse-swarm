gem_package 'chef-vault' do
  clear_sources true
  version '2.9.1'
  gem_binary '/opt/chef/embedded/bin/gem'
end.run_action(:install)

include_recipe 'chef-vault'

execute 'pkill java' do
  returns [0, 1]
end

include_recipe 'java'
include_recipe 'maven'

directory node['morse_swarm']['dir'] do
  action :create
  recursive true
end

include_recipe 'morse_swarm::config_files'

maven 'swarm' do
  group_id   'com.marcarndt.morse'
  version    "#{node['applications']['swarm']}"
  dest       "#{node['morse_swarm']['dir']}"
  classifier 'swarm'
  action     :put
end

execute "java  -jar #{node['morse_swarm']['dir']}/swarm.jar -s#{node['morse_swarm']['dir']}#{node['morse_swarm']['application_yml']}  > /var/log/morse_monkey.log &"

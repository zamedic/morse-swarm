docker_installation 'default' do
  action :create
end
secrets = get_project_secrets

execute "docker login -u zamedic -p #{secrets['docker-password']}"
execute "docker build -t morse_swarm #{node['delivery']['workspace']['repo']}/"
execute 'docker tag morse_swarm zamedic/morse_swarm'
execute 'docker push zamedic/morse_swarm'

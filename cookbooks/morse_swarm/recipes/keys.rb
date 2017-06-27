item = chef_vault_item('morse_swarm', 'keys')

file "#{node['morse_swarm']['dir']}/chef.pem" do
  content item['chef']
  mode '0400'
end

file "#{node['morse_swarm']['dir']}/ssh.pem" do
  content item['ssh']
  mode '0400'
end
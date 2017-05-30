item = chef_vault_item('morse_monkey', 'keys')

file "#{node['morse_monkey_cookbook']['dir']}/chef.pem" do
  content item['chef']
  mode '0400'
end

file "#{node['morse_monkey_cookbook']['dir']}/ssh.pem" do
  content item['ssh']
  mode '0400'
end
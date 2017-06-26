bots = chef_vault_item('morse_swarm', 'bots')
config = data_bag_item('morse_swarm', node.chef_environment)
mongo = chef_vault_item('morse_swarm', 'mongo')

template "#{node['morse_swarm']['dir']}/#{node['morse_swarm']['application_yml']}" do
  source 'morse_swarm.erb'
  variables ({
      dto: node,
      bot_key: bots[config['bot']['databag_secret_key_field']],
      data_bag: config,
      mongo_password: mongo[config['bot']['databag_secret_key_field']]
  })
end


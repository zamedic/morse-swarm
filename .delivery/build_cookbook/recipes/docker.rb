docker_installation 'default' do
  action :create
end
secrets = get_project_secrets

docker_registry 'https://index.docker.io/v1/' do
  username 'zamedic'
  password secrets['docker-password']
  email 'marc@marcarndt.com'
end

execute "docker build -t morse_swarm #{node['delivery']['workspace']['repo']}/Dockerfile"
execute 'docker tag morse_swarm zamedic/morse_swarm'
execute 'docker push zamedic/morse_swarm'

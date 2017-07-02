docker_installation 'default' do
  action :create
end
secrets = get_project_secrets

docker_registry 'https://index.docker.io/v1/' do
  username 'zamedic'
  password secrets['docker-password']
  email 'marc@marcarndt.com'
end

docker_image 'morse_swarm' do
  tag version_number
  source "#{node['delivery']['workspace']['repo']}/Dockerfile"
  action :build
end

docker_image 'morse_swarm' do
  repo 'zamedic'
  tag version_number
  action :push
end
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
  source "#{node['delivery']['workspace']['repo']}/Dockerfile"
  action :build
end

docker_tag 'mosr swarm tag' do
  target_repo 'morse_swarm'
  to_tag pom_version_no_snapshot()
  to_repo 'zamedic/morse_swarm'
  action :tag
end

docker_image 'morse_swarm' do
  repo 'zamedic/morse_swarm'
  tag pom_version_no_snapshot()
  action :push
end
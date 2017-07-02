#
# Cookbook Name:: build_cookbook
# Recipe:: publish
#
# Copyright (c) 2017 The Authors, All Rights Reserved.
secrets = get_project_secrets

docker_installation 'default' do
  action :create
end

docker_registry 'https://index.docker.io/v1/' do
  username 'zamedic'
  password secrets['docker-password']
  email 'marc@marcarndt.com'
end

docker_image 'morse_swarm' do
  tag 'morse_swarm'
  source "#{node['delivery']['workspace']['repo']}/Dockerfile"
  action :build
end

docker_image 'morse_swarm' do
  action :push
end



include_recipe 'maven_sonatype_truck::publish'


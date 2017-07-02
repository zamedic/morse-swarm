#
# Cookbook Name:: build_cookbook
# Recipe:: default
#
# Copyright (c) 2017 The Authors, All Rights Reserved.
include_recipe 'maven_sonatype_truck::default'

docker_installation 'default' do
  action :create
end
secrets = get_project_secrets

docker_registry 'https://index.docker.io/v1/' do
  username 'zamedic'
  password secrets['docker-password']
  email 'marc@marcarndt.com'
end
#
# Cookbook Name:: build_cookbook
# Recipe:: publish
#
# Copyright (c) 2017 The Authors, All Rights Reserved.

docker_image 'morse_swarm' do
  tag 'morse_swarm'
  source "#{node['delivery']['workspace']['repo']}/Dockerfile"
  action :build
end

docker_image 'morse_swarm' do
  action :push
end



include_recipe 'maven_sonatype_truck::publish'


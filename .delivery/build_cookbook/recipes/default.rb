#
# Cookbook Name:: build_cookbook
# Recipe:: default
#
# Copyright (c) 2017 The Authors, All Rights Reserved.
include_recipe 'maven_sonatype_truck::default'

if(node['delivery']['change']['stage'] == 'acceptance' && node['delivery']['change']['phase'] == 'provision')
  include_recipe 'build_cookbook::docker'
end
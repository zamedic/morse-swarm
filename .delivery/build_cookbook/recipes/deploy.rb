#
# Cookbook Name:: build_cookbook
# Recipe:: deploy
#
# Copyright (c) 2017 The Authors, All Rights Reserved.
include_recipe 'maven_sonatype_truck::deploy'


node['delivery']['change']['phase']
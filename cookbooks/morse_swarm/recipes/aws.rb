remote_file "#{Chef::Config[:file_cache_path]}/xray.rpm" do
  source 'https://s3.dualstack.us-east-1.amazonaws.com/aws-xray-assets.us-east-1/xray-daemon/aws-xray-daemon-2.x.rpm'
end

execute "yum install -y #{Chef::Config[:file_cache_path]}/xray.rpm" do
  returns [0,1]
end

package 'awslogs'


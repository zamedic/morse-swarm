remote_file '/tmp/xray.rpm' do
  source ' https://s3.dualstack.us-east-1.amazonaws.com/aws-xray-assets.us-east-1/xray-daemon/aws-xray-daemon-2.x.rpm'
end

execute 'yum install -y /tmp/xray.rpm'

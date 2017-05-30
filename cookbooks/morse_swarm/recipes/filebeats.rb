filebeat_prospector 'morse_monkey_log' do
  paths ['/var/log/morse_monkey.log']
  document_type 'log'
  ignore_older '24h'
  scan_frequency '15s'
  harvester_buffer_size 16384
end
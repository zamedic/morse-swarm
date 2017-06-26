name             'morse_swarm'
maintainer       'Marc Arndt'
maintainer_email 'marc@marcarndt.com'
license          'MIT'
description      'Installs/Configures Morse Swarm'
long_description IO.read(File.join(File.dirname(__FILE__), 'README.md'))
version          '1.1.1'

chef_version '>= 12.5' if respond_to?(:chef_version)


supports 'centos'
supports 'redhat'
supports 'ubuntu'

issues_url 'https://github.com/zamedic/morse-swarm/issues'
source_url 'https://github.com/zamedic/morse-swarm'

depends 'chef-vault'
depends 'java'
depends 'maven'




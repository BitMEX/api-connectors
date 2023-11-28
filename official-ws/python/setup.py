#!/usr/bin/env python
from setuptools import setup
from os.path import join, dirname

here = dirname(__file__)

setup(name='bitmex-ws',
      version='1.5.0',
      description='Sample adapter for connecting to the BitMEX Websocket API.',
      long_description=open(join(here, 'README.md')).read(),
      author='Samuel Reed',
      author_email='sam@bitmex.com',
      url='',
      install_requires=[
          'websocket-client==1.6.4',
      ],
      packages=['', 'util'],
      )

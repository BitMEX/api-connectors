#!/usr/bin/env python
from setuptools import setup
from os.path import join, dirname

here = dirname(__file__)

setup(name='bitmex-ws',
      version='0.3.1',
      description='Sample adapter for connecting to the BitMEX Websocket API.',
      long_description=open(join(here, 'README.md')).read(),
      author='Samuel Reed',
      author_email='sam@bitmex.com',
      url='',
      install_requires=[
          'websocket-client==0.46.0',
      ],
      packages=['', 'util'],
      )

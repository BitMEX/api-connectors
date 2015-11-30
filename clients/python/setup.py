# coding: utf-8

import sys
from setuptools import setup, find_packages

NAME = "swagger_client"
VERSION = "1.0.0"



# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = ["urllib3 >= 1.10", "six >= 1.9", "certifi", "python-dateutil"]

setup(
    name=NAME,
    version=VERSION,
    description="BitMEX API",
    author_email="support@bitmex.com",
    url="",
    keywords=["Swagger", "BitMEX API"],
    install_requires=REQUIRES,
    packages=find_packages(),
    include_package_data=True,
    long_description="""\
    REST API for the BitMEX.com trading platform.&lt;br&gt;&lt;br&gt;&lt;a href=\&quot;/app/restAPI\&quot;&gt;REST Documentation&lt;/a&gt;&lt;br&gt;&lt;a href=\&quot;/app/wsAPI\&quot;&gt;Websocket Documentation&lt;/a&gt;
    """
)



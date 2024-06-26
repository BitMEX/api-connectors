# coding: utf-8

"""
    BitMEX API

    ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section.   # noqa: E501

    OpenAPI spec version: 1.2.0
    Contact: support@bitmex.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from swagger_client.configuration import Configuration


class Stats(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'root_symbol': 'str',
        'currency': 'str',
        'volume24h': 'int',
        'turnover24h': 'int',
        'open_interest': 'int',
        'open_value': 'int'
    }

    attribute_map = {
        'root_symbol': 'rootSymbol',
        'currency': 'currency',
        'volume24h': 'volume24h',
        'turnover24h': 'turnover24h',
        'open_interest': 'openInterest',
        'open_value': 'openValue'
    }

    def __init__(self, root_symbol=None, currency=None, volume24h=None, turnover24h=None, open_interest=None, open_value=None, _configuration=None):  # noqa: E501
        """Stats - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._root_symbol = None
        self._currency = None
        self._volume24h = None
        self._turnover24h = None
        self._open_interest = None
        self._open_value = None
        self.discriminator = None

        self.root_symbol = root_symbol
        if currency is not None:
            self.currency = currency
        if volume24h is not None:
            self.volume24h = volume24h
        if turnover24h is not None:
            self.turnover24h = turnover24h
        if open_interest is not None:
            self.open_interest = open_interest
        if open_value is not None:
            self.open_value = open_value

    @property
    def root_symbol(self):
        """Gets the root_symbol of this Stats.  # noqa: E501


        :return: The root_symbol of this Stats.  # noqa: E501
        :rtype: str
        """
        return self._root_symbol

    @root_symbol.setter
    def root_symbol(self, root_symbol):
        """Sets the root_symbol of this Stats.


        :param root_symbol: The root_symbol of this Stats.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and root_symbol is None:
            raise ValueError("Invalid value for `root_symbol`, must not be `None`")  # noqa: E501

        self._root_symbol = root_symbol

    @property
    def currency(self):
        """Gets the currency of this Stats.  # noqa: E501


        :return: The currency of this Stats.  # noqa: E501
        :rtype: str
        """
        return self._currency

    @currency.setter
    def currency(self, currency):
        """Sets the currency of this Stats.


        :param currency: The currency of this Stats.  # noqa: E501
        :type: str
        """

        self._currency = currency

    @property
    def volume24h(self):
        """Gets the volume24h of this Stats.  # noqa: E501


        :return: The volume24h of this Stats.  # noqa: E501
        :rtype: int
        """
        return self._volume24h

    @volume24h.setter
    def volume24h(self, volume24h):
        """Sets the volume24h of this Stats.


        :param volume24h: The volume24h of this Stats.  # noqa: E501
        :type: int
        """

        self._volume24h = volume24h

    @property
    def turnover24h(self):
        """Gets the turnover24h of this Stats.  # noqa: E501


        :return: The turnover24h of this Stats.  # noqa: E501
        :rtype: int
        """
        return self._turnover24h

    @turnover24h.setter
    def turnover24h(self, turnover24h):
        """Sets the turnover24h of this Stats.


        :param turnover24h: The turnover24h of this Stats.  # noqa: E501
        :type: int
        """

        self._turnover24h = turnover24h

    @property
    def open_interest(self):
        """Gets the open_interest of this Stats.  # noqa: E501


        :return: The open_interest of this Stats.  # noqa: E501
        :rtype: int
        """
        return self._open_interest

    @open_interest.setter
    def open_interest(self, open_interest):
        """Sets the open_interest of this Stats.


        :param open_interest: The open_interest of this Stats.  # noqa: E501
        :type: int
        """

        self._open_interest = open_interest

    @property
    def open_value(self):
        """Gets the open_value of this Stats.  # noqa: E501


        :return: The open_value of this Stats.  # noqa: E501
        :rtype: int
        """
        return self._open_value

    @open_value.setter
    def open_value(self, open_value):
        """Sets the open_value of this Stats.


        :param open_value: The open_value of this Stats.  # noqa: E501
        :type: int
        """

        self._open_value = open_value

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(Stats, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Stats):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Stats):
            return True

        return self.to_dict() != other.to_dict()

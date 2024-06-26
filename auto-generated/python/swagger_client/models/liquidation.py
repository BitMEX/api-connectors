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


class Liquidation(object):
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
        'order_id': 'str',
        'symbol': 'str',
        'side': 'str',
        'price': 'float',
        'leaves_qty': 'int'
    }

    attribute_map = {
        'order_id': 'orderID',
        'symbol': 'symbol',
        'side': 'side',
        'price': 'price',
        'leaves_qty': 'leavesQty'
    }

    def __init__(self, order_id=None, symbol=None, side=None, price=None, leaves_qty=None, _configuration=None):  # noqa: E501
        """Liquidation - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._order_id = None
        self._symbol = None
        self._side = None
        self._price = None
        self._leaves_qty = None
        self.discriminator = None

        self.order_id = order_id
        if symbol is not None:
            self.symbol = symbol
        if side is not None:
            self.side = side
        if price is not None:
            self.price = price
        if leaves_qty is not None:
            self.leaves_qty = leaves_qty

    @property
    def order_id(self):
        """Gets the order_id of this Liquidation.  # noqa: E501


        :return: The order_id of this Liquidation.  # noqa: E501
        :rtype: str
        """
        return self._order_id

    @order_id.setter
    def order_id(self, order_id):
        """Sets the order_id of this Liquidation.


        :param order_id: The order_id of this Liquidation.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and order_id is None:
            raise ValueError("Invalid value for `order_id`, must not be `None`")  # noqa: E501

        self._order_id = order_id

    @property
    def symbol(self):
        """Gets the symbol of this Liquidation.  # noqa: E501


        :return: The symbol of this Liquidation.  # noqa: E501
        :rtype: str
        """
        return self._symbol

    @symbol.setter
    def symbol(self, symbol):
        """Sets the symbol of this Liquidation.


        :param symbol: The symbol of this Liquidation.  # noqa: E501
        :type: str
        """

        self._symbol = symbol

    @property
    def side(self):
        """Gets the side of this Liquidation.  # noqa: E501


        :return: The side of this Liquidation.  # noqa: E501
        :rtype: str
        """
        return self._side

    @side.setter
    def side(self, side):
        """Sets the side of this Liquidation.


        :param side: The side of this Liquidation.  # noqa: E501
        :type: str
        """

        self._side = side

    @property
    def price(self):
        """Gets the price of this Liquidation.  # noqa: E501


        :return: The price of this Liquidation.  # noqa: E501
        :rtype: float
        """
        return self._price

    @price.setter
    def price(self, price):
        """Sets the price of this Liquidation.


        :param price: The price of this Liquidation.  # noqa: E501
        :type: float
        """

        self._price = price

    @property
    def leaves_qty(self):
        """Gets the leaves_qty of this Liquidation.  # noqa: E501


        :return: The leaves_qty of this Liquidation.  # noqa: E501
        :rtype: int
        """
        return self._leaves_qty

    @leaves_qty.setter
    def leaves_qty(self, leaves_qty):
        """Sets the leaves_qty of this Liquidation.


        :param leaves_qty: The leaves_qty of this Liquidation.  # noqa: E501
        :type: int
        """

        self._leaves_qty = leaves_qty

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
        if issubclass(Liquidation, dict):
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
        if not isinstance(other, Liquidation):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Liquidation):
            return True

        return self.to_dict() != other.to_dict()

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


class Announcement(object):
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
        'id': 'int',
        'link': 'str',
        'title': 'str',
        'content': 'str',
        '_date': 'datetime'
    }

    attribute_map = {
        'id': 'id',
        'link': 'link',
        'title': 'title',
        'content': 'content',
        '_date': 'date'
    }

    def __init__(self, id=None, link=None, title=None, content=None, _date=None, _configuration=None):  # noqa: E501
        """Announcement - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._id = None
        self._link = None
        self._title = None
        self._content = None
        self.__date = None
        self.discriminator = None

        self.id = id
        if link is not None:
            self.link = link
        if title is not None:
            self.title = title
        if content is not None:
            self.content = content
        if _date is not None:
            self._date = _date

    @property
    def id(self):
        """Gets the id of this Announcement.  # noqa: E501


        :return: The id of this Announcement.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Announcement.


        :param id: The id of this Announcement.  # noqa: E501
        :type: int
        """
        if self._configuration.client_side_validation and id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def link(self):
        """Gets the link of this Announcement.  # noqa: E501


        :return: The link of this Announcement.  # noqa: E501
        :rtype: str
        """
        return self._link

    @link.setter
    def link(self, link):
        """Sets the link of this Announcement.


        :param link: The link of this Announcement.  # noqa: E501
        :type: str
        """

        self._link = link

    @property
    def title(self):
        """Gets the title of this Announcement.  # noqa: E501


        :return: The title of this Announcement.  # noqa: E501
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this Announcement.


        :param title: The title of this Announcement.  # noqa: E501
        :type: str
        """

        self._title = title

    @property
    def content(self):
        """Gets the content of this Announcement.  # noqa: E501


        :return: The content of this Announcement.  # noqa: E501
        :rtype: str
        """
        return self._content

    @content.setter
    def content(self, content):
        """Sets the content of this Announcement.


        :param content: The content of this Announcement.  # noqa: E501
        :type: str
        """

        self._content = content

    @property
    def _date(self):
        """Gets the _date of this Announcement.  # noqa: E501


        :return: The _date of this Announcement.  # noqa: E501
        :rtype: datetime
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this Announcement.


        :param _date: The _date of this Announcement.  # noqa: E501
        :type: datetime
        """

        self.__date = _date

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
        if issubclass(Announcement, dict):
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
        if not isinstance(other, Announcement):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Announcement):
            return True

        return self.to_dict() != other.to_dict()

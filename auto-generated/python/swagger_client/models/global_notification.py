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


class GlobalNotification(object):
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
        '_date': 'datetime',
        'title': 'str',
        'body': 'str',
        'ttl': 'int',
        'type': 'str',
        'closable': 'bool',
        'persist': 'bool',
        'wait_for_visibility': 'bool',
        'sound': 'str'
    }

    attribute_map = {
        'id': 'id',
        '_date': 'date',
        'title': 'title',
        'body': 'body',
        'ttl': 'ttl',
        'type': 'type',
        'closable': 'closable',
        'persist': 'persist',
        'wait_for_visibility': 'waitForVisibility',
        'sound': 'sound'
    }

    def __init__(self, id=None, _date=None, title=None, body=None, ttl=None, type=None, closable=True, persist=True, wait_for_visibility=True, sound=None, _configuration=None):  # noqa: E501
        """GlobalNotification - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._id = None
        self.__date = None
        self._title = None
        self._body = None
        self._ttl = None
        self._type = None
        self._closable = None
        self._persist = None
        self._wait_for_visibility = None
        self._sound = None
        self.discriminator = None

        if id is not None:
            self.id = id
        self._date = _date
        self.title = title
        self.body = body
        self.ttl = ttl
        if type is not None:
            self.type = type
        if closable is not None:
            self.closable = closable
        if persist is not None:
            self.persist = persist
        if wait_for_visibility is not None:
            self.wait_for_visibility = wait_for_visibility
        if sound is not None:
            self.sound = sound

    @property
    def id(self):
        """Gets the id of this GlobalNotification.  # noqa: E501


        :return: The id of this GlobalNotification.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this GlobalNotification.


        :param id: The id of this GlobalNotification.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def _date(self):
        """Gets the _date of this GlobalNotification.  # noqa: E501


        :return: The _date of this GlobalNotification.  # noqa: E501
        :rtype: datetime
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this GlobalNotification.


        :param _date: The _date of this GlobalNotification.  # noqa: E501
        :type: datetime
        """
        if self._configuration.client_side_validation and _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def title(self):
        """Gets the title of this GlobalNotification.  # noqa: E501


        :return: The title of this GlobalNotification.  # noqa: E501
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this GlobalNotification.


        :param title: The title of this GlobalNotification.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and title is None:
            raise ValueError("Invalid value for `title`, must not be `None`")  # noqa: E501

        self._title = title

    @property
    def body(self):
        """Gets the body of this GlobalNotification.  # noqa: E501


        :return: The body of this GlobalNotification.  # noqa: E501
        :rtype: str
        """
        return self._body

    @body.setter
    def body(self, body):
        """Sets the body of this GlobalNotification.


        :param body: The body of this GlobalNotification.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and body is None:
            raise ValueError("Invalid value for `body`, must not be `None`")  # noqa: E501

        self._body = body

    @property
    def ttl(self):
        """Gets the ttl of this GlobalNotification.  # noqa: E501


        :return: The ttl of this GlobalNotification.  # noqa: E501
        :rtype: int
        """
        return self._ttl

    @ttl.setter
    def ttl(self, ttl):
        """Sets the ttl of this GlobalNotification.


        :param ttl: The ttl of this GlobalNotification.  # noqa: E501
        :type: int
        """
        if self._configuration.client_side_validation and ttl is None:
            raise ValueError("Invalid value for `ttl`, must not be `None`")  # noqa: E501

        self._ttl = ttl

    @property
    def type(self):
        """Gets the type of this GlobalNotification.  # noqa: E501


        :return: The type of this GlobalNotification.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this GlobalNotification.


        :param type: The type of this GlobalNotification.  # noqa: E501
        :type: str
        """
        allowed_values = ["success", "error", "info"]  # noqa: E501
        if (self._configuration.client_side_validation and
                type not in allowed_values):
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"  # noqa: E501
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def closable(self):
        """Gets the closable of this GlobalNotification.  # noqa: E501


        :return: The closable of this GlobalNotification.  # noqa: E501
        :rtype: bool
        """
        return self._closable

    @closable.setter
    def closable(self, closable):
        """Sets the closable of this GlobalNotification.


        :param closable: The closable of this GlobalNotification.  # noqa: E501
        :type: bool
        """

        self._closable = closable

    @property
    def persist(self):
        """Gets the persist of this GlobalNotification.  # noqa: E501


        :return: The persist of this GlobalNotification.  # noqa: E501
        :rtype: bool
        """
        return self._persist

    @persist.setter
    def persist(self, persist):
        """Sets the persist of this GlobalNotification.


        :param persist: The persist of this GlobalNotification.  # noqa: E501
        :type: bool
        """

        self._persist = persist

    @property
    def wait_for_visibility(self):
        """Gets the wait_for_visibility of this GlobalNotification.  # noqa: E501


        :return: The wait_for_visibility of this GlobalNotification.  # noqa: E501
        :rtype: bool
        """
        return self._wait_for_visibility

    @wait_for_visibility.setter
    def wait_for_visibility(self, wait_for_visibility):
        """Sets the wait_for_visibility of this GlobalNotification.


        :param wait_for_visibility: The wait_for_visibility of this GlobalNotification.  # noqa: E501
        :type: bool
        """

        self._wait_for_visibility = wait_for_visibility

    @property
    def sound(self):
        """Gets the sound of this GlobalNotification.  # noqa: E501


        :return: The sound of this GlobalNotification.  # noqa: E501
        :rtype: str
        """
        return self._sound

    @sound.setter
    def sound(self, sound):
        """Sets the sound of this GlobalNotification.


        :param sound: The sound of this GlobalNotification.  # noqa: E501
        :type: str
        """

        self._sound = sound

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
        if issubclass(GlobalNotification, dict):
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
        if not isinstance(other, GlobalNotification):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, GlobalNotification):
            return True

        return self.to_dict() != other.to_dict()

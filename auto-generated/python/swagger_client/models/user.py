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


class User(object):
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
        'firstname': 'str',
        'lastname': 'str',
        'username': 'str',
        'account_name': 'str',
        'is_user': 'bool',
        'email': 'str',
        'date_of_birth': 'str',
        'phone': 'str',
        'created': 'datetime',
        'last_updated': 'datetime',
        'preferences': 'UserPreferences',
        'tfa_enabled': 'str',
        'affiliate_id': 'str',
        'country': 'str',
        'geoip_country': 'str',
        'geoip_region': 'str',
        'first_trade_timestamp': 'datetime',
        'first_deposit_timestamp': 'datetime',
        'typ': 'str'
    }

    attribute_map = {
        'id': 'id',
        'firstname': 'firstname',
        'lastname': 'lastname',
        'username': 'username',
        'account_name': 'accountName',
        'is_user': 'isUser',
        'email': 'email',
        'date_of_birth': 'dateOfBirth',
        'phone': 'phone',
        'created': 'created',
        'last_updated': 'lastUpdated',
        'preferences': 'preferences',
        'tfa_enabled': 'TFAEnabled',
        'affiliate_id': 'affiliateID',
        'country': 'country',
        'geoip_country': 'geoipCountry',
        'geoip_region': 'geoipRegion',
        'first_trade_timestamp': 'firstTradeTimestamp',
        'first_deposit_timestamp': 'firstDepositTimestamp',
        'typ': 'typ'
    }

    def __init__(self, id=None, firstname=None, lastname=None, username=None, account_name=None, is_user=True, email=None, date_of_birth=None, phone=None, created=None, last_updated=None, preferences=None, tfa_enabled=None, affiliate_id=None, country=None, geoip_country=None, geoip_region=None, first_trade_timestamp=None, first_deposit_timestamp=None, typ=None, _configuration=None):  # noqa: E501
        """User - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._id = None
        self._firstname = None
        self._lastname = None
        self._username = None
        self._account_name = None
        self._is_user = None
        self._email = None
        self._date_of_birth = None
        self._phone = None
        self._created = None
        self._last_updated = None
        self._preferences = None
        self._tfa_enabled = None
        self._affiliate_id = None
        self._country = None
        self._geoip_country = None
        self._geoip_region = None
        self._first_trade_timestamp = None
        self._first_deposit_timestamp = None
        self._typ = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if firstname is not None:
            self.firstname = firstname
        if lastname is not None:
            self.lastname = lastname
        self.username = username
        if account_name is not None:
            self.account_name = account_name
        self.is_user = is_user
        if email is not None:
            self.email = email
        if date_of_birth is not None:
            self.date_of_birth = date_of_birth
        if phone is not None:
            self.phone = phone
        if created is not None:
            self.created = created
        if last_updated is not None:
            self.last_updated = last_updated
        if preferences is not None:
            self.preferences = preferences
        if tfa_enabled is not None:
            self.tfa_enabled = tfa_enabled
        if affiliate_id is not None:
            self.affiliate_id = affiliate_id
        if country is not None:
            self.country = country
        if geoip_country is not None:
            self.geoip_country = geoip_country
        if geoip_region is not None:
            self.geoip_region = geoip_region
        if first_trade_timestamp is not None:
            self.first_trade_timestamp = first_trade_timestamp
        if first_deposit_timestamp is not None:
            self.first_deposit_timestamp = first_deposit_timestamp
        if typ is not None:
            self.typ = typ

    @property
    def id(self):
        """Gets the id of this User.  # noqa: E501


        :return: The id of this User.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this User.


        :param id: The id of this User.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def firstname(self):
        """Gets the firstname of this User.  # noqa: E501


        :return: The firstname of this User.  # noqa: E501
        :rtype: str
        """
        return self._firstname

    @firstname.setter
    def firstname(self, firstname):
        """Sets the firstname of this User.


        :param firstname: The firstname of this User.  # noqa: E501
        :type: str
        """

        self._firstname = firstname

    @property
    def lastname(self):
        """Gets the lastname of this User.  # noqa: E501


        :return: The lastname of this User.  # noqa: E501
        :rtype: str
        """
        return self._lastname

    @lastname.setter
    def lastname(self, lastname):
        """Sets the lastname of this User.


        :param lastname: The lastname of this User.  # noqa: E501
        :type: str
        """

        self._lastname = lastname

    @property
    def username(self):
        """Gets the username of this User.  # noqa: E501


        :return: The username of this User.  # noqa: E501
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this User.


        :param username: The username of this User.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and username is None:
            raise ValueError("Invalid value for `username`, must not be `None`")  # noqa: E501

        self._username = username

    @property
    def account_name(self):
        """Gets the account_name of this User.  # noqa: E501


        :return: The account_name of this User.  # noqa: E501
        :rtype: str
        """
        return self._account_name

    @account_name.setter
    def account_name(self, account_name):
        """Sets the account_name of this User.


        :param account_name: The account_name of this User.  # noqa: E501
        :type: str
        """

        self._account_name = account_name

    @property
    def is_user(self):
        """Gets the is_user of this User.  # noqa: E501


        :return: The is_user of this User.  # noqa: E501
        :rtype: bool
        """
        return self._is_user

    @is_user.setter
    def is_user(self, is_user):
        """Sets the is_user of this User.


        :param is_user: The is_user of this User.  # noqa: E501
        :type: bool
        """
        if self._configuration.client_side_validation and is_user is None:
            raise ValueError("Invalid value for `is_user`, must not be `None`")  # noqa: E501

        self._is_user = is_user

    @property
    def email(self):
        """Gets the email of this User.  # noqa: E501


        :return: The email of this User.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this User.


        :param email: The email of this User.  # noqa: E501
        :type: str
        """

        self._email = email

    @property
    def date_of_birth(self):
        """Gets the date_of_birth of this User.  # noqa: E501


        :return: The date_of_birth of this User.  # noqa: E501
        :rtype: str
        """
        return self._date_of_birth

    @date_of_birth.setter
    def date_of_birth(self, date_of_birth):
        """Sets the date_of_birth of this User.


        :param date_of_birth: The date_of_birth of this User.  # noqa: E501
        :type: str
        """

        self._date_of_birth = date_of_birth

    @property
    def phone(self):
        """Gets the phone of this User.  # noqa: E501


        :return: The phone of this User.  # noqa: E501
        :rtype: str
        """
        return self._phone

    @phone.setter
    def phone(self, phone):
        """Sets the phone of this User.


        :param phone: The phone of this User.  # noqa: E501
        :type: str
        """

        self._phone = phone

    @property
    def created(self):
        """Gets the created of this User.  # noqa: E501


        :return: The created of this User.  # noqa: E501
        :rtype: datetime
        """
        return self._created

    @created.setter
    def created(self, created):
        """Sets the created of this User.


        :param created: The created of this User.  # noqa: E501
        :type: datetime
        """

        self._created = created

    @property
    def last_updated(self):
        """Gets the last_updated of this User.  # noqa: E501


        :return: The last_updated of this User.  # noqa: E501
        :rtype: datetime
        """
        return self._last_updated

    @last_updated.setter
    def last_updated(self, last_updated):
        """Sets the last_updated of this User.


        :param last_updated: The last_updated of this User.  # noqa: E501
        :type: datetime
        """

        self._last_updated = last_updated

    @property
    def preferences(self):
        """Gets the preferences of this User.  # noqa: E501


        :return: The preferences of this User.  # noqa: E501
        :rtype: UserPreferences
        """
        return self._preferences

    @preferences.setter
    def preferences(self, preferences):
        """Sets the preferences of this User.


        :param preferences: The preferences of this User.  # noqa: E501
        :type: UserPreferences
        """

        self._preferences = preferences

    @property
    def tfa_enabled(self):
        """Gets the tfa_enabled of this User.  # noqa: E501


        :return: The tfa_enabled of this User.  # noqa: E501
        :rtype: str
        """
        return self._tfa_enabled

    @tfa_enabled.setter
    def tfa_enabled(self, tfa_enabled):
        """Sets the tfa_enabled of this User.


        :param tfa_enabled: The tfa_enabled of this User.  # noqa: E501
        :type: str
        """

        self._tfa_enabled = tfa_enabled

    @property
    def affiliate_id(self):
        """Gets the affiliate_id of this User.  # noqa: E501


        :return: The affiliate_id of this User.  # noqa: E501
        :rtype: str
        """
        return self._affiliate_id

    @affiliate_id.setter
    def affiliate_id(self, affiliate_id):
        """Sets the affiliate_id of this User.


        :param affiliate_id: The affiliate_id of this User.  # noqa: E501
        :type: str
        """
        if (self._configuration.client_side_validation and
                affiliate_id is not None and len(affiliate_id) > 6):
            raise ValueError("Invalid value for `affiliate_id`, length must be less than or equal to `6`")  # noqa: E501

        self._affiliate_id = affiliate_id

    @property
    def country(self):
        """Gets the country of this User.  # noqa: E501


        :return: The country of this User.  # noqa: E501
        :rtype: str
        """
        return self._country

    @country.setter
    def country(self, country):
        """Sets the country of this User.


        :param country: The country of this User.  # noqa: E501
        :type: str
        """
        if (self._configuration.client_side_validation and
                country is not None and len(country) > 3):
            raise ValueError("Invalid value for `country`, length must be less than or equal to `3`")  # noqa: E501

        self._country = country

    @property
    def geoip_country(self):
        """Gets the geoip_country of this User.  # noqa: E501


        :return: The geoip_country of this User.  # noqa: E501
        :rtype: str
        """
        return self._geoip_country

    @geoip_country.setter
    def geoip_country(self, geoip_country):
        """Sets the geoip_country of this User.


        :param geoip_country: The geoip_country of this User.  # noqa: E501
        :type: str
        """
        if (self._configuration.client_side_validation and
                geoip_country is not None and len(geoip_country) > 2):
            raise ValueError("Invalid value for `geoip_country`, length must be less than or equal to `2`")  # noqa: E501

        self._geoip_country = geoip_country

    @property
    def geoip_region(self):
        """Gets the geoip_region of this User.  # noqa: E501


        :return: The geoip_region of this User.  # noqa: E501
        :rtype: str
        """
        return self._geoip_region

    @geoip_region.setter
    def geoip_region(self, geoip_region):
        """Sets the geoip_region of this User.


        :param geoip_region: The geoip_region of this User.  # noqa: E501
        :type: str
        """
        if (self._configuration.client_side_validation and
                geoip_region is not None and len(geoip_region) > 2):
            raise ValueError("Invalid value for `geoip_region`, length must be less than or equal to `2`")  # noqa: E501

        self._geoip_region = geoip_region

    @property
    def first_trade_timestamp(self):
        """Gets the first_trade_timestamp of this User.  # noqa: E501


        :return: The first_trade_timestamp of this User.  # noqa: E501
        :rtype: datetime
        """
        return self._first_trade_timestamp

    @first_trade_timestamp.setter
    def first_trade_timestamp(self, first_trade_timestamp):
        """Sets the first_trade_timestamp of this User.


        :param first_trade_timestamp: The first_trade_timestamp of this User.  # noqa: E501
        :type: datetime
        """

        self._first_trade_timestamp = first_trade_timestamp

    @property
    def first_deposit_timestamp(self):
        """Gets the first_deposit_timestamp of this User.  # noqa: E501


        :return: The first_deposit_timestamp of this User.  # noqa: E501
        :rtype: datetime
        """
        return self._first_deposit_timestamp

    @first_deposit_timestamp.setter
    def first_deposit_timestamp(self, first_deposit_timestamp):
        """Sets the first_deposit_timestamp of this User.


        :param first_deposit_timestamp: The first_deposit_timestamp of this User.  # noqa: E501
        :type: datetime
        """

        self._first_deposit_timestamp = first_deposit_timestamp

    @property
    def typ(self):
        """Gets the typ of this User.  # noqa: E501


        :return: The typ of this User.  # noqa: E501
        :rtype: str
        """
        return self._typ

    @typ.setter
    def typ(self, typ):
        """Sets the typ of this User.


        :param typ: The typ of this User.  # noqa: E501
        :type: str
        """

        self._typ = typ

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
        if issubclass(User, dict):
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
        if not isinstance(other, User):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, User):
            return True

        return self.to_dict() != other.to_dict()

<?php
/**
 * QuoteFillRatio
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * BitMEX API
 *
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section.
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 * Swagger Codegen version: 2.4.42-SNAPSHOT
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * QuoteFillRatio Class Doc Comment
 *
 * @category Class
 * @description Daily Quote Fill Ratio Statistic
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class QuoteFillRatio implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'QuoteFillRatio';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'date' => '\DateTime',
        'account' => 'double',
        'quote_count' => 'double',
        'dealt_count' => 'double',
        'quotes_mavg7' => 'double',
        'dealt_mavg7' => 'double',
        'quote_fill_ratio_mavg7' => 'double'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'date' => 'date-time',
        'account' => 'double',
        'quote_count' => 'double',
        'dealt_count' => 'double',
        'quotes_mavg7' => 'double',
        'dealt_mavg7' => 'double',
        'quote_fill_ratio_mavg7' => 'double'
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'date' => 'date',
        'account' => 'account',
        'quote_count' => 'quoteCount',
        'dealt_count' => 'dealtCount',
        'quotes_mavg7' => 'quotesMavg7',
        'dealt_mavg7' => 'dealtMavg7',
        'quote_fill_ratio_mavg7' => 'quoteFillRatioMavg7'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'date' => 'setDate',
        'account' => 'setAccount',
        'quote_count' => 'setQuoteCount',
        'dealt_count' => 'setDealtCount',
        'quotes_mavg7' => 'setQuotesMavg7',
        'dealt_mavg7' => 'setDealtMavg7',
        'quote_fill_ratio_mavg7' => 'setQuoteFillRatioMavg7'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'date' => 'getDate',
        'account' => 'getAccount',
        'quote_count' => 'getQuoteCount',
        'dealt_count' => 'getDealtCount',
        'quotes_mavg7' => 'getQuotesMavg7',
        'dealt_mavg7' => 'getDealtMavg7',
        'quote_fill_ratio_mavg7' => 'getQuoteFillRatioMavg7'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['date'] = isset($data['date']) ? $data['date'] : null;
        $this->container['account'] = isset($data['account']) ? $data['account'] : null;
        $this->container['quote_count'] = isset($data['quote_count']) ? $data['quote_count'] : null;
        $this->container['dealt_count'] = isset($data['dealt_count']) ? $data['dealt_count'] : null;
        $this->container['quotes_mavg7'] = isset($data['quotes_mavg7']) ? $data['quotes_mavg7'] : null;
        $this->container['dealt_mavg7'] = isset($data['dealt_mavg7']) ? $data['dealt_mavg7'] : null;
        $this->container['quote_fill_ratio_mavg7'] = isset($data['quote_fill_ratio_mavg7']) ? $data['quote_fill_ratio_mavg7'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['date'] === null) {
            $invalidProperties[] = "'date' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets date
     *
     * @return \DateTime
     */
    public function getDate()
    {
        return $this->container['date'];
    }

    /**
     * Sets date
     *
     * @param \DateTime $date date
     *
     * @return $this
     */
    public function setDate($date)
    {
        $this->container['date'] = $date;

        return $this;
    }

    /**
     * Gets account
     *
     * @return double
     */
    public function getAccount()
    {
        return $this->container['account'];
    }

    /**
     * Sets account
     *
     * @param double $account account
     *
     * @return $this
     */
    public function setAccount($account)
    {
        $this->container['account'] = $account;

        return $this;
    }

    /**
     * Gets quote_count
     *
     * @return double
     */
    public function getQuoteCount()
    {
        return $this->container['quote_count'];
    }

    /**
     * Sets quote_count
     *
     * @param double $quote_count quote_count
     *
     * @return $this
     */
    public function setQuoteCount($quote_count)
    {
        $this->container['quote_count'] = $quote_count;

        return $this;
    }

    /**
     * Gets dealt_count
     *
     * @return double
     */
    public function getDealtCount()
    {
        return $this->container['dealt_count'];
    }

    /**
     * Sets dealt_count
     *
     * @param double $dealt_count dealt_count
     *
     * @return $this
     */
    public function setDealtCount($dealt_count)
    {
        $this->container['dealt_count'] = $dealt_count;

        return $this;
    }

    /**
     * Gets quotes_mavg7
     *
     * @return double
     */
    public function getQuotesMavg7()
    {
        return $this->container['quotes_mavg7'];
    }

    /**
     * Sets quotes_mavg7
     *
     * @param double $quotes_mavg7 quotes_mavg7
     *
     * @return $this
     */
    public function setQuotesMavg7($quotes_mavg7)
    {
        $this->container['quotes_mavg7'] = $quotes_mavg7;

        return $this;
    }

    /**
     * Gets dealt_mavg7
     *
     * @return double
     */
    public function getDealtMavg7()
    {
        return $this->container['dealt_mavg7'];
    }

    /**
     * Sets dealt_mavg7
     *
     * @param double $dealt_mavg7 dealt_mavg7
     *
     * @return $this
     */
    public function setDealtMavg7($dealt_mavg7)
    {
        $this->container['dealt_mavg7'] = $dealt_mavg7;

        return $this;
    }

    /**
     * Gets quote_fill_ratio_mavg7
     *
     * @return double
     */
    public function getQuoteFillRatioMavg7()
    {
        return $this->container['quote_fill_ratio_mavg7'];
    }

    /**
     * Sets quote_fill_ratio_mavg7
     *
     * @param double $quote_fill_ratio_mavg7 quote_fill_ratio_mavg7
     *
     * @return $this
     */
    public function setQuoteFillRatioMavg7($quote_fill_ratio_mavg7)
    {
        $this->container['quote_fill_ratio_mavg7'] = $quote_fill_ratio_mavg7;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    #[\ReturnTypeWillChange]
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    #[\ReturnTypeWillChange]
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    #[\ReturnTypeWillChange]
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}



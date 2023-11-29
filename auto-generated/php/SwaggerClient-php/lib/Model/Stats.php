<?php
/**
 * Stats
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
 * Swagger Codegen version: 2.4.38-SNAPSHOT
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
 * Stats Class Doc Comment
 *
 * @category Class
 * @description Exchange Statistics
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class Stats implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'Stats';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'root_symbol' => 'string',
        'currency' => 'string',
        'volume24h' => 'float',
        'turnover24h' => 'float',
        'open_interest' => 'float',
        'open_value' => 'float'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'root_symbol' => null,
        'currency' => null,
        'volume24h' => 'int64',
        'turnover24h' => 'int64',
        'open_interest' => 'int64',
        'open_value' => 'int64'
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
        'root_symbol' => 'rootSymbol',
        'currency' => 'currency',
        'volume24h' => 'volume24h',
        'turnover24h' => 'turnover24h',
        'open_interest' => 'openInterest',
        'open_value' => 'openValue'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'root_symbol' => 'setRootSymbol',
        'currency' => 'setCurrency',
        'volume24h' => 'setVolume24h',
        'turnover24h' => 'setTurnover24h',
        'open_interest' => 'setOpenInterest',
        'open_value' => 'setOpenValue'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'root_symbol' => 'getRootSymbol',
        'currency' => 'getCurrency',
        'volume24h' => 'getVolume24h',
        'turnover24h' => 'getTurnover24h',
        'open_interest' => 'getOpenInterest',
        'open_value' => 'getOpenValue'
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
        $this->container['root_symbol'] = isset($data['root_symbol']) ? $data['root_symbol'] : null;
        $this->container['currency'] = isset($data['currency']) ? $data['currency'] : null;
        $this->container['volume24h'] = isset($data['volume24h']) ? $data['volume24h'] : null;
        $this->container['turnover24h'] = isset($data['turnover24h']) ? $data['turnover24h'] : null;
        $this->container['open_interest'] = isset($data['open_interest']) ? $data['open_interest'] : null;
        $this->container['open_value'] = isset($data['open_value']) ? $data['open_value'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['root_symbol'] === null) {
            $invalidProperties[] = "'root_symbol' can't be null";
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
     * Gets root_symbol
     *
     * @return string
     */
    public function getRootSymbol()
    {
        return $this->container['root_symbol'];
    }

    /**
     * Sets root_symbol
     *
     * @param string $root_symbol root_symbol
     *
     * @return $this
     */
    public function setRootSymbol($root_symbol)
    {
        $this->container['root_symbol'] = $root_symbol;

        return $this;
    }

    /**
     * Gets currency
     *
     * @return string
     */
    public function getCurrency()
    {
        return $this->container['currency'];
    }

    /**
     * Sets currency
     *
     * @param string $currency currency
     *
     * @return $this
     */
    public function setCurrency($currency)
    {
        $this->container['currency'] = $currency;

        return $this;
    }

    /**
     * Gets volume24h
     *
     * @return float
     */
    public function getVolume24h()
    {
        return $this->container['volume24h'];
    }

    /**
     * Sets volume24h
     *
     * @param float $volume24h volume24h
     *
     * @return $this
     */
    public function setVolume24h($volume24h)
    {
        $this->container['volume24h'] = $volume24h;

        return $this;
    }

    /**
     * Gets turnover24h
     *
     * @return float
     */
    public function getTurnover24h()
    {
        return $this->container['turnover24h'];
    }

    /**
     * Sets turnover24h
     *
     * @param float $turnover24h turnover24h
     *
     * @return $this
     */
    public function setTurnover24h($turnover24h)
    {
        $this->container['turnover24h'] = $turnover24h;

        return $this;
    }

    /**
     * Gets open_interest
     *
     * @return float
     */
    public function getOpenInterest()
    {
        return $this->container['open_interest'];
    }

    /**
     * Sets open_interest
     *
     * @param float $open_interest open_interest
     *
     * @return $this
     */
    public function setOpenInterest($open_interest)
    {
        $this->container['open_interest'] = $open_interest;

        return $this;
    }

    /**
     * Gets open_value
     *
     * @return float
     */
    public function getOpenValue()
    {
        return $this->container['open_value'];
    }

    /**
     * Sets open_value
     *
     * @param float $open_value open_value
     *
     * @return $this
     */
    public function setOpenValue($open_value)
    {
        $this->container['open_value'] = $open_value;

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



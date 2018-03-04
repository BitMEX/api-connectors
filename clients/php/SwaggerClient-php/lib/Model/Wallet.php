<?php
/**
 * Wallet
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   http://github.com/swagger-api/swagger-codegen
 * @license  http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * BitMEX API
 *
 * ## REST API for the BitMEX Trading Platform  [Changelog](/app/apiChangelog)    #### Getting Started   ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](https://www.bitmex.com/app/restAPI).  *All* table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  *This is only a small subset of what is available, to get you started.*  Fill in the parameters and click the `Try it out!` button to try any of these queries.  * [Pricing Data](#!/Quote/Quote_get)  * [Trade Data](#!/Trade/Trade_get)  * [OrderBook Data](#!/OrderBook/OrderBook_getL2)  * [Settlement Data](#!/Settlement/Settlement_get)  * [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  -  ## All API Endpoints  Click to expand a section.
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * Wallet Class Doc Comment
 *
 * @category    Class */
/** 
 * @package     Swagger\Client
 * @author      http://github.com/swagger-api/swagger-codegen
 * @license     http://www.apache.org/licenses/LICENSE-2.0 Apache Licene v2
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class Wallet implements ArrayAccess
{
    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'Wallet';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = array(
        'account' => 'float',
        'currency' => 'string',
        'prev_deposited' => 'float',
        'prev_withdrawn' => 'float',
        'prev_amount' => 'float',
        'prev_timestamp' => '\DateTime',
        'delta_deposited' => 'float',
        'delta_withdrawn' => 'float',
        'delta_amount' => 'float',
        'deposited' => 'float',
        'withdrawn' => 'float',
        'amount' => 'float',
        'pending_credit' => 'float',
        'pending_debit' => 'float',
        'confirmed_debit' => 'float',
        'timestamp' => '\DateTime',
        'addr' => 'string',
        'withdrawal_lock' => '\Swagger\Client\Model\XAny[]'
    );

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = array(
        'account' => 'account',
        'currency' => 'currency',
        'prev_deposited' => 'prevDeposited',
        'prev_withdrawn' => 'prevWithdrawn',
        'prev_amount' => 'prevAmount',
        'prev_timestamp' => 'prevTimestamp',
        'delta_deposited' => 'deltaDeposited',
        'delta_withdrawn' => 'deltaWithdrawn',
        'delta_amount' => 'deltaAmount',
        'deposited' => 'deposited',
        'withdrawn' => 'withdrawn',
        'amount' => 'amount',
        'pending_credit' => 'pendingCredit',
        'pending_debit' => 'pendingDebit',
        'confirmed_debit' => 'confirmedDebit',
        'timestamp' => 'timestamp',
        'addr' => 'addr',
        'withdrawal_lock' => 'withdrawalLock'
    );

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = array(
        'account' => 'setAccount',
        'currency' => 'setCurrency',
        'prev_deposited' => 'setPrevDeposited',
        'prev_withdrawn' => 'setPrevWithdrawn',
        'prev_amount' => 'setPrevAmount',
        'prev_timestamp' => 'setPrevTimestamp',
        'delta_deposited' => 'setDeltaDeposited',
        'delta_withdrawn' => 'setDeltaWithdrawn',
        'delta_amount' => 'setDeltaAmount',
        'deposited' => 'setDeposited',
        'withdrawn' => 'setWithdrawn',
        'amount' => 'setAmount',
        'pending_credit' => 'setPendingCredit',
        'pending_debit' => 'setPendingDebit',
        'confirmed_debit' => 'setConfirmedDebit',
        'timestamp' => 'setTimestamp',
        'addr' => 'setAddr',
        'withdrawal_lock' => 'setWithdrawalLock'
    );

    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = array(
        'account' => 'getAccount',
        'currency' => 'getCurrency',
        'prev_deposited' => 'getPrevDeposited',
        'prev_withdrawn' => 'getPrevWithdrawn',
        'prev_amount' => 'getPrevAmount',
        'prev_timestamp' => 'getPrevTimestamp',
        'delta_deposited' => 'getDeltaDeposited',
        'delta_withdrawn' => 'getDeltaWithdrawn',
        'delta_amount' => 'getDeltaAmount',
        'deposited' => 'getDeposited',
        'withdrawn' => 'getWithdrawn',
        'amount' => 'getAmount',
        'pending_credit' => 'getPendingCredit',
        'pending_debit' => 'getPendingDebit',
        'confirmed_debit' => 'getConfirmedDebit',
        'timestamp' => 'getTimestamp',
        'addr' => 'getAddr',
        'withdrawal_lock' => 'getWithdrawalLock'
    );

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = array();

    /**
     * Constructor
     * @param mixed[] $data Associated array of property value initalizing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['account'] = isset($data['account']) ? $data['account'] : null;
        $this->container['currency'] = isset($data['currency']) ? $data['currency'] : null;
        $this->container['prev_deposited'] = isset($data['prev_deposited']) ? $data['prev_deposited'] : null;
        $this->container['prev_withdrawn'] = isset($data['prev_withdrawn']) ? $data['prev_withdrawn'] : null;
        $this->container['prev_amount'] = isset($data['prev_amount']) ? $data['prev_amount'] : null;
        $this->container['prev_timestamp'] = isset($data['prev_timestamp']) ? $data['prev_timestamp'] : null;
        $this->container['delta_deposited'] = isset($data['delta_deposited']) ? $data['delta_deposited'] : null;
        $this->container['delta_withdrawn'] = isset($data['delta_withdrawn']) ? $data['delta_withdrawn'] : null;
        $this->container['delta_amount'] = isset($data['delta_amount']) ? $data['delta_amount'] : null;
        $this->container['deposited'] = isset($data['deposited']) ? $data['deposited'] : null;
        $this->container['withdrawn'] = isset($data['withdrawn']) ? $data['withdrawn'] : null;
        $this->container['amount'] = isset($data['amount']) ? $data['amount'] : null;
        $this->container['pending_credit'] = isset($data['pending_credit']) ? $data['pending_credit'] : null;
        $this->container['pending_debit'] = isset($data['pending_debit']) ? $data['pending_debit'] : null;
        $this->container['confirmed_debit'] = isset($data['confirmed_debit']) ? $data['confirmed_debit'] : null;
        $this->container['timestamp'] = isset($data['timestamp']) ? $data['timestamp'] : null;
        $this->container['addr'] = isset($data['addr']) ? $data['addr'] : null;
        $this->container['withdrawal_lock'] = isset($data['withdrawal_lock']) ? $data['withdrawal_lock'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = array();
        if ($this->container['account'] === null) {
            $invalid_properties[] = "'account' can't be null";
        }
        if ($this->container['currency'] === null) {
            $invalid_properties[] = "'currency' can't be null";
        }
        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properteis are valid
     */
    public function valid()
    {
        if ($this->container['account'] === null) {
            return false;
        }
        if ($this->container['currency'] === null) {
            return false;
        }
        return true;
    }


    /**
     * Gets account
     * @return float
     */
    public function getAccount()
    {
        return $this->container['account'];
    }

    /**
     * Sets account
     * @param float $account
     * @return $this
     */
    public function setAccount($account)
    {
        $this->container['account'] = $account;

        return $this;
    }

    /**
     * Gets currency
     * @return string
     */
    public function getCurrency()
    {
        return $this->container['currency'];
    }

    /**
     * Sets currency
     * @param string $currency
     * @return $this
     */
    public function setCurrency($currency)
    {
        $this->container['currency'] = $currency;

        return $this;
    }

    /**
     * Gets prev_deposited
     * @return float
     */
    public function getPrevDeposited()
    {
        return $this->container['prev_deposited'];
    }

    /**
     * Sets prev_deposited
     * @param float $prev_deposited
     * @return $this
     */
    public function setPrevDeposited($prev_deposited)
    {
        $this->container['prev_deposited'] = $prev_deposited;

        return $this;
    }

    /**
     * Gets prev_withdrawn
     * @return float
     */
    public function getPrevWithdrawn()
    {
        return $this->container['prev_withdrawn'];
    }

    /**
     * Sets prev_withdrawn
     * @param float $prev_withdrawn
     * @return $this
     */
    public function setPrevWithdrawn($prev_withdrawn)
    {
        $this->container['prev_withdrawn'] = $prev_withdrawn;

        return $this;
    }

    /**
     * Gets prev_amount
     * @return float
     */
    public function getPrevAmount()
    {
        return $this->container['prev_amount'];
    }

    /**
     * Sets prev_amount
     * @param float $prev_amount
     * @return $this
     */
    public function setPrevAmount($prev_amount)
    {
        $this->container['prev_amount'] = $prev_amount;

        return $this;
    }

    /**
     * Gets prev_timestamp
     * @return \DateTime
     */
    public function getPrevTimestamp()
    {
        return $this->container['prev_timestamp'];
    }

    /**
     * Sets prev_timestamp
     * @param \DateTime $prev_timestamp
     * @return $this
     */
    public function setPrevTimestamp($prev_timestamp)
    {
        $this->container['prev_timestamp'] = $prev_timestamp;

        return $this;
    }

    /**
     * Gets delta_deposited
     * @return float
     */
    public function getDeltaDeposited()
    {
        return $this->container['delta_deposited'];
    }

    /**
     * Sets delta_deposited
     * @param float $delta_deposited
     * @return $this
     */
    public function setDeltaDeposited($delta_deposited)
    {
        $this->container['delta_deposited'] = $delta_deposited;

        return $this;
    }

    /**
     * Gets delta_withdrawn
     * @return float
     */
    public function getDeltaWithdrawn()
    {
        return $this->container['delta_withdrawn'];
    }

    /**
     * Sets delta_withdrawn
     * @param float $delta_withdrawn
     * @return $this
     */
    public function setDeltaWithdrawn($delta_withdrawn)
    {
        $this->container['delta_withdrawn'] = $delta_withdrawn;

        return $this;
    }

    /**
     * Gets delta_amount
     * @return float
     */
    public function getDeltaAmount()
    {
        return $this->container['delta_amount'];
    }

    /**
     * Sets delta_amount
     * @param float $delta_amount
     * @return $this
     */
    public function setDeltaAmount($delta_amount)
    {
        $this->container['delta_amount'] = $delta_amount;

        return $this;
    }

    /**
     * Gets deposited
     * @return float
     */
    public function getDeposited()
    {
        return $this->container['deposited'];
    }

    /**
     * Sets deposited
     * @param float $deposited
     * @return $this
     */
    public function setDeposited($deposited)
    {
        $this->container['deposited'] = $deposited;

        return $this;
    }

    /**
     * Gets withdrawn
     * @return float
     */
    public function getWithdrawn()
    {
        return $this->container['withdrawn'];
    }

    /**
     * Sets withdrawn
     * @param float $withdrawn
     * @return $this
     */
    public function setWithdrawn($withdrawn)
    {
        $this->container['withdrawn'] = $withdrawn;

        return $this;
    }

    /**
     * Gets amount
     * @return float
     */
    public function getAmount()
    {
        return $this->container['amount'];
    }

    /**
     * Sets amount
     * @param float $amount
     * @return $this
     */
    public function setAmount($amount)
    {
        $this->container['amount'] = $amount;

        return $this;
    }

    /**
     * Gets pending_credit
     * @return float
     */
    public function getPendingCredit()
    {
        return $this->container['pending_credit'];
    }

    /**
     * Sets pending_credit
     * @param float $pending_credit
     * @return $this
     */
    public function setPendingCredit($pending_credit)
    {
        $this->container['pending_credit'] = $pending_credit;

        return $this;
    }

    /**
     * Gets pending_debit
     * @return float
     */
    public function getPendingDebit()
    {
        return $this->container['pending_debit'];
    }

    /**
     * Sets pending_debit
     * @param float $pending_debit
     * @return $this
     */
    public function setPendingDebit($pending_debit)
    {
        $this->container['pending_debit'] = $pending_debit;

        return $this;
    }

    /**
     * Gets confirmed_debit
     * @return float
     */
    public function getConfirmedDebit()
    {
        return $this->container['confirmed_debit'];
    }

    /**
     * Sets confirmed_debit
     * @param float $confirmed_debit
     * @return $this
     */
    public function setConfirmedDebit($confirmed_debit)
    {
        $this->container['confirmed_debit'] = $confirmed_debit;

        return $this;
    }

    /**
     * Gets timestamp
     * @return \DateTime
     */
    public function getTimestamp()
    {
        return $this->container['timestamp'];
    }

    /**
     * Sets timestamp
     * @param \DateTime $timestamp
     * @return $this
     */
    public function setTimestamp($timestamp)
    {
        $this->container['timestamp'] = $timestamp;

        return $this;
    }

    /**
     * Gets addr
     * @return string
     */
    public function getAddr()
    {
        return $this->container['addr'];
    }

    /**
     * Sets addr
     * @param string $addr
     * @return $this
     */
    public function setAddr($addr)
    {
        $this->container['addr'] = $addr;

        return $this;
    }

    /**
     * Gets withdrawal_lock
     * @return \Swagger\Client\Model\XAny[]
     */
    public function getWithdrawalLock()
    {
        return $this->container['withdrawal_lock'];
    }

    /**
     * Sets withdrawal_lock
     * @param \Swagger\Client\Model\XAny[] $withdrawal_lock
     * @return $this
     */
    public function setWithdrawalLock($withdrawal_lock)
    {
        $this->container['withdrawal_lock'] = $withdrawal_lock;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
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
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}


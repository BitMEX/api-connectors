/**
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.42-SNAPSHOT.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */



#include "Transaction.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Transaction::Transaction()
{
    m_TransactID = utility::conversions::to_string_t("");
    m_Account = 0L;
    m_AccountIsSet = false;
    m_Currency = utility::conversions::to_string_t("");
    m_CurrencyIsSet = false;
    m_Network = utility::conversions::to_string_t("");
    m_NetworkIsSet = false;
    m_TransactType = utility::conversions::to_string_t("");
    m_TransactTypeIsSet = false;
    m_Amount = 0L;
    m_AmountIsSet = false;
    m_Fee = 0L;
    m_FeeIsSet = false;
    m_TransactStatus = utility::conversions::to_string_t("");
    m_TransactStatusIsSet = false;
    m_Address = utility::conversions::to_string_t("");
    m_AddressIsSet = false;
    m_Tx = utility::conversions::to_string_t("");
    m_TxIsSet = false;
    m_Text = utility::conversions::to_string_t("");
    m_TextIsSet = false;
    m_TransactTime = utility::datetime();
    m_TransactTimeIsSet = false;
    m_Timestamp = utility::datetime();
    m_TimestampIsSet = false;
    m_WalletBalance = 0L;
    m_WalletBalanceIsSet = false;
}

Transaction::~Transaction()
{
}

void Transaction::validate()
{
    // TODO: implement validation
}

web::json::value Transaction::toJson() const
{
    web::json::value val = web::json::value::object();

    val[utility::conversions::to_string_t("transactID")] = ModelBase::toJson(m_TransactID);
    if(m_AccountIsSet)
    {
        val[utility::conversions::to_string_t("account")] = ModelBase::toJson(m_Account);
    }
    if(m_CurrencyIsSet)
    {
        val[utility::conversions::to_string_t("currency")] = ModelBase::toJson(m_Currency);
    }
    if(m_NetworkIsSet)
    {
        val[utility::conversions::to_string_t("network")] = ModelBase::toJson(m_Network);
    }
    if(m_TransactTypeIsSet)
    {
        val[utility::conversions::to_string_t("transactType")] = ModelBase::toJson(m_TransactType);
    }
    if(m_AmountIsSet)
    {
        val[utility::conversions::to_string_t("amount")] = ModelBase::toJson(m_Amount);
    }
    if(m_FeeIsSet)
    {
        val[utility::conversions::to_string_t("fee")] = ModelBase::toJson(m_Fee);
    }
    if(m_TransactStatusIsSet)
    {
        val[utility::conversions::to_string_t("transactStatus")] = ModelBase::toJson(m_TransactStatus);
    }
    if(m_AddressIsSet)
    {
        val[utility::conversions::to_string_t("address")] = ModelBase::toJson(m_Address);
    }
    if(m_TxIsSet)
    {
        val[utility::conversions::to_string_t("tx")] = ModelBase::toJson(m_Tx);
    }
    if(m_TextIsSet)
    {
        val[utility::conversions::to_string_t("text")] = ModelBase::toJson(m_Text);
    }
    if(m_TransactTimeIsSet)
    {
        val[utility::conversions::to_string_t("transactTime")] = ModelBase::toJson(m_TransactTime);
    }
    if(m_TimestampIsSet)
    {
        val[utility::conversions::to_string_t("timestamp")] = ModelBase::toJson(m_Timestamp);
    }
    if(m_WalletBalanceIsSet)
    {
        val[utility::conversions::to_string_t("walletBalance")] = ModelBase::toJson(m_WalletBalance);
    }

    return val;
}

void Transaction::fromJson(web::json::value& val)
{
    setTransactID(ModelBase::stringFromJson(val[utility::conversions::to_string_t("transactID")]));
    if(val.has_field(utility::conversions::to_string_t("account")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("account")];
        if(!fieldValue.is_null())
        {
            setAccount(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("currency")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("currency")];
        if(!fieldValue.is_null())
        {
            setCurrency(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("network")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("network")];
        if(!fieldValue.is_null())
        {
            setNetwork(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("transactType")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("transactType")];
        if(!fieldValue.is_null())
        {
            setTransactType(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("amount")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("amount")];
        if(!fieldValue.is_null())
        {
            setAmount(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("fee")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("fee")];
        if(!fieldValue.is_null())
        {
            setFee(ModelBase::int64_tFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("transactStatus")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("transactStatus")];
        if(!fieldValue.is_null())
        {
            setTransactStatus(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("address")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("address")];
        if(!fieldValue.is_null())
        {
            setAddress(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("tx")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("tx")];
        if(!fieldValue.is_null())
        {
            setTx(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("text")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("text")];
        if(!fieldValue.is_null())
        {
            setText(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("transactTime")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("transactTime")];
        if(!fieldValue.is_null())
        {
            setTransactTime(ModelBase::dateFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("timestamp")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("timestamp")];
        if(!fieldValue.is_null())
        {
            setTimestamp(ModelBase::dateFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("walletBalance")))
    {
        web::json::value& fieldValue = val[utility::conversions::to_string_t("walletBalance")];
        if(!fieldValue.is_null())
        {
            setWalletBalance(ModelBase::int64_tFromJson(fieldValue));
        }
    }
}

void Transaction::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("transactID"), m_TransactID));
    if(m_AccountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("account"), m_Account));
    }
    if(m_CurrencyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("currency"), m_Currency));
        
    }
    if(m_NetworkIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("network"), m_Network));
        
    }
    if(m_TransactTypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("transactType"), m_TransactType));
        
    }
    if(m_AmountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("amount"), m_Amount));
    }
    if(m_FeeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("fee"), m_Fee));
    }
    if(m_TransactStatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("transactStatus"), m_TransactStatus));
        
    }
    if(m_AddressIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("address"), m_Address));
        
    }
    if(m_TxIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("tx"), m_Tx));
        
    }
    if(m_TextIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("text"), m_Text));
        
    }
    if(m_TransactTimeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("transactTime"), m_TransactTime));
        
    }
    if(m_TimestampIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("timestamp"), m_Timestamp));
        
    }
    if(m_WalletBalanceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("walletBalance"), m_WalletBalance));
    }
}

void Transaction::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    setTransactID(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("transactID"))));
    if(multipart->hasContent(utility::conversions::to_string_t("account")))
    {
        setAccount(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("account"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("currency")))
    {
        setCurrency(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("currency"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("network")))
    {
        setNetwork(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("network"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("transactType")))
    {
        setTransactType(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("transactType"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("amount")))
    {
        setAmount(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("amount"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("fee")))
    {
        setFee(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("fee"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("transactStatus")))
    {
        setTransactStatus(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("transactStatus"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("address")))
    {
        setAddress(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("address"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("tx")))
    {
        setTx(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("tx"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("text")))
    {
        setText(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("text"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("transactTime")))
    {
        setTransactTime(ModelBase::dateFromHttpContent(multipart->getContent(utility::conversions::to_string_t("transactTime"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("timestamp")))
    {
        setTimestamp(ModelBase::dateFromHttpContent(multipart->getContent(utility::conversions::to_string_t("timestamp"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("walletBalance")))
    {
        setWalletBalance(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("walletBalance"))));
    }
}

utility::string_t Transaction::getTransactID() const
{
    return m_TransactID;
}


void Transaction::setTransactID(utility::string_t value)
{
    m_TransactID = value;
    
}
int64_t Transaction::getAccount() const
{
    return m_Account;
}


void Transaction::setAccount(int64_t value)
{
    m_Account = value;
    m_AccountIsSet = true;
}
bool Transaction::accountIsSet() const
{
    return m_AccountIsSet;
}

void Transaction::unsetAccount()
{
    m_AccountIsSet = false;
}

utility::string_t Transaction::getCurrency() const
{
    return m_Currency;
}


void Transaction::setCurrency(utility::string_t value)
{
    m_Currency = value;
    m_CurrencyIsSet = true;
}
bool Transaction::currencyIsSet() const
{
    return m_CurrencyIsSet;
}

void Transaction::unsetCurrency()
{
    m_CurrencyIsSet = false;
}

utility::string_t Transaction::getNetwork() const
{
    return m_Network;
}


void Transaction::setNetwork(utility::string_t value)
{
    m_Network = value;
    m_NetworkIsSet = true;
}
bool Transaction::networkIsSet() const
{
    return m_NetworkIsSet;
}

void Transaction::unsetNetwork()
{
    m_NetworkIsSet = false;
}

utility::string_t Transaction::getTransactType() const
{
    return m_TransactType;
}


void Transaction::setTransactType(utility::string_t value)
{
    m_TransactType = value;
    m_TransactTypeIsSet = true;
}
bool Transaction::transactTypeIsSet() const
{
    return m_TransactTypeIsSet;
}

void Transaction::unsetTransactType()
{
    m_TransactTypeIsSet = false;
}

int64_t Transaction::getAmount() const
{
    return m_Amount;
}


void Transaction::setAmount(int64_t value)
{
    m_Amount = value;
    m_AmountIsSet = true;
}
bool Transaction::amountIsSet() const
{
    return m_AmountIsSet;
}

void Transaction::unsetAmount()
{
    m_AmountIsSet = false;
}

int64_t Transaction::getFee() const
{
    return m_Fee;
}


void Transaction::setFee(int64_t value)
{
    m_Fee = value;
    m_FeeIsSet = true;
}
bool Transaction::feeIsSet() const
{
    return m_FeeIsSet;
}

void Transaction::unsetFee()
{
    m_FeeIsSet = false;
}

utility::string_t Transaction::getTransactStatus() const
{
    return m_TransactStatus;
}


void Transaction::setTransactStatus(utility::string_t value)
{
    m_TransactStatus = value;
    m_TransactStatusIsSet = true;
}
bool Transaction::transactStatusIsSet() const
{
    return m_TransactStatusIsSet;
}

void Transaction::unsetTransactStatus()
{
    m_TransactStatusIsSet = false;
}

utility::string_t Transaction::getAddress() const
{
    return m_Address;
}


void Transaction::setAddress(utility::string_t value)
{
    m_Address = value;
    m_AddressIsSet = true;
}
bool Transaction::addressIsSet() const
{
    return m_AddressIsSet;
}

void Transaction::unsetAddress()
{
    m_AddressIsSet = false;
}

utility::string_t Transaction::getTx() const
{
    return m_Tx;
}


void Transaction::setTx(utility::string_t value)
{
    m_Tx = value;
    m_TxIsSet = true;
}
bool Transaction::txIsSet() const
{
    return m_TxIsSet;
}

void Transaction::unsetTx()
{
    m_TxIsSet = false;
}

utility::string_t Transaction::getText() const
{
    return m_Text;
}


void Transaction::setText(utility::string_t value)
{
    m_Text = value;
    m_TextIsSet = true;
}
bool Transaction::textIsSet() const
{
    return m_TextIsSet;
}

void Transaction::unsetText()
{
    m_TextIsSet = false;
}

utility::datetime Transaction::getTransactTime() const
{
    return m_TransactTime;
}


void Transaction::setTransactTime(utility::datetime value)
{
    m_TransactTime = value;
    m_TransactTimeIsSet = true;
}
bool Transaction::transactTimeIsSet() const
{
    return m_TransactTimeIsSet;
}

void Transaction::unsetTransactTime()
{
    m_TransactTimeIsSet = false;
}

utility::datetime Transaction::getTimestamp() const
{
    return m_Timestamp;
}


void Transaction::setTimestamp(utility::datetime value)
{
    m_Timestamp = value;
    m_TimestampIsSet = true;
}
bool Transaction::timestampIsSet() const
{
    return m_TimestampIsSet;
}

void Transaction::unsetTimestamp()
{
    m_TimestampIsSet = false;
}

int64_t Transaction::getWalletBalance() const
{
    return m_WalletBalance;
}


void Transaction::setWalletBalance(int64_t value)
{
    m_WalletBalance = value;
    m_WalletBalanceIsSet = true;
}
bool Transaction::walletBalanceIsSet() const
{
    return m_WalletBalanceIsSet;
}

void Transaction::unsetWalletBalance()
{
    m_WalletBalanceIsSet = false;
}

}
}
}
}


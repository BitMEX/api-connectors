# Most subscriptions take a symbol, but some do not.
NO_SYMBOL_SUBS = [
    "account",
    "affiliate",
    "announcement",
    "connected",
    "chat",
    "insurance",
    "margin",
    "publicNotifications",
    "privateNotifications",
    "transact",
    "wallet"
]
# By default, we subscribe to these tables. They can be overridden
# on websocket init via the "subscriptions" parameter.
DEFAULT_SUBS = [
    "execution",
    "instrument",
    "margin",
    "order",
    # You can sub to orderBookL2 for all levels, or orderBook10 for top 10 levels.
    # This will save bandwidth & processing time in many cases. OrderBook10 is a pulsed
    # table that sends all rows. For more on orderBook subscriptions, see
    # https://www.bitmex.com/app/wsAPI#Subscriptions
    "orderBookL2",
    "position",
    "quote",
    "trade"
]

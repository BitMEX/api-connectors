# Common files
require 'swagger_client/api_client'
require 'swagger_client/api_error'
require 'swagger_client/version'
require 'swagger_client/configuration'

# Models
require 'swagger_client/models/base_object'
require 'swagger_client/models/chat'
require 'swagger_client/models/error'
require 'swagger_client/models/connected_users'
require 'swagger_client/models/announcement'
require 'swagger_client/models/api_key'
require 'swagger_client/models/execution'
require 'swagger_client/models/instrument'
require 'swagger_client/models/instrument_interval'
require 'swagger_client/models/insurance'
require 'swagger_client/models/leaderboard'
require 'swagger_client/models/liquidation'
require 'swagger_client/models/order'
require 'swagger_client/models/order_book'
require 'swagger_client/models/order_book_l2'
require 'swagger_client/models/position'
require 'swagger_client/models/quote'
require 'swagger_client/models/settlement'
require 'swagger_client/models/funding'
require 'swagger_client/models/stats'
require 'swagger_client/models/stats_history'
require 'swagger_client/models/trade'
require 'swagger_client/models/trade_bin'
require 'swagger_client/models/transaction'
require 'swagger_client/models/access_token'
require 'swagger_client/models/affiliate'
require 'swagger_client/models/user'
require 'swagger_client/models/user_commission'
require 'swagger_client/models/margin'
require 'swagger_client/models/user_preferences'
require 'swagger_client/models/inline_response_200'
require 'swagger_client/models/inline_response_200_1'

# APIs
require 'swagger_client/api/order_api'
require 'swagger_client/api/api_key_api'
require 'swagger_client/api/user_api'
require 'swagger_client/api/announcement_api'
require 'swagger_client/api/leaderboard_api'
require 'swagger_client/api/funding_api'
require 'swagger_client/api/order_book_api'
require 'swagger_client/api/position_api'
require 'swagger_client/api/schema_api'
require 'swagger_client/api/quote_api'
require 'swagger_client/api/settlement_api'
require 'swagger_client/api/trade_api'
require 'swagger_client/api/execution_api'
require 'swagger_client/api/insurance_api'
require 'swagger_client/api/chat_api'
require 'swagger_client/api/instrument_api'
require 'swagger_client/api/stats_api'
require 'swagger_client/api/liquidation_api'

module SwaggerClient
  class << self
    # Configure sdk using block.
    # SwaggerClient.configure do |config|
    #   config.username = "xxx"
    #   config.password = "xxx"
    # end
    # If no block given, return the configuration singleton instance.
    def configure
      if block_given?
        yield Configuration.instance
      else
        Configuration.instance
      end
    end
  end
end

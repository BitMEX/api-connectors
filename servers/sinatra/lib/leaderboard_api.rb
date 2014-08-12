require 'json'

MyApp.add_route('get', '/', {
  "resourcePath" => "/leaderboard",
  "summary" => "Get current leaderboard.",
  "nickname" => "leaderboard_getOrderBook", 
  "responseClass" => "Array[leaderboard]", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end



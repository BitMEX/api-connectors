require 'json'

MyApp.add_route('get', '/', {
  "resourcePath" => "/stats",
  "summary" => "Get exchange-wide and per-series turnover and volume statistics.",
  "nickname" => "find", 
  "responseClass" => "Array[Stats]", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/history', {
  "resourcePath" => "/stats",
  "summary" => "Get historical exchange-wide and per-series turnover and volume statistics.",
  "nickname" => "history", 
  "responseClass" => "Array[StatsHistory]", 
  "endpoint" => "/history", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end



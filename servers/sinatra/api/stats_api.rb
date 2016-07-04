require 'json'


MyApp.add_route('GET', '/stats', {
  "resourcePath" => "/Stats",
  "summary" => "Get exchange-wide and per-series turnover and volume statistics.",
  "nickname" => "stats/get", 
  "responseClass" => "array[Stats]", 
  "endpoint" => "/stats", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/stats/history', {
  "resourcePath" => "/Stats",
  "summary" => "Get historical exchange-wide and per-series turnover and volume statistics.",
  "nickname" => "stats/history", 
  "responseClass" => "array[StatsHistory]", 
  "endpoint" => "/stats/history", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


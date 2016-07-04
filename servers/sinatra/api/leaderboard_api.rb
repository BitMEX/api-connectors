require 'json'


MyApp.add_route('GET', '/leaderboard', {
  "resourcePath" => "/Leaderboard",
  "summary" => "Get current leaderboard.",
  "nickname" => "leaderboard/get", 
  "responseClass" => "array[Leaderboard]", 
  "endpoint" => "/leaderboard", 
  "notes" => "",
  "parameters" => [
    
    {
      "name" => "method",
      "description" => "Ranking type. Options: \&quot;notional\&quot;, \&quot;ROE\&quot;",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "notional"
    },
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


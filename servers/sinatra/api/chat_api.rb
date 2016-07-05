require 'json'


MyApp.add_route('GET', '/api/v1/chat', {
  "resourcePath" => "/Chat",
  "summary" => "Get chat messages.",
  "nickname" => "chat/get", 
  "responseClass" => "array[Chat]", 
  "endpoint" => "/chat", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "count",
      "description" => "Number of results to fetch.",
      "dataType" => "number",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "100"
    },
    {
      "name" => "start",
      "description" => "Starting point for results.",
      "dataType" => "number",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "0"
    },
    {
      "name" => "reverse",
      "description" => "If true, will sort results newest first.",
      "dataType" => "boolean",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "true"
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/chat/connected', {
  "resourcePath" => "/Chat",
  "summary" => "Get connected users.",
  "nickname" => "chat/get_connected", 
  "responseClass" => "ConnectedUsers", 
  "endpoint" => "/chat/connected", 
  "notes" => "Returns an array with browser users in the first position and API users (bots) in the second position.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/chat', {
  "resourcePath" => "/Chat",
  "summary" => "Send a chat message.",
  "nickname" => "chat/new", 
  "responseClass" => "Chat", 
  "endpoint" => "/chat", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


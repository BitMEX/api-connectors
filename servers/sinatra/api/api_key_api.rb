require 'json'


MyApp.add_route('GET', '/apiKey', {
  "resourcePath" => "/ApiKey",
  "summary" => "Get your API Keys.",
  "nickname" => "api_key/get", 
  "responseClass" => "array[ApiKey]", 
  "endpoint" => "/apiKey", 
  "notes" => "",
  "parameters" => [
    
    {
      "name" => "reverse",
      "description" => "If true, will sort results newest first.",
      "dataType" => "boolean",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "false"
    },
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/apiKey', {
  "resourcePath" => "/ApiKey",
  "summary" => "Create a new API Key.",
  "nickname" => "api_key/new", 
  "responseClass" => "ApiKey", 
  "endpoint" => "/apiKey", 
  "notes" => "API Keys can also be created via [this Python script](https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py) See the [API Key Documentation](/app/apiKeys) for more information on capabilities.",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/apiKey', {
  "resourcePath" => "/ApiKey",
  "summary" => "Remove an API Key.",
  "nickname" => "api_key/remove", 
  "responseClass" => "inline_response_200", 
  "endpoint" => "/apiKey", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/apiKey/disable', {
  "resourcePath" => "/ApiKey",
  "summary" => "Disable an API Key.",
  "nickname" => "api_key/disable", 
  "responseClass" => "ApiKey", 
  "endpoint" => "/apiKey/disable", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/apiKey/enable', {
  "resourcePath" => "/ApiKey",
  "summary" => "Enable an API Key.",
  "nickname" => "api_key/enable", 
  "responseClass" => "ApiKey", 
  "endpoint" => "/apiKey/enable", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


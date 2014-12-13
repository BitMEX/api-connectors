require 'json'

MyApp.add_route('post', '/', {
  "resourcePath" => "/apiKey",
  "summary" => "Create a new API Key.",
  "nickname" => "createKey", 
  "responseClass" => "ApiKey", 
  "endpoint" => "/", 
  "notes" => "API Keys can also be created via<a href="https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py">this Python script</a>.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/', {
  "resourcePath" => "/apiKey",
  "summary" => "Get your API Keys.",
  "nickname" => "getKeys", 
  "responseClass" => "Array[ApiKey]", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('delete', '/', {
  "resourcePath" => "/apiKey",
  "summary" => "Remove an API Key.",
  "nickname" => "remove", 
  "responseClass" => "boolean", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/disable', {
  "resourcePath" => "/apiKey",
  "summary" => "Disable an API Key.",
  "nickname" => "disable", 
  "responseClass" => "ApiKey", 
  "endpoint" => "/disable", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/enable', {
  "resourcePath" => "/apiKey",
  "summary" => "Enable an API Key.",
  "nickname" => "enable", 
  "responseClass" => "ApiKey", 
  "endpoint" => "/enable", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end



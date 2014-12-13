require 'json'

MyApp.add_route('get', '/', {
  "resourcePath" => "/chat",
  "summary" => "Get chat messages.",
  "nickname" => "get", 
  "responseClass" => "Array[Chat]", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "count",
      "description" => "",
      "dataType" => "double",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      "defaultValue" => 100},
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/', {
  "resourcePath" => "/chat",
  "summary" => "Send a chat message.",
  "nickname" => "send", 
  "responseClass" => "Chat", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end



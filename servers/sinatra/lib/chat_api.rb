require 'json'

MyApp.add_route('post', '/', {
  "resourcePath" => "/chat",
  "summary" => "Send a chat message.",
  "nickname" => "chat_create", 
  "responseClass" => "chat", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/', {
  "resourcePath" => "/chat",
  "summary" => "Get chat messages.",
  "nickname" => "chat_find", 
  "responseClass" => "Array[chat]", 
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



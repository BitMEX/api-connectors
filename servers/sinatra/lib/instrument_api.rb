require 'json'

MyApp.add_route('get', '/', {
  "resourcePath" => "/instrument",
  "summary" => "Get instruments.",
  "nickname" => "get", 
  "responseClass" => "Array[Instrument]", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "filter",
      "description" => "Table filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;}.",
      "dataType" => "object",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/active', {
  "resourcePath" => "/instrument",
  "summary" => "Get all active instruments and instruments that have expired in <24hrs.",
  "nickname" => "getActive", 
  "responseClass" => "Array[Instrument]", 
  "endpoint" => "/active", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end



require 'json'

MyApp.add_route('get', '/', {
  "resourcePath" => "/execution",
  "summary" => "Get your executions. This includes each trade and insurance charge.",
  "nickname" => "getMyExecutions", 
  "responseClass" => "Array[Execution]", 
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
    {
      "name" => "count",
      "description" => "Number of executions to fetch",
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



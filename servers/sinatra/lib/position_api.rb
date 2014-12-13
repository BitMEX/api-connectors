require 'json'

MyApp.add_route('get', '/', {
  "resourcePath" => "/position",
  "summary" => "Get your positions.",
  "nickname" => "find", 
  "responseClass" => "Array[Position]", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "filter",
      "description" => "Filter. For example, send {&quot;symbol&quot;: &quot;XBTF15&quot;, &quot;open&quot;: true}.",
      "dataType" => "object",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "columns",
      "description" => "Which columns to fetch. For example, send [&quot;columnName&quot;].",
      "dataType" => "Array[any]",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    {
      "name" => "count",
      "description" => "Number of rows to fetch.",
      "dataType" => "double",
      "paramType" => "query",
      "allowMultiple" => false,
      "allowableValues" => "",
      },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end



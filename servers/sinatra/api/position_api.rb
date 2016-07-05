require 'json'


MyApp.add_route('GET', '/api/v1/position', {
  "resourcePath" => "/Position",
  "summary" => "Get your positions.",
  "nickname" => "position/get", 
  "responseClass" => "array[Position]", 
  "endpoint" => "/position", 
  "notes" => "See <a href=\"http://www.onixs.biz/fix-dictionary/5.0.SP2/msgType_AP_6580.html\">the FIX Spec</a> for explanations of these fields.",
  "parameters" => [
    {
      "name" => "filter",
      "description" => "Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "columns",
      "description" => "Which columns to fetch. For example, send [\&quot;columnName\&quot;].",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    {
      "name" => "count",
      "description" => "Number of rows to fetch.",
      "dataType" => "number",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/position/isolate', {
  "resourcePath" => "/Position",
  "summary" => "Enable isolated margin or cross margin per-position.",
  "nickname" => "position/isolate_margin", 
  "responseClass" => "Position", 
  "endpoint" => "/position/isolate", 
  "notes" => "On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/position/transferMargin', {
  "resourcePath" => "/Position",
  "summary" => "Transfer equity in or out of a position.",
  "nickname" => "position/transfer_isolated_margin", 
  "responseClass" => "Position", 
  "endpoint" => "/position/transferMargin", 
  "notes" => "When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/api/v1/position/leverage', {
  "resourcePath" => "/Position",
  "summary" => "Choose leverage for a position.",
  "nickname" => "position/update_leverage", 
  "responseClass" => "Position", 
  "endpoint" => "/position/leverage", 
  "notes" => "On Speculative (DPE-Enabled) contracts, users can choose an isolated leverage. This will automatically enable isolated margin.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


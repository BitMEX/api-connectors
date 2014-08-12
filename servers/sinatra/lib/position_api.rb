require 'json'

MyApp.add_route('get', '/', {
  "resourcePath" => "/position",
  "summary" => "Get your positions.",
  "nickname" => "position_find", 
  "responseClass" => "Array[position]", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end



require 'json'


MyApp.add_route('GET', '/api/v1/announcement', {
  "resourcePath" => "/Announcement",
  "summary" => "Get site announcements.",
  "nickname" => "announcement/get", 
  "responseClass" => "array[Announcement]", 
  "endpoint" => "/announcement", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "columns",
      "description" => "Array of column names to fetch. If omitted, will return all columns.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v1/announcement/urgent', {
  "resourcePath" => "/Announcement",
  "summary" => "Get urgent (banner) announcements.",
  "nickname" => "announcement/get_urgent", 
  "responseClass" => "array[Announcement]", 
  "endpoint" => "/announcement/urgent", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


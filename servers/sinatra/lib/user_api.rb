require 'json'

MyApp.add_route('post', '/login', {
  "resourcePath" => "/user",
  "summary" => "Log in to BitMEX.",
  "nickname" => "user_login", 
  "responseClass" => "object", 
  "endpoint" => "/login", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "object",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/logout', {
  "resourcePath" => "/user",
  "summary" => "Log out of BitMEX.",
  "nickname" => "user_logout", 
  "responseClass" => "void", 
  "endpoint" => "/logout", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/', {
  "resourcePath" => "/user",
  "summary" => "Register a new user.",
  "nickname" => "user_create", 
  "responseClass" => "user", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "Model instance data",
      "dataType" => "user",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('get', '/', {
  "resourcePath" => "/user",
  "summary" => "Get your user model.",
  "nickname" => "user_getMe", 
  "responseClass" => "user", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('put', '/', {
  "resourcePath" => "/user",
  "summary" => "Update your password, name, and other attributes.",
  "nickname" => "user_updateMe", 
  "responseClass" => "user", 
  "endpoint" => "/", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/savePrefs', {
  "resourcePath" => "/user",
  "summary" => "Save application preferences.",
  "nickname" => "user_savePreferences", 
  "responseClass" => "user", 
  "endpoint" => "/savePrefs", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/requestSMS', {
  "resourcePath" => "/user",
  "summary" => "Request an SMS verification token.",
  "nickname" => "user_verifyPhone", 
  "responseClass" => "boolean", 
  "endpoint" => "/requestSMS", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

MyApp.add_route('post', '/confirmPhone', {
  "resourcePath" => "/user",
  "summary" => "Confirm your phone number by entering your SMS verification token.",
  "nickname" => "user_confirmPhone", 
  "responseClass" => "user", 
  "endpoint" => "/confirmPhone", 
  "notes" => "",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end



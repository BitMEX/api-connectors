part of api;


@Entity()
class RoleMapping {
  
  num id = null;
  
  /* The principal type, such as user, application, or role */
  String principalType = null;
  
  
  String principalId = null;
  
  
  num roleId = null;
  
  
  RoleMapping();

  @override
  String toString()  {
    return 'RoleMapping[id=$id, principalType=$principalType, principalId=$principalId, roleId=$roleId, ]';
  }

}


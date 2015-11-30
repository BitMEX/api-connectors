part of api;


@Entity()
class AnonymousModel5 {
  /* See the API docs for the list of supported values. */
  String scheme = null;
  
  /* Scheme-specific credentials */
  Object credential = null;
  
  
  AnonymousModel5();

  @override
  String toString()  {
    return 'AnonymousModel5[scheme=$scheme, credential=$credential, ]';
  }

}


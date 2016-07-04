part of api;


@Entity()
class Error {
  
  @Property(name: 'message')
  String message = null;
  

  @Property(name: 'code')
  Number code = null;
  
  Error();

  @override
  String toString()  {
    return 'Error[message=$message, code=$code, ]';
  }

}


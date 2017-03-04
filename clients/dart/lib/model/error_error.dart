part of api;


@Entity()
class ErrorError {
  
  @Property(name: 'message')
  String message = null;
  

  @Property(name: 'name')
  String name = null;
  
  ErrorError();

  @override
  String toString()  {
    return 'ErrorError[message=$message, name=$name, ]';
  }

}


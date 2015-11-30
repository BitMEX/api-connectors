part of api;


@Entity()
class Error {
  
  String message = null;
  
  
  Number code = null;
  
  
  Error();

  @override
  String toString()  {
    return 'Error[message=$message, code=$code, ]';
  }

}


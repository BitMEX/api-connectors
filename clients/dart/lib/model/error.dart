part of api;


@Entity()
class Error {
  
  @Property(name: 'error')
  ErrorError error = null;
  
  Error();

  @override
  String toString()  {
    return 'Error[error=$error, ]';
  }

}


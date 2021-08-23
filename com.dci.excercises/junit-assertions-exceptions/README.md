## Overview
   
   assertThrows() method ensures error/exception handling works correctly.
    
## Task

 Create a Employee class with getters for the following properties:
 
    int empId;   
    String firstName;
    String lastName;
    String[] departments;
 
 Add code in the constructor which throws IllegalArgumentException if lastName is null
  
 Create a test class and test method to create Employee instance with below values:

    empId = 1001;   
    firstName = Hugo;
    lastName = null;
    departments = "sales", "admin"
 
 Write test method to verify :
   * IllegalArgumentException thrown during the object creation by using assertThrows()
   
   
   
    


package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;
public class Contact{
    private String Value;
    
    public Contact(String contact){
 		  this.Value = contact;
 	  }
 	  
 	  public String toString(){
 	    return Value;
 	  }
 }

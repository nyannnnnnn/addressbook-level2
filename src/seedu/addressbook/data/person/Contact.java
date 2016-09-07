package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact{
    private String value;
    private boolean isPrivate;
    public Contact(String contact, boolean isPrivate, String validation, String constrains){
 		this.isPrivate = isPrivate;
        contact = contact.trim();
        if (!isValid(contact, validation)) {
            throw new IllegalValueException(constrains);
        }
        this.value = contact;
 	  }
 	  
 	  private boolean isValid(String contact, String validation){
 	      return test.mathes(contact, validation);
 	  }
 	  
 	  public boolean isPrivate(){
 	      return isPrivate;
 	  }
 	  
 	  public String toString(){
 	    return Value;
 	  }
 	  
 	  @Override
 	  public int hashCode() {
 	    return value.hashCode();
 	  }
 }

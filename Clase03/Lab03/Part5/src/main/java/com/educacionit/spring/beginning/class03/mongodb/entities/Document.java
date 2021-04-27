
package com.educacionit.spring.beginning.class03.mongodb.entities;



import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;


public class Document implements Serializable {
	
	

	@Id
	private String id;

	private Integer number;

	private String name = "";

	private String  address = "";


	private static final long serialVersionUID = 7528129259859212248L;
	
	
	public Document() {
			
		super ();
	}

	public Document (String id, Integer number, String name,
                     String address) {
			
		super ();
			
		this.id = id;
		this.number  = number;
		this.name   = name;
		this.address  = address;
	}


    public String getId () {

        return this.id;
    }


    public void setId (String id) {

        this.id = id;
    }


	public Integer getNumber () {
        
    	return this.number;
    }


    public void setNumber (Integer number) {

    	this.number = number;
    }

	public String getName () {
    	
    	// Return the value.
    	return this.name;
	}


	public void setName (String name) {
		
			this.name = name;
	}

    public String getAddress () {

        // Return the value.
        return this.address;
    }


    public void setAddress (String address) {

        this.address = address;
    }

 	/* (non-Javadoc)
 	 * @see java.lang.Object#hashCode ()
 	 */
 	@Override
 	public int hashCode () {
 			
 		// Return the value.
 		int hash = 0;  
 	    hash += (this.getId () != null ? this.getId ().hashCode () : 0);  
         	  
 	    // Return the new value.
 	    return hash;
 	}

 	/* (non-Javadoc)
 	 * @see java.lang.Object#equals (java.lang.Object)
 	 */
 	@Override
 	public boolean equals (Object object) {
 			
 		// Return the value.
 		if (this == object)  {
 			return true;
 		}
 	              
 	    if (object == null) {
 	       	return false;
 	    }  
 	              
 	    if (getClass () != object.getClass ()) {
 	        return false;
 	    }  
 	              
 	    // Check the classes.
 	    Document other = (Document) object;
 	    if (!this.id.equals (other.getId ())) {  
             return false;  
         }  
 	        
 	    // Return the value.
 	    return true; 
 	}

 	/* (non-Javadoc)
 	 * @see java.lang.Object#toString ()
 	 */
 	@Override
 	public String toString () {

 		if (this.id != null) {
 			return String.format ("Document Id [%s] Name [%s] Number [%d]", this.id, this.name, this.number);
 		} else {
            return String.format ("Document Id [#] Name [#] Number [#]");
 		} 
 	}
}
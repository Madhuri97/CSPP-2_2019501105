/**
 * This class discusses about the Contact Object. The attributes of the contact object
 * are as follows. 
 * name : Name of the person / friend. 
 * email : mail id of the person / friend. 
 * phoneNumber : Phone Number of the person / friend.
 * 
 * @author Siva Sankar 
 */
//it is used for not changing the variables in the method so 
class Contact {
    private String name;
    private String email;
    private String phoneNumber;
    //constructor
    Contact(final String n, final String e, final String p) {
        this.name = n;
        this.email = e;
        this.phoneNumber = p;
    }
    //getters 
    public String getName() {
        return this.name;  //return the name of the particular name
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    //{ Name = Bob Sedgewick, Email = bob@gmail.com, Phone Number = +91 9999912345 }
    public String toString() {
        return "{ Name = " +this.name +", Email = " + this.email + ", Phone Number = " + this.phoneNumber + " }";
    }
    //setter (manupulating contact list, we dont return anything )
    public void setName(final String toSet) {
        this.name = toSet;
    }
    public void setEmail(final String toSet) {
        this.email = toSet;
    }
    public void setPhoneNumber(final String toSet) {
        this.phoneNumber = toSet;
    }
}
//  Your code goes here... For Contact class


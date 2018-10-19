/**
 * The Model Object for the MVC design
 * @author Muneeb Nasir, Student NO: 101033955
 * @version 6.0
 */
public class BuddyModel
{
    private String name;
    private String address;
    private String number;
    private String email;

    public BuddyModel()
    {
        this.address = null;
        this.name = null;
        this.number = null;
    }

    public BuddyModel(String name, String address, String number, String email)
    {
        this.address = address;
        this.name = name;
        this.number = number;
        this.email = email;
    }
    /**
     * The getter method for attaining the all the information of the Buddy object
     */
    @Override
    public String toString()
    {
        String test = "Name: "+ name + "        Address: " + address + "        Number: " + number +    "       Email: " + email + "\n";
        return test;
    }
    /**
     * The getter method for attaining the address of the Buddy object
     */
    public String getAddress() {
        return address;
    }

    /**
     * The setter method for declaring the EMAIL of the Buddy object
     */
    public void setEmail(String email) {
        this.address = email;
    }

    /**
     * The setter method for declaring the address of the Buddy object
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * The getter method for attaining the name of the Buddy object
     */
    public String getName() {
        return name;
    }

    /**
     * The getter method for attaining the EMAIL of the Buddy object
     */
    public String getEmail() {
        return email;
    }


    /**
     * The setter method for declaring the name of the Buddy object
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The getter method for attaining the address of the Buddy object
     */
    public String getNumber() {
        return number;
    }

    /**
     * The setter method for declaring the address of the Buddy object
     */
    public void setNumber(String number) {
        this.number = number;
    }





}

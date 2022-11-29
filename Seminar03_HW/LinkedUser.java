package Seminar03_HW;


public class LinkedUser{
    private int id;
    private String firstName;
    private String lastName;
    private int nextUserId;
    
    
    public int getId() {
        return id;
    }
    

    public LinkedUser(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public LinkedUser(int id, String firstName, String lastName, int nextUserId) {
        this(id, firstName, lastName);
        this.nextUserId = nextUserId;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    
    @Override
    public String toString() {
        return String.format("%d %s %s %d", id, firstName, lastName, nextUserId);
    }


    
}

import java.util.List;

public class User implements Comparable<User>{
    private String firstName;
    private String lastName;
    private Integer age;
    private Personal subordinates;

    public Personal getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<User>subordinates) {
        this.subordinates = new Personal (subordinates);
    }

    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s", firstName, lastName, age);
    }

    @Override
    public int compareTo(User other) {
        return this.firstName.compareTo(other.firstName);

        // if (this.age < other.age) {
        //      return -1;
        // }
        // if (this.age == other.age) {
        //      return 0;
        // }
        //  return 1;
        
    }

    
}

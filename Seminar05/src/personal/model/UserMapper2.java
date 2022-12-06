package personal.model;

public class UserMapper2 {
    public String map2(User user) {
        return String.format("%s; %s; %s; %s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map2(String line) {
        String[] lines = line.split("; ");
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}

package ProfLesson;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Name", "SecondName", "Vich");
        SerializationAction.writeToXML(user);
        User newUser = SerializationAction.readFromXML(User.class);
        System.out.println(newUser);
    }
}

/**
 * Created by ethan on 2017-02-07.
 * edited
 */
public class Student extends Person {
    private String major;
    private boolean fulltime;

    Student(String name, String emailAddress, String major, boolean fulltime) {
        super(name, emailAddress);
        this.major = major;
        this.fulltime = fulltime;
    }

    public String toString() {
        return String.format("Name: %s\nMajor: %s\nEmail: %s", this.name, this.major, this.emailAddress);
    }
}

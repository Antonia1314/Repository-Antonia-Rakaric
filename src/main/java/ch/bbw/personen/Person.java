package ch.bbw.personen;

public class Person {
    private String firstname;
    private String lastname;
    private String email;
    private String registrationNumber;

    public Person(String firstname, String lastname, String email) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public String getFirstname() { return firstname; }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

}

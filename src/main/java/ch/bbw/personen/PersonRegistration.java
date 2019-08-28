package ch.bbw.personen;

import java.util.ArrayList;
import java.util.List;

class PersonRegistration {
    private List<Person> personenList;
    private static PersonRegistration personenregistarion = null;

    private PersonRegistration() {
        personenList = new ArrayList<Person>();
    }

    public static PersonRegistration getInstance() {
        if (personenregistarion == null) {
            personenregistarion = new PersonRegistration();
            return personenregistarion;
        } else {
            return personenregistarion;
        }
    }

    public void add(Person person) {
        personenList.add(person);
    }

    public String upDateStudent(Person person) {
        for (int i = 0; i < personenList.size(); i++) {
            Person person1 = personenList.get(i);
            if (person1.getRegistrationNumber().equals(person.getRegistrationNumber())) {
                personenList.set(i, person);
                //Person updaten
                return "Update successful";
            }
        }
        return "Update un-successful";
    }

    public String deleteStudent(Person Person) {
        for (int i = 0; i < personenList.size(); i++) {
            Person person = personenList.get(i);
            System.out.println(personenList.get(i));
            if (person.getRegistrationNumber().equals(person.getRegistrationNumber())) {
                personenList.remove(i);
                //Person wird gelöscht
                return "Delete successful";
            }
        }
        return "Delete un-successful";
    }

    //Alle Personen aus der Liste ausgeben
    public List<Person> getStudentRecords() {
        return personenList;
    }
}
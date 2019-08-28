package ch.bbw.personen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonRegistrationsController {
    @RequestMapping(method = RequestMethod.POST, value = "/register/person")

    @ResponseBody
    public PersonRegistrationAntwort registerStudent(@RequestBody Person person) {
        System.out.println("In registerStudent");
        PersonRegistrationAntwort personRegistrationAntwort = new PersonRegistrationAntwort();
        PersonRegistration.getInstance().add(person);

        personRegistrationAntwort.setFirstname(person.getFirstname());
        personRegistrationAntwort.setLastname(person.getLastname());
        personRegistrationAntwort.setEmail(person.getEmail());
        personRegistrationAntwort.setRegistrationNumber(person.getRegistrationNumber());
        personRegistrationAntwort.setRegistrationStatus("Successful");
        System.out.println("Student wurde registriert");
        return personRegistrationAntwort;
    }

}

package ch.bbw.personen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {

    @RequestMapping(method = RequestMethod.GET, value = "/student/allstudent")
    @ResponseBody
    public List<Person> getAllStudents() {
        System.out.println("Get all Students");
        return PersonRegistration.getInstance().getStudentRecords();
        //Alle Personen aus der Liste ausgeben
    }

}

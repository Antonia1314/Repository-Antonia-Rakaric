package ch.bbw.personen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonUpdateController {

    @RequestMapping(method = RequestMethod.PUT, value = "/update/student")
    @ResponseBody
    public String upDateStudent(@RequestBody Person person) {
        System.out.println("In updateStudentRecord");
        return PersonRegistration.getInstance().upDateStudent(person);
    }
}

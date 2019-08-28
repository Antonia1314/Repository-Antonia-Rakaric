package ch.bbw.personen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonDeleteController {

    @RequestMapping(method = RequestMethod.DELETE, value="/delete/student")
    @ResponseBody
    public String deleteStudent(@RequestBody Person person) {
        System.out.println("In deleteStudentRecord");
        return PersonRegistration.getInstance().deleteStudent(person);
    }
}


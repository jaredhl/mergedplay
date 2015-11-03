package controllers;

import play.data.Form;
import play.mvc.Controller;
import models.*;
import play.libs.*;
import play.data.*;
import javax.validation.*;
import static play.data.validation.Constraints.*;
import static play.mvc.Results.*;
import play.db.ebean.Model.*;
import play.mvc.*;
import play.libs.Scala;

import views.html.*;

import java.util.*;

/**
 * Created by cloftin on 10/28/15.
 */
public class Data extends Controller{
    static Form<StudentMember> studentForm = Form.form(StudentMember.class);

    public Result show(){
        /*Map<String, String> toBind = new HashMap<String,String>();
        toBind.put("firstName", "diane");
        StudentMember student = studentForm.bind(toBind).get();
        */

        return ok(data.render(studentForm));
    }

    @play.db.ebean.Transactional
    /*public Result post(){
        Form<StudentMember> boundForm = studentForm.bindFromRequest();
        if(boundForm.hasErrors()){
            return badRequest(data.render(boundForm));
        } else {
            StudentMember member = boundForm.get();
            StudentMember existing = StudentMember.findById();
                    .where()
                        .eq("firstName", member.firstName)
                    .findUnique(); //search by firstname
        }
    }*/

    public Result post(){
        return ok(data.render(studentForm.bindFromRequest()));
    }
}

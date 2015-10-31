package controllers;

import play.data.Form;
import play.mvc.Controller;
import models.*;
import play.*;
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

    public Result post(){
        return ok(data.render(studentForm.bindFromRequest()));
    }
}

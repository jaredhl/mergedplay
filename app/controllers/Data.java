package controllers;

import com.avaje.ebean.Model;
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

//no need to use JPA if we're using ebean

import views.html.*;

import java.util.*;

//TODO: transactional stuff isn't working right now, so just use an in memory db and say you're waiting for chris

/**
 * Created by cloftin on 10/28/15.
 */
public class Data extends Controller{
    //TODO: get form working from login
    //TODO: add login auth for all views
    //workflow for demo: user logs in,
    static Form<StudentMember> studentForm = Form.form(StudentMember.class);

    public Result show(){

        //stuff below autofills the form
        /*Map<String, String> toBind = new HashMap<String,String>();
        toBind.put("firstName", "diane");
        StudentMember student = studentForm.bind(toBind).get();
        */

        return ok(data.render(studentForm));
        //display an empty form to the user
    }

    //@play.db.ebean.Transactional
    public Result post(){

        //cheat and use an in memory database?
        //TODO: login, fill out form, submit, logout, log back in, form should fill up
        //want to associate login with form data and pull accordingly
        Form<StudentMember> boundForm = studentForm.bindFromRequest();

        if(boundForm.hasErrors()){
            //check if form created from request is bad
            return badRequest(data.render(boundForm));
        } else {

            StudentMember member = boundForm.get();
            //declare a enw finder here?
            Model.Finder<String, StudentMember> find = new Model.Finder(StudentMember.class);
            StudentMember existing = (StudentMember) find.where().eq("firstName", member.firstName);

            if(existing != null){
                //we have an existing user by this name, populate with their data
                member = existing;
            }
            member.save();
            //save result
            return ok(data.render(boundForm));
        }

    }

    /*public Result post(){
        //simple version
        return ok(data.render(studentForm.bindFromRequest()));
    }*/
}

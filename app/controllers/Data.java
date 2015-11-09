package controllers;

import com.avaje.ebean.*;
import static play.data.Form.*;
import play.mvc.Controller;
import models.*;
import play.libs.*;
import play.data.*;
import javax.validation.*;
import static play.data.validation.Constraints.*;
import static play.mvc.Results.*;
import play.db.ebean.Transactional;
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

    //static Form<StudentMember> studentForm = Form.form(StudentMember.class);

    public Result create(){

        //if id is 0, we use the static form we created, otherwise we bind it from an existing student

        //StudentMember = (id == 0) ? new StudentMember() : StudentMember.makeFromId(id);

        Form<StudentMember> studentForm = form(StudentMember.class);

        return ok(data.render(studentForm));
        //display an empty form to the user
    }

    @play.db.ebean.Transactional
    public Result save(){

        //cheat and use an in memory database?
        //TODO: login, fill out form, submit, logout, log back in, form should fill up
        //want to associate login with form data and pull accordingly
        Form<StudentMember> boundForm = form(StudentMember.class).bindFromRequest();

        if(boundForm.hasErrors()){
            //check if form created from request is bad
            return badRequest(data.render(boundForm));
        } else {

            boundForm.get().save();
            //StudentMember member = boundForm.get();
            //declare a enw finder here?
            /*Model.Finder<String, StudentMember> find = new Model.Finder(StudentMember.class);
            StudentMember existing = (StudentMember) find.where().eq("firstName", member.firstName);

            if(existing != null){
                //we have an existing user by this name, populate with their data
                member = existing;
            }*/

            //TODO: save not working for some reason...

            //com.avaje.ebean.Ebean.save(member);
            //member.save();
            //save result
            return ok(data.render(boundForm));
        }

    }

    public Result add(){
        //adds a dummy entry to the db
        StudentMember student = new StudentMember();
        student.setFirstName("Scott");
        student.setMajor("nothing");
        student.save();
        return ok("record is added");
    }

    /*public Result post(){
        //simple version
        return ok(data.render(studentForm.bindFromRequest()));
    }*/
}

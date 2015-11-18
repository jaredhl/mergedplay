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

    public static Result create(){

        //if id is 0, we use the static form we created, otherwise we bind it from an existing student

        //StudentMember = (id == 0) ? new StudentMember() : StudentMember.makeFromId(id);

        Form<StudentMember> studentForm = form(StudentMember.class);

        return ok(data.render(studentForm));
        //display an empty form to the user
    }

    @play.db.ebean.Transactional
    public static Result save(){

        Form<StudentMember> boundForm = form(StudentMember.class).bindFromRequest();

        System.out.println("name: " + boundForm.get().firstName);

        if(boundForm.hasErrors()){
            return badRequest(data.render(boundForm));
        } else {

            //TODO: validation errors mean that this operation could return null (nothing is saved)
            boundForm.get().save();

            /*StudentMember member = boundForm.get();
            //declare a new finder here?
            Model.Finder<String, StudentMember> find = new Model.Finder(StudentMember.class);
            StudentMember existing = (StudentMember) find.where().eq("firstName", member.firstName);

            if(existing != null){
                //we have an existing user by this name, populate with their data
                member = existing;
            }*/

            //TODO: save not working for some reason...
            //okay, save works now, get it working with form data, then work on search

            //com.avaje.ebean.Ebean.save(member);
            //member.save();
            //save result
            return ok(data.render(boundForm));
        }

    }

    public static Result add(){
        //adds a dummy entry to the db
        StudentMember student = new StudentMember();
        student.setFirstName("Scott");
        student.setMajor("nothing");
        student.save();
        return ok("record is added");
    }

    public static List<StudentMember> find(String firstNameQuery){
        //takes a query for a first name and returns a list of results
        List<StudentMember> members = StudentMember.find.where().like("firstName", "firstNameQuery").findList();
        return members;
    }

    /*public Result post(){
        //simple version
        return ok(data.render(studentForm.bindFromRequest()));
    }*/
}

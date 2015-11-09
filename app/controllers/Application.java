package controllers;

import java.util.*;
import com.avaje.ebean.Model;
import play.libs.*;
import play.mvc.*;
import play.data.*;
import play.*;
import models.*;
import views.*;
import views.html.*;

public class Application extends Controller{

    //get it working with the Ebean ORM, then look into using Slick (requires knowledge of scala)
    //modify computer database app
    //TODO: text search for db objects
    //could always revert to an older version of the framework that supports ebean
    //talk to CCA, merge with front end
    //annotation ensures a valid session is required to access page
    @Security.Authenticated(ActionAuthenticator.class)
    public Result index() {

        //String firstName = new Model.Finder<String, StudentMember>(StudentMember.class).where().;
        return ok(views.html.index.render(
                //Task.findTodoInvolving(request().username()),
                //StudentMember.find.byId(request().username())
                "application is working"
        ));
    }

    public Result login(){
        Form<Login> loginForm = Form.form(Login.class);
        return ok(login.render(loginForm));
    }

    public Result authenticate(){
        //doesn't do anything, lets anyone in
        Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
        if(loginForm.hasErrors()){
            return badRequest(login.render(loginForm));
        } else {
            //login successful, reroute to index page
            session().clear();
            session("email", loginForm.get().email);
            return redirect(
                    //invalid login: redirect to login page
                    routes.Data.create()
            );
        }

    }

    public Result logout(){
        session().clear();
        flash("success","you've been logged out");
        return redirect(routes.Application.login());
    }

    public Result allUsers(){
        //render firstNames and majors of all members of the db
        //this page gives all users currently in the db
        List<StudentMember> allMembers = StudentMember.find.all();
        //get usernames and render them as a page
        //should work with the in-memory database
        return ok(views.html.members.render(allMembers));

    }


}

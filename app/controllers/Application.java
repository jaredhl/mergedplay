package controllers;

import play.libs.*;
import play.mvc.*;
import play.data.*;
import play.*;
import models.*;
import views.*;
import views.html.*;

public class Application extends Controller{

    //annotation ensures a valid session is required to access page
    @Security.Authenticated(ActionAuthenticator.class)
    public Result index() {
        return ok(views.html.index.render(
                //Project.findInvolving(request().username()),
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
                    routes.Application.index()
            );
        }

    }

    public Result logout(){
        session().clear();
        flash("success","you've been logged out");
        return redirect(routes.Application.login());
    }


}

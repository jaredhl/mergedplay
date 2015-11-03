package controllers;

import play.mvc.*;

/**
 * Created by cloftin on 11/2/15.
 */
public class ActionAuthenticator extends Security.Authenticator{
    //authentication
    @Override
    public String getUsername(Http.Context ctx){
        return ctx.session().get("email"); //username is email for our purposes
    }

    public Result onUnauthorized(Http.Context ctx){
        return redirect(routes.Application.login()); //return user to login page
    }
}

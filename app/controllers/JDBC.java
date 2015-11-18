package controllers;


import play.mvc.*;

import db.jdbc.SampleDB;
import play.libs.*;
import java.util.List;
import play.mvc.*;
import play.*;

/**
 * Created by cloftin on 10/31/15.
 */
public class JDBC extends Controller{
    public static Result page(){
        return ok(views.html.jdbc.render());
    }
    public static Result table(){
        try{
            SampleDB.createTestTable();
            return ok("table created");
        } catch(Exception e){
            return internalServerError(e.getMessage());
        }
    }

    public static Result test(String value){
        try{
            SampleDB.insertTestData(value);
            List<String> vs = SampleDB.getTestData();
            return ok(Json.toJson(vs));
        } catch(Exception e){
            return internalServerError(e.getMessage());
        }
    }
}

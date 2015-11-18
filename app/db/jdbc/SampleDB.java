package db.jdbc;


import play.db.*;
import java.sql.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by cloftin on 10/31/15.
 */
public class SampleDB {
    public static Connection connect(){
        return DB.getConnection();
    }

    public static void disconnect(Connection connection) throws Exception{
        connection.close();
    }

    public static void createTestTable(){
        Connection c = connect();
        try{
            c.createStatement().executeUpdate("create table test(value varchar(50))");
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            try{
               disconnect(c);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void insertTestData(String v) throws Exception{
        Connection c = connect(); //connect to db
        try{
            c.createStatement().executeUpdate("insert into test values ('" + v + "')");
        } finally{
            disconnect(c);
        }
    }

    public static List<String> getTestData() throws Exception{
        Connection c = connect();
        try{
            //risk of sql injection
            ResultSet resultSet = c.createStatement().executeQuery("select * from test");
            List<String> values = new ArrayList<String>();
            while(resultSet.next()){
                values.add(resultSet.getString(1));
            }
            return values;
        } finally{
            disconnect(c);
        }
    }
}

package models;
import play.data.validation.Constraints.*;
import javax.persistence.*;
import java.util.Calendar;

import com.avaje.ebean.Model;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;




/**
 * Created by cloftin on 10/3/15.
 */
@Entity
//use the default id lookup for now, until we get search working
//@AttributeOverride(name = "id", column = @Column(name="PID"))
public class StudentMember extends Model{


    @Required
    public String firstName, lastName, major;

    public String secondMajor;

    @Required
    @Email
    public String email;

    @Pattern("Freshman|Sophomore|Junior|Senior")
    public String classLevel;

    public String gradYear;

    @Required
    @MinLength(8) //passwords must be at least 8 characters long
    public String password;

    @Required
    @MinLength(9)
    @MaxLength(9)
    @Pattern("^[0-9]*$")
    public String PID; //PID is a string as it is displayed

    public String homeTown;


    //search by PID to be safe?

    public static Finder<Long, StudentMember> find = new Model.Finder<Long, StudentMember>(StudentMember.class); //not really sure what this does

    //constructor
    public StudentMember(String firstName, String lastName, String major, String minor, String classLevel, String email, String PID, String hometown){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.major = major;
        this.classLevel = classLevel;
        this.gradYear = gradYear;
        this.password = password;
        this.PID = PID;
        this.homeTown = hometown;
    }

    public StudentMember(){}

    public StudentMember findByFirstName(String firstName){
        //returns a student member object corresponding to this firstName
        return find.where().eq("firstName", firstName).findUnique();
    }

    public String getSecondMajor() {
        return secondMajor;
    }

    public void setSecondMajor(String secondMajor) {
        this.secondMajor = secondMajor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(String classLevel) {
        this.classLevel = classLevel;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String classYear) {
        this.gradYear = gradYear;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }



    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    /*public String validate(){
        if(Integer.valueOf(gradYear) < Calendar.getInstance().get(Calendar.YEAR)){
            return "Invalid graduation year";
        }
        return "error";
    }*/

    private List<StudentMember> allStudents = new ArrayList(); //arraylist of students

    /*public StudentMember getById(long id){
        //username is just firstname
        for(StudentMember member : allStudents){
            if(member.id == id){
                return member; //return member with this name
            }
        }
        return null;
    }*/


}
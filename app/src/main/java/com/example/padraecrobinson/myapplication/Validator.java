package com.example.padraecrobinson.myapplication;

/**
 * Created by padraecrobinson on 2018-02-10.
 */

public class Validator {

    public int num_passed_checks = 0;

    public int validate(String the_password){
        if(not_password(the_password) && min_length(the_password)){
            System.out.print("password is secure");
        }
        else { System.out.print("password is not secure"); }
        return num_passed_checks;

    }

    //FOLLOWING IS 2 METHODS FOR a2-stage1
    public boolean not_password(String the_password){
        String uncapped_pass = the_password.toLowerCase();
        if(uncapped_pass.equals("password")){
            System.out.print("what a terrible password");
            return false;
        }
        num_passed_checks++;
        return true;
    }

    public boolean min_length(String the_password){
        if(the_password.length() < 8){
            System.out.print("password must be at least 8 characters long");
            return false;
        }
        num_passed_checks++;
        return true;

    }



}

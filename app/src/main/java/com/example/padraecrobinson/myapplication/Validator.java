package com.example.padraecrobinson.myapplication;

/**
 * Created by padraecrobinson on 2018-02-10.
 */

public class Validator {

    public int num_passed_checks = 0;

    public int validate(String the_password){
        if(not_password(the_password) && min_length(the_password)
                && spec_char(the_password) && both_cases(the_password) && has_digit(the_password)) {
            System.out.println("password is secure");
        }
        else { System.out.println("password is not secure"); }
        return num_passed_checks;

    }

    //FOLLOWING IS 2 METHODS FOR a2-stage1
    public boolean not_password(String the_password){
        String uncapped_pass = the_password.toLowerCase();
        if(uncapped_pass.equals("password")){
            System.out.println("what a terrible password");
            return false;
        }
        num_passed_checks++;
        return true;
    }

    public boolean min_length(String the_password){
        if(the_password.length() < 8){
            System.out.println("password must be at least 8 characters long");
            return false;
        }
        num_passed_checks++;
        return true;

    }

    
    //STAGE 2 STUFF BELOW
    
    
    public boolean both_cases(String the_password){
        if(the_password.equals(the_password.toLowerCase()) || the_password.equals(the_password.toUpperCase())){
            System.out.println("Your password must have an uppercase or lowercase character");
            return false;
        }
        else{num_passed_checks++;}
        return true;
    }

    public boolean has_digit(String the_password){
        if(the_password.matches(".*\\d.*")){
            num_passed_checks++;
            return true;
        }
        else {System.out.println("Your password must have at least one digit in it");}
        return false;
    }

    public boolean spec_char(String the_password){
        if(the_password.matches(".*[~!@#$%^&*()_+].*")){
            num_passed_checks++;
            return true;
        }
        else {System.out.println("password must contain special character");}
        return false;
    }



}

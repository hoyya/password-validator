package com.example.padraecrobinson.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    Validator for_test = new Validator();

    String password_sample = "pasasWord";


    @Test
    public void T_validate() throws Exception{
        assertEquals(2,for_test.validate(password_sample));

    }

    @Test
    public void T_not_password() throws Exception{
        assertTrue(for_test.not_password(password_sample));

    }

    @Test
    public void T_min_length() throws Exception{
        assertTrue(for_test.min_length(password_sample));
    }



}

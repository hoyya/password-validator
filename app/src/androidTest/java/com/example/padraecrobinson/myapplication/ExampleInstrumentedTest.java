package com.example.padraecrobinson.myapplication;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    //https://developer.android.com/training/testing/ui-testing/espresso-testing.html
    // THE ABOVE URL WAS CONSULTED IN THE CONSTRUCTION OF THIS FILE

    private String pass_1,pass_2,pass_3,pass_4,pass_5;


    @Before
    public void initialize_passwords(){
        pass_1 = "abcDefg1";
        pass_2 = "password";
        pass_3 = "Abcd3f1%";
        pass_4 = "";
        pass_5 = "ddd2C^";

    }

    @Test
    public void test_pass_1() throws Exception {

    }

    @Test
    public void test_pass_1() throws Exception {

    }

    @Test
    public void test_pass_1() throws Exception {

    }

    @Test
    public void test_pass_1() throws Exception {

    }

    @Test
    public void test_pass_1() throws Exception {

    }
}

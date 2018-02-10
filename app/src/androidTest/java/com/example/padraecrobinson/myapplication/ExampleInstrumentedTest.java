package com.example.padraecrobinson.myapplication;


import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.action.ViewActions.click;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleInstrumentedTest {

    //https://developer.android.com/training/testing/ui-testing/espresso-testing.html
    // THE ABOVE URL WAS CONSULTED IN THE CONSTRUCTION OF THIS FILE

    private String pass_1,pass_2,pass_3,pass_4,pass_5;

    @Rule
    public ActivityTestRule<MainActivity> test_main_activity = new ActivityTestRule<>(
            MainActivity.class);

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
        onView(withId(R.id.input_box)).perform(typeText(pass_1));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.output_box)).check(matches(withText("Password is bad")));

    }

    @Test
    public void test_pass_2() throws Exception {
        onView(withId(R.id.input_box)).perform(typeText(pass_2));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.output_box)).check(matches(withText("Password is bad")));
    }

    @Test
    public void test_pass_3() throws Exception {
        onView(withId(R.id.input_box)).perform(typeText(pass_3));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.output_box)).check(matches(withText("Password is good")));
    }

    @Test
    public void test_pass_4() throws Exception {
        onView(withId(R.id.input_box)).perform(typeText(pass_4));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.output_box)).check(matches(withText("Password is bad")));
    }

    @Test
    public void test_pass_5() throws Exception {
        onView(withId(R.id.input_box)).perform(typeText(pass_5));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.output_box)).check(matches(withText("Password is bad")));
    }
}

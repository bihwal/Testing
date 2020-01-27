package com.example.testing;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MyInstrumentsTest {

    @Rule
    public ActivityTestRule<MainActivity> testRule= new ActivityTestRule<>(MainActivity.class);
    public String result="10";

    @Test
    public void TestAddition(){
        onView(withId(R.id.etFirst)).perform(typeText("6"));

        onView(withId(R.id.etSecond)).perform(typeText("4"));

        onView(withId(R.id.btnSum)).perform(click());

        onView(withId(R.id.tvOutput)).perform(click());
    }
}

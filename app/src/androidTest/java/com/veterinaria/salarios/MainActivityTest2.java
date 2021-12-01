

package com.veterinaria.salarios;


import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest2 {


    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void testSuma(){

        Espresso.onView(ViewMatchers.withId(R.id.edtxCategoria)).perform(ViewActions.typeText("1"),ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.edtxHoras)).perform(ViewActions.typeText("40"),ViewActions.closeSoftKeyboard());

        Espresso.onView(ViewMatchers.withId(R.id.btnCalcular)).perform(click());

        Espresso.onView(ViewMatchers.withId(R.id.txvResultado)).check(matches(withText("480000.0")));

    }



}




package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReminderTests extends TestBase{

    @Test
    public void addNewReminderPositiveTest() {
        //tap on add reminder
        app.getMainScreen().tapOnAddReminder();
        //enter title
        app.getReminder().enterTitle("Holiday");
        //tap on date field
        app.getReminder().tapOnDateField();
        //swipe to month
        app.getReminder().swipeToMonth("future","MAR",2);
        //select date
        app.getReminder().selectDate(7);
        //tap on year
        app.getReminder().tapOnYear();
        //swipe to year and tap
        app.getReminder().swipeToYear("future","2025");
        //tap on ok
        app.getReminder().tapOnOk();
        //tap on time field
        app.getReminder().tapOnTimeField();
        //select time
        app.getReminder().selectTime("am",812,930,538,653);
        //tap on ok
        app.getReminder().tapOnOk();
        //tap on repetition interval field
        app.getReminder().tapOnRepetitionIntervalField();
        //enter number
        app.getReminder().enterNumber("2");
        //swipe up
        app.getReminder().swipe(0.8,0.4);
        //tap on type of repetition field
        app.getReminder().tapOnRepetitionField();
        //select type of repetition
        app.getReminder().selectTypeOfRepetition("Week");
        // save repetition
        app.getReminder().saveReminder();
        //assert by title
        app.getReminder().pause(500);
        Assert.assertTrue(app.getMainScreen().isReminderTitlePresent().contains("Holiday"));
    }
}

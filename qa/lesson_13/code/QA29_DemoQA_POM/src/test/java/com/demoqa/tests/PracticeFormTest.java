package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm().hideIframes();
    }

    @Test
    public void enterPracticeFormTest() {
        new PracticeFormPage(driver).enterPersonalData("Jack", "Sparrow",
                        "jack@gm.com", "1234567890")
                .selectGender("Male")
                .enterDate("13 Jun 1987")
                .addSubject(new String[]{"Maths","Chemistry"})
                .selectHobby(new String[]{"Sports","Reading"})
                .uploadFile("C:/Tools/1.jpg")
                .selectState("NCR")
                .selectCity("Delhi")
                .submit();
    }

    @Test
    public void enterPracticeFormWithChooseDateTest() {
        new PracticeFormPage(driver).enterPersonalData("Jack", "Sparrow",
                        "jack@gm.com", "1234567890")
                .selectGender("Male")
                .chooseDate("June", "1987","16")
                .addSubject(new String[]{"Maths","Chemistry"})
                .selectHobby(new String[]{"Sports","Reading"})
                .uploadFile("C:/Tools/1.jpg")
                .selectState("NCR")
                .selectCity("Delhi")
                .submit();
    }
}

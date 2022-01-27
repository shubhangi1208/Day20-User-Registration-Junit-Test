package com.bridgelabz;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest extends UserRegistration {
    @Test
    public void givenFirstname_WhenProper_ShouldReturnFirstNameisValid() {
        UserRegistration userRegistration= new UserRegistration();
        boolean result = userRegistration.validFirstName("Shubhangi");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenLastname_WhenProper_ShouldReturnLastNameisValid() {
        UserRegistration userRegistration= new UserRegistration();
        boolean result = userRegistration.validLastName("Topale");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnEmailisValid() {
        UserRegistration userRegistration= new UserRegistration();
        boolean result = userRegistration.validEmail("abc@yahoo.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnPhoneNoisValid() {
        UserRegistration userRegistration= new UserRegistration();
        boolean result = userRegistration.validMobileNumber("91 9096067476");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnPasswordisValid() {
        UserRegistration userRegistration =new UserRegistration();
        boolean result= userRegistration.validPassword("Abc@1234");
        Assert.assertEquals(true, result);
    }
}
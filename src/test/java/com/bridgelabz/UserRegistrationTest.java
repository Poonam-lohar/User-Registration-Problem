package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration user = new UserRegistration();

    @Test
    public void giveFirstName_shouldGiveTrue() {
        boolean result = user.validFirstName("Poonam");
        Assertions.assertTrue(result);
    }

    @Test
    public void giveFirstName_ShouldGiveFalse() {
        boolean result = user.validFirstName("poonam");
        Assertions.assertFalse(result);
    }

    @Test
    public void giveLastName_shouldGiveTrue() {
        boolean result = user.validLastName("Desai");
        Assertions.assertTrue(result);
    }

    @Test
    public void givelastName_shouldGiveFalse() {
        boolean result = user.validLastName("desai");
        Assertions.assertFalse(result);
    }

    @Test
    public void giveEmail_shouldGiveTrue() {
        boolean result = user.validEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void giveEmail_shouldGiveFalse() {
        boolean result = user.validEmail("Loharpoonam98@gmail");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNo_ShouldReturnsTrue() {
        boolean result = user.validMobileNumber("91 7058765434");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNo_ShouldReturnsFalse() {
        boolean result = user.validMobileNumber("7034567898");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule1_ShouldReturnsTrue() {
        boolean result = user.validPassword("Poonam15");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule1_ShouldReturnsFalse() {
        boolean result = user.validPassword("poonam456");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule2_ShouldReturnsTrue() {
        boolean result = user.validUpperCasePassword("Poon@m15");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule2_ShouldReturnsFalse() {
        boolean result = user.validUpperCasePassword("poonam");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule3_ShouldReturnsTrue() {
        boolean result = user.validNumericPassword("Poon@m15");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule3_ShouldReturnsFalse() {
        boolean result = user.validNumericPassword("Poonam@");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule4_ShouldReturnsTrue() {
        boolean result = user.validSymbolPassword("Poonam");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule4__ShouldReturnsFalse() {
        boolean result = user.validSymbolPassword("PoonamDesai@");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailSample_ShouldReturnTrue() {
        boolean result = user.validEmailSamples("abc@gmail.com.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmailSample_ShouldReturnFalse() {
        boolean result = user.validEmailSamples("abc123@.com");
        Assertions.assertFalse(result);
    }
}



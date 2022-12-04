package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration user = new UserRegistration();

    @Test
    public void giveFirstName_shouldGiveTrue() {
        try {
            boolean result = user.validFirstName("Poonam");
            Assertions.assertTrue(result);
        } catch (UserRegistrationexception e) {
            System.out.println("Valid First name:" + e);
        }
    }

    @Test
    public void giveFirstName_ShouldGiveFalse() {
        try {
            boolean result = user.validFirstName("poonam");
            Assertions.assertFalse(result);
        } catch (UserRegistrationexception e) {
            System.out.println("Invalid First name:" + e);
        }
    }

    @Test
    public void giveLastName_shouldGiveTrue() {
        try {
            boolean result = user.validLastName("Desai");
            Assertions.assertTrue(result);
        } catch (UserRegistrationexception e) {
            System.out.println("Valid lastname:" + e);
        }
    }

    @Test
    public void givelastName_shouldGiveFalse() {
        try {
            boolean result = user.validLastName("desai");
            Assertions.assertFalse(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }

    @Test
    public void giveEmail_shouldGiveTrue() {
        try {
            boolean result = user.validEmail("abc.xyz@bl.co.in");
            Assertions.assertTrue(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }

    @Test
    public void giveEmail_shouldGiveFalse() {
        try {
            boolean result = user.validEmail("Loharpoonam98@gmail");
            Assertions.assertFalse(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMobileNo_ShouldReturnsTrue() {
        try {
            boolean result = user.validMobileNumber("91 7058765434");
            Assertions.assertTrue(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenMobileNo_ShouldReturnsFalse() {
        try {
            boolean result = user.validMobileNumber("7034567898");
            Assertions.assertFalse(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }


    @Test
    public void givenPasswordRule1_ShouldReturnsTrue() {
        try {
            boolean result = user.validPassword("Poonam15");
            Assertions.assertTrue(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule1_ShouldReturnsFalse() {
        try {
            boolean result = user.validPassword("poonam456");
            Assertions.assertFalse(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_ShouldReturnsTrue() {
        try {
            boolean result = user.validUpperCasePassword("Poon@m15");
            Assertions.assertTrue(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule2_ShouldReturnsFalse() {
        try {
            boolean result = user.validUpperCasePassword("poonam");
            Assertions.assertFalse(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule3_ShouldReturnsTrue() {
        try {
            boolean result = user.validNumericPassword("Poon@m15");
            Assertions.assertTrue(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule3_ShouldReturnsFalse() {
        try {
            boolean result = user.validNumericPassword("Poonam@");
            Assertions.assertFalse(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule4_ShouldReturnsTrue() {
        try {
            boolean result = user.validSymbolPassword("Poonam");
            Assertions.assertTrue(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenPasswordRule4__ShouldReturnsFalse() {
        try {
            boolean result = user.validSymbolPassword("PoonamDesai@");
            Assertions.assertFalse(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmailSample_ShouldReturnTrue() {
        try {
            boolean result = user.validEmailSamples("abc@gmail.com.com");
            Assertions.assertTrue(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmailSample_ShouldReturnFalse() {
        try {
            boolean result = user.validEmailSamples("abc123@.com");
            Assertions.assertFalse(result);
        } catch (UserRegistrationexception e) {
            System.out.println(e);
        }
    }
}



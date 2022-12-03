package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {

        System.out.println("Welcome To User Registration Problem....");

        UserRegistration user = new UserRegistration();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1: To validate First Name:\nEnter 2: To validate Last Name:" +
                "\nEnter 3: To validate Email:\nEnter 4: To validate Mobile Number:" +
                "\nEnter 5: To validate Password Rule1:\nEnter 6: To validate Password Rule2:" +
                "\nEnter 7: To validate Password Rule3:\nEnter 8: To validate Password Rule3" +
                "\nEnter 9: To validate Email Samples:");

        switch (sc.nextInt()) {
            case 1:
                user.validFirstName("Poonam");
                break;
            case 2:
                user.validLastName("Desai");
                break;
            case 3:
                user.validEmail("abc.xyz@bl.co.in");
                break;
            case 4:
                user.validMobileNumber("91 7058835985");
                break;
            case 5:
                user.validPassword("Poonam15");
                break;
            case 6:
                user.validUpperCasePassword("Poonamdesai");
                break;
            case 7:
                user.validNumericPassword("Poonam5");
                break;
            case 8:
                user.validSymbolPassword("Poonam@5");
                break;
            case 9:
                user.validEmailSamples("abc@gmail.com.com");
                break;
        }
    }
}

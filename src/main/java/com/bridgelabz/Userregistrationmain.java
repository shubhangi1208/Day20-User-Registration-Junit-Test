package com.bridgelabz;

import java.util.Scanner;

public class Userregistrationmain {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        UserRegistration user = new UserRegistration();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println(" 1.To validate First Name \n 2.To validate Last Name \n 3.To Validate Email ID \n 4.To validate Mobile number \n 5.To validate Password \n 6.Quit ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter First Name ");
                    String name = sc.next();
                    user.validFirstName(name);
                    break;
                case 2:
                    System.out.println("Enter Last Name ");
                    String lastname = sc.next();
                    user.validLastName(lastname);
                    break;
                case 3:
                    System.out.println("Enter Email ID ");
                    String emailID = sc.next();
                    user.validEmail(emailID);
                case 4:
                    System.out.println("Enter the Mobile Number");
                    String mobilenumber= sc.next();
                    user.validMobileNumber(mobilenumber);
                    break;
                case 5:
                    System.out.println("Enter the Password");
                    String password =sc.next();
                    user.validPassword(password);
                    break;
                case 6:
                    System.out.println("Thank You ");
                    break;
            }

        } while (choice != 6);
    }
}

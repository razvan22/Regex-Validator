package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(validatePhoneNumber("08-12 34 56"));
        System.out.println(validatePhoneNumber("040-123 45"));
        System.out.println(validatePhoneNumber("0704-12 34 56"));
        System.out.println(validatePhoneNumber("0707321654"));
        System.out.println(validatePhoneNumber("0707 555 666"));
        System.out.println("\n");


        System.out.println(validateEmail("razviy69@gmail.com"));
        System.out.println("\n");

        System.out.println(validateBirthDate("1990-08-21 1234"));
        System.out.println(validateBirthDate("9008211234"));
        System.out.println(validateBirthDate("900821-1234"));
        System.out.println(validateBirthDate("1918-09-22 2345"));
        System.out.println(validateBirthDate("180922+2345"));

        System.out.println("\n");
        System.out.println(validatePassword("razvan22"));

    }
    public static boolean validatePhoneNumber(String phoneNumber){
        return phoneNumber.matches("\\d+[-]*\\s*\\d+\\s*\\d+\\s*\\d+");
    }
    public static boolean validateEmail(String email){
        return email.matches("\\w*[.]*\\w{2,}[@]\\w{2,}[.]\\w{2,}");
    }
    public static boolean validateBirthDate(String birthDate){
        return birthDate.matches("\\d+[+]*[-]*\\s*\\d*[-]*\\d*\\s*\\d*");
    }
    public static boolean validatePassword(String password){
        return password.matches("\\w{8,}");
    }


}

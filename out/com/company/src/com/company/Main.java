package com.company;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Validator validator = new Validator();

        String[] phoneNumbers = {
                "08-12 34 56",
                "040-123 45",
                "0704-12 34 56",
                "0707321654",
                "0707 555 666"
        };
        for (String phoneNr : phoneNumbers){
            if (validator.validatePhoneNumber(phoneNr)) {
                System.out.println(phoneNr + " ===> valid phone number");
            }
        }


        System.out.println("\n");
        String [] emailList = {
                "lhinners0@pen.io",
                "acolclough1@archive.org",
                "blehrleangelfire.com",
                "ffavel4@php.net",
                "bnoke5@telegraph.co.uk",
                "dcopperwaite6@hibu.com",
                "cmahady7@boston.com",
                "ncrowd@unicef.org",
                "cbangham9@marketwatch.com"
        };

        for (String email : emailList){
            if (validator.validateEmail(email)) {
                System.out.println(email + " ===> valid email");
            }else {
                System.out.println(email + " ===> not valid email");
            }
        }

        System.out.println("\n");
        String[] birthDateList= {
                "1990-08-21 1234",
                "9008211234",
                "900821-1234",
                "1918-09-22 2345",
                "180922+2345"

        };
        for (String birthDate : birthDateList){
            if (validator.validateBirthDate(birthDate)){
                System.out.println(birthDate + " ===> valid birth date");
            }
        }

        System.out.println("\n");
        String[] passwordList = {
                "mypassword",
                "00000000",
                "AlphaRomeo4c",
                "fiatlinea2014",
                "F@rd1co",
                "F@rd1coSports",
                "Suzuki@lpha2016",
                "!vwvento2015",
                "!@#$%^&*Aa1",
                "myDream1@$$",
                "Hello World@001"
        };

        for(String password : passwordList) {
            if (validator.validatePassword(password)) {
                System.out.println(password + "===> valid password");
            }else {
                System.out.println(password + "===> not valid password");
            }

        }
        System.out.println("\n");

        String hello = "hej\n" +
                "hejsan1\n" +
                "\n" +
                "hall100å\n" +
                "what's up";
        System.out.println("String with digits :\n"+ hello);
        System.out.println("\n");
        System.out.println("Replaced all digits :\n"+validator.replaceDigit(hello));

        System.out.println("\n");
        String trimString = "hej      på  dig\n" + "   hejsan\n" + " hej      \n" + "     hej    hej";
        System.out.println("Before trim/replaceAll methods :\n"+trimString);
        System.out.println("\n");
        Stream.of(trimString.
                replaceAll(" +", " ").
                split("\n")).
                map(String::trim).
                forEach(System.out::println);

    }
}

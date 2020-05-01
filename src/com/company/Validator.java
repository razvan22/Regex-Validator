package com.company;

public class Validator {
    public boolean validatePhoneNumber(String phoneNumber){
        return phoneNumber.matches("\\d+[-]*\\s*\\d+\\s*\\d+\\s*\\d+");
    }
    public boolean validateEmail(String email){
        return email.matches("\\w*[.]*\\w{2,}[@]\\w{2,}[.]\\w{2,}");
    }
    public boolean validateBirthDate(String birthDate){
        return birthDate.matches("\\d+[+]*[-]*\\s*\\d*[-]*\\d*\\s*\\d*");
    }
    public boolean validatePassword(String password){
        String passwordContains = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*](?=\\S+$).{8,15}$";
        return password.matches(passwordContains);


    }
    public String replaceDigit(String stringWithDigits){
     return stringWithDigits.replaceAll("\\d","");
    }

}

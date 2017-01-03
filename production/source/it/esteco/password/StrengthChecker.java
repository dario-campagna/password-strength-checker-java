package it.esteco.password;

public class StrengthChecker {
    public boolean isStrongPassword(String password) {
        return password.length() > 7 ? true : false;
    }
}

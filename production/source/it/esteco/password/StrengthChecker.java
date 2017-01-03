package it.esteco.password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrengthChecker {
    public boolean isStrongPassword(String password) {
        return password.length() > 7 && atLeastOneAlpha(password) ? true : false;
    }

    private boolean atLeastOneAlpha(CharSequence password) {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}

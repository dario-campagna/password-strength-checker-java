package it.esteco.password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphaRule implements StrengthRule {
    @Override
    public boolean isSatisfiedBy(String password) {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}

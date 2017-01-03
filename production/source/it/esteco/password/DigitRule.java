package it.esteco.password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitRule implements StrengthRule {

    private final Pattern pattern = Pattern.compile("\\d");

    @Override
    public boolean isSatisfiedBy(String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}

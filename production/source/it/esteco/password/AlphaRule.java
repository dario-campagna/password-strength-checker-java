package it.esteco.password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphaRule implements StrengthRule {

    private final Pattern pattern = Pattern.compile("[a-zA-Z]");

    @Override
    public boolean isSatisfiedBy(String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
}

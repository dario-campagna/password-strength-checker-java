package it.esteco.password;

public class LengthRule implements StrengthRule {

    public boolean isSatisfiedBy(String password) {
        return password.length() > 7;
    }
}

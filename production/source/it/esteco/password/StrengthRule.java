package it.esteco.password;

/**
 * Created by dcampagna on 03/01/2017.
 */
public interface StrengthRule {
    boolean isSatisfiedBy(String password);
}

package it.esteco.password;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckPasswordContainsDigit {

    @Test
    public void passwordContainsNoDigit() throws Exception {
        assertFalse(new DigitRule().isSatisfiedBy("a"));
    }

    @Test
    public void passwordContainsAtLeastOneDigit() throws Exception {
        assertTrue(new DigitRule().isSatisfiedBy("1"));
        assertTrue(new DigitRule().isSatisfiedBy("a1"));
    }
}

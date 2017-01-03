package it.esteco.password;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckPasswordLength {

    @Test
    public void passwordTooShort() throws Exception {
        assertFalse(new LengthRule().isSatisfiedBy(""));
        assertFalse(new LengthRule().isSatisfiedBy("aaa"));
        assertFalse(new LengthRule().isSatisfiedBy("aaaaaaa"));
    }

    @Test
    public void passwordLongEnough() throws Exception {
        assertTrue(new LengthRule().isSatisfiedBy("abcdefgh"));
        assertTrue(new LengthRule().isSatisfiedBy("1234567890"));
    }
}

package it.esteco.password;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckPasswordStrength {

    @Test
    public void passwordTooShort() throws Exception {
        assertFalse(new StrengthChecker().isStrongPassword(""));
        assertFalse(new StrengthChecker().isStrongPassword("aaa"));
        assertFalse(new StrengthChecker().isStrongPassword("aaaaaaa"));
    }

    @Test
    public void passwordIsStrong() throws Exception {
        assertTrue(new StrengthChecker().isStrongPassword("abcdefgh"));
    }

    @Test
    public void passwordContainsNoAlpha() throws Exception {
        assertFalse(new StrengthChecker().isStrongPassword("12345678"));
    }
}

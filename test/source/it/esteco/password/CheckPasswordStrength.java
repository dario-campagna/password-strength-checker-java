package it.esteco.password;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckPasswordStrength {

    private StrengthChecker strengthChecker;

    @Before
    public void setUp() throws Exception {
        List<StrengthRule> strengthRules = Arrays.asList(new LengthRule(), new AlphaRule());
        strengthChecker = new StrengthChecker(strengthRules);
    }

    @Test
    public void passwordIsStrong() throws Exception {
        assertTrue(strengthChecker.isStrongPassword("abcdefgh"));
    }

    @Test
    @Ignore
    public void passwordContainsNoDigit() throws Exception {
        assertFalse(strengthChecker.isStrongPassword("abcdefgh"));
    }
}

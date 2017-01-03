package it.esteco.password;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class CheckPasswordStrength {

    @Test
    public void passwordIsStrong() throws Exception {
        List<StrengthRule> strengthRules = Arrays.asList(new LengthRule(), new AlphaRule(), new DigitRule());
        StrengthChecker strengthChecker = new StrengthChecker(strengthRules);

        assertTrue(strengthChecker.isStrongPassword("abcdefg1"));
    }

}

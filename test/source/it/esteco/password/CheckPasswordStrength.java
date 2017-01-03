package it.esteco.password;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckPasswordStrength {

    @Test
    public void passwordIsNotStrongIfAtLeastOneRuleIsNotSatisfied() throws Exception {
        List<StrengthRule> strengthRules = Arrays.asList(password -> true, password -> false);
        StrengthChecker strengthChecker = new StrengthChecker(strengthRules);

        assertFalse(strengthChecker.isStrongPassword(""));
    }

    @Test
    public void passwordIsStrongIfAllStrengthRulesAreSatisfied() throws Exception {
        List<StrengthRule> strengthRules = Arrays.asList(password -> true);
        StrengthChecker strengthChecker = new StrengthChecker(strengthRules);

        assertTrue(strengthChecker.isStrongPassword(""));
    }
}

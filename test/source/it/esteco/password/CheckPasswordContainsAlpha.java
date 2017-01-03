package it.esteco.password;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckPasswordContainsAlpha {

    @Test
    public void passwordContainsNoAlpha() throws Exception {
        assertFalse(new AlphaRule().isSatisfiedBy("1"));
    }

    @Test
    public void passwordContainsAtLeastOneAlpha() throws Exception {
        assertTrue(new AlphaRule().isSatisfiedBy("a"));
        assertTrue(new AlphaRule().isSatisfiedBy("1a"));
    }
}

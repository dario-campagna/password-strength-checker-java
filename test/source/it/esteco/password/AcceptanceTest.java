package it.esteco.password;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class AcceptanceTest {

    private StrengthChecker strengthChecker;
    private boolean isStrong;
    private String password;

    public AcceptanceTest(boolean isStrong, String password) {
        this.isStrong = isStrong;
        this.password = password;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {false, "abc1"},
                {false, "abcdefgh"},
                {false, "12345678"},
                {true, "abcde123"},
                {true, "123abcde"},
                {true, "123abCDE"}
        });
    }

    @Before
    public void setUp() throws Exception {
        List<StrengthRule> strengthRules = Arrays.asList(
                new LengthRule(),
                new AlphaRule(),
                new DigitRule()
        );
        strengthChecker = new StrengthChecker(strengthRules);
    }

    @Test
    public void checkPassword() throws Exception {
        assertEquals(isStrong, strengthChecker.isStrongPassword(password));
    }
}

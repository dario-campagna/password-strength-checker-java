package it.esteco.password;

import java.util.List;

public class StrengthChecker {
    private List<StrengthRule> strengthRules;

    public StrengthChecker(List<StrengthRule> strengthRules) {
        this.strengthRules = strengthRules;
    }

    public boolean isStrongPassword(String password) {
        return strengthRules.stream().allMatch(rule -> rule.isSatisfiedBy(password));
    }

}

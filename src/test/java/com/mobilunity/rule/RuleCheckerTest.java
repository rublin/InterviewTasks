package com.mobilunity.rule;

import org.junit.Test;

import static org.junit.Assert.*;

public class RuleCheckerTest {
    private RuleChecker checker = new RuleChecker();

    @Test
    public void checkLength() throws Exception {
        assertEquals(Resolution.PASS, checker.checkRules("A1!q"));
        assertEquals("Length can't be too short", Resolution.FAIL, checker.checkRules("A1#"));
        assertEquals("Length can't be too long", Resolution.FAIL, checker.checkRules("Am@Z1ng4Am@Z1ng4Am@Z1ng4Am@Z1ng4frv"));
    }

    @Test
    public void checkLetter() throws Exception {
        assertEquals(Resolution.PASS, checker.checkRules("Am@Z1ng4"));
        assertEquals("Username should contain at least one letter", Resolution.FAIL, checker.checkRules("@2134!4"));
    }

    @Test
    public void checkDigit() throws Exception {
        assertEquals(Resolution.PASS, checker.checkRules("Am@Z1ng4"));
        assertEquals("Username should contain at least one digit", Resolution.FAIL, checker.checkRules("Q$er"));
    }

    @Test
    public void checkSpecialCharacter() throws Exception {
        assertEquals(Resolution.PASS, checker.checkRules("Am@Z1ng4"));
        assertEquals("Username should contain at least one special character", Resolution.FAIL, checker.checkRules("AmZ1ng4!"));
    }

    @Test
    public void checkSpace() throws Exception {
        assertEquals(Resolution.PASS, checker.checkRules("Am@Z1ng4"));
        assertEquals("Username should not contain space", Resolution.FAIL, checker.checkRules("Am@Z 1ng4"));
        assertEquals("Username should not contain space", Resolution.FAIL, checker.checkRules(" Am@Z1ng4"));
        assertEquals("Username should not contain space", Resolution.FAIL, checker.checkRules("Am@Z1ng4 "));
    }

}
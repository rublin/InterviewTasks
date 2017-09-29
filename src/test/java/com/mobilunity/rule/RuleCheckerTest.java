package com.mobilunity.rule;

import org.junit.Test;

import static org.junit.Assert.*;

public class RuleCheckerTest {
    private RuleCheckerImpl checker = new RuleCheckerImpl();

    @Test
    public void checkLength() throws Exception {
        assertEquals(Resolution.PASS, checker.checkRules("A1_q"));
        assertEquals(Resolution.PASS, checker.checkRules("Am@Z1ng4Am@Z1ng4Am@Z1ng4Am@Z1ng4"));
        assertEquals("Length can't be too short", Resolution.FAIL, checker.checkRules("A1#"));
        assertEquals("Length can't be too long", Resolution.FAIL, checker.checkRules("Am@Z1ng4Am@Z1ng4Am@Z1ng4Am@Z1ng4f"));
    }

    @Test
    public void checkLetter() throws Exception {
        assertEquals(Resolution.PASS, checker.checkRules("A4@5"));
        assertEquals(Resolution.PASS, checker.checkRules("4@5A"));
        assertEquals(Resolution.PASS, checker.checkRules("4@A5"));
        assertEquals("Username should contain at least one letter A-Z", Resolution.FAIL, checker.checkRules("a4@5a"));
        assertEquals("Username should contain at least one letter A-Z", Resolution.FAIL, checker.checkRules("@2134!4"));
    }

    @Test
    public void checkDigit() throws Exception {
        assertEquals(Resolution.PASS, checker.checkRules("Am@Zng4"));
        assertEquals(Resolution.PASS, checker.checkRules("Am@Z1ng"));
        assertEquals(Resolution.PASS, checker.checkRules("1Am@Zng"));
        assertEquals("Username should contain at least one digit", Resolution.FAIL, checker.checkRules("Q$er"));
    }

    @Test
    public void checkSpecialCharacter() throws Exception {
        assertEquals(Resolution.PASS, checker.checkRules("Am@Z1ng4"));
        assertEquals(Resolution.PASS, checker.checkRules("Am#Z1ng4"));
        assertEquals(Resolution.PASS, checker.checkRules("Am_Z1ng4"));
        assertEquals(Resolution.PASS, checker.checkRules("Am-Z1ng4"));
        assertEquals("Username should contain at least one special character", Resolution.FAIL, checker.checkRules("AmZ1ng4!"));
    }

    @Test
    public void checkSpace() throws Exception {
        assertEquals(Resolution.PASS, checker.checkRules("Am@Z1ng4"));
        assertEquals("Username should not contain space", Resolution.FAIL, checker.checkRules("Am@Z 1ng4"));
        assertEquals("Username should not contain space", Resolution.FAIL, checker.checkRules(" Am@Z1ng4"));
        assertEquals("Username should not contain space", Resolution.FAIL, checker.checkRules("Am@Z1ng4 "));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNull() throws Exception {
        checker.checkRules(null);
    }

}
package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    void remainWithCB() {
        int amount = 1900;
        int expeсted = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expeсted);
    }

    @Test
    void remainWithoutCB() {
        int amount = 2000;
        int expeсted = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual, expeсted);
    }

}
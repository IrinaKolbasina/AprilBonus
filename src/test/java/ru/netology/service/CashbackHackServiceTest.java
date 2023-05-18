package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remainTestWithCB() {
        int amount = 1900;
        int expexted = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expexted, actual);
    }

    @org.junit.Test
    public void remainTestWithoutCB() {
        int amount = 2000;
        int expexted = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expexted, actual);
    }
}
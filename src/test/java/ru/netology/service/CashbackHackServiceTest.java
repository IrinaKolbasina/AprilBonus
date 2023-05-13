package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class CashbackHackServiceTest {
           @Test
        void remain() {
            int amount = 1900;
            int expexted = 100;
            CashbackHackService service = new CashbackHackService();
            int actual = service.remain(amount);
            Assert.assertEquals(actual, expexted);
        }
    }
package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn100IfAmount900() {
        assertEquals(100, service.remain(900));
    }

    @Test
    public void shouldReturn1000IfAmount0() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldReturn1999IfAmount1() {
        assertEquals(service.remain(1999), 1);
    }

    @Test
    public void shouldReturn0IfAmount1000() {
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldReturn1500IfAmount500() {

        assertEquals(service.remain(1500), 500);
    }
}


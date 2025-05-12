package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldReturn100IfAmount900() {
        assertEquals(100, service.remain(900));
           }
    @Test
    void shouldReturn1000IfAmount0() {
        assertEquals(1000, service.remain(0));
    }
    @Test
    void shouldReturn1999IfAmount1() {
        assertEquals(1, service.remain(1999));
    }
    @Test
    void shouldReturn0IfAmount1000() {
        assertEquals(0, service.remain(1000));
    }
    @Test
    void shouldReturn1500IfAmount500() {
        assertEquals(500, service.remain(1500));
    }
    }


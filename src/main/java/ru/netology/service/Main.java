package ru.netology.service;

public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();

        System.out.println("Для максимального кэшбэка Вам необходимо еще докупить на сумму  " + service.remain(1999) + " руб.");
        System.out.println();
        System.out.println("Для максимального кэшбэка Вам необходимо еще докупить на сумму  " + service.remain(1000) + " руб.");

    }
}
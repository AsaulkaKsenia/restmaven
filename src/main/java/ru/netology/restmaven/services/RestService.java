package ru.netology.restmaven.services;

public class RestService {
    public int calculate(int income, int expence, int treshold) {
        int count = 0; // дл подсчета месяцев отдыха
        int balance = 0; // баланс счета

        for (int month = 0; month < 12; month++) {

            if (balance >= treshold) {
                count++;
                balance = ((balance - expence) / 3);
            } else {
                balance = (balance + income - expence);
            }
        }
        return count;
    }
}

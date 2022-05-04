package ru.job4j.array;

import java.util.Arrays;

/**
 * Класс описывает работу автомата с кофе.
 * Высчитывают разницу между купюрой и ценой кофе.
 * Сдачу выдаёт сдачу монетами начиная с 10 до 1р. *
 */
public class Machine {
    /**
     * @param money купюра
     * @param price цена кофе
     * @return возвращает массив из монет выданных в сдаче
     */
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int delta = money - price;
        /**
         * Алгоритм цикла: Если сдача(delta) > старшей монеты,
         * Если остаток > монеты, то операцию повторяем,
         * а если меньше, то берем монету номиналом меньше.
         * При каждом проходе размер size++
         */
        for (int coin : coins) {
            while (delta >= coin) {
                delta = delta - coin;
                rsl[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
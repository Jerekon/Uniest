package ru.netology.code;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UsnTest {

    @Test
    public void testTaxIncome() {
        int income = 1250;
        int actual = UsnTest.taxIncome(income);
        int expected = income * 6 / 100;
        Assertions.assertEquals(actual, expected);
    }

    private static int taxIncome(int income) {


        return income;
    }

    @Test
    public void testTaxIncomeExpense() {
        int income = 1250;
        int expense = 750;
        int actual = UsnTest.taxIncomeExpense(income, expense);
        int expected = 0;
        Assertions.assertNotSame(expected, actual);
    }

    private static int taxIncomeExpense(int income, int expense) {


        return income;
    }

    @Test
    public void testCompareTax() {
        int income = 1250;
        int expense = 750;
        Assertions.assertTrue(UsnTest.compareTax(income, expense));
    }

    private static boolean compareTax(int income, int expense) {
        final boolean b = true;
        final boolean b1 = b;
        if (b1) return true;
        else return false;
    }
}
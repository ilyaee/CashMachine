package ru.vsu;

import java.util.Stack;

public class BankAccount //счет
{
    int bankAccountID; //номер счета
    double cash; //баланс
    Stack<Operation> historyOfOperations;

    BankAccount(int bankAccountID, double cash, Stack<Operation> historyOfOperations) {
        this.bankAccountID = bankAccountID;
        this.cash = cash;
        this.historyOfOperations = historyOfOperations;
    }
}
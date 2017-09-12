package ru.vsu;

public class Utils {
    static void monoTransferMoney(BankAccount fromBA, BankAccount toBA, double m) {
        Utils.withdrawMoney(m, fromBA);
        Utils.addMoney(m, toBA);
    }

    static void multyTransferMoney(BankAccount fromBA, BankAccount toBA, double m) {
        Utils.withdrawMoney(m, fromBA);
        Utils.addMoney(0.9f * m, toBA);
    }

    static void addMoney(double m, BankAccount BA) {
        BA.cash += m;
        BA.historyOfOperations.push(new Operation("Зачисление на счет в размере: ", m));
    }

    static void withdrawMoney(double m, BankAccount BA) //добавить проверку баланса перед вычетом
    {
        BA.cash -= m;
        BA.historyOfOperations.push(new Operation("Снятие средств со счета в размере: ", m));
    }
}
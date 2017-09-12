package ru.vsu;

import java.util.ArrayList;
import java.util.List;

public class AccountHolder {
    String name;
    ArrayList<BankAccount> bankAccountList;
    int id;

    AccountHolder(int id, String name, ArrayList<BankAccount> bankAccountList) {
        this.name = name;
        this.bankAccountList = bankAccountList;
        this.id = id;
    }
    //
}

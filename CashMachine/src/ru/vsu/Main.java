package ru.vsu;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Здравствуйте!\nДобавим нового пользователя? y/n");
        //как переключаться между пользователями???
        //пересылка между счетами или по id пользователя
        //предварительная проверка существования

        Scanner input = new Scanner(System.in);     //процесс добавления пользователя
        String c = input.nextLine();
        switch (c) {
            case "y":
                System.out.print("Введите имя:\n");
                Scanner inp = new Scanner(System.in);   //как это работает?
                addNewUser(inp.nextLine());
                break;
            case "n":
                System.out.print("До свидания");
                System.exit(0);
                break;
            default:
                System.out.print("Недопустимая команда\n");
                Main.main(args);
                break;
        }
        System.out.print("Добавим новый счет\nВведите ваш персональный идентификатор:\n");
        //Scanner in = new Scanner(System.in);
        addNewBankAccount(input.nextInt());    //добавить проверку
        System.out.print("Выберите одно из доступных действий:\n1) Новый счет\n2) Новый клиент\n");
        switch (input.nextInt()) {
            case 1:
                System.out.print("Введите ваш идентификатор:\n");
                addNewBankAccount(input.nextInt());
                break;
            case 2:
                System.out.print("Введите имя:\n");
                addNewUser(input.nextLine());
                break;
            default:
                System.out.print("Недопустимая команда\n");
                //придумать дальше
                break;
        }
    }

    private static List<AccountHolder> accountHoldersList = new ArrayList<>();
    private static ArrayList<BankAccount> bankAccountsList = new ArrayList<>();
    private static int accountHolderID = 0;
    private static int bankAccountID = 0;

    private static void addNewUser(String name) {
        accountHoldersList.add(accountHolderID, new AccountHolder(accountHolderID, name, bankAccountsList));
        System.out.println("Ваш персональный идентификатор:" + accountHolderID);
        accountHolderID++;
    }

    //swing
    private static void addNewBankAccount(int inputAccountID) {
        if (accountHoldersList.get(inputAccountID).id == inputAccountID) //too nice crutch:)                не заходит в else!!!!!!!!!!
        {
            accountHoldersList.get(inputAccountID).bankAccountList.add(bankAccountID, new BankAccount(bankAccountID, 0, new Stack<Operation>()));
            System.out.println("Номер вашего счета: " + bankAccountID);
            bankAccountID++;
        } else
            System.out.print("ID введен неверно"); //добавить возможность написания id заново
    }
}
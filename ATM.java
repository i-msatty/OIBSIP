package ATMSYSTEM;

import java.io.IOException;

public class ATM {

    public static void main(String[] args) throws IOException
     {
        Menu Menus = new Menu();
        introduction();
        Menus.mainMenu();
    }

    public static void introduction() {
        System.out.println("Welcome to the ATM Project!");
    }
}
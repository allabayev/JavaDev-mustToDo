package uz.staticForMe.modul;

import java.util.Scanner;

public class Users {
    //
    public String userName;
    public String email;
    public String password;

    public void user_info(){
        System.out.println("\nyour userName" + userName);
        System.out.println("your email " + email);
        System.out.println("Your pasword is " + password);
        Scanner in = new Scanner(System.in);
        System.out.println("\nwill you wont to rename new paswor");
        String scanner=in.nextLine();
        String newScan;

        switch (scanner) {
            case "yes":
                System.out.println("Enter your new pasword ");
                newScan=in.nextLine();
                System.out.println("your userName" + userName);
                System.out.println("your email " + email);
                System.out.println("Your new pasword is " + newScan);
                break;
            case "no":
                System.out.println("your userName" + userName);
                System.out.println("your email " + email);
                System.out.println("Your pasword is " + password);
            default:
        }
    }
}
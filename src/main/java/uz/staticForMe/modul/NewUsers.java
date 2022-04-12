package uz.staticForMe.modul;

import java.util.Scanner;

public class NewUsers {
    //
    public String password;
    public void changePassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter old password:");
        String oldPassword = scanner.nextLine();

        if(oldPassword.equals(password)){
            System.out.print("Enter new password");
            String newPassord = scanner.nextLine();
            System.out.print("Confirm new password: ");
            String confirmPassword = scanner.nextLine();
            if (newPassord.equals(confirmPassword)){
                password = newPassord;
            } else{
                System.out.println("password is not match");
            }
        } else {
            System.out.println("Old password incorrect");
        }
    }
}
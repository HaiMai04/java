package javatest.chuong3;

import java.util.Scanner;

class Account {
    private String mName;
    private String password;

    public void setName(String name) {
        this.mName = name;
    }

    public String getName() {
        return this.mName;
    }

    public void setPass(String pass) {
        this.password = pass;
    }

    // Không cung cấp getter cho password để bảo mật
}

public class fix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account();
        System.out.printf("Initial name is %s\n", myAccount.getName());

        System.out.print("Please enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.printf("Name is %s\n", myAccount.getName());

        System.out.print("Please enter the password: ");
        String inputPassword = input.nextLine();
        myAccount.setPass(inputPassword);

        System.out.println("Password has been set. You can verify it if needed.");

        input.close(); // Đóng Scanner để tránh rò rỉ tài nguyên
    }
}

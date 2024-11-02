
package javatest.chuong3;

import java.util.Scanner;

public class AccountTest {
    private String name;

    

    // Phương thức setName để gán giá trị cho tên
    public void setName(String name) {
        this.name = name;
    }

    // Phương thức getName để lấy giá trị của tên
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tạo đối tượng AccountTest
        AccountTest myAccount = new AccountTest();

        // Nhập tên từ người dùng
        System.out.println("Nhập tên: ");
        String theName = input.nextLine();

        // Gán tên cho đối tượng
        myAccount.setName(theName);

        // Hiển thị tên vừa nhập
        System.out.printf("Tên là: %s%n", myAccount.getName());

        input.close();
    }
}
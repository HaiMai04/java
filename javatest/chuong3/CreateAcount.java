package javatest.chuong3;
import java.util.Scanner;

class Account {
    private String aName;
    private String aPassword;
    public void setName(String name) {
        this.aName = name;
    }
   public String getName() {
    return this.aName;
}
  
}
 public class CreateAcount {
    
    public static void main(String[] args) {
        
    
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.println("Nhap tai khoan");
        String theName = input.nextLine();
        myAccount.setName(theName);
       
        System.out.printf("Tai khoan cua ban la %s\n", myAccount.getName());
    
        

}
}

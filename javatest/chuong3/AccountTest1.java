package javatest.chuong3;

import javatest.chuong3.test.Account;

class Account {
    private String aName;
    public void setName(String name){
        this.aName = name;
    }
    public String getname() {
        return this.aName;
    }
}


public class AccountTest1 {
    
    public static void main(String[] args) {
        Account account1 = new Account("Hai Mai");
        Account account2 = new Account("Mai Hai");
        printf("account1 name is %s", account1.getname());
        printf("account2 name is %s",account2.getname());
    }
}

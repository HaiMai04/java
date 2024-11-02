package accountTest;

    class Account {
        private String aName;
        public Account (String name) {
            this.aName = name;
        }
        public String getName() {
            return aName;
        }
    }

        public class AccountTest {
            public static void main(String[] args) {
                Account account1 = new Account("haimai\n");
                Account account2 = new Account("maihai");
                System.out.printf("ten cua a la %s", account1.getName());
                System.out.printf("ten cua b la %s", account2.getName());
            }
        }
    public class Bank {
        public static void main(String[] args) {
            int balance = 1000;
            int withdrawal = 1500; 

            try {
             
                if (withdrawal > balance) { 
                    throw new LowBalanceException("Insufficient balance to withdrawal");
                } else {
                    balance -= withdrawal; 
                    System.out.println("withdrawal succesfull remaining balance : " + balance);
                }
            } catch (LowBalanceException e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                System.out.println("Thank you for using our banking service");
            }
        }
    }
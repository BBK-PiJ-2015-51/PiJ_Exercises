public class BankAccount implements Runnable {
    private int balance = 10000;

    public int getBalance() {
        return balance;
    }

    public int retrieve(int money) {
        int result = 0;
        if (balance > money) {
            result = money;
        } else {
            result = balance;
        }
        balance = balance - result;
        return result;
    }

    public void run() {

        for (int i = 0; i < 500; i++) {
        System.out.println("running...taking out " + i);
            retrieve(i);
            System.out.println("balance is " + getBalance());
        }
    }

    public static void main(String args[]) {
        BankAccount b = new BankAccount();
        for (int i = 0; i < 5; i++) {
        Thread t = new Thread(b);
            //b.run();
            t.start();
        }

    }
}
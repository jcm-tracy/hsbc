public class Bank {
    int balance = 10000;
    synchronized void withdraw(int amount){
        System.out.println("取款");
        while (balance<amount){
            System.out.println("金额不足，无法取款，等待存款");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("取款完成");
    }
    synchronized void deposit(int amount){
        System.out.println("存款");
        balance += amount;
        System.out.println("存款完成");
        notify();
    }
}

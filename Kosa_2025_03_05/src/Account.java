public class Account {
    private long balance;
    
    public Account(long balance) {
        this.balance = balance;
    }
    
    // 현재 잔고 반환
    public long getBalance() {
        return balance;
    }
    
    // 입금
    public void deposit(long amount) {
        balance += amount;
    }
    
    // 출금
    public boolean withdraw(long amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

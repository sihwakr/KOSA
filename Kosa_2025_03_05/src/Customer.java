public class Customer {
    private String id;       // 고객 ID
    private String name;     // 고객 이름
    private Account account; // 고객의 은행계좌(Account)
    
    public Customer(String id, String name, Account account) {
        this.id = id;
        this.name = name;
        this.account = account;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public Account getAccount() {
        return account;
    }
    
    // 필요한 경우, 이름을 변경하는 메서드 등이 추가될 수 있습니다.
    // public void setName(String name) { this.name = name; }
}

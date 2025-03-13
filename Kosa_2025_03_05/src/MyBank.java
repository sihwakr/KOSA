public class MyBank {
    private Customer[] customers;  // 은행이 보유한 고객 리스트
    private int numOfCustomers;    // 현재 등록된 고객 수
    
    public MyBank() {
        // 필요에 따라 고객 정보를 배열 대신 ArrayList로 관리해도 무방합니다.
        customers = new Customer[100]; 
        numOfCustomers = 0;
    }
    
    // 신규 고객 등록
    public void addCustomer(String id, String name, long balance) {
        // 새로운 계좌(Account) 객체 생성
        Account newAccount = new Account(balance);
        // 신규 고객(Customer) 객체 생성
        Customer newCustomer = new Customer(id, name, newAccount);
        // 고객 배열에 저장
        customers[numOfCustomers++] = newCustomer;
    }
    
    // ID로 특정 고객 조회
    public Customer getCustomer(String id) {
        for (int i = 0; i < numOfCustomers; i++) {
            if (customers[i].getId().equals(id)) {
                return customers[i];
            }
        }
        return null; // 해당 ID를 가진 고객이 없는 경우
    }
    
    // 모든 고객 반환
    public Customer[] getAllCustomers() {
        // 등록된 고객 수만큼 복사해서 반환
        Customer[] result = new Customer[numOfCustomers];
        for (int i = 0; i < numOfCustomers; i++) {
            result[i] = customers[i];
        }
        return result;
    }
    
    // 전체 고객 수 조회
    public int getNumOfCustomers() {
        return numOfCustomers;
    }
}

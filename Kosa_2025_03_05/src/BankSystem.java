import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankSystem {
    private MyBank myBank; // MyBank 객체를 통해 고객 및 계좌 관리
    
    public BankSystem() {
        myBank = new MyBank();
        showMenu();
    }
    
    public void showMenu() {
        String menu = null;
        String id = null;
        String name = null;
        long balance = 0;
        
        do {
            System.out.println("**** 메뉴를 입력하세요 ****");
            System.out.println("1. 고객등록");
            System.out.println("2. 고객보기(1명)");
            System.out.println("3. 고객전체보기");
            System.out.println("4. 고객예금출금");
            System.out.println("5. 고객예금입금");
            System.out.println("q. 끝내기(종료)");
            System.out.println("************************");
            System.out.print(">> ");
            
            menu = readFromKeyboard();
            
            if(menu.equals("1")) {
                // 1. 고객등록
                System.out.print("ID를 입력하세요: ");
                id = readFromKeyboard();
                
                System.out.print("이름을 입력하세요: ");
                name = readFromKeyboard();
                
                System.out.print("잔고를 입력하세요: ");
                balance = Long.parseLong(readFromKeyboard());
                
                myBank.addCustomer(id, name, balance);
                System.out.println("신규 고객이 등록되었습니다.\n");
                
            } else if(menu.equals("2")) {
                // 2. 고객보기(1명)
                System.out.print("조회할 고객의 ID를 입력하세요: ");
                id = readFromKeyboard();
                
                Customer cust = myBank.getCustomer(id);
                if(cust == null) {
                    System.out.println("등록된 고객이 아닙니다.\n");
                } else {
                    System.out.println(
                        cust.getId() + " : " +
                        cust.getName() + " : " +
                        cust.getAccount().getBalance()
                    );
                    System.out.println();
                }
                
            } else if(menu.equals("3")) {
                // 3. 고객전체보기
                Customer[] allCust = myBank.getAllCustomers();
                if(allCust.length == 0) {
                    System.out.println("등록된 고객이 없습니다.\n");
                } else {
                    for(int i=0; i<allCust.length; i++){
                        System.out.println(
                            allCust[i].getId() + " : " +
                            allCust[i].getName() + " : " +
                            allCust[i].getAccount().getBalance()
                        );
                    }
                    System.out.println();
                }
                
            } else if(menu.equals("4")) {
                // 4. 고객예금출금
                System.out.print("출금할 고객의 ID를 입력하세요: ");
                id = readFromKeyboard();
                
                Customer cust = myBank.getCustomer(id);
                
                if(cust == null) {
                    System.out.println("등록된 고객이 아닙니다.\n");
                } else {
                    System.out.print("출금액을 입력하세요: ");
                    balance = Long.parseLong(readFromKeyboard());
                    
                    if(cust.getAccount().withdraw(balance)) {
                        System.out.println("정상적으로 출금되었습니다.");
                        System.out.println("출금 후 잔고: " + cust.getAccount().getBalance() + "\n");
                    } else {
                        System.out.println("잔고가 부족합니다.\n");
                    }
                }
                
            } else if(menu.equals("5")) {
                // 5. 고객예금입금
                System.out.print("입금할 고객의 ID를 입력하세요: ");
                id = readFromKeyboard();
                
                Customer cust = myBank.getCustomer(id);
                
                if(cust == null) {
                    System.out.println("등록된 고객이 아닙니다.\n");
                } else {
                    System.out.print("입금액을 입력하세요: ");
                    balance = Long.parseLong(readFromKeyboard());
                    
                    cust.getAccount().deposit(balance);
                    System.out.println("정상적으로 입금되었습니다.");
                    System.out.println("입금 후 잔고: " + cust.getAccount().getBalance() + "\n");
                }
            }
            // 'q'를 입력하면 do~while의 반복 조건(!menu.equals("q"))가 깨지므로 종료
            
        } while(!menu.equals("q"));
        
        System.out.println("프로그램을 종료합니다.");
    }
    
    public String readFromKeyboard() {
        String input = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return input;
    }
    
    public static void main(String[] args) {
        new BankSystem();
    }
}

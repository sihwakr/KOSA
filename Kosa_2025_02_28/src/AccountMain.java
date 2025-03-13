public class AccountMain {
    
    public static void main(String[] args) {
        Account account; // 참조형(주소값)
        account = new Account("111-111", "홍길동", 10000);

        Account account2 = new Account("222-222", "백길동", 20000);

        

        //객체 필드에 값을 넣는다 - 객체를 초기화 한다고 부름 
        account.accountNo = "111-111";
        account.ownerName = "홍길동";
        account.balance = 10000;

        account2.accountNo = "111-112";
        account2.ownerName = "홍길동2";
        account2.balance = 20000;


        account.deposit(5000);

        try{
            account.withdraw(10000);
        }catch(Exception e){
            e.printStackTrace();
        }

        account.printAcoount();
        System.out.println("------------------");
        account2.printAcoount();

        System.out.println(("계좌번호 " + account.accountNo));
        System.out.println(("계좌주 " + account.ownerName));
        System.out.println(("잔액 " + account.balance));


        System.out.println(("계좌번호 " + account2.accountNo));
        System.out.println(("계좌주 " + account2.ownerName));
        System.out.println(("잔액 " + account2.balance));

    }



    
}

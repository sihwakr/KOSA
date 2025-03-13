public class Account {
    
    // 필드 표현 
    String accountNo;
    String ownerName;
    int balance;

    public  Account(){}

    //생성자 (constructor)
    //객체를 초기화 할 때 사용한것이 생성자
    //접근제어자 - 퍼블릭 리턴형 X / 클래스 이름하고 같아야 함
    //오버로딩

    public Account(String accountNo, String ownerName, int balance){
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //기능(메서드) 표현

    //입금하다
    public void deposit(int amount){
        balance+=amount;
    }

    //출금하다
    public int withdraw(int amount)throws Exception{
        if(balance<amount){
            throw new Exception("잔액부족");
        }
        balance -=amount;

        return amount;
    }   

    public void printAcoount(){
        System.out.println(("계좌번호 " +accountNo));
        System.out.println(("계좌주 " + ownerName));
        System.out.println(("잔액 " + balance));
    }
}







//account 클래스로 부터 account 객체를 생성하길 원한다
//객체로부터 공통된 데이터 구조와 기능을 추출해야 한다.
//상태(필드) : 계좌번호, 계좌주, 잔액 등등 
//기능(메서드) : 입금하다. 출금하다.
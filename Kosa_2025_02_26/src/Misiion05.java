import java.util.Scanner;

public class Misiion05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int firnum = 0;   // 첫 번째 정수
        int secnum = 0;   // 두 번째 정수
        String op = "";   // 연산자 (+, -, *, /)
        
        boolean isValid;  // 유효한 입력이 들어왔는지 판별하는 변수

        // 1) 첫 번째 정수 입력
        isValid = false;  // 매 입력 단계마다 false로 초기화
        do {
            System.out.print("첫 번째 정수를 입력하세요: ");
            if (sc.hasNextInt()) {
                firnum = sc.nextInt();   // 정수 입력
                isValid = true;          // 정수 입력 성공
            } else {
                System.out.println("정수가 아닙니다. 다시 입력해주세요.");
                sc.next(); // 잘못된 입력(토큰) 제거
            }
        } while (!isValid);
        
        // 다음 입력 전, 버퍼에 남아있는 줄바꿈(개행) 제거
        sc.nextLine();

        // 2) 두 번째 정수 입력
        isValid = false;
        do {
            System.out.print("두 번째 정수를 입력하세요: ");
            if (sc.hasNextInt()) {
                secnum = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("정수가 아닙니다. 다시 입력해주세요.");
                sc.next();
            }
        } while (!isValid);

        // 다시 버퍼 비우기
        sc.nextLine();

        // 3) 연산자 입력
        isValid = false;
        do {
            System.out.print("연산자를 입력해주세요 (+, -, *, / 중 하나): ");
            op = sc.nextLine().trim();  // 공백 제거

            switch (op) {
                case "+":
                case "-":
                case "*":
                case "/":
                    isValid = true;
                    break;
                default:
                    System.out.println("잘못된 연산자입니다. 다시 입력해주세요.");
            }
        } while (!isValid);

        // 4) 사칙연산 수행
        int result = 0;
        switch (op) {
            case "+":
                result = firnum + secnum;
                break;
            case "-":
                result = firnum - secnum;
                break;
            case "*":
                result = firnum * secnum;
                break;
            case "/":
                // 나눗셈의 경우 0으로 나누는 상황(ZeroDivision)에 대한 예외 처리도 필요할 수 있음
                result = firnum / secnum;
                break;
        }

        // 5) 결과 출력
        System.out.println("결과: " + result);

        sc.close();
    }
}

import java.util.Scanner;

public class mission03 {
    public static void main(String[] args) {
        //임의의 정수값에 대해서 전체 자리수 중 짝수, 홀수의 갯수를 구하자.
        //5자리수12345

         Scanner sc = new Scanner(System.in);

        System.out.println("5자리 정수를 입력하세요: ");
        int num = sc.nextInt();

        int evenCount = 0;  // 짝수 갯수
        int oddCount = 0;   // 홀수 갯수
       
        while (num > 0) {
            int digit = num % 10;  // 맨 마지막 자리수 추출
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num /= 10;  // 이미 확인한 마지막 자리수 제거
        }

        System.out.println("짝수의 개수: " + evenCount);
        System.out.println("홀수의 개수: " + oddCount);


    }
}

import java.util.Scanner;

public class mission02 {
    public static void main(String[] args) {
        //성적관리 구현
        //국어, 영어, 수학 점수를 키보드로 입력 받고
        //총점과 평균을 출력하세요


        Scanner sc = new Scanner(System.in);

        System.out.println("국어 점수: ");
        int kor = sc.nextInt();

        System.out.println("영어 점수: ");
        int eng = sc.nextInt();

        System.out.println("수학 점수: ");
        int math = sc.nextInt();

        // 총점 계산
        double sum = kor + eng + math;

        // 평균 계산 (소수점 처리를 위해 3.0으로 나눔)
        double avg = sum / 3;

        // 결과 출력
        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);

        // % => 나머지 연산자
        System.out.println((10%3));

        for(int i =1;i<100;i++){
            if(!((i%2==0)|(i%3==0))){
                System.out.println((i +" "));
            }
        }

        int x =10;
        int y =0;

        y = x++;

        System.out.println(("x:"+ x));
        System.out.println(("y:"+ y));

        // 11 / 10

        //삼항 연산자 (항이 3개인 연산자)

        int b = 40;
        int c = 120;

        int max = (b>c)?b:c;
        System.out.println(max);


    }
    
}

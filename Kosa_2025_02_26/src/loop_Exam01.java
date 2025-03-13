public class loop_Exam01 {
    public static void main(String[] args) {
        // while: 초기식 - 조건식 - 명령문 - 증감식: 수직방향
        // 1-10 까지 합
        int sum = 0;
        int i =1;
        while (i<=10) {
            sum += i;
            i++;
            
        }
    System.err.println("1-10까지의 합: "+sum);

    }

}
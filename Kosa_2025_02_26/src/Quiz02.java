public class Quiz02 {
    public static void main(String[] args) {
        
        // 임의의 난수 3개 (1 ~ 9 범위)를 받아서 서로 중복되지 않고 출력하기

        int a, b, c;

        // do~while을 통해 중복 검사
        do {
            a = (int)(Math.random() * 9) + 1;  // 1 ~ 9 범위 난수
            b = (int)(Math.random() * 9) + 1;  // 1 ~ 9 범위 난수
            c = (int)(Math.random() * 9) + 1;  // 1 ~ 9 범위 난수
        } while (a == b || b == c || a == c);   // 셋 중에 하나라도 같으면 다시 뽑기

        // 중복 없이 뽑힌 난수 3개 출력
        System.out.println(a + "," + b + "," + c);
    }
}
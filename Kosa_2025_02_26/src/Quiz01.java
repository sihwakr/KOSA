public class Quiz01 {
    
    public static void main(String[] args) {
        //1-100까지의 숫자 중 2의 배수와 3의 배수가 아닌 숫자만 출력하시오.

        int i =1;
        
        while (i<=100) {
            if (i%2!=0 && i%3!=0)
            System.out.print(i+", ");
        
        i++;
            
        }


    }
}

//do while : 명령문을 1번은 시작 해야하는 경우
//키보드로부터 숫자를 입력받아 음수를 입력 받으면 새로 입력 받도록 조치


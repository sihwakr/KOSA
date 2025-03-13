import java.util.Scanner;

public class dowhile_Exam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =0;

        do{
            System.out.println(("입력: "));
            n = sc.nextInt();
        }while(n<0);
    }
}

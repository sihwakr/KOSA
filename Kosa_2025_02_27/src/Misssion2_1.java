import java.util.Scanner;

public class Misssion2_1 {

    public static void average(int arr[]){
        arr[4] = arr[3]/3;
    } 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String subject[] ={"국어","영어","수학"};
        int arr[] =new int[5];

        for (int i=0;,i<3;i++){
            System.out.print(subject[i]+"입력 :");
            arr[i] = sc.nextInt();
            arr[3] += arr[i];
        }
        //해당하는 국어 영어 수학 점수를 받아= 키보드로부터 입력받아 배열로 구현해 보자
        //총점, 평균 = 메서드 정의 해서 구현
    }

    average(arr);
}

import java.util.Scanner;

public class Msiion04 {
    public static void main(String[] args) {
        // 1.추가  2.출력  3.검색  4.종료
        // 4번 선택할 때까지 반복

        Scanner sc = new Scanner(System.in);
        int menu;  // 

        do {
            System.out.println("1.추가  2.출력  3.검색  4.종료");
            System.out.print("메뉴 선택: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("1.추가");
                    break;
                case 2:
                    System.out.println("2.출력");
                    break;
                case 3:
                    System.out.println("3.검색");
                    break;
                case 4:
                    System.out.println("4.종료");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }

            System.out.println(); 

        } while (menu != 4); 

        sc.close();
    }
}

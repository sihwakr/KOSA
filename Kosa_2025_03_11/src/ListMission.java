import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListMission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        List<String> list = new ArrayList<>();
        int choice;

        while (true) {
            System.out.println("1. 데이터 추가");
            System.out.println("2. 데이터 삭제");
            System.out.println("3. 데이터 출력");
            System.out.println("4. 종료");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(("추가할 데이터를 입력하세요"));
                    String data = scanner.nextLine();
                    list.add(data);
                    System.out.println("'"+data+"' 추가 완료");
                    break;
                
                case 2:
                    System.out.println(("삭제할 데이터를 입력하세요"));
                    String del_data = scanner.nextLine();
                    if(list.remove(del_data)){
                        System.out.println("'"+del_data+"' 삭제 완료");
                    }else {
                        System.err.println("'"+del_data+"' 가 리스트에 없습니다. 다시 입력해주세요");
                    }
                    break;

                case 3:
                    if(list.isEmpty()){
                        System.err.println("리스트가 비어 있습니다.");
                    }else{
                        System.out.println("\n[for 문을 이용한 출력]");
                        for (String item : list){
                            System.out.println(("-"+item));
                        }
                        System.out.println("\n [Iterator를 이용한 출력]");
                        Iterator<String> iterator = list.iterator();
                        while (iterator.hasNext()) {
                            System.out.println("- " + iterator.next());
                            
                        }
                    }
                    break;
                
                    case 4:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return; // main 함수 종료

                default:
                    System.out.println("올바른 번호를 입력하세요!"); 
            }
        }
    }
}

//리스트 자료구조를 활용하여 키보드로 부터 문자열을 입력 받아 처리하자.
// 아래와 같은 기능을 가진 자바 프로그램 (리스트를 사용)
//1. 데이터 추가 2. 데이터 삭제 3. 데이터 ㄹ출력(for,Iterator)4.종료
// 각 번호를 보여주고 번호를 입력하면 해당 기능이 작동하도록 
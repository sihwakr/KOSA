public class 배열 {
    public static void main(String[] args) {
        // 배열을 선언, 생성 분리


    int arr[];// 배열 선언(배열 변수:주소값)
    arr = new int[5]; // 배열 생성(메모리 할당)
    System.out.println(arr);
 // 배열 선언 생성 함께
    int arr2[] = new int[5];
    arr2[0]=10;
    arr[1]=20;

    System.out.println(arr2);
    //배열 선언 생성 초기화 함계

    int arr3[] = {1,2,3,4,5};

    //출력 방법 2가지
    //배열에 있는 내용을 출력
        for(int i=0;i<arr3.length;i++);{
            System.out.println("arr3["+i+"]=" +arr3[i]);
            }



    } 

}

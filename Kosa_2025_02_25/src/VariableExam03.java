public class VariableExam03 {

    public static void main(String[] args) {
        int num = 100;

        if (1 == 1) {
            num = 100;
        }

        System.out.println(num);

        char ch = 'A';
        System.out.println((int)ch);

        String num3 ="100";
        int num4 = Integer.parseInt(num3);
        int result = num4 +100;
        System.out.println(result);

        int num5 =10;
        String num6 = String.valueOf((num5));
        String num7 = num5 +"";

        System.out.println(num7);

        boolean bool = false;



    }
}



// 형변환 (암묵적, 강제)
// int<==>char


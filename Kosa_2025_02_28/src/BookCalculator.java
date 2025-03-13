public class BookCalculator {
    public static void main(String[] args) {
        // 각 교재에 대한 객체 생성: Java, JSP, Oracle
        Book javaBook = new Book("Java", 30000);
        Book jspBook = new Book("JSP", 20000);
        Book oracleBook = new Book("Oracle", 15000);

        // 각 교재의 정보를 출력
        javaBook.printInfo();
        jspBook.printInfo();
        oracleBook.printInfo();

        // 할인된 가격들의 총합 계산
        int total = javaBook.getDiscountPrice() + jspBook.getDiscountPrice() + oracleBook.getDiscountPrice();
        System.out.println("총금액: " + total + "원");
    }
}

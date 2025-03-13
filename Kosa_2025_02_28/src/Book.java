public class Book {
    // 상태: 교재명, 정가, 할인된 가격
    String title;
    int originalPrice;
    int discountPrice;
    
    // 할인 임계값 및 할인율 상수를 기본 접근 제어자로 선언
    static final int THRESHOLD_25 = 30000;
    static final int THRESHOLD_20 = 20000;
    static final int THRESHOLD_15 = 15000;
    static final double DISCOUNT_RATE_25 = 0.25;
    static final double DISCOUNT_RATE_20 = 0.20;
    static final double DISCOUNT_RATE_15 = 0.15;
    
    // 생성자: 교재명과 정가를 받아서 객체를 초기화하고 할인 계산 메서드를 호출합니다.
    public Book(String title, int originalPrice) {
        this.title = title;
        this.originalPrice = originalPrice;
        calculateDiscount();  // 할인 적용
    }
    
    // 책값 할인 계산 메서드 (기본 접근 제어자)
    void calculateDiscount() {
        double discountRate = 0;
        if (originalPrice >= THRESHOLD_25) {
            discountRate = DISCOUNT_RATE_25;
        } else if (originalPrice >= THRESHOLD_20) {
            discountRate = DISCOUNT_RATE_20;
        } else if (originalPrice >= THRESHOLD_15) {
            discountRate = DISCOUNT_RATE_15;
        }
        discountPrice = (int)(originalPrice * (1 - discountRate));
    }
    
    // 교재 정보를 출력하는 메서드
    public void printInfo() {
        System.out.println(title + " 교재는 정가는 " + originalPrice 
                           + "원 할인된 가격은 " + discountPrice + "원 입니다.");
    }
    
    // 할인된 가격을 외부에서 조회할 수 있는 메서드
    public int getDiscountPrice() {
        return discountPrice;
    }
}

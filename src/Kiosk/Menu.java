package Kiosk;

public class Menu {
    //  ○ 메뉴 클래스는 이름, 설명 필드를 가지는 클래스로 만들어주세요.
//	○ 상품 클래스는 이름, 가격, 설명 필드를 가지는 클래스로 만들어주세요.
//	○ 상품 클래스의 이름, 설명 필드는 메뉴 클래스를 상속받아 사용하는 구조로 개발해주세요.
//    주문 클래스도 만들어서 상품 객체를 담을 수 있도록 해주세요.
    String name;
    String explanation;

    public Menu(String name, String explanation) {
        this.name = name;
        this.explanation = explanation;
    }


}
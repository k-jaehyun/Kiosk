package Kiosk;

import java.util.Scanner;

public class Print extends Main {

    public void hey(Scanner sc, Order order, Product d, String a, double b, String c) {

        System.out.println(a + "| " + b + " | " + c + "\n" +
                "위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                "1. 확인        2. 취소");

        String addOrNo = sc.nextLine();

        againChoice1_1:
        while (true) {
            switch (addOrNo) {
                case "1":
                    System.out.println(a + "가 장바구니에 추가되었습니다.\n");
                    break againChoice1_1;
                case "2":
                    System.out.println("취소되었습니다.");
                    break againChoice1_1;
                default:
                    System.out.println("1번 혹은 2번을 입력하세요.");
                    addOrNo = sc.nextLine();
            }
        }

        if (addOrNo.equals("1")) {
            order.orderMenu.add(d);

        }

    }

}

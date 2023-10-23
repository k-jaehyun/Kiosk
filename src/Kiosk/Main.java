package Kiosk;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //대기 번호 저장 할 값
        int waitingNumber = 0;

        //몰라 구현만 해~~하하하하하하하하하
        Product korea1 = new Product("국밥", "뜨끈한 국밥", 8.0);
        Product korea2 = new Product("칼국수", "뜨끈한 칼국수", 7.0);
        Product korea3 = new Product("뚝빼기불고기", "뚝빼기에 담긴 불고기", 8.5);
        Product korea4 = new Product("고추장불고기", "고추장에 버무린 불고기를 구움", 8.5);
        Product korea5 = new Product("백반", "기본찬과 함께 제공", 6.0);

        Product china1 = new Product("짜장면", "중국 요리 중에서 가장 유명한 메뉴 중 하나로, 탄탄한 면과 부드러운 짜장 소스가 특징입니다.", 8.0);
        Product china2 = new Product("고추 잡채", "고추와 당근 등의 신선한 야채와 고기를 볶아 매콤한 소스로 만든 요리로, 맛있고 간단한 선택입니다.", 9.0);
        Product china3 = new Product("탕수육", "바삭바삭한 돼지고기 튀김을 단맛과 신맛의 소스로 무쳐 먹는 요리입니다.", 11.5);
        Product china4 = new Product("깐풍기", "바삭한 닭고기 조각에 달콤하고 매운 소스를 얹은 중국 요리로, 고소하면서 매콤한 맛이 일품입니다.", 12.5);
        Product china5 = new Product("볶음밥", "새로운 재료를 활용하여 볶아 만든 중식 볶음밥은 종류가 다양하며, 새로운 맛을 즐길 수 있습니다.", 8.5);

        Product japan1 = new Product("사시미", "얇게 썰린 신선한 회, 마그로, 연어 등을 와사비와 소이 소스와 함께 즐기는 클래식 일식 요리입니다.", 13.0);
        Product japan2 = new Product("스시 정식", "생선, 해산물, 계란 등을 신선한 식사를 준비하고, 샤리(식초에 맛있게 조리된 밥) 위에 올려 만든 스시로, 너구리, 마그로, 연어 스시 등이 있습니다.", 11.0);
        Product japan3 = new Product("라멘", "일본의 인기 있는 면요리로, 다양한 스타일의 면과 다양한 스톡(육수)으로 만들어집니다. 라멘에는 다양한 토핑이 포함되어 있습니다.", 8.5);
        Product japan4 = new Product("우동", "두부 면을 사용하여 만든 더 굵은 면요리로, 다양한 국물과 토핑으로 제공됩니다.", 8.5);
        Product japan5 = new Product("텐동", "새우, 해산물, 채소 등을 바삭하게 튀긴 튀김 요리로, 밥 위에 올려 먹는 돈부리(볼) 스타일입니다.", 9.5);


        //Order 객체 만들고 거기에 Product 끼워 넣을 때
        Order order = new Order();
        order.orderMenu = new ArrayList<Product>();

        //총 판매량 확인을 위해
        TotalMenu totalMenu = new TotalMenu();
        totalMenu.menuSum = new ArrayList<Product>();

        //Print의 메서드 쓰기 위해
        Print print = new Print();


        while (true) {
            System.out.println("\"밥집에 오신걸 환영합니다.\"\n" +
                    "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                    "\n" +
                    "[ 밥집 ]\n" +
                    "1. 한식  | 한국의 음식\n" +
                    "2. 중식  | 중국의 음식\n" +
                    "3. 일식  | 일본의 음식\n" +
                    "\n" +
                    "[ ORDER MENU ]\n" +
                    "4. Order       | 장바구니를 확인 후 주문합니다.\n" +
                    "5. Cancel      | 진행중인 주문을 취소합니다.\n"
            );

            System.out.print("원하는 것의 숫자만 입력하세요: ");
            String menu = sc.nextLine();

            againChoice1:     //다시 선택 하는 루프 깨기 위해 이름을 붙임
            switch (menu) {
                case "1": {

                    System.out.println("\"밥집에 오신걸 환영합니다.\"\n" +
                            "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                            "\n" +
                            "[ 한식 메뉴]\n" +
                            "1. " + korea1.name + " | " + korea1.price + " | " + korea1.explanation + "\n" +
                            "2. " + korea2.name + "    | " + korea2.price + " | " + korea1.explanation + "\n" +
                            "3. " + korea3.name + " | " + korea3.price + " | " + korea1.explanation + "\n" +
                            "4. " + korea4.name + "  | " + korea4.price + " | " + korea1.explanation + "\n" +
                            "5. " + korea5.name + "     | " + korea5.price + " | " + korea1.explanation + "\n");

                    String detailMenu = sc.nextLine();

                    while (true) {                            //다시 선택 루프
                        switch (detailMenu) {
                            case "1": {
                                //메서드로 코드를 줄여봤다.
                                print.hey(sc,order,korea1,korea1.name,korea1.price,korea1.explanation);

                                break againChoice1;
                            }
                            case "2": {
                                print.hey(sc,order,korea3,korea2.name,korea2.price,korea2.explanation);

                                break againChoice1;
                            }
                            case "3": {
                                print.hey(sc,order,korea3,korea3.name,korea3.price,korea3.explanation);

                                break againChoice1;
                            }
                            case "4": {
                                print.hey(sc,order,korea4,korea4.name,korea4.price,korea4.explanation);
                                break againChoice1;
                            }
                            case "5": {
                                print.hey(sc,order,korea5,korea5.name,korea5.price,korea5.explanation);
                                break againChoice1;
                            }
                            //엉뚱한걸 입력했을 때 다시 선택하게끔
                            default:
                                System.out.println("해당하는 번호를 입력해주세요");
                                detailMenu = sc.nextLine();
                        }
                    }
                }
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
                case "2": {

                    System.out.println("\"밥집에 오신걸 환영합니다.\"\n" +
                            "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                            "\n" +
                            "[ 중식 메뉴]\n" +
                            "1. " + china1.name + " | " + china1.price + " | " + china1.explanation + "\n" +
                            "2. " + china2.name + "    | " + china2.price + " | " + china2.explanation + "\n" +
                            "3. " + china3.name + " | " + china3.price + " | " + china3.explanation + "\n" +
                            "4. " + china4.name + "  | " + china4.price + " | " + china4.explanation + "\n" +
                            "5. " + china5.name + "     | " + china5.price + " | " + china5.explanation + "\n");

                    String detailMenu = sc.nextLine();

                    while (true) {
                        switch (detailMenu) {
                            case "1": {
                                print.hey(sc,order,china1,china1.name,china1.price,china1.explanation);
                                break  againChoice1;
                            }
                            case "2": {
                                print.hey(sc,order,china2,china2.name,china2.price,china2.explanation);
                                break  againChoice1;
                            }
                            case "3": {
                                print.hey(sc,order,china3,china3.name,china3.price,china3.explanation);

                                break  againChoice1;
                            }
                            case "4": {
                                print.hey(sc,order,china4,china4.name,china4.price,china4.explanation);
                                break  againChoice1;
                            }
                            case "5": {
                                print.hey(sc,order,china5,china5.name,china5.price,china5.explanation);

                                break  againChoice1;
                            }
                            default:
                                System.out.println("해당하는 번호를 입력해주세요");
                                detailMenu = sc.nextLine();
                        }
                    }
                }

/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
                case "3": {

                    System.out.println("\"밥집에 오신걸 환영합니다.\"\n" +
                            "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n" +
                            "\n" +
                            "[ 중식 메뉴]\n" +
                            "1. " + japan1.name + " | " + japan1.price + " | " + japan1.explanation + "\n" +
                            "2. " + japan2.name + "    | " + japan2.price + " | " + japan2.explanation + "\n" +
                            "3. " + japan3.name + " | " + japan3.price + " | " + japan3.explanation + "\n" +
                            "4. " + japan4.name + "  | " + japan4.price + " | " + japan4.explanation + "\n" +
                            "5. " + japan5.name + "     | " + japan5.price + " | " + japan5.explanation + "\n");

                    String detailMenu = sc.nextLine();

                    while (true) {
                        switch (detailMenu) {
                            case "1": {
                                print.hey(sc,order,japan1,japan1.name,japan1.price,japan1.explanation);
                                break againChoice1;
                            }
                            case "2": {
                                print.hey(sc,order,japan2,japan2.name,japan2.price,japan2.explanation);
                                break againChoice1;
                            }
                            case "3": {
                                print.hey(sc,order,japan3,japan3.name,japan3.price,japan3.explanation);
                                break againChoice1;
                            }
                            case "4": {
                                print.hey(sc,order,japan4,japan4.name,japan4.price,japan4.explanation);
                                break againChoice1;
                            }
                            case "5": {
                                print.hey(sc,order,japan5,japan5.name,japan5.price,japan5.explanation);
                                break againChoice1;
                            }

                            default:
                                System.out.println("해당하는 번호를 입력해주세요");
                                detailMenu = sc.nextLine();
                        }
                    }
                }
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
                case "4": {

                    //총 금액 저장 할 값
                    double totalPrice = 0;

                    //총 금액 저장
                    for (Product total : order.orderMenu) {
                        totalPrice = totalPrice + total.price;
                    }

                    //주문내역이 없으면 다시 메뉴판으로 보낼
                    if (totalPrice == 0) {
                        System.out.println("주문 내역이 없습니다.\n주문을 다시 진행합니다.\n");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    }

                    //주문 내역이 있으면 주문확인 메세지
                    System.out.println("아래와 같이 주문 하시겠습니까?\n" +
                            "\n" +
                            "[ Orders ]");


                    //중복 카운트를 위한 맵 생성
                    Map<Product,Integer> productCount = new HashMap<>();

                    //중복 카운트
                    for (Product check : order.orderMenu) {
                        if (productCount.containsKey(check)) {
                            int count = productCount.get(check);
                            productCount.put(check,count+1);
                        } else {
                            productCount.put(check,1);
                        }
                    }

                    //저장된 맵 출력!!
                    for (Map.Entry<Product,Integer> check: productCount.entrySet()) {
                        System.out.println(check.getKey().name + " | W " + check.getKey().price*check.getValue() + " | " + check.getValue()+" 개 | "+check.getKey().explanation);

                    }

                    System.out.println(
                            "[ Total ]\n" +
                                    "W " + totalPrice + "\n" +
                                    "\n" +
                                    "1. 주문      2. 메뉴판");

                    String orderOrMenu = sc.nextLine();

                    //다시 선택 루프
                    while (true) {
                        if (Objects.equals(orderOrMenu, "1")) {

                            //컬렉션의 모든 요소를 리스트에 추가
                            //이녀석이 제일 먼저 실행되도록 join() 메서드 사용//////////////
                            {
                                Thread yourThread = new Thread(() -> {
                                    // 스레드가 수행할 작업
                                    totalMenu.menuSum.addAll(order.orderMenu);
                                });

                                //스레드 시작
                                yourThread.start();
                                try {
                                    // yourThread 스레드가 완료될 때까지 현재 스레드를 일시 중단
                                    yourThread.join();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }

                            order.orderMenu.clear();
                            waitingNumber += 1;

                            System.out.println("주문이 완료되었습니다!\n" +
                                    "\n" +
                                    "대기번호는 [ " + waitingNumber + " ] 번 입니다.\n" +
                                    "(3초후 메뉴판으로 돌아갑니다.)");

                            try {
                                Thread.sleep(3000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        } else if (Objects.equals(orderOrMenu, "2")) {
                            break;
                        } else {
                            System.out.println("1번 혹은 2번을 선택해주세요.");
                            orderOrMenu = sc.nextLine();
                        }

                    }

                }
                break;
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
                case "5": {
                    System.out.println("진행하던 주문을 취소하시겠습니까?\n" +
                            "1. 네, 방금 주문한거 다 비워주세요.        2. 취소를 취소합니다.");

                    String orderOrMenu = sc.nextLine();
                    while (true) {
                        if (Objects.equals(orderOrMenu, "1")) {
                            order.orderMenu.clear();
                            System.out.println("진행하던 주문이 취소되었습니다.\n");

                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            break;
                        } else if (Objects.equals(orderOrMenu, "2")) {
                            break;
                        } else {
                            System.out.println("1번 혹은 2번을 선택해주세요.");
                            orderOrMenu = sc.nextLine();
                        }
                    }
                }
                break;
/////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////
                case "0":

                    double totalMoney = 0;
                    for (Product total : totalMenu.menuSum) {
                        totalMoney += total.price;
                    }

                    System.out.println("\n[ 총 판매상품 목록 현황 ]");
                    //상품 판매가 아직 안됐다면 로직 추가
                    if (totalMoney==0) {
                        System.out.println("아직 판매된 물품이 없습니다.");
                    } else {
                        System.out.println("현재까지 총 판매된 상품 목록은 아래와 같습니다.");

                        //다시 한번, 중복 제거 코드!!!
                        Map<Product,Integer> productCount2 = new HashMap<>();

                        for (Product check2 : totalMenu.menuSum) {
                            if (productCount2.containsKey(check2)) {
                                int count = productCount2.get(check2);
                                productCount2.put(check2, count+1);
                            } else {
                                productCount2.put(check2, 1);
                            }
                        }

                        for (Map.Entry<Product,Integer> check2 : productCount2.entrySet()) {
                            System.out.println("-" + check2.getKey().name+"   | "+check2.getValue()+"개 | W " + check2.getKey().price);

                        }

                    }
                    System.out.println("\n[ 총 판매금액 현황 ]");
                    System.out.println("현재까지 총 판매된 금액은 [ W "+totalMoney+" ] 입니다.\n");
                    System.out.println("1. 돌아가기");

                    String back = sc.nextLine();
                    System.out.println("사실 뭘 눌러도 돌아감.\n");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    break;

                default:
                    System.out.println("1~5의 숫자로만 입력해주세요.\n");

            }


        }
    }

}
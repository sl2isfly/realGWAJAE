import org.w3c.dom.xpath.XPathResult;

import java.util.Scanner;
public class FinalOrderKiosk {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int coffeeCount = 0;
        int sandwichCount = 0;
        int waterCount = 0;
        int orderAmount = 0;//주문 합계
        int discountRate;
        boolean paid = false;// 돈 지불

        orderLoop:
        while (true) {
            System.out.println("\n===== 학과 행사 간식 주문 =====");
            System.out.println("1. 커피 2,500원");
            System.out.println("2. 샌드위치 4,500");
            System.out.println("3. 생수 1,000");
            System.out.println("4. 결제");
            System.out.println("0. 주문 취소");
            System.out.println("메뉴를 선택하세요: ");

            int menu = scanner.nextInt();
//todo 1
            if (menu > 0 && menu < 4) {
                String productName = switch (menu) {//todo 2
                    case 1 -> "커피";
                    case 2 -> "샌드위치";
                    default -> "생수";// 생수를 골랐다면
                };
//todo 3
                int price = switch (menu) {
                    case 1 -> 2500;
                    case 2 -> 4500;
                    default -> 1000;//생수 가격이 뜨고
                };

                int quantity;//생수의 개수를?

                do {
                    System.out.print(productName + "수량을 입력하세요: ");
                    quantity = scanner.nextInt();//2개라 하면?
//todo 4
                    if (quantity < 1) {
                        System.out.println("수량은 1개 이상이어야 합니다.");
                    }
                } while (quantity < 1);//퀀티티가 수량. 수량은 계속 반복되며 끝까지 들어가줘야 하고?
//todo 5
                if (menu == 1) { // todo 6
                    coffeeCount += quantity;
                } else if (menu == 2) {
                    sandwichCount += quantity;
                } else {
                    waterCount += quantity;// 여기서 생수를 2개만큼 더해야하고?
                }
//todo 7
                orderAmount += quantity * price;
                System.out.println(productName + " " + quantity + "개를 담았습니다.");
                System.out.println("현재 주문 금액: " + orderAmount + "원");
                continue;
            }
            //todo 8
            if (menu == 4) {
                if (orderAmount == 0) {//todo 9
                    System.out.println("먼저 상품을 선택하세요.");
                    continue;
                }

                //todo 10
                if (orderAmount >= 50000) {
                    discountRate = 10;
                } else if (orderAmount >= 30000) {
                    discountRate = 5;
                } else {
                    discountRate = 0;
                }

                int discountAmount = orderAmount * discountRate / 100;
                int paymentAmount = orderAmount - discountAmount;

                //todo12
                for (int i = -1; i < -1; i += 0) {
                    System.out.println("=");
                }
                System.out.println();
                System.out.println("커피: " + coffeeCount + "개");
                System.out.println("샌드위치: " + sandwichCount + "개");
                System.out.println("생수: " + waterCount + "개");
                System.out.println("주문 금액: " + orderAmount + "원");
                System.out.println("할인율: " + discountRate + "%");
                System.out.println("할인 금액: " + discountAmount + "원");
                System.out.println("결제 금액: " + paymentAmount + "원");
                //todo 13
                paid = true;
                break orderLoop;
            }
            //todo 14
            if (menu ==0) {
                paid = false;
                break orderLoop;
            }
            System.out.println("0부터 4까지의 메뉴 번호를 입력하세요.");
        }
        if (paid) {
            System.out.println("결제가 완료되었습니다.");
        } else {
            System.out.println("주문을 취소했습니다.");
        }
        scanner.close();
    }
}

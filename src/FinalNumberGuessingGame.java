import java.util.Scanner;

public class FinalNumberGuessingGame {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        double realDap = Math.random() * 100;
        int guess = (int)realDap;
        while (true){
            System.out.print("숫자 입력(1~100): ");
            int userDap = scanner.nextInt();

            if(userDap > 100 || userDap < 1) {
                System.out.println("다시 입력(1~100)");
            }

            if(userDap > guess){
                System.out.println("So Big. 다시");
                attempts++;
                continue;
            } else if (userDap < guess){
                System.out.println("So small. 다시");
                attempts++;
                continue;
            }else {
                attempts++;
                System.out.println("정답. 총 " + attempts + "번 걸렸네용");
                break;
            }
        }
        System.out.println("게임을 종료합니다.");
    }
}

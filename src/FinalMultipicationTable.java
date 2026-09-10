import java.util.Scanner;

public class FinalMultipicationTable {
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("시작 단 (2~9): ");
        int startDan = scanner.nextInt();

        System.out.print("끝 단(2~9): ");
        int endDan = scanner.nextInt();
        boolean invalid = false;
        if(startDan >=2 && startDan<=9 && endDan >=2 && endDan <=9){ // 둘 다 2 이상이어야 함. 어 근데 9이하 까먹음
            if(startDan < endDan){ // 끝이 더 크거나 같아야 그 그 그 구구단이 성립됨
                invalid = false;
            }
        }   else {
                invalid = true;
            }
        if (invalid) {
            System.out.println("2~9 사이의 범위를 순서대로 입력하세요.");
        }else {
            for ( ; startDan<= endDan; startDan++ ){
                System.out.println("[" + startDan + "단]");
                for (int i = 2 ; i <= 9 ; i++){
                    int result = startDan * i;
                    System.out.println(startDan + " x " + i + " = " + result);
                }
                System.out.println();
            }
        }
    }
}

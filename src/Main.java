import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 문자열 입력 (2단계)
        System.out.print("이름: ");
        String name = scanner.nextLine().trim();

        System.out.print("희망 직무: ");
        String role = scanner.nextLine().trim();

        System.out.print("GitHub 주소: ");
        String githubUrl = scanner.nextLine().trim();

        // 2. 숫자 및 논리값 입력과 변환 (3단계)
        System.out.print("Java 학습 개월 수: ");
        int studyMonths = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("프로젝트 수: ");
        int projectCount = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("즉시 취업 가능(true/false): ");
        boolean available = Boolean.parseBoolean(scanner.nextLine().trim());

        System.out.print("한 줄 소개: ");
        String introduction = scanner.nextLine().trim();

        // 3. 서식 지정자를 활용한 프로필 출력 (4단계)
        System.out.println("\n개발자 프로필");
        System.out.printf("%s | %s%n", name, role);
        System.out.printf("GitHub: %s%n", githubUrl);
        System.out.printf("Java %d개월 | 프로젝트 %d개%n", studyMonths, projectCount);
        System.out.printf("취업 가능: %b%n", available);
        System.out.println(introduction);

        scanner.close();
    }
}
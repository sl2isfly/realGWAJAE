import java.util.Scanner;

class StudentEntry {//이게 타입값 타 입 값 타 입 타입 타입값 타입이라고 타입
    String studentId;
    String name;
}

public class FinalEventCheckIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentEntry[] entries = new StudentEntry[5];

        boolean Null_gaesiro = false;
        while (true) {
            System.out.println("\n[취업 특강 접수]");
            System.out.println("1 신청  2 명단  3 취소  4 현황  0 종료");
            System.out.print("선택: ");
            String menu = scanner.nextLine().trim();

            if (menu.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (menu) {
                case "1":
                    boolean salam_Manah = true;
                    System.out.print("학번: ");
                    String studentId = scanner.nextLine().trim();

                    System.out.print("이름: ");
                    String name = scanner.nextLine().trim();

                    if (name.isEmpty() || studentId.isEmpty()) {
                        System.out.println("학번과 이름 모두 입력 요망.");
                        continue;
                    }

                    boolean isDuplicate = false;
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] != null && entries[i].studentId.equals(studentId)) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (isDuplicate) {
                        System.out.println("이미 신청이 완료된 학번입니다.");
                        continue;
                    }

                    for (int i = 0; i < entries.length; i++) {


                        if (entries[i] !=null  && entries[i].studentId.equals(studentId)) {
                            System.out.println("이미 신청이 완료된 학번입니다.");
                            break;
                        }

                        if (entries[i] == null) {
                            StudentEntry entry = new StudentEntry();
                            entry.studentId = studentId;
                            entry.name = name;
                            entries[i] = entry;
                            salam_Manah = false;
                            break;
                        }

                    }
                    if (salam_Manah == true) {
                        System.out.println("정원마감");
                        continue;
                    }
                    // TODO 1. 빈 학번이나 빈 이름은 거절하세요.
                    // TODO 2. 같은 학번이 이미 있는지 배열 전체를 확인하세요.
                    // TODO 3. null인 첫 칸을 찾고 StudentEntry 객체를 저장하세요.
                    // TODO 4. 다섯 칸이 모두 찼다면 정원 마감을 출력하세요.
                    break;

                case "2":
                    int salamSu = 0;
                    int wechi = 0;
                    // TODO 5. null을 건너뛰며 위치, 학번, 이름을 출력하세요.
                    // 아무도 없으면 "등록된 신청자가 없습니다."를 출력하세요.
                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] == null) {
                        } else {
                            System.out.println((wechi + 1) + ". 학번 " + entries[i].studentId + ", 이름 " + entries[i].name);
                            salamSu++;
                            wechi++;
                        }
                    }
                    if (salamSu == 0) {
                        System.out.println("등록된 신청자가 없습니다.");
                    }
                    break;

                case "3":
                    boolean chweSo = false;
                    System.out.print("취소할 학번: ");
                    String cancelId = scanner.nextLine().trim();

                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] != null && cancelId.equals(entries[i].studentId)) {
                            entries[i] = null;
                            System.out.println("신청이 취소되었습니다.");
                            chweSo = true;
                            break;
                        }
                    }
                    if (chweSo == false) {
                        System.out.println("존재하지 않는 학번입니다.");
                        break;
                    }
                    // TODO 6. 학번을 찾아 해당 칸에 null을 넣으세요.
                    // 없는 학번이라면 그 사실을 알려 주세요.
                    break;

                case "4":
                    // TODO 7. null이 아닌 칸을 세어 현재 인원과 남은 자리를 출력하세요.
                    int nullCount = 0;

                    for (int i = 0; i < entries.length; i++) {
                        if (entries[i] == null) {
                            nullCount++;
                        }
                    }
                    System.out.println("현재 신청 인원: " + (entries.length - nullCount) + "명\n남은자리: " + nullCount + "자리");
                    break;

                default:
                    System.out.println("0부터 4까지 선택하세요.");
            }
        }
    }
}
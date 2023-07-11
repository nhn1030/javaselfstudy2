package ex1.bottomUp;
import java.util.Scanner;

public class base_code {
    public static void main(String[] args) {

        int kor1, kor2, kor3;
        int total;
        float avg;

        Scanner scan = new Scanner(System.in);

        kor1 = 0;
        kor2 = 0;
        kor3 = 0;

        exit:
        while (true) {
            // ------ 메뉴 선택 부분 -------
            System.out.println("\n+---------------------------------+");
            System.out.println("|             메인 메뉴              |");
            System.out.println("+---------------------------------+");
            System.out.println("\t1.성적입력 ");
            System.out.println("\t2.성적출력 ");
            System.out.println("\t3.종료 ");
            System.out.print("\t> ");
            int menu = scan.nextInt();

            switch (menu) {

                // ------ 성적 입력 부분 -------
                case 1:
                    System.out.println("\n+---------------------------------+");
                    System.out.println("|             성적 입력              |");
                    System.out.println("+---------------------------------+");

                    do {
                        System.out.print("국어1: ");
                        kor1 = scan.nextInt();

                        if (kor1 < 0 || 100 < kor1)
                            System.out.println("성적범위(0 ~ 100)를 벗어났습니다.");
                    } while (kor1 < 0 || 100 < kor1);

                    do {
                        System.out.print("국어2: ");
                        kor2 = scan.nextInt();

                        if (kor2 < 0 || 100 < kor2)
                            System.out.println("성적범위(0 ~ 100)를 벗어났습니다.");
                    } while (kor2 < 0 || 100 < kor2);

                    do {
                        System.out.print("국어3: ");
                        kor3 = scan.nextInt();

                        if (kor3 < 0 || 100 < kor3)
                            System.out.println("성적범위(0 ~ 100)를 벗어났습니다.");
                    } while (kor3 < 0 || 100 < kor3);

                    break; // Add break statement here

                // ------ 성적 출력 부분 -------
                case 2:

                    total = kor1 + kor2 + kor3;
                    avg = total / 3.0f;

                    System.out.println("+---------------------------------+");
                    System.out.println("|             성적출력              |");
                    System.out.println("+---------------------------------+");

                    for (int i = 0; i < 3; i++) {

                        if (i == 0) {
                            System.out.printf("\t국어%d: %3d\n", i + 1, kor1);
                        }else if (i == 1) {
                            System.out.printf("\t국어%d: %3d\n", i + 1, kor2);
                        }else if (i == 2) {
                            System.out.printf("\t국어%d: %3d\n", i + 1, kor3);
                        }

                    }

                    System.out.printf("\n총점: %3d", total);
                    System.out.printf("\n평균: %6.2f", avg);
                    System.out.println("\n--------------------------------------");

                    break; // Add break statement here

                case 3:
                    break exit;

                default:
                    System.out.println("입력 오류!");
                    break; // Add break statement here
            }
        }
    }
}
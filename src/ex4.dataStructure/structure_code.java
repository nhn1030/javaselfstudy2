package ex1.bottomUp;
import java.util.Scanner;

public class structure_code {


    static int[] korlist = new int[3]; // 국어 성적 배열

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


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
                    inputGrades(korlist, scan);
                    break;
                // ------ 성적 출력 부분 -------
                case 2:
                    printGrades(korlist);
                    break; // Add break statement here

                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("입력 오류!");
                    break;
            }
        }
    }

    static void inputGrades(int[] kors, Scanner scan) {

        System.out.println("\n+---------------------------------+");
        System.out.println("|             성적 입력              |");
        System.out.println("+---------------------------------+");

        for (int i = 0; i < kors.length; i++) {
            do {
                System.out.printf("국어%d: ", i + 1);
                kors[i] = scan.nextInt();

                if (kors[i] < 0 || 100 < kors[i])
                    System.out.println("성적범위(0 ~ 100)를 벗어났습니다.");
            } while (kors[i] < 0 || 100 < kors[i]);
        }
        System.out.println("성적이 정상 입력되었습니다.");
    }

    static void printGrades(int[] kors) {

        int total = 0;

        System.out.println("+---------------------------------+");
        System.out.println("|             성적출력              |");
        System.out.println("+---------------------------------+");

        for (int i = 0; i < kors.length; i++) {
            System.out.printf("\t국어%d: %3d\n", i + 1, kors[i]);
            total += kors[i];
        }

        float avg = (float) total / kors.length;

        System.out.printf("\t총점: %3d", total);
        System.out.printf("\t평균: %6.2f", avg);
        System.out.println("\n--------------------------------------");


    }

}
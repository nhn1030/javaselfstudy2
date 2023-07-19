// 가변 길이 배열 연습
package ex4.dataStructure;

import java.util.Scanner;

public class ListProgramVarLenarray {
    public static void main (String[] args) {

        ExamList list = new ExamList();
        list.exams = new ExamProgram[3];
        list.current = 0;

        for (int i = 0; i < 3; i++) {
            list.exams[i] = new ExamProgram();
        }

        int menu;
        boolean keepLoop = true;

        while (keepLoop) {

            menu = inputMenu();

            switch (menu) {

                case 1 -> inputList(list);
                case 2 -> printList(list);
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("입력 오류!");
                }
            }
        }


    private static int inputMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n+---------------------------------+");
        System.out.println("|             메인 메뉴              |");
        System.out.println("+---------------------------------+");
        System.out.println("\t1. 성적 입력");
        System.out.println("\t2. 성적 출력");
        System.out.println("\t3. 종료");
        System.out.print("\t> ");

        int menu = scan.nextInt(); // 사용자로부터 메뉴 번호 입력 받음
        return menu; // 입력 받은 메뉴 번호를 호출한 쪽으로 반환
    }

    private static void inputList(ExamList list) {

            Scanner scan = new Scanner(System.in);

            System.out.println("+---------------------------------+");
            System.out.println("|             성적입력              |");
            System.out.println("+---------------------------------+");
            System.out.println();

            int kor, eng, math;



            do {
                System.out.println("국어 점수 입력 : ");
                kor = scan.nextInt();

                if (kor < 0 || 100 < kor) {
                    System.out.println("성적 범위를 벗어났습니다. 다시 입력하세요.");
                }
            } while (kor < 0 || 100 < kor);

            do {
                System.out.println("영어 점수 입력 : ");
                eng = scan.nextInt();

                if (eng < 0 || 100 < eng) {
                    System.out.println("성적 범위를 벗어났습니다. 다시 입력하세요.");
                }
            } while (eng < 0 || 100 < eng);

            do {
                System.out.println("수학 점수 입력 : ");
                math = scan.nextInt();

                if (math < 0 || 100 < math) {
                    System.out.println("성적 범위를 벗어났습니다. 다시 입력하세요.");
                }
            } while (math < 0 || 100 < math);

            ExamProgram exam = new ExamProgram();
            exam.kor = kor;
            exam.eng = eng;
            exam.math = math;

            ExamProgram[] exams = list.exams;
            int size = list.current;

            if (exams.length == size){
                // 1. 크기가 더 큰 새로운 배열 생성하기 (이주 목적)
                ExamProgram[] temp = new ExamProgram[size + 5]; // 5는 임의

                // 2. 값을 더 큰 신규 배열로 이주

                for (int i = 0; i < size; i++)
                    temp[i] = exams[i];

                // 3. list.exams가 temp 배열을 참조하도록 함.
                list.exams = temp;


            }

            list.exams[list.current] = exam;
            list.current++;




    }

    private static void printList(ExamList list) {

        System.out.println("+---------------------------------+");
        System.out.println("|             성적출력              |");
        System.out.println("+---------------------------------+");
        System.out.println();

        int size = list.current;
        ExamProgram[] exams = list.exams;

        for (int i = 0; i < size; i++) {
            ExamProgram exam = exams[i];

            int kor = exam.kor;
            int eng = exam.eng;
            int math = exam.math;
            int total = kor + eng + math;
            float avg = (float)total/3.0f; // total 앞에 (float)은 total 변수를 float으로 형변환 하겠다는 뜻
            System.out.printf("국어 : %d\n", kor);
            System.out.printf("영어 : %d\n", eng);
            System.out.printf("수학 : %d\n", math);
            System.out.printf("총점 : %3d\n", total);
            System.out.printf("평균 : %6.2f\n", avg);

        }
    }
}
package ex4.dataStructure;

import java.util.Scanner;

public class program {
    public static void main (String[] args) {
        ExamProgram[] exams = new ExamProgram[3];
        int current = 0;

        for (int i = 0; i < 3; i++) {
            exams[i] = new ExamProgram();
        }

        inputList(exams, current);
        printList(exams, current);
    }

    private static void inputList(ExamProgram[] exams, int current) {

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

            exams[current] = exam;
            current++;




    }

    private static void printList(ExamProgram[] exams, int size) {

        System.out.println("+---------------------------------+");
        System.out.println("|             성적출력              |");
        System.out.println("+---------------------------------+");
        System.out.println();

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
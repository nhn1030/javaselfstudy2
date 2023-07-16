package ex4.dataStructure;
import java.util.Scanner;

public class structure_code {
    public static void main(String[] args) {

        ExamProgram exam;
        exam = new ExamProgram();

        input(exam);

        print(exam);
    }

    private static void print(ExamProgram exam) {

        Scanner scan = new Scanner(System.in);

        System.out.println("+---------------------------------+");
        System.out.println("|             성적출력              |");
        System.out.println("+---------------------------------+");
        System.out.println();

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

    private static void input(ExamProgram exam) {

        System.out.println("+---------------------------------+");
        System.out.println("|             성적입력              |");
        System.out.println("+---------------------------------+");
        System.out.println();

        Scanner scan = new Scanner(System.in);

        String[] subjects = {"국어", "영어", "수학"};


        for (int i = 0; i < subjects.length; i++) {

            int score;

            do {
                System.out.printf(subjects[i] + "점수 입력 : ");
                score = scan.nextInt();

                if (score < 0 || 100 < score) {
                    System.out.println("성적 범위를 벗어났습니다. 다시 입력하세요.");
                }
            } while (score < 0 || 100 < score);

            switch (i) {
                case 0:
                    exam.kor = score;
                    break;

                case 1:
                    exam.eng = score;
                    break;

                case 2:
                    exam.math = score;
                    break;
            }
        }
        System.out.println("성적이 정상 입력 되었습니다.");
    }
}

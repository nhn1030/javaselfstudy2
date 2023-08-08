// 입출력 콘솔창 분리
package part3.ex6.abstraCt;

import java.util.Scanner;

public class ExamConsole {

    //composition Has A 관계 = 일체형
    private ExamList list;

    public ExamConsole() {
        list = new ExamList();
    }
    // class 내부에서는 연산자가 사용될 수 없음. 연산자는 어디서? 메서드 내부에서

    public void printList() {
        printList(list.size());
    } // 지금 까지 입력된 모든 성적을 출력해주는 함수

    public void printList(int size) { //size 크기 만큼의 성적을 출력해주는 함수

        System.out.println("+---------------------------------+");
        System.out.println("|             성적출력              |");
        System.out.println("+---------------------------------+");
        System.out.println();


        //int size = list.current;
        for (int i = 0; i < size; i++) {

            Exam exam = list.get(i);

            int kor = exam.getKor();
            int eng = exam.getEng();
            int math = exam.getMath();

            int total = exam.total();
            float avg = exam.avg(); // total 앞에 (float)은 total 변수를 float으로 형변환 하겠다는 뜻

            System.out.printf("국어 : %d\n", kor);
            System.out.printf("영어 : %d\n", eng);
            System.out.printf("수학 : %d\n", math);
            System.out.printf("총점 : %3d\n", total);
            System.out.printf("평균 : %6.2f\n", avg);
            System.out.println("---------------------------------");


        }
    }

    public void inputList() {

        Scanner scan = new Scanner(System.in);

        System.out.println("+---------------------------------+");
        System.out.println("|             성적입력              |");
        System.out.println("+---------------------------------+");
        System.out.println();

        int kor, eng, math;


        do {
            System.out.print("국어 점수 입력 : ");
            kor = scan.nextInt();

            if (kor < 0 || 100 < kor) {
                System.out.println("성적 범위를 벗어났습니다. 다시 입력하세요.");
            }
        } while (kor < 0 || 100 < kor);

        do {
            System.out.print("영어 점수 입력 : ");
            eng = scan.nextInt();

            if (eng < 0 || 100 < eng) {
                System.out.println("성적 범위를 벗어났습니다. 다시 입력하세요.");
            }
        } while (eng < 0 || 100 < eng);

        do {
            System.out.print("수학 점수 입력 : ");
            math = scan.nextInt();

            if (math < 0 || 100 < math) {
                System.out.println("성적 범위를 벗어났습니다. 다시 입력하세요.");
            }
        } while (math < 0 || 100 < math);



        /*
        Exam exam = new Exam();
        exam.setKor(kor);
        exam.setEng(eng);
        exam.setMath(math);
        */

        Exam exam = new Exam(kor, eng, math);

        list.add(exam);

    }


}

package ex4.dataStructure;

import java.util.Scanner;

public class ExamList {
    private Exam[] exams;
    private int current;
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


        Exam exam = new Exam();
        exam.setKor(kor);
        exam.setEng(eng);
        exam.setMath(math);

        Exam[] exams = this.exams;
        int size = this.current;

        if (exams.length == size){
            // 1. 크기가 더 큰 새로운 배열 생성하기 (이주 목적)
            Exam[] temp = new Exam[size + 5]; // 5는 임의

            // 2. 값을 더 큰 신규 배열로 이주

            for (int i = 0; i < size; i++)
                temp[i] = exams[i];

            // 3. list.exams가 temp 배열을 참조하도록 함.
            this.exams = temp;
        }

        this.exams[this.current] = exam; // 반복횟수
        this.current++;




    }

    public void printList() {
        this.printList(this.current);
    } // 지금 까지 입력된 모든 성적을 출력해주는 함수

    public void printList(int size) { //size 크기 만큼의 성적을 출력해주는 함수

        System.out.println("+---------------------------------+");
        System.out.println("|             성적출력              |");
        System.out.println("+---------------------------------+");
        System.out.println();


        //int size = list.current;
        Exam[] exams = this.exams;

        for (int i = 0; i < size; i++) {

            Exam exam = exams[i];

            int kor = exam.getKor();
            int eng = exam.getEng();
            int math = exam.getMath();

            int total = kor + eng + math;
            float avg = (float)total/3.0f; // total 앞에 (float)은 total 변수를 float으로 형변환 하겠다는 뜻
            System.out.printf("국어 : %d\n", kor);
            System.out.printf("영어 : %d\n", eng);
            System.out.printf("수학 : %d\n", math);
            System.out.printf("총점 : %3d\n", total);
            System.out.printf("평균 : %6.2f\n", avg);
            System.out.println("---------------------------------");


        }
    }

    public ExamList() {
        this.exams = new Exam[3];
        this.current = 0;
    }
}


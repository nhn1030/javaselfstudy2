package part3.ex5.splitUICode;

public class ExamList {
    public int size() {
        return current;
    }
    private Exam[] exams;
    private int current;

    public void add(Exam exam) {

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
    public Exam get(int i) {
        return this.exams[i];
    }
    public ExamList() {
        this.exams = new Exam[3];
        this.current = 0;
    }
}

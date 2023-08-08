package part3.ex6.abstraCt;

public abstract class Exam {
    private int kor;
    private int eng;
    private int math;

    public Exam() {
        this(0,0,0);
    }

    public Exam(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }


    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int total() {
        return kor + eng + math;
    }

    public float avg() {
        return (float)this.total()/3.0f;
    }
}

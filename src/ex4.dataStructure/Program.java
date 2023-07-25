// 가변 길이 배열 연습
package ex4.dataStructure;

import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        ExamList list = new ExamList();

        int menu;
        boolean keepLoop = true;

        while (keepLoop) {

            menu = inputMenu();

            switch (menu) {

                case 1 -> list.inputList();
                case 2 -> list.printList();
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("입력 오류!");
                }
            }
        }


    public static int inputMenu() {
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


}
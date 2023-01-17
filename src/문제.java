//534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄때 학생당 몇 개를 가질 수 있고,
// 최종적으로 몇 개가 남는지를 구하는 코드입니다. (#1)과(#2)에 들어갈 알맞는 코드를 작성하세요.


public class 문제 {
    public static void main(String[] args) {
        int pencils=534;
        int students=30;

        //학생 한 명이 가지는 연필 수
        int pencilsPerstudents=(pencils/students);          //(#1)
        System.out.println(pencilsPerstudents);
        //17자루씩 30명이 가진다

        //남는 연필수
        int pencilsLeft=(pencils%students);         //(#2)
        System.out.println(pencilsLeft);
        //17자루씩 30명이 가지고 24자루가 남는다.


    }
}

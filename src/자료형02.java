public class 자료형02 {
    public static void main(String[] args) {

        //실수를 적으면(10.5) 자바는 기본적으로 double형으로 인식한다.
        float num3=10.5f; //f,F둘다 적용가능

        //정수를 적으면(1000000000) 자바는 기본적으로 int형으로 인식한다.
        long num4=10000000000L;  //l,L둘다 가능

        //타입(자료형) 변환
        //값의 저장이 가능한 경우 - 큰 허용 범위 타입 = 작은 허영 범위 타임 -> 자동 타입 변환 : promotion
        //값의 저장이 불가능한 경우 - 작은 혀용 범위 타입 = 큰 허용 범위 타입 -> 불가능
        int x1=10;
        double x2=x1;
        //자동 타입 변환
        System.out.println(x2);
        //실수형이기때문에 10.0이 출력

        double y1=10.5;
        int y2= (int) y1;
        //강제 타입 변환(데이터 손실) : casting
        System.out.println(y2);

        double z = 50;
        int d = (int) 20.5;
    }
}

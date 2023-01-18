public class 연산자03 {
    public static void main(String[] args) {
        //증감연산자
        //1. 전위증감연산자
        //   변수의 값을 1 증가 혹은 1감소 시킴.
        //   먼저 변수의 값을 1증가, 감소 시키고 나머지 연산을 진행.
        //2. 후위증감연산자
        //   변수의 값을 1 증가 혹은 1감소 시킴.
        //   나머지 연산을 모두 실행시키고, 변수의 값을 1증가, 감소시킨다.
        //++, --
        int num1 = 10;

        //num1 값을 1 증가시키는 코드
        ++num1;     //11
        num1++;     //12
        num1 = num1+1;      //13
        num1 += 1;      //14
        System.out.println(num1);

        int num2 = 10;
        int result;
        result = ++num2;
        System.out.println(num2);       //11
        System.out.println(result);     //11

        result = (num2++);
        System.out.println(num2);       //12
        System.out.println(result);     //11

        int num3 = 5;
        System.out.println(++num3);     //6
        System.out.println(num3++);     //6
        System.out.println(num3);       //7





    }
}

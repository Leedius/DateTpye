public class 연산자01 {
    public static void main(String[] args) {
        //산술연산자 : +,-,*,/
        //% 모듈러 연산자 : 나눈 값의 나머지를 구함.
        int num1=10;
        int num2=25;
        int result1=num2/num1;
        //2(정수끼리의 연산값은 정수 단 실수가 하나라도 포함되어 있으면 연산결과는 실수)
        int result2=num2%num1;          //5(나눈 값의 나머지)

        // ==(같다), !=(같지않다),
        System.out.println(10==10);
        System.out.println(10!=10);

        //! : 부정연산자
        boolean bool=true;
        System.out.println(!bool);          //false

        //크기비교
        //a>b : a가 b보다 크다
        //a<b : a가 b보다 작다
        //a>=b : a가 b보다 크거나 같다
        //a<=b : a가 b보다 작거나 같다

        //변수 a의 값이 10이하이면
        //a<=10;

        //논리연산자(그리고, 그러나)
        //그리고 : &&
        //또는 : ||(vertical bar)

        //a가 5보다 크거나 b가 10이랑 같다.
        //a>5 || b==10;

        //1. a가 b랑 같지않고, a가 10이상이다.
        //a!=b && a>=10;
        //2. a가 10보다 크고 20보다 작다.
        //a>10 && a<20;
        //3. a가 5보다 크거나 같으면서 10보다 작거나 같고, 동시에 7은 아니다.
        // a>=5 && a<=10 && a!=7;




    }
}

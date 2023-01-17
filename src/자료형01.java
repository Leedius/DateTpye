import java.sql.SQLOutput;

public class 자료형01 {
    public static void main(String[] args) {
        //참, 거짓을 저장할 수 잇는 자료형
        boolean bool=true; //flase
        System.out.println("bool = "+bool);

        //정수를 저장할 수 있는 자료형
        //byte, short, int(기본), long
        int num1=10;


        //실수를 저장할 수 있는 자료형
        //float, double(기본)
        double num2=10.5;
        System.out.println(num1+num2);

        //문자를 저장하는 자료형 char
        //문자 : 한 글자, 반드시 홀따옴표로 감싸야 함.
        //문자열 : 하나 이상의 글자, 반드시 쌍따옴표로 감싸야 함.
        //"A" - 문자열
        char c='!';
        System.out.println("c="+c);
        int unicode=c;
        System.out.println("unicode="+unicode);

        //문자열을 저장하는 자료형 (기본 자료형 아님)
        //기본 자료형을 제외한 자료형은 대문자로시작
        String s="java";
        System.out.println("s="+s);


    }
}

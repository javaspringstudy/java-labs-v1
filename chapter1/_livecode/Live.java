package chapter1._livecode;

public class Live {
    //JVM이 자바를 실행하는 규칙 - main() 메소들를 시점점으로 한다.
    public static void main(String[] args) {
        int age=10;//Stack 메모리에 저장
        a();
        b();
        {
            int age2=10;//Stack 메모리에 저장
            System.out.println(age);
        }//age2가 스택에서 pop되어 사라짐

        System.out.println("age="+age);
        //System.out.println(age2);//age2 변수가 없어졌기 때문에 에러발생

        c();
    }//main()이 종료될때 age가 스택에서 pop되어 사라짐

    public static void a(){
        System.out.println("a()");
    }
    public static void b(){
        System.out.println("b()");
    }

    public static void c(){
        int age = 129;
        double salary = 10000.2;
        int salary2 = (int) salary;//강제형변환
        System.out.println("age="+age);
        System.out.println("salary="+salary);
        System.out.println("salary2="+salary2);
    }

}

package chapter1.labs.lab2;

/**
 * Lab 2: 자바 데이터 타입 실습
 * 
 * 이 실습은 자바의 기본 데이터 타입을 이해하고 사용하는 것을 목표로 합니다.
 */
public class DataTypesLab {
    public static void main(String[] args) {
        // TODO: 다음 기본 데이터 타입의 변수를 선언하고 값을 할당하세요.
        // 1. 정수형(byte, short, int, long) 변수 선언 및 할당
        byte age = 23;
        short sn = 23456;
        int money = 10000000;
        long distance = 230000000000L;
        
        
        // TODO: 2. 실수형(float, double) 변수 선언 및 할당
        float salary = 10000.00f;
        double height = 170.5;
        
        
        // TODO: 3. 문자형(char) 변수 선언 및 할당
        char gender = 'M';
        
        
        // TODO: 4. 논리형(boolean) 변수 선언 및 할당
        boolean married = true;
        
        
        // TODO: 5. 모든 변수 값을 출력하세요.
        System.out.println("age: " + age);
        System.out.println("sn: " + sn);
        System.out.println("money: " + money);
        System.out.println("distance: " + distance);
        System.out.println("salary: " + salary);
        System.out.println("height: " + height);
        System.out.println("gender: " + gender);
        System.out.println("married: " + married);


        // TODO: 6. 자신의 키(cm)와 몸무게(kg)를 저장하는 변수를 선언하고 
        // BMI 지수를 계산하여 출력하세요. (BMI = 몸무게(kg) / (키(m) * 키(m)))
        float h = 170.5f;
        float w = 75.9f;
        
        float BMI = w/(h*h);
        System.out.println("BMI지수: " + BMI);
    }
} 
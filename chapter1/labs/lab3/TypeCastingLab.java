package chapter1.labs.lab3;

/**
 * Lab 3: 자바 타입 변환(Type Casting) 실습
 * 
 * 이 실습은 자바의 타입 변환에 대해 이해하고 실습하는 것을 목표로 합니다.
 */
public class TypeCastingLab {
    public static void main(String[] args) {
        // TODO: 1. 자동 형변환(Implicit Casting) 예제
        // byte -> int, int -> long, long -> float, float -> double 순으로 
        // 변수를 선언하고 자동 형변환을 수행한 뒤 결과 출력하기
        byte a = 55;
        int b = a;
        long c = a;
        float d = a;
        double e = a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);

        
        // TODO: 2. 명시적 형변환(Explicit Casting) 예제
        // double -> float -> long -> int -> char -> short -> byte 순으로
        // 변수를 선언하고 명시적 형변환을 수행한 뒤 결과 출력하기
        double f = 200.546;
        float g = (float) f;
        long h = (long) g;
        int i = (int) h;
        char j = (char) i;
        short k = (short) j;
        byte l = (byte) k;

        System.out.println("f: "+f);
        System.out.println("g: "+g);
        System.out.println("h: "+h);
        System.out.println("i: "+i);
        System.out.println("j: "+j);
        System.out.println("k: "+k);
        System.out.println("l: "+l);


        
        
        // TODO: 3. 데이터 손실 확인하기
        // int 값을 byte로 변환하여 데이터 손실이 발생하는 예제 작성하기
        
        
        // TODO: 4. 문자열과 숫자 간 변환하기
        // 문자열 "123"을 정수로, "3.14"를 실수로 변환하기
        
        
        // TODO: 5. 숫자를 문자열로 변환하기
        // 정수 456과 실수 7.89를 문자열로 변환하기
        
    }
} 
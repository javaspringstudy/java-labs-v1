package chapter2.labs.lab5;

import java.util.Scanner;

/**
 * 별표(*) 패턴 출력 실습
 */
public class StarPatternLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("패턴 출력을 위한 높이를 입력하세요: ");
        int height = scanner.nextInt();

        // 1. 직각삼각형 패턴 (왼쪽 정렬)
        System.out.println("\n1. 직각삼각형 패턴 (왼쪽 정렬)");
        // 예시 (높이 5):
        // *
        // **
        // ***
        // ****
        // *****


        // TODO: 위와 같은 패턴을 출력하세요.

        //StringBuffer 사용해서 빅오에 역행하기....ㅋㅋㅋ
        String[] starArr = new String[height];

        for (int i = 0; i < height; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }
            starArr[i] = sb.toString();
            System.out.println(starArr[i]);
        }


        // 2. 직각삼각형 패턴 (오른쪽 정렬)
        System.out.println("\n2. 직각삼각형 패턴 (오른쪽 정렬)");
        // 예시 (높이 5):
        //     *
        //    **
        //   ***
        //  ****
        // *****

        // TODO: 위와 같은 패턴을 출력하세요.
        //StringBuilder 사용해서 빅오에 역행하기....ㅋㅋㅋ
        int cnt = height - 1;
        while (cnt >= 0) {
            StringBuilder sb_space = new StringBuilder();
            for (int i = 0; i < cnt; i++) {
                sb_space.append(" ");
            }
            System.out.printf(sb_space.toString());

            StringBuilder sb_star = new StringBuilder();
            for (int i = 0; i < (height - cnt); i++){
                sb_star.append("*");
            }
            System.out.print(sb_star.toString());

            System.out.println();
            cnt--;
        }


        // 3. 피라미드 패턴
        System.out.println("\n3. 피라미드 패턴");
        // 예시 (높이 5):
        //     4*1=2n+1
        //    3***3
        //   2*****5
        //  1*******7
        // 0*********9

        // TODO: 위와 같은 패턴을 출력하세요.

        for(int i=0;i<height;i++){
            //공란찍기
            for(int j=height-i;j>0;j--) System.out.printf(" ");

            //별찍기
            for(int j=0;j<2*i+1;j++) System.out.printf("*");

            System.out.println();
        }


        // 4. 역삼각형 패턴
        System.out.println("\n4. 역삼각형 패턴");
        // 예시 (높이 5):
        // 0*********9=
        //  1*******7
        //   2*****5
        //    3***3
        //     4*1

        // TODO: 위와 같은 패턴을 출력하세요.
        for(int i=1;i<=height;i++){
            //공란찍기
            for(int j=0;j<i;j++) System.out.printf(" ");
            
            //별찍기
            for(int j=0;j<2*height+1-2*i;j++) System.out.printf("*");
            System.out.println();
        }


        // 5. 다이아몬드 패턴
        System.out.println("\n5. 다이아몬드 패턴");
        // 예시 (높이 5, 실제 높이는 9):
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //  *******
        //   *****
        //    ***
        //     *

        // TODO: 위와 같은 패턴을 출력하세요.


        // 6. 모래시계 패턴
        System.out.println("\n6. 모래시계 패턴");
        // 예시 (높이 5, 실제 높이는 9):
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        //    ***
        //   *****
        //  *******
        // *********

        // TODO: 위와 같은 패턴을 출력하세요.


        // 7. 숫자 피라미드 패턴
        System.out.println("\n7. 숫자 피라미드 패턴");
        // 예시 (높이 5):
        //     1
        //    121
        //   12321
        //  1234321
        // 123454321

        // TODO: 위와 같은 패턴을 출력하세요.


        scanner.close();
    }
} 
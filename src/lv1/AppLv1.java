package lv1;

import java.util.Scanner;

public class AppLv1 {

    // Lv 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // 양의 정수(0 포함) 입력받기

            System.out.print("첫 번째 숫자를 입력하세요(양의 정수(0 포함)): ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요(양의 정수(0 포함)): ");
            int num2 = scanner.nextInt();


            // 사칙연산 기호(+, -, X, %를 입력받기
            System.out.print("사칙연산 기호를 입력하세요(+, -, X, %): ");
            String operator = scanner.next();
            char operatorC = operator.charAt(0);


            // 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
            double result;
            switch (operatorC) {
                case '+':
                    result = num1 + num2;
                    System.out.println("result = " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("result = " + result);
                    break;

                case 'X':
                    result = num1 * num2;
                    System.out.println("result = " + result);
                    break;

                case '%':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 " + num2 + "이 입력될 수 없습니다.");
                    } else {
                        result = (double) num1 / num2;
                        System.out.println("result = " + result);
                    }
                    break;

                default:
                    System.out.println("오류 발생");
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            scanner.nextLine();
            String msg = scanner.nextLine();

            if (msg.equals("exit")){
                System.out.println("종료합니다.");
                break;
            }

        }
        // 반복문을 사용하되, "exit" 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드 수정

    }
}

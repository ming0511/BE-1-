package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    // Lv 2. 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        while (true) {
            // 1. 양의 정수(0 포함)를 입력받기
            Scanner scanner = new Scanner(System.in);

            System.out.print("첫 번째 숫자를 입력하세요(양의 정수(0 포함)): ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요(양의 정수(0 포함)): ");
            int num2 = scanner.nextInt();


            // 2. 사칙연산 기호(+, -, X, %)를 입력받기
            System.out.print("사칙연산 기호를 입력하세요(+, -, X, %): ");
            char operatorC = scanner.next().charAt(0);


            // lV 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정
            calculator.calculate(num1, num2, operatorC);

            // App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정(캡슐화)
            // 3. App 클래스의 main 메서드에서 위에서 구현한 메서드를 활용
            List<Double> results = calculator.getResults();
            System.out.println("results = " + results);

            List<Double> emptyArrayList = new ArrayList<>();
            calculator.setResults(emptyArrayList);

            results = calculator.getResults();
            System.out.println("results = " + results);


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String msg = scanner.nextLine();

            if (msg.equals("exit")){
                System.out.println("종료합니다.");
                break;
            }

        }
        // 4. 반복문을 사용하되, 반복의 종류를 알려주는 "exit" 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정하기

    }
}

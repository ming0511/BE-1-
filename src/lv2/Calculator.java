package lv2;

import java.util.ArrayList;
import java.util.List;

// 사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 틀래스를 생성
public class Calculator {

    // 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
    private int num1;
    private int num2;
    private char operatorC;
    private List<Double> results = new ArrayList<>();

    // 사칙연산을 수행한 후, 결과값을 반환하는 메서드 구현
    public double calculate(int num1, int num2, char operatorC){
        double result = 0;

        switch (operatorC) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case 'X':
                result = num1 * num2;
                break;

            case '%':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 " + num2 + "이 입력될 수 없습니다.");
                } else {
                    result = (double) num1 / num2;
                    break;
                }

            default:
                System.out.println("오류 발생");
        }

        this.results.add(result);

        return result;
    }

    // 1) 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(+, -, X, %) 기능을 수행한 후
    // 2) 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성

}

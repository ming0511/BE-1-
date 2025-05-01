package lv2;

import java.util.ArrayList;
import java.util.List;

// 사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 틀래스를 생성
public class Calculator {

    // 2. 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
    private List<Double> results = new ArrayList<>();

    // 1. 간접 접근을 통해 필드에 접근하여 가져올 수 있도록 구현
    public List<Double> getResults() {
        return results;
    }


    // 2. 간접 접근을 통해 필드에 접근하여 수정할 수 있도록 구현
    public void setResults(List<Double> results) {
        this.results = results;
    }


    // 1. 사칙연산을 수행한 후, 결과값을 반환하는 메서드 구현
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

    // 3.
    // 1) 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(+, -, X, %) 기능을 수행한 후
    // 2) 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성


    // TODO: Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정
    public void removeResult(){
        if (!results.isEmpty()){
            results.remove(0);
            System.out.println("삭제되었습니다.");
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }

}

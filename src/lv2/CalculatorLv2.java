package lv2;

import java.util.ArrayList;
import java.util.List;


public class CalculatorLv2 {

    // 연산 결과를 저장하는 컬렉션 타입 필드
    private List<Double> results = new ArrayList<>();

    // 간접 접근을 통해 필드 접근
    public List<Double> getResults() {
        return List.copyOf(results);
    }


    // 간접 접근을 통해 필드에 접근하여 수정
    public void setResults(List<Double> results) {
        this.results = results;
    }


    // 사칙연산을 수행한 후, 결과값을 반환하는 메서드
    public double calculate(int num1, int num2, char operatorC){
        double result = 0;

        switch (operatorC) {
            case '+':
                result = num1 + num2;
                this.results.add(result);
                break;

            case '-':
                result = num1 - num2;
                this.results.add(result);
                break;

            case 'X':
                result = num1 * num2;
                this.results.add(result);
                break;

            case '%':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 " + num2 + "이 입력될 수 없습니다.");
                } else {
                    result = (double) num1 / num2;
                    this.results.add(result);
                }
                break;

            default:
                System.out.println("오류 발생");
        }

        return result;
    }

    // Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 메서드
    public void removeResult(){
        if (!results.isEmpty()){
            results.remove(0);
            System.out.println("삭제되었습니다.");
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }

}

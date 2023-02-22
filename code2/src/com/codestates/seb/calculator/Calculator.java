package com.codestates.seb.calculator;
import java.util.Scanner;
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */

public class Calculator {
  public static void main(String[] args) {
    System.out.println("===Java Calculator===");
    Scanner input = new Scanner(System.in);

    //입력 예시 ====> 11 + 12
    while(true){
      System.out.println("연산 식을 입력해 주세요 ex)11 + 12");
      //문자열 형식으로 입력받기
      String oper = input.nextLine();

      //띄어쓰기로 연산자와 피 연산자 분리
      String [] opers = oper.split(" ");


      //입력 식이 예시와 맞지 않을 경우 다시 입력
      if(opers.length!=3){
        System.out.println("예시에 맞춰 다시 입력해주세요");
        continue;
      }
      //연산자 할당
        double oper1 = Double.parseDouble(opers[0]);
        char operater = opers[1].charAt(0);
        double oper2 = Double.parseDouble(opers[2]);

      //operater 조건 문
      if(operater=='+') System.out.println(oper1+oper2);
      else if(operater=='-') System.out.println(oper1-oper2);
      else if (operater=='*') System.out.println(oper1*oper2);
      else if(operater=='/'){
        //0으로 나누게 되었을 경우 더사 압력을 바란다는 문구
        if(Double.isInfinite(oper1/oper2) || Double.isNaN(oper1/oper2)){
          System.out.println("0으로 나눌 수 없습니다.");
          continue;
        }
      }
      else {
        System.out.println("잘못된 기호를 입력하셨습니다. 다시 입력해주세요!!");
        continue;
      }
      //사용자에게 재 시동 여부를 물어본다.
      System.out.println("다시 실행하시겠습니까? 다시 실행 하고 싶으시면 YES 아니면 NO를 입력해주세요");
      String answer = input.nextLine();
      if(answer.equals("NO"))break;
      else if(answer.equals("YES"))continue;
      else {
        System.out.println("이상한 값을 입력하셨습니다. 프로그램을 종료합니다.");
        break;
      }
    }
    // TODO...
  }
}

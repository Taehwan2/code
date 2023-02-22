package com.codestates.seb.gugudan;
import java.util.Scanner;

public class gugudan {
    public static final int min_gugudan = 2;
    public static final int max_gugudan = 9;
  public static void main(String[] args) {
    //TODO:
    // 0. 구구단을 정의하기 전 구구단 연산을 위한 변수를 선언합니다.
    // 클래스에 포함된 메서드를 활용하기 위해 객체 생성
    // Scanner(클래스명) s(변수명) = new(객체 생성을 위한 키워드) Scanner(클래스명)(System.in);
    Scanner sc = new Scanner(System.in);
    while(true){
    // 사용자 입력을 받기 위한 안내 문구
      System.out.print("[안내]희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9) : 9\n");

      // 1. 단을 입력합니다.
      int n = sc.nextInt();
      //2.변수를 사용하여 조건 확인
      // 입력받은 값을 출력합니다.
        System.out.printf("%d 단이 입력되었습니다.\n",n);
      if(min_gugudan(n)&&max_gugudan(n)){
        for (int i = 1; i < 9; i++) {
          System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
        //3.조건에 안맞을 시 종료
      // 조건 1. 입력값이 min_gugudan(2)보다 작다.
      // 조건 2. 입력값이 max_gugudan(9)보다 크다.
      }else{
        System.out.printf("구구단은 %d단에서 %d단까지만 가능합니다.",min_gugudan,max_gugudan);
        System.out.println("프로그램을 종료합니다.");
        break;
      }
      //4.무한반복을 해결하기 위해 사용자 의견을 받고 종료 or 지속
      System.out.println("종료를 원하시면 YES 계속하시길 원하시면 NO를 눌러주세요");
      if(sc.nextLine()=="YES")break;
      else continue;
    }


  }

  private static boolean max_gugudan(int i) {
    if(min_gugudan<=i)return true;
    return  false;
  }

  private static boolean min_gugudan(int i) {
    if(i<=max_gugudan)return true;
    return  false;
  }
}

package com.codestates.seb.electricityBill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ElectricityBill {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //입력 버퍼 생성
        final List<Integer> wh = List.of(99, 150, 250, 301, 450, 510); //입력값이 맞는지 확인하기 위한 리스트 생성
        System.out.println("=".repeat(25));
        System.out.println(" 주택용 전기요금(저압) 계산기 ");
        System.out.println("=".repeat(25));

        //안내 문구
        System.out.print("=".repeat(25));
        System.out.print(" 99,150,250,301,450,510 중 택1 입력하세요 ");
        System.out.println("=".repeat(25));

        //입력자가 No를 입력하면 그만 아니면 계속
        while (true) {
            System.out.print("입력하세요:");
            int xhs = Integer.parseInt(bf.readLine());
            //만약 사용자의 입력값이 리스트 안에 없는 값이면 다시 입력하라고 back
            if (!wh.contains(xhs)) {
                System.out.println("다시 입력해주세요");
                continue;
            }
            //확인 메서드를 통해 값을 확인하고 변수에 값 할당한다.
            double result = check(xhs);
            System.out.println(result);
            //안내문구
            System.out.println("다시하려면 Y 끝내려면  N을 입력하세요");
            //만약 N를 입력시 반복문 종료
            if (bf.readLine() .equals("N") ) break;
        }
        //TODO:

        // 1, 100 이하인 경우 전력당 60.7 원이 부가됩니다. (사용한 전력 100 kWh 이하일 경)

        // 2, 100 이하인 경우 전력당 60.7원 부과, 100 초과인 경우 125.9원 부과 (사용한 전력이 100 kWh 초과일 경우)
    }

    //전기 사용량에 따라서 가격이 변하기 때문에 double형의 타입을 지정하고, 초과된 금액만큼 가격을 할당하며 내려간다.
    private static double check(int xhs) {
        double result = 0.0;
        while (true) {
            if(xhs>500){
                result+=(xhs-500)*670.6;
                xhs=500;
            }if(xhs>400){
                result+=(xhs-400)*417.7;
                xhs=400;
            }if(xhs>300){
                result+=(xhs-300)*280.6;
                xhs=300;
            }if(xhs>200){
                result+=(xhs-200)*187.9;
                xhs=200;
            }if(xhs>100){
                result+=(xhs-100)*125.9;
                xhs=100;
            }else{
                result+=xhs*60.7;
                break;
            }
        }

        return result;
    }
}



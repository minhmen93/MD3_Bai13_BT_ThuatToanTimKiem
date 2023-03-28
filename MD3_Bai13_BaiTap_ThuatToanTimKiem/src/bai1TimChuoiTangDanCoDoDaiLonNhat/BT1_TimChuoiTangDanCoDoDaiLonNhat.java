package bai1TimChuoiTangDanCoDoDaiLonNhat;

import java.util.LinkedList;
import java.util.Scanner;

public class BT1_TimChuoiTangDanCoDoDaiLonNhat {

    public static class TimChuoiTangDanCoDoDaiLonNhat {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào chuỗi :");
            String inputString = scanner.nextLine();
            LinkedList<Character> list = new LinkedList<>();
            String maxLenght = "";
            Character max;


            for (int i = 0; i < inputString.length(); i++) {
                //String .value - phuong thức chuyển đổi kiểu dữ liệu khác thành chuỗi
                // ở đây chuyển đoạn vừa nhập thành chuỗi
                String temp = String.valueOf(inputString.charAt(i));
                max = inputString.charAt(i);
                for (int j = i + 1; j < inputString.length() - 1; j++) {
                    if (max < inputString.charAt(j)) {
                        max = inputString.charAt(j);
                        temp += inputString.charAt(j);
                    }
                    if (temp.length() > maxLenght.length()) {
                        maxLenght = temp;
                    }
                }
            }
            System.out.println(maxLenght);
        }
    }
}

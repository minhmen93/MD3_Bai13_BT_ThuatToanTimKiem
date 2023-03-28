package bai3ChuoiLienTiepCoDoDaiLonNhat;

import java.util.LinkedList;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào chuỗi cần kiểm tra: ");
            String string = scanner.nextLine();
            LinkedList<Character> list = new LinkedList<>();
            // 1 chuỗi String có độ dài dài nhất
            String maxLenght = "";
            // khai báo kí tự lớn nhất
            Character max;

            for (int i = 0; i < string.length(); i++) {
                String temp = String.valueOf(string.charAt(i));
                max = string.charAt(i);
                for (int j = 0; j < string.length(); j++) {
                    if (max < string.charAt(j)) {
                        max = string.charAt(j);
                        temp += string.charAt(j);
                    }
                    if (temp.length() > maxLenght.length()) {
                        maxLenght = temp;
                    }
                }
            }
            System.out.println("chuỗi liên tiếp tăng dần : " + maxLenght);

        }
    }
}

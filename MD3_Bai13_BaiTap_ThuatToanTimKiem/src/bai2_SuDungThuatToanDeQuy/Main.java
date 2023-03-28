package bai2_SuDungThuatToanDeQuy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Nhập vào số lượng phần tử : ");

        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            list.add(new Random().nextInt(20));
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println(binarySearch(list,0, list.size()-1, 9));
    }

    public static int binarySearch(List<Integer> list, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (list.get(middle) == value) {
                return middle;
            } else if (list.get(middle) > value) {
                return binarySearch(list,left,middle-1,value);
            } else {
                return binarySearch(list,middle+1,right,value);
            }
        }
        return -1;
    }

 
}

package part10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static int solution(int n) {
//        List list = new ArrayList();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
//                list.add(i);
            sum += i;
            }
        }
//        for (int i = 0; i < list.size(); i++) {
//             sum += (int) list.get(i);
//        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}

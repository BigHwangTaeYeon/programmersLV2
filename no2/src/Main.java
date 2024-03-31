import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Optional;

public class Main {
    class Solution {
        public static String solution(String s) {
            String answer = "";
            s = s.toLowerCase();

//            char[] a = s.toCharArray();
            String[] a = s.split("");

            for (String string : a) {
                System.out.println("string = " + string);
            }
            return answer;
        }
    }
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        System.out.println(Solution.solution("AssS DrEee  GEed  2sdfF 5SDs   d D"));
    }

}
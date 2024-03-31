import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    class Solution {
        public static String solution(String s) {
            String answer = "";

            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            for (int i=0; i<s.split(" ").length; i++) {
                minHeap.add(
                        Integer.parseInt(s.split(" ")[i])
                );
            }

            PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return - Integer.compare(o1,o2);
                }
            });
            for (int i=0; i<s.split(" ").length; i++) {
                maxHeap.add(
                        Integer.parseInt(s.split(" ")[i])
                );
            }

            System.out.println("min = " + minHeap.peek());
            System.out.println("max = " + maxHeap.peek());

            answer = minHeap.peek() + " " + maxHeap.peek();

            return answer;
        }
    }

    public static void main(String[] args) {
//        System.out.println("Hello world!");
        String solution = Solution.solution("1 2 3 8 7 5 9 0");
        System.out.println("solution = " + solution.toString());
    }
}
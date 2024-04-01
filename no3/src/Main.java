import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    class Solution
    {
        public static int solution(int []A, int []B)
        {
            int answer = 0;

            PriorityQueue<Integer> queueA = new PriorityQueue<Integer>();
            PriorityQueue<Integer> queueB = new PriorityQueue<Integer>(Collections.reverseOrder());
            for (int i : A) {
                queueA.offer(i);
            }
            for (int i : B) {
                queueB.offer(i);
            }
            for(int i=0; i<A.length; i++) {
                answer += queueA.peek() * queueB.peek();
                queueA.poll();
                queueB.poll();
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
    }
}
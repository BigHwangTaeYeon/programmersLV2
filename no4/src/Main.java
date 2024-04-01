
public class Main {
    class Solution {
        static boolean  solution(String s) {
            boolean answer = true;
            String[] bracketArray = s.split("");
            int startCount=0;
            int endCount=0;

            for(int i=0; i<bracketArray.length; i++) {
                if(startCount == endCount && ")".equals(bracketArray[i])) {
                    return answer = false;
                }
                if("(".equals(bracketArray[i])){
                    startCount++;
                } else {
                    endCount++;
                }
            }

            if(startCount == endCount) {
                answer = true;
            } else {
                answer = false;
            }

            return answer;
        }
    }
    public static void main(String[] args) {
        System.out.println(
                Solution.solution("())((()))(()")
        );
    }
}
import java.util.Collections;
import java.util.LinkedList;

public class Main {class Solution {
    public static int[] solution(String s) {
        int[] answer = {};
        LinkedList<String> sList = new LinkedList();
        Collections.addAll(sList, s.split(""));
        int oneSize = 0;
        int countZero = 0;
        int countTrans = 0;

        loof: while (true) {
            System.out.println("sList = " + sList.toString());

            for (int i = 0; i < sList.size(); i++) {
                if ("0".equals(sList.get(i))) {
                    countZero++;
                } else {
                    oneSize++;
                }
            }
            sList.clear();

            Collections.addAll(sList, String.valueOf(Integer.toBinaryString(oneSize)).split(""));

            countTrans++;
            oneSize = 0;

            boolean confirm = true;

            for (String findZero : sList) {
                if("0".equals(findZero)) {
                    confirm = false;
                }
            }

            if(confirm) {
                break loof;
            }
        }

        System.out.println(countTrans);
        System.out.println(countZero);
        return answer;
    }
}
    public static void main(String[] args) {
        System.out.println(Solution.solution("01110"));
    }
}
import java.util.ArrayList;
import java.util.List;

public class LeetCode1431 {
    public static void main(String[] args) {
        int[] candies = new int[]{2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> answer = kidsWithTheGreatestNumOfCandies(candies, extraCandies);
        for(Boolean ans : answer){
            System.out.println(ans);
        }
    }

    public static List<Boolean> kidsWithTheGreatestNumOfCandies(int[] candies, int extraCandies){
        int biggestNum = 0;
        List<Boolean> answer = new ArrayList<Boolean>();

        for(int n : candies){
            if(n > biggestNum){
                biggestNum = n;
            }
            //biggestNum = Math.max(n, biggestNum); 이 코드로 향상 가능
        }

        for(int n1 : candies){
            if(n1 + extraCandies >= biggestNum){
                answer.add(true);
            }else{
                answer.add(false);
            }
            //answer.add(n1 + extraCandies >= biggestNum); 이 코드로 if문 제거 가능
        }
        return answer;
    }
}

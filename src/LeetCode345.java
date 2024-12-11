import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LeetCode345 {
    public static void main(String[] args){
            String s = "IceCreAm";
            String a = reverseVowels(s);
            System.out.println(a);
    }

    public static String reverseVowels(String s){
        Set<Character> vowels = new HashSet<>();
        Stack<Character> vowelsInString = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int len = s.length();
        String answer = "";

        for(char vowel : "aeouiAEOUI".toCharArray()){
            vowels.add(vowel);
        }

        for(char ch : s.toCharArray()){
            if(vowels.contains(ch)){
                vowelsInString.push(ch);
            }
        }

        for(char c : s.toCharArray()){
            if(vowels.contains(c)){
                sb.append(vowelsInString.pop());
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
        // vowels 담음.
        // s를 앞부터 비교해서 나오는 모음들을 별도의 array involved 에 담기. 순서 중요한 set.(set과 array의 차이는 뭐지)
        // 다시 s를 앞부터 비교해서 별도의 answer String에 하나씩 붙이기. 모음인지 비교하다가 모음이면,involved의 마지막에서 i번째를 가져와서 붙이기.
    }

}

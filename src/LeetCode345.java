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
    }
}

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Solution {
    public static void main(String[] args) {
        String answer = mergeAlternately("abc", "sdfg");
        System.out.println("Output : " + answer);

        String developedAnswer = developedAnswer("abc", "sdfg");
        System.out.println("Output : " + developedAnswer);
    }

    public static String mergeAlternately(String word1, String word2) {

        String answer = "";

        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();

        int array1Length = array1.length;
        int array2Length = array2.length;

        int cnt = 0;

        while (cnt < array1Length && cnt < array2Length) {
            answer += array1[cnt];
            answer += array2[cnt];
            cnt++;
        }

        if (array1Length < array2Length) {
            for (int i = cnt; i < array2Length; i++) {
                answer += array2[i];
            }
        } else if (array1Length > array2Length) {
            for (int i = cnt; i < array1Length; i++) {
                answer += array1[i];
            }
        }
        return answer;
    }

    public static String developedAnswer(String word1, String word2) {
        StringBuilder answer = new StringBuilder();  // StringBuilder 사용

        int length1 = word1.length();
        int length2 = word2.length();
        int cnt = 0;

        // 두 문자열을 교차로 합치기
        while (cnt < length1 && cnt < length2) {
            answer.append(word1.charAt(cnt));  // StringBuilder의 append 메소드 사용
            answer.append(word2.charAt(cnt));
            cnt++;
        }

        // 남은 부분 이어붙이기
        if (cnt < length1) {
            answer.append(word1.substring(cnt));  // substring으로 한 번에 붙이기
        }
        if (cnt < length2) {
            answer.append(word2.substring(cnt));
        }

        return answer.toString();  // 최종 결과를 문자열로 변환
    }
}
// TIP <shortcut actionId="Debug"/>을(를) 눌러 코드 디버그를 시작하세요. 1개의 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 중단점을 설정해 드렸습니다
// 언제든 <shortcut actionId="ToggleLineBreakpoint"/>을(를) 눌러 중단점을 더 추가할 수 있습니다.
// System.out.println("i = " + i);
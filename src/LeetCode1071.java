public class LeetCode1071 {
    public static void main(String[] args) {
        String answer = greatestCommonDivisiorOfString("ABABAB", "AB");
        System.out.println("Output : " + answer);

    }
/*
유클리드 알고리즘과 최대공약수(GCD)

유클리드 알고리즘의 원리

핵심 아이디어

두 수 a와 b의 최대공약수는 b와 a % b의 최대공약수와 같다.
여기서 %는 나머지를 구하는 연산자다.
즉, GCD(a, b) = GCD(b, a % b).

계산 과정

이 과정을 반복해서 나머지가 0이 될 때까지 계산하면, 그때의 b가 GCD가 된다.

수학적 근거

a와 b가 어떤 수로 나눠떨어질 수 있다고 가정하자.
d가 a와 b의 공약수라면, d는 (a % b)도 나눌 수 있다.
즉, d | a, d | b → d | (a - k*b) (여기서 k는 정수).
a % b는 바로 (a - k*b)와 같기 때문에, d는 (a % b)의 공약수이다.
따라서 a와 b의 공약수는 b와 a % b의 공약수와 동일하다.
이 과정은 반복적으로 줄어들어서 a % b가 0이 되는 순간, 남은 숫자가 최대공약수(GCD)가 된다.

예제: GCD(48, 18)

a = 48, b = 18

나머지: 48 % 18 = 12

새로운 a = 18, 새로운 b = 12.

a = 18, b = 12

나머지: 18 % 12 = 6

새로운 a = 12, 새로운 b = 6.

a = 12, b = 6

나머지: 12 % 6 = 0

나머지가 0이므로 b = 6이 GCD!

코드 구현

private int gcd(int a, int b) {
    // 나머지가 0이면, 현재 b가 최대공약수
    if (b == 0) return a;

    // 그렇지 않으면, 재귀적으로 b와 a % b를 사용해 GCD를 구함
    return gcd(b, a % b);
}

실행 흐름 (예제: GCD(48, 18))

gcd(48, 18)

b != 0 → 재귀 호출: gcd(18, 48 % 18) = gcd(18, 12).

gcd(18, 12)

b != 0 → 재귀 호출: gcd(12, 18 % 12) = gcd(12, 6).

gcd(12, 6)

b != 0 → 재귀 호출: gcd(6, 12 % 6) = gcd(6, 0).

gcd(6, 0)

b == 0 → 반환: 6.
 */

}

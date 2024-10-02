public class LeetCode605 {
    public static void main(String[] args) {
        int[] flowerbed = new int[]{0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0};
        boolean output = canPlaceFlowers(flowerbed, 6);
        System.out.println(output);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n){
        int cnt = 1;
        int totalCnt = 0;
        for (int j : flowerbed) {
            if (j == 1) {
                totalCnt += (cnt - 1) / 2;
                cnt = 0;
            } else {
                cnt++;
            }
        }
        totalCnt += cnt / 2;

        return totalCnt >= n;
    }
}

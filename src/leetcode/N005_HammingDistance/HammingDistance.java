package leetcode.N005_HammingDistance;

/**
 * 승지니어 https://youtu.be/KNs8KhLIOdc
 * https://leetcode.com/problems/hamming-distance/submissions/
 *
 * @ 비트변환
 *      a = 3 -> 11
 *      b = 2 -> 10
 *
 * @ 비트연산
 *      a & b = 10 ; 두 비트가 모두 1이면 1, 아니면 0
 *      a | b = 10 ; 두 비트 중 하나라도 1이면 1, 아니면 0
 *      a ^ b = 10 ; 두 비트가 다르면 1, 아니면 0
 * @ 시프트 연산
 *      a >> i = 01; a의 모든 비트를 오른쪽으로 i 만큼 밀고, 맨 외쪽을 0으로 채움
 *      a << i = 10; a의 모든 비트를 왼쪽으로 i 만큼 밀고, 맨 오른쪽을 0으로 채움
 */

public class HammingDistance {
    public static void main(String[] args) {

        Solution s = new Solution();
        int x = 1;
        int y = 4;
        int ret = s.hammingDistance(x, y);
        System.out.println(ret);
    }
}

class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y; // XOR 연산을 통해 다른 부분을 1 로 변환 한다.
        int cnt = 0;
        for (int i = 0; i < 32 ; i++) { // Integer.MAX 를 2진 변환하면 31 자리이므로 31 번 반복 한다.
            cnt += (xor >> i) & 1;  // and 연산을 통해 1인 부분을 더한다.
        }
        return cnt;
    }
}



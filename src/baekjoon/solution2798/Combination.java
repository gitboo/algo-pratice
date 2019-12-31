package baekjoon.solution2798;

import java.util.ArrayList;
import java.util.List;

//https://gorakgarak.tistory.com/523?category=265216
public class Combination {
    public static void main(String[] args) {
        //int[] arr = new int[5];
        List<Integer> arr = new ArrayList<>();;
        combination(arr, 0, 5, 3, 0);
    }

    /**
     * @param arr 은 여기서는 순열글과는 다르게 안에서 교환하고 하는게 아니기때문에, 안에 데이터는 없다.
     *            그냥 빈공간을 적당히 확보해주면 된다.
     *            샘플에서는 0,1,2,3 네개의 원소를 가지고 계산을 할 예정이니 int[4]배열의 공간을 만들어준다.
     *
     * @param index 의 경우 벌써 하나가 정해졌으면 배열중 첫번째 원소가 정해졌다는 뜻으로, +1을 해준다. 그리고 하나가 정해졌으므로, r-1 인자를 주어야 한다.
     *              만약, 정해지지 않은 상태라면 배열에 값이 들어가지 않았음을 뜻하므로 index를 증가시키지 않고 찾는 대상도 r 인자를 주어야 한다.
     *
     * @param n 조합을 구할 0~n개의 숫자를 설정한다.
     *
     * @param r 조합에서 몇개를 추출할것인지 고른다.
     *
     * @param  target 0~n으로 나열되어있는 원소들의 집합안에 어떤 숫자를 타겟으로 해서 배열에 집어넣을지를 고를때 쓰인다.
     *                즉, 어떤 combination() 함수가 오든, 항상 +1씩 해주어 판별하게 만든다. 실제로 index변수에 따라, 들어가고 말고가 결정된다.
     *                이 안에서 딱 두개를 그냥 나눠서 구하면 된다. 1번경우와 2번경우. 이를 자바코드로 구현해봤을때는 다음과 같다.
     */
    public static void combination(List<Integer> arr, int index, int n, int r, int target) {

        if (r == 0) {
            print(arr, index);
        }
        else if (target == n) {
            return;
        }
        else {
            //arr[index] = target;
            arr.add(index, target);
            combination(arr, index + 1, n, r - 1, target + 1);
            combination(arr, index, n, r, target + 1);
        }
    }//end combination()

    public static void print(List<Integer> arr, int length) {
        /*for (int i = 0; i < length; i++) {
            System.out.print(arr.get(i));
        }
        System.out.println("");*/

        System.out.println(arr);
    }
}

/**
 * 012
 * 013
 * 014
 * 023
 * 024
 * 034
 * 123
 * 124
 * 134
 * 234
 */



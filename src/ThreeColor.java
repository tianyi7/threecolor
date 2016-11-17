/**
 * Created by Administrator on 2016/11/17.
 */
import java.util.*;
public class ThreeColor {
    public static int[] sortThreeColor(int[] A, int n) {
        if (A == null || A.length < 2) {
            return A;
        }
        int left = 0;
        int index = 0;
        int right = A.length;
        while (index < right) {
            if (A[index] == 0) {
                swap(A, left++, index++);
            } else if (A[index] == 2) {
                swap(A, index, --right);
            } else {
                index++;
            }
        }
        return A;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
    public static void main(String args[]){
        int[] A={1,1,0,0,2,1,1,0};
        sortThreeColor(A,8);
        for(int i = 0;i<A.length;i++){
            System.out.println(A[i]);

        }
    }
}

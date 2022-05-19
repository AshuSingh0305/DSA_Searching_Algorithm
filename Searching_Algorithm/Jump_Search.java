package DataStructure.Searching_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Jump_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,3,5,7,9,2,4,6,8,10,11,22,13,34,15,26,17,38};
        int search=1;
        Arrays.sort(arr);
        System.out.println(jumpSearch(arr, search));
    }
    public static int jumpSearch(int arr[], int target){
        int space =(int) Math.sqrt(arr.length);
        int start = 0;
        int next = space;
        while (start<=arr.length){
            if(next>arr.length){
                next = arr.length;
                break;
            }
            if(next == arr.length){
                break;
            }
            if(arr[next-1] < target){
                start+= space;
                next+= space;
            }else break;
        }
        for(int i = start ; i<next ; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}

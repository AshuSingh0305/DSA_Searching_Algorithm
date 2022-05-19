package DataStructure.Searching_Algorithm;

import java.util.Arrays;

public class Exponential_Search {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,2,4,6,8,10,11,22,13,34,15,26,17,38};
        int search=38;
        Arrays.sort(arr);
        expoSearch(arr,0, 1, search);
    }
    public static void expoSearch(int[]arr,int boundby2, int bound, int search){
        if(bound>arr.length) bound=arr.length-1;
        if(search>arr[bound])  expoSearch(arr, bound, bound*2, search);
        else System.out.println(BinarySearch(arr, boundby2, bound, search));
    }
    public static int BinarySearch(int array[], int left , int right, int val){
        if(left > right) return -1;
        int index = (left+right)/2;
        if(array[index]== val) return index;
        else if(array[index] < val) return BinarySearch(array,index+1 , right , val);
        else return BinarySearch(array, left , index-1 , val);
    }
}

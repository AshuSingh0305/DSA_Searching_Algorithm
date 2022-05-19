package DataStructure.Searching_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,3,5,7,9,2,4,6,8,10};
        int search=7;
        Arrays.sort(arr);
        int location = BinarySearchIterative(arr, search);
        System.out.println(location);
        location = recursionSearch(arr, 0, arr.length-1, search);
        System.out.println(location);
    }
    public static int BinarySearchIterative(int arr[], int search){
        int left=0;
        int right=arr.length-1;
        while(true){
            if(left>right) return -1;
            int mid=(left+right)/2;
            if(arr[mid]==search) return mid;
            else{
                if(arr[mid]>search) right=mid-1;
                else left=mid+1;
            }
        }
    }
    public static int recursionSearch(int array[], int left , int right, int val){
        if(left > right)
            return -1;
        int index = (left+right)/2;
        if(array[index]== val)
            return index;
        else if(array[index] < val){
            return recursionSearch(array,index+1 , right , val);
        }else{
            return recursionSearch(array, left , index-1 , val);
        }
    }
}

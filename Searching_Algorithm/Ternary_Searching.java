package DataStructure.Searching_Algorithm;

public class Ternary_Searching {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,2,4,6,8,10,11,12,13,14,15,16,17,18};
        int search=10;
        System.out.println(TernarySearch(arr, 0, arr.length-1, search));
    }
    public static int TernarySearch(int [] array , int left , int right , int target ){
        int partitionsize = (right-left)/3;
        int mid1 = left+partitionsize;
        int mid2 = right-partitionsize;
        if(mid1>mid2)
            return -1;

        if(array[mid1] == target)
            return mid1;

        if(array[mid2] == target)
            return mid2;
        if(array[mid1] > target)
            return TernarySearch(array , left , mid1-1 , target);

        if(array[mid2] < target)
            return TernarySearch(array , mid2+1 , right , target);

        return TernarySearch(array , mid1+1 , mid2-1 , target);
    }
}

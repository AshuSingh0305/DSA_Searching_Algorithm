package DataStructure.Searching_Algorithm;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int search=sc.nextInt();
        boolean find=false;
        for(int i=0;i<n;i++){
            if(arr[i]==search){
                System.out.println("Element at index: "+i);
                find=true;
                break;
            }
        }
        if(!find){
            System.out.println("Element not found");
        }
    }
}

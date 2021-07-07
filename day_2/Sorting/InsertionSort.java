package day_2.Sorting;

public class InsertionSort {

    public static void main(String args[]){
        int[] arr = {12,10,15,8,14,1};
        InsertionSort is = new InsertionSort();
        is.sort(arr);
        printArray(arr);


    }

    public void sort(int arr[]){
        int n = arr.length;
        for(int i = 1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void printArray(int arr[]){
        System.out.println("Insertion Algo: O(n^2)");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}

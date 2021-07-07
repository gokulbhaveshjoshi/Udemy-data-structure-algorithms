package day_2.Sorting;

public class SelectionSort {
    public void sort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1 ; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]){
        int n = arr.length;
        System.out.println("Selection Sort:- O(n*n)");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7,8,6,4,5,2,3,1,45,25,31,14};
        SelectionSort ss = new SelectionSort();
        ss.sort(arr);
        printArray(arr);
    }
    
}

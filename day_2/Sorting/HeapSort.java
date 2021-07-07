package day_2.Sorting;

public class HeapSort {

    public static void main(String args[]){
        int[] arr = {9,6,3,8,5,2,0,7,4,1};
        HeapSort hs = new HeapSort();
        hs.sort(arr);
        System.out.println("Sorted array");
        printArray(arr);


    }

    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
    
    public void sort(int arr[]){
        int n = arr.length;

        //build heap tree
        for(int i =n/2 -1; i>=0; i--){
            heapify(arr, n, i);
        }

        // One by one extract an element from heap
        for(int i = n -1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;

        if(l<n && arr[l]>arr[largest]){
            largest = l;
        }

        if(r<n && arr[r]>arr[largest]){
            largest = r;
        }

        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
}

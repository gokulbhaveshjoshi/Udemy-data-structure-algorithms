package day_1.Array;

public class MinElement {

    public static void main(String[] args) {
        int[] array = {9,6,3,0,1,4,7,8,5,2};
        int min = array[0];
        for(int i = 0; i<array.length; i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("Min Element in array : " + min);
    }
    
}

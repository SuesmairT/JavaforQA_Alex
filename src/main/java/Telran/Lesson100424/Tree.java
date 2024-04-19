package Telran.Lesson100424;
//[1,2,3,4,5]
public class Tree {

    public int garlandLength(int[] arr) {
        int length =0;
        //calculation
        for (int i=1; i<arr.length; i++){
            length = length + (arr[i]-arr[i-1]);
        }
        return length;
    }
}

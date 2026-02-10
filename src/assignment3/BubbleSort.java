import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args){
Scanner in = new Scanner(System.in);
    System.out.println("How big would you like the array to be?");
    int n = in.nextInt();
    int initial;
    int bubbleArray[] = new int[n];
    for (int i = 0; i < n; i++){
        System.out.println("What value at position " + i + "?");
        initial = in.nextInt();
        bubbleArray[i] = initial;
    } //initializing the array
    
    for (int j = 0; j < n - 1; j++){
        for (int i = 0; i < n - 1 - j; i++){
        if (bubbleArray[i] > bubbleArray[i+1]){
            int temp = bubbleArray[i];
            bubbleArray[i] = bubbleArray[i+1];
            bubbleArray[i+1] = temp;
        }
    }
    }
    
    for (int bubbles: bubbleArray){
        System.out.println(bubbles);
    }
    
}
}

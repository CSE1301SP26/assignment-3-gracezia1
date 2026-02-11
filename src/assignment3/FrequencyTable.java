import java.util.Scanner;

public class FrequencyTable {
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("How many dice?");
int n = in.nextInt();
int[][] frequency = new int[2][n*5 + 1];
int sum = 0;
for (int i = 0; i < frequency[0].length; i++){
    frequency[0][i] = i + n;
}
for (int j = 0; j < 1000; j++){
    sum = 0;
    for (int r = 0; r < n; r++){
        int roll = ((int)(Math.random() * 6 + 1));
        sum = sum + roll;
    for (int k = 0; k < frequency[0].length; k++){
        if (sum == frequency[0][k]){
            frequency[1][k]++;
        }
    }
    }
}
for (int r = 0; r < frequency[0].length; r++){
    System.out.println(frequency[0][r] + ": " + frequency[1][r]);
}
}
    

}

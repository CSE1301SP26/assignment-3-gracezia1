import java.util.Scanner;

public class FrequencyTable {
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int[][] frequency = new int[2][n*6];
for (int i = 0; i < frequency[0].length; i++){
    frequency[0][i] = i + n;
}
for (int j = 0; j < n + 1; j++){
    int roll = ((int)(Math.random() * 6 + 1)) * n;
    for (int k = 0; k < frequency[0].length; k++){
        if (roll == frequency[0][k]){
            frequency[1][k]++;
        }
    }
}
for (int r = 0; r < frequency[0].length; r++){
    System.out.println(frequency[0][r] + ": " + frequency[1][r]);
}
}
    

}

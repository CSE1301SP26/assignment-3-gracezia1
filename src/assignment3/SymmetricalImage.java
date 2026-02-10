import java.util.Scanner;
public class SymmetricalImage {
public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    System.out.println("n:");
    int n = in.nextInt();
    System.out.println("m:");
    int m = in.nextInt();
    int r = 0;
    int c = 0;
    String[][] image = new String[n][m];
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
            image[i][j] = " ";
        }
    }
    for (int count = 0; count < (n*m)/4; count++){
        r = (int)(Math.random() * n);
        c = (int)(Math.random() * m);
        image [r][c] = "*";
        image [r][m - 1 - c] = "*";
    }
    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
            System.out.print(image[i][j]);
        }
        System.out.println();
    }
}
}

package Test;

import java.util.Scanner;

public class partice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];

        System.out.println("Enter matrix elements:");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            int sum = 0;
            for(int j=0;j<3;j++){
                sum += a[i][j];
            }
            System.out.println("Row "+i+" Sum = "+sum);
        }

        for(int j=0;j<3;j++){
            int sum = 0;
            for(int i=0;i<3;i++){
                sum += a[i][j];
            }
            System.out.println("Column "+j+" Sum = "+sum);
        }
    }
}
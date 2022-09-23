import java.util.Scanner;
public class Matrixmultiplication{
     public static void main(String[] args) {
     	int a[][]=new int[3][2];
     	int b[][]=new int[2][3];
     	int c[][]=new int[3][3];

          Scanner sc=new Scanner(System.in);
          System.out.println("enter frist matrix:");
          for(int i=0;i<3;i++){
                 for(int j=0;j<2;j++){
                    a[i][j]=sc.nextInt();
                 }
          }
          System.out.println("enter second matrix:");
          for(int i=0;i<2;i++){
              for(int j=0;j<3;j++){
                    b[i][j]=sc.nextInt();
                 }
          }
          for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
                   int sum=0;
                   for(int k=0;k<2;k++){
                          sum=sum+(a[i][k]*b[k][j]);
                   }   
                      c[i][j]=sum;
                 }
        }
        System.out.println("sum of matrix=");
        for(int i=0;i<3;i++){
          for(int j=0;j<3;j++){
                    System.out.print(c[i][j] +" ");
                }
          System.out.println("\n");
        }
     }
}
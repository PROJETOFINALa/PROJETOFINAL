package teste.length;

//import java.util.Scanner;

public class TesteLength {
   public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);
       int a[][] = new int[4][3];int b[] =new int[4]; int c[] = new int[4];
    int r[] = new int[4];
       for (int[] a1 : a) {
           for (int j = 0; j < a1.length; j++) {
               a1[j] = sc.nextInt();
           }
       }
    
    for (int i=0;i<a.length;i++){
        int maior = a [i][0];
        for(int j=0;j<a[i].length;j++){
            if(a[i][j]>maior)
                maior=a[i][i];
              }
        r[i]=maior;
    }
    for (int i=0;i<r.length;i++)
           System.out.println("MAIOR NÚMERO;"+r[i]+"NA POSIÇÃO:"+i);
    }
    
}

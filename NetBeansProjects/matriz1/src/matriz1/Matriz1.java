package matriz1;

import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double num [][] = new double [3][3];
     double resul[][] = new double [3][3];
     double valor;
     
     for(int i=0;i<num.length;i++){
        for(int j=0;j<num[i].length;j++){
            System.out.println("Digite" +i + "" + j + ";");
            num[i][j]=sc.nextDouble();
        }
    }
    System.out.println("Digute um número: ");
    valor = sc.nextDouble();
    
    for(int i=0;i<num.length;i++){
        for(int j=0;j<num[i].length;j++){
            resul[i][j]=num[i][j]*valor;
        }
    }
    for(int i=0;i<num.length;i++){
        for(int j=0;j<num[i].length;j++){
            System.out.print("|"+ i +","+ j +";" + resul[i][j]+"|");
        }
        }
    System.out.println("");
    }
    }

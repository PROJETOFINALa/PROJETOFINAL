package matriz;

import java.util.Scanner;

public class Matriz {
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       float notas[][] = new float[10][3];
       for(int i = 0;i<notas.length;i++)
       {
           System.out.format("\nDigite as notas do aluno %d \n", i+1);
           for(int j =0;j<notas[i].length;j++)
           { System.out.format("Digite a %da. nota", j+1);
           notas[i][j]= sc.nextFloat();
           }
       }
       float soma, media;
       for (int i=0;i<notas.length;i++)
       {    
           soma=0;
           for(int j=0;j<notas[i].length;j++)
           {
               soma = soma + notas[i][j];
               }
           media = soma / notas[i].length;
           System.out.format("\nMédia do aluno %d; %.2f", i+1, media);
           }
           }
       
       
    
}

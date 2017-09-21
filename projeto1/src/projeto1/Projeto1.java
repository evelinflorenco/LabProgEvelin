package projeto1;

import java.util.Scanner;

public class Projeto1 {
	
	 public static void main(String[] args) {
		 
	      final int N�MEROS_A_LER = 3;
	      Scanner sc = new Scanner(System.in);
	      int m�nimo = Integer.MAX_VALUE;
	      int m�ximo = Integer.MIN_VALUE;
	 
	      for (int i = 0; i < N�MEROS_A_LER; i++) {
	        int num = recebeProximoInteiro(sc);
	        m�nimo = menorNumeroEntre(m�nimo, num);
	        m�ximo = maiorNumeroEntre(m�ximo, num);
	      }
	 
	      System.out.println("O menor numero eh: " + m�nimo);
	      System.out.println("O maior numero eh: " + m�ximo);
	   }
	 
	   private static int maiorNumeroEntre(int numero1, int numero2) {
	      return numero2 > numero1? numero2: numero1;
	   }
	 
	   private static int menorNumeroEntre(int numero1, int numero2) {
	      return numero2 < numero1? numero2: numero1;
	   }
	 
	   private static int recebeProximoInteiro(Scanner sc) {
	      System.out.print("Entre com o proximo inteiro:");
	      int num = sc.nextInt();
	      return num;
	   }
	 
	}

 
  
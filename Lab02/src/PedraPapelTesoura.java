import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		
		
	
		
		
		final String FRASE = "Pedra (1), Papel (2), Tesoura (3)?";
		
	
		int resultado;
		int numero_de_elementos = 3;
		int jogador_1;
		int jogador_2;
				
		Scanner sc = new Scanner(System.in);		
				
		do{
			System.out.println(FRASE); 
			jogador_1 = sc.nextInt();			
		}while (!(jogador_1 >= 1 && jogador_1 <= 3));		
		
		do{			
			System.out.println(FRASE); 
			jogador_2 = sc.nextInt();
		}while (!(jogador_2 >= 1 && jogador_2 <= 3));
			
			
	
		
		
		switch(jogador_1){
		case 1:
			System.out.print("PEDRA - ");
			break;
		case 2:
			System.out.print("PAPEL - ");
			break;
		case 3:
			System.out.print("TESOURA - ");
			break;
		
		}
		
		switch(jogador_2){
		case 1:
			System.out.println("PEDRA");
			break;
		case 2:
			System.out.println("PAPEL");
			break;
		case 3:
			System.out.println("TESOURA");
			break;
	
		}
		
		resultado = Math.abs(((numero_de_elementos + jogador_1 - jogador_2) % numero_de_elementos)) ;
		
		
		
		if (0 < resultado && resultado <= numero_de_elementos / 2) {
			System.out.println("Jogador 1 Ganhou!");
		}else if (resultado > numero_de_elementos / 2) {
			System.out.println("Jogador 2 Ganhou!");
		}else if (resultado == 0) {
			System.out.println("Empate!");
		}	
		
	}

}

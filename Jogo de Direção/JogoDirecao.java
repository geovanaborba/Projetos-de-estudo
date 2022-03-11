import java.util.Scanner;

public class JogoDirecao {

	public static void main(String[] args) {

		
		System.out.println("Você está perdido no meio da floresta e precisa voltar para casa. ...");
		System.out.println("Escolha uma direção para tentar achar o caminho de volta (w, d, s, a):");
		
		Scanner leitor = new Scanner(System.in);
		
		String op;
		
		do {
			
			op = leitor.nextLine();
			
			if(op.equals("w")) {
				System.out.println("Você caminha por muito tempo e encontra uma imensa parede que se estende muito! Você volta um pouco e precisa encontrar outra direção!");
			}
			else if(op.equals("d")) {
				System.out.println("Lobos selvagens! CORRA OU SERÁ DEVORADO!");
			}
			else if(op.equals("s")) {
				System.out.println("Cuidado, monstro à frente! Você consegue escapar de ser esmagado se escondendo em uma fenda numa pedra gigante. Que sorte! O monstro vai "
                                        + "embora, mas não seria adequado continuar nessa direção. Você toma outro rumo!");
			}
			else if(op.equals("a")) {
				System.out.println("Você caminha por um bom tempo, o que pareceram ser horas, mas finalmente encontrou a saída! Parabéns! Cuidado com a floresta na próxima vez");
			}
			
		}while(!op.equals("a")); // enquanto opção não é igual a "a".
		
	}

}

//Programa feito através dos vídeos do canal Java Fácil do YouTube.

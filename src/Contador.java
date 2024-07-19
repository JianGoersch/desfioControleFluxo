import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {	
		try {
			Scanner terminal = new Scanner(System.in);

		    System.out.println("Digite o primeiro parâmetro");
		        int parametroUm = terminal.nextInt();
		    System.out.println("Digite o segundo parâmetro");
		        int parametroDois = terminal.nextInt();
            terminal.close();
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            e.printStackTrace();
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
	}
		else{
			int contagem = parametroDois - parametroUm;
			System.out.println("O resultado da conta é: "+ contagem);
			for (int i = parametroUm; i <= parametroDois; i++) {
				System.out.println("Número: " + i);
			}
		}
		
}
}
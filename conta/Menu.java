package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.model.Conta;
import conta.util.Cores;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;


public class Menu {

	public static void main(String[] args) {
		
		
		//Teste da Classe Conta Corrente
				ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Gabriel", 20000.0f);
				cc1.visualizar();
				cc1.sacar(500.0f);
				cc1.visualizar();
				cc1.depositar(100.0f);
				cc1.visualizar();
	
		// Teste da Classe Conta Poupança
				ContaPoupanca cp1 = new ContaPoupanca(2, 123, 2, "Maria dos Santos", 15);
				cp1.visualizar();
		        cp1.sacar(1000.0f);
				cp1.visualizar();
				cp1.depositar(5000.0f);
				cp1.visualizar();	
		
		Scanner leia = new Scanner(System.in);

		int opcao = 0;
		
		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                  BANCO Rocattinho                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
			opcao = leia.nextInt();
			}catch (InputMismatchException e){
				leia.nextLine();
				opcao = 0;
			}
		
			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco Rocattinho!");
				leia.close();
				System.exit(0);
			}
				
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Criar Conta\n\n");
				
				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Listar todas as Contas\n\n");
				
				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Buscar Conta por Numero  \n\n");
				
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Atualizar Dados da Conta\n\n");
				
				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Apagar Conta\n\n");
				
				keyPress();
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Sacar\n\n");
				
				keyPress();
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Depositar\n\n");
				
				keyPress();
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Transferir valores entre Contas\n\n");
				
				keyPress();
				break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD +"\nOpção Inválida\n");
					
					keyPress();
					break;
					
				


	
		}
	}
	}

	private static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		}catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
		
	}
}



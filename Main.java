import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes", "Sair"));
		int option = -1; 
		do{
			option = mainMenu.getSelection();

			if (option == 1){
				Menu contaMenu = new Menu("Menu Contas", Arrays.asList("Abri", "Alterar", "Fechar", "Retornar"));
				System.out.println(contaMenu.getSelection() + " foi selecionada");
			}
			else {
				System.out.println(mainMenu.getSelection() + " foi selecionada");
				System.out.println("Fim");
			}
		} while (option!=4);
		
		
	}

}	
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal 2", Arrays.asList("Conta", "Cliente", "Operacoes", "Sair"));
		System.out.println(mainMenu.getSelection() + " foi selecionada");
		System.out.println("Fim");
	}

}
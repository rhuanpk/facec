package util;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import exception.InvalidOption;
import interfaces.Menu;
import interfaces.SubMenu;

public final class Method {

	public static final String opcaoMenuSair = "Sair";
	public static final String opcaoMenuVoltar = "Voltar";

	public static Scanner sc = new Scanner(System.in);

	public static void start(Menu menu, SubMenu... subMenus) {
		while (true) {
			result.Menu menuResult = execMenu(menu);
			if (menuResult.isExit())
				break;
			startSubMenu(subMenus[menuResult.getOpcao() - 1]);
		}
		System.out.println("Obrigado!");
	}

	private static void startSubMenu(SubMenu subMenu) {
		while (true) {
			result.Menu menuResult = execMenu(subMenu);
			if (menuResult.isExit())
				break;
			Object action = subMenu.itemsMenu()[menuResult.getOpcao() - 1];
			if (action instanceof Runnable runnable) {
				runnable.run();
			}
		}
	}

	private static result.Menu execMenu(Menu menu) {
		while (true) {
			try {
				limparConsole();
				boolean exit = false;
				int maximoOpcoes = menu.printMenu();
				int opcao = lerOpcao(maximoOpcoes);
				if (opcao == 0)
					exit = true;
				return new result.Menu(exit, opcao);
			} catch (InvalidOption e) {
				System.out.println("\n" + e.getMessage());
				continueEnter();
			}
		}
	}

	public static void limparConsole() {
		for (int index = 0; index < 999; index++) {
			System.out.println("\b");
		}
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static int lerInt(String message) throws Exception {
		try {
			if (message != null && !message.isEmpty() || !message.isBlank())
				System.out.print(message);
			int resposta = sc.nextInt();
			System.out.println();
			return resposta;
		} catch (InputMismatchException e) {
			sc.next();
			throw new Exception();
		} catch (Exception e) {
			throw e;
		}
	}

	public static int lerOpcao(int maximoOpcoes) throws InvalidOption {
		try {
			int escolha = sc.nextInt();
			if (escolha < 0 || escolha > (maximoOpcoes - 1))
				throw new exception.InvalidOption();
			System.out.println();
			return escolha;
		} catch (InputMismatchException e) {
			sc.next();
			throw new exception.InvalidOption();
		}
	}

	public static void continueEnter() {
		try {
			System.out.print("\nContinuar <ENTER>");
			System.in.read();
		} catch (IOException e) {
		}
	}

	public static void printMenu(String titulo, String... opcoes) {
		boolean hasBackFlag = false;
		String backMessage = null;
		StringBuilder sb = new StringBuilder().append("---> " + titulo + " <---\n\n");
		for (int index = 0; index < opcoes.length; index++) {
			String opcao = opcoes[index];
			if (opcao == opcaoMenuSair || opcao == opcaoMenuVoltar) {
				hasBackFlag = true;
				backMessage = opcao;
				continue;
			}
			sb.append(index + 1).append(". " + opcao + "\n");
		}
		if (hasBackFlag)
			sb.append("0. " + backMessage + "\n");
		sb.append("\nEscolha: ");
		System.out.print(sb.toString());
	}

}

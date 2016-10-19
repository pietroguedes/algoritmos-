import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = getIdade(s);
		if (age >= 18) {
			System.out.println("Digite a quantidade de pontos na carteira:");
			int points = s.nextInt();
			if (points < 20) {
				System.out.println("Pode dirigir");
			} else {
				System.out.println("Não pode dirigir");
			}
		} else {
			System.out.println("Não pode dirigir");
		}
		s.close();
	}

	private static int getIdade(Scanner s) {
		System.out.println("Digite a sua idade:");
		int age = s.nextInt();
		return age;
	}

}

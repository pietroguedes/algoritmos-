
public class Main {
	
	public static void main(String[] args) {
		int mes = 2;
		String s;
		switch (mes) {
		case 1:
			s = "Janeiro";
			break;
		case 2:
			s = "Fevereiro";
			break;
		case 3:
			s = "Março";
			break;
		default:
			s = "Mês inválido.";
			break;
		}
		System.out.println(s);
	}
	
//	public static void main(String[] args) {
//		String mes = "  janEIro ";
//		mes = mes.toLowerCase();
//		mes = mes.trim();
//		int mesInteiro;
//		switch (mes) {
//		case "janeiro":
//			mesInteiro = 1;
//			break;
//		case "fevereiro":
//			mesInteiro = 2;
//			break;
//		case "março":
//			mesInteiro = 3;
//			break;
//		default:
//			mesInteiro = -1;
//			break;
//		}
//		System.out.println(mesInteiro);
//	}

}

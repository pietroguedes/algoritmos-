
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
			s = "Mar�o";
			break;
		default:
			s = "M�s inv�lido.";
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
//		case "mar�o":
//			mesInteiro = 3;
//			break;
//		default:
//			mesInteiro = -1;
//			break;
//		}
//		System.out.println(mesInteiro);
//	}

}

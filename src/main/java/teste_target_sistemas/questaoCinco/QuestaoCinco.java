package teste_target_sistemas.questaoCinco;

public class QuestaoCinco {

	public QuestaoCinco() {
		
	}
	
	public String inverterString(String texto) {
		StringBuilder sb = new StringBuilder();
		for (int i = texto.length()-1; i >= 0; i--) {
			sb.append(texto.charAt(i));
		}
		
		return sb.toString();
	}
	
}

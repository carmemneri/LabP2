package lp2.lab01;
public class IdadePreferencialInteligente {
	public static void main(String[] args) {
		int ano_nasc = 1998;
		int ano_atual = 2020;
		int idade = (ano_atual - ano_nasc); 
		if (idade >= 60) {
			System.out.println("Voce tem " + idade + " anos. Voce pode usar o atendimento especial.");
		} else {
		  System.out.println("Voce tem " + idade + " anos. Voce ainda nao pode usar o atendimento especial.");
		}
	}
}

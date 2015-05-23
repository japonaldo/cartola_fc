package br.com.fujioka.cartola;

import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cartola cartola = Cartola
				.parseaDados("/home/local/CERTI/jmf/Documents/cartola");

		// List<Time> times = cartola.getTimes();
		List<Jogador> jogadores = cartola.getJogadores();
		
		// for (Time time : times) {
		// System.out.println("Time: " + time.getNome());
		// }
		Collections.sort(jogadores);
		// jogadores.sort(Comparator<Jogador>() {
		// @Override
		// public int compare(Jogador j1, Jogador j2) {
		// return j1.getProximaPontuacaoNecessaria() <
		// j2.getProximaPontuacaoNecessaria();
		// }
		// });
		// System.out.println("Número de time é: " + times.size());
		System.out.println("Número do jogadores é: " + jogadores.size());
		for (Jogador jogador : jogadores) {
			System.out.println("Jogador: " + jogador.getNome() + "\tposição: "
					+ jogador.getPosicao() + "\ttime: "
					+ jogador.getTime().getNome() + "\t\tmedia para pontuar: "
					+ jogador.getMediaParaPontuar()
					+ "\t\tpróxima pontuação necessária:"
					+ jogador.getProximaPontuacaoNecessaria());
		}
		System.out.println("Fim!");
	}

}

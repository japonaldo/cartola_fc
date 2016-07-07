package br.com.fujioka.cartola;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.fujioka.cartola.Jogador.JogadorPosicao;

public class Cartola {
	private List<Time> mTimes;
	private List<Jogador> mJogadores;
	
	public Cartola() {
		this.mTimes = new ArrayList<Time>();
		this.mJogadores = new ArrayList<Jogador>();
	}
	
	public void AdicionaTime(Time time) {
//		System.out.println("Adicionando time: " + time.getNome());
		if (!mTimes.contains(time)) {
			mTimes.add(time);
		}
	}
	
	public void AdicionaJogador(Jogador jogador) {
//		System.out.println("Adicionando jogador: " + jogador.getNome());
		if (!mJogadores.contains(jogador)) {
			mJogadores.add(jogador);
		}
	}
	
	public List<Time> getTimes() {
		return mTimes;
	}
	
	public List<Jogador> getJogadores() {
		return mJogadores;
	}
	
//	public List<Jogador> ordena
	
	public static Cartola parseaDados(String arquivoPath) throws NullPointerException {
		System.out.println("Parseando dados do arquivo: " + arquivoPath);
		Cartola cartola = new Cartola();
		File arquivo = new File(arquivoPath);
		BufferedReader buffReader = null;
		try {
			buffReader = new BufferedReader(new FileReader(arquivo));
			String linha = "";
			do {
				String nomeTime = "";
				String nomeJogador = "";
				String posicao = "";
				int numeroJogos = 0;
				float precoAtual = 0;
				float precoVariacao = 0;
				float mediaPontuacao = 0;
				float ultimaPontuacao = 0;
				if ((linha = buffReader.readLine()) != null) {
					nomeTime = linha.trim();
				}
				if ((linha = buffReader.readLine()) != null) {
					posicao = linha.trim();
				}
				if ((linha = buffReader.readLine()) != null) {
					nomeJogador = linha.trim();
				}
				for (int i = 0; i < 2; i++) {
					linha = buffReader.readLine();
				}
				if ((linha = buffReader.readLine()) != null) {
					String[] scouts = linha.trim().split("\t");
					int i = 0;
					try {
						numeroJogos = Integer.parseInt(scouts[i++]);
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
					try {
						precoAtual = Float.parseFloat(scouts[i++]);
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
					try {
						precoVariacao = Float.parseFloat(scouts[i++]);
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
					try {
						mediaPontuacao = Float.parseFloat(scouts[i++]);
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
					try {
						ultimaPontuacao = Float.parseFloat(scouts[i++]);
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
				}
				for (int i = 0; i < 2; i++) {
					linha = buffReader.readLine();
				}
				
				if (linha == null) {
					break;
				}
				Time time = new Time();
				Jogador jogador = new Jogador(nomeJogador,
						JogadorPosicao.ConverterPosicao(posicao), numeroJogos,
						precoAtual, precoVariacao, mediaPontuacao,
						ultimaPontuacao, new ScoutsAtacando(), time);
				time.setNome(nomeTime);
				time.AdicionaJogador(jogador);
				cartola.AdicionaTime(time);
				cartola.AdicionaJogador(jogador);
			} while (linha != null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (buffReader != null) {
				try {
					buffReader.close();
				} catch (IOException e) {
				}
			}
		}
		return cartola;
	}
}

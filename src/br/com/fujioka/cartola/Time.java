package br.com.fujioka.cartola;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String mNome;
	private List<Jogador> mJogadores = new ArrayList<Jogador>();
	
	public Time() {
		this.mNome = "";
		this.mJogadores = new ArrayList<Jogador>();
	}
	
	public Time(String mNome, List<Jogador> mJogadores) {
		super();
		this.mNome = mNome;
		this.mJogadores = mJogadores;
	}
	
	public String getNome() {
		return mNome;
	}
	public void setNome(String mNome) {
		this.mNome = mNome;
	}
	public List<Jogador> getJogadores() {
		return mJogadores;
	}
	public void setJogadores(List<Jogador> jogadores) {
		this.mJogadores = jogadores;
	}
	
	public void AdicionaJogador(Jogador jogador) {
		if (!mJogadores.contains(jogador)) {
			mJogadores.add(jogador);
		}
	}
}

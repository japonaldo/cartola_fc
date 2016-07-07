package br.com.fujioka.cartola;

public class Jogador implements Comparable<Jogador> {

	public enum JogadorPosicao {
		GOLEIRO, ZAGUEIRO, LATERAL, MEIO_CAMPO, ATACANTE, TECNICO;

		public static JogadorPosicao ConverterPosicao(String posicao) {
			JogadorPosicao pos;
			if ("GOL".equals(posicao)) {
				pos = GOLEIRO;
			} else if ("ZAG".equals(posicao)) {
				pos = ZAGUEIRO;
			} else if ("LAT".equals(posicao)) {
				pos = LATERAL;
			} else if ("MEI".equals(posicao)) {
				pos = MEIO_CAMPO;
			} else if ("ATA".equals(posicao)) {
				pos = ATACANTE;
			} else {
				pos = TECNICO;
			}
			return pos;
		}
	};

	public Jogador(String mNome, JogadorPosicao mPosicao, int mNumeroJogos,
			float mPrecoAtual, float mPrecoVariacao, float mMediaPontuacao,
			float mUltimaPontuacao, ScoutsAtacando mScoutsAtacando, Time mTime) {
		super();
		this.mNome = mNome;
		this.mPosicao = mPosicao;
		this.setNumeroJogos(mNumeroJogos);
		this.mPrecoAtual = mPrecoAtual;
		this.mPrecoVariacao = mPrecoVariacao;
		this.mMediaPontuacao = mMediaPontuacao;
		this.mUltimaPontuacao = mUltimaPontuacao;
		this.mScoutsAtacando = mScoutsAtacando;
		this.mTime = mTime;
	}

	private String mNome;
	private JogadorPosicao mPosicao;
	private int mNumeroJogos;
	private float mPrecoAtual;
	private float mPrecoVariacao;
	private float mMediaPontuacao;
	private float mUltimaPontuacao;
	private ScoutsAtacando mScoutsAtacando;
	private Time mTime;
	
	public Time getTime() {
		return mTime;
	}
	
	public void setTime(Time time) {
		this.mTime = time;
	}

	public String getNome() {
		return mNome;
	}

	public void setNome(String mNome) {
		this.mNome = mNome;
	}

	public JogadorPosicao getPosicao() {
		return mPosicao;
	}

	public void setPosicao(JogadorPosicao mPosicao) {
		this.mPosicao = mPosicao;
	}

	public int getNumeroJogos() {
		return this.mNumeroJogos;
	}

	public void setNumeroJogos(int mNumeroJogos) {
		this.mNumeroJogos = mNumeroJogos;
	}

	public float getPrecoAtual() {
		return mPrecoAtual;
	}

	public void setPrecoAtual(float mPrecoAtual) {
		this.mPrecoAtual = mPrecoAtual;
	}

	public float getPrecoVariacao() {
		return mPrecoVariacao;
	}

	public void setPrecoVariacao(float mPrecoVariacao) {
		this.mPrecoVariacao = mPrecoVariacao;
	}

	public float getMediaPontuacao() {
		return mMediaPontuacao;
	}

	public void setMediaPontuacao(float mMediaPontuacao) {
		this.mMediaPontuacao = mMediaPontuacao;
	}

	public float getUltimaPontuacao() {
		return mUltimaPontuacao;
	}

	public void setUltimaPontuacao(float mUltimaPontuacao) {
		this.mUltimaPontuacao = mUltimaPontuacao;
	}

	public float getProximaPontuacaoNecessaria() {
		return (this.getMediaParaPontuar() * (this.mNumeroJogos + 1))
				- this.mMediaPontuacao;
	}

	public float getMediaParaPontuar() {
		return this.mPrecoAtual / 3;
	}

	public ScoutsAtacando getScoutsAtacando() {
		return mScoutsAtacando;
	}

	public void setScoutsAtacando(ScoutsAtacando mScoutsAtacando) {
		this.mScoutsAtacando = mScoutsAtacando;
	}

	@Override
	public int compareTo(Jogador jogador) {
		return (this.getProximaPontuacaoNecessaria() < jogador
				.getProximaPontuacaoNecessaria() ? -1 : 1);
	}

}

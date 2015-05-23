package br.com.fujioka.cartola;

public class ScoutsAtacando {
	private int mFaltasSofridas;
	private int mPassesErrados;
	private int mAssistencias;
	private int mFinalizacaoTrave;
	private int mFinalizacaoDefendida;
	private int mFinalizacaoFora;
	private int mGols;
	private int mImpedimentos;
	private int mPenaltisPerdidos;
	
	public ScoutsAtacando(int mFaltasSofridas, int mPassesErrados,
			int mAssistencias, int mFinalizacaoTrave,
			int mFinalizacaoDefendida, int mFinalizacaoFora, int mGols,
			int mImpedimentos, int mPenaltisPerdidos) {
		super();
		this.mFaltasSofridas = mFaltasSofridas;
		this.mPassesErrados = mPassesErrados;
		this.mAssistencias = mAssistencias;
		this.mFinalizacaoTrave = mFinalizacaoTrave;
		this.mFinalizacaoDefendida = mFinalizacaoDefendida;
		this.mFinalizacaoFora = mFinalizacaoFora;
		this.mGols = mGols;
		this.mImpedimentos = mImpedimentos;
		this.mPenaltisPerdidos = mPenaltisPerdidos;
	}
	
	public ScoutsAtacando() {
	}

	public int getFaltasSofridas() {
		return mFaltasSofridas;
	}
	public void setFaltasSofridas(int mFaltasSofridas) {
		this.mFaltasSofridas = mFaltasSofridas;
	}
	public int getPassesErrados() {
		return mPassesErrados;
	}
	public void setPassesErrados(int mPassesErrados) {
		this.mPassesErrados = mPassesErrados;
	}
	public int getAssistencias() {
		return mAssistencias;
	}
	public void setAssistencias(int mAssistencias) {
		this.mAssistencias = mAssistencias;
	}
	public int getFinalizacaoTrave() {
		return mFinalizacaoTrave;
	}
	public void setFinalizacaoTrave(int mFinalizacaoTrave) {
		this.mFinalizacaoTrave = mFinalizacaoTrave;
	}
	public int getFinalizacaoDefendida() {
		return mFinalizacaoDefendida;
	}
	public void setFinalizacaoDefendida(int mFinalizacaoDefendida) {
		this.mFinalizacaoDefendida = mFinalizacaoDefendida;
	}
	public int getFinalizacaoFora() {
		return mFinalizacaoFora;
	}
	public void setFinalizacaoFora(int mFinalizacaoFora) {
		this.mFinalizacaoFora = mFinalizacaoFora;
	}
	public int getGols() {
		return mGols;
	}
	public void setGols(int mGols) {
		this.mGols = mGols;
	}
	public int getImpedimentos() {
		return mImpedimentos;
	}
	public void setImpedimentos(int mImpedimentos) {
		this.mImpedimentos = mImpedimentos;
	}
	public int getPenaltisPerdidos() {
		return mPenaltisPerdidos;
	}
	public void setPenaltisPerdidos(int mPenaltisPerdidos) {
		this.mPenaltisPerdidos = mPenaltisPerdidos;
	}
	
}

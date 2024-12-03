package com.senaidev.cadastroproduto;

public class Cliente {

	public Cliente(Spring nome, int cPF, int telefone, int dt_nacimento) {
		super();
		Nome = nome;
		CPF = cPF;
		Telefone = telefone;
		this.dt_nacimento = dt_nacimento;
	}
	private Spring Nome;
	private int CPF;
	private int Telefone;
	private int dt_nacimento;
	public Spring getNome() {
		return Nome;
	}
	public void setNome(Spring nome) {
		Nome = nome;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	public int getDt_nacimento() {
		return dt_nacimento;
	}
	public void setDt_nacimento(int dt_nacimento) {
		this.dt_nacimento = dt_nacimento;
	}
}

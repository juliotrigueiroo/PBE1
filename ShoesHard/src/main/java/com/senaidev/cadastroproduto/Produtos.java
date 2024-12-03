package com.senaidev.cadastroproduto;

public class Produtos {

	public Produtos(String nome, int codigo, boolean preço, String tipoDoProduto) {
		super();
		Nome = nome;
		Codigo = codigo;
		Preço = preço;
		TipoDoProduto = tipoDoProduto;
	}
	private String Nome;
	private int Codigo;
	private boolean Preço;
	private String TipoDoProduto;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public boolean isPreço() {
		return Preço;
	}
	public void setPreço(boolean preço) {
		Preço = preço;
	}
	public String getTipoDoProduto() {
		return TipoDoProduto;
	}
	public void setTipoDoProduto(String tipoDoProduto) {
		TipoDoProduto = tipoDoProduto;
	}
	
	
}

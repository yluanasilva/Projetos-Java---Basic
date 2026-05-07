package Loja;

public class Produto {
	private String nome;
	private String descriçao;
	private double preco;

	
	public Produto() {
		this.nome = "";
		this.descriçao = "";
		this.preco = 0;
	}
	public Produto(String nome, String descricao, double preco) {
		this.setNome(nome);
		this.setDescriçao(descricao);
		this.setPreco(preco);
		
	}

	double getPreco() {
		return preco;
	}

	private void setPreco(double preco) {
		this.preco = preco;
	}

	private String getDescriçao() {
		return descriçao;
	}

	private void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}

	String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

}

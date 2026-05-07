package Loja;

public class Main {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("cadeado", "metal", 18.99);
		Produto p2 = new Produto("chave", "metal", 16.99);
		
		Carrinho c = new Carrinho();
		c.adicionar(p1);
		c.adicionar(p2);
		c.remover("cadeado");
		
		Venda v = new Venda(c);
		v.totalPreco();
	}

}

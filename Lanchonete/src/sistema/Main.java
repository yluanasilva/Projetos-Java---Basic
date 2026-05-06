package sistema;

public class Main {

	public static void main(String[] args) {
		
		Item item1 = new Item("Coca-cola", 5.99,01);
		Item item2 = new Item("Sanduiche natural", 12.99,02);
		Item item3 = new Item("suco natural", 10.99,03);
		Item item4 = new Item("x-salada", 15.99,04);
		Item item5 = new Item("Coxinha", 8.99,05);
		Item item6 = new Item("Fatia de Bolo", 12.99,06);
		
		
		Carrinho c = new Carrinho();
		
		c.adicionarItem(item2);
		c.adicionarItem(item3);
		c.adicionarItem(item5);
		c.adicionarItem(item1);
		c.adicionarItem(item4);
		c.adicionarItem(item6);
		
		
		c.removerItem(5);
		
		c.calcularPreco();
		
	}
}

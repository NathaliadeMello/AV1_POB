package Pacote;

public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(1, "111", "a1a", "Coca-cola", "Refrigerante de cola", "Bebidas", 4.99, 300, "Fanta");
		String produtos[];
		Lista l = new Lista();
		l.ListarProd(p1);
		produtos[0] = p1.Nome;
	}

}

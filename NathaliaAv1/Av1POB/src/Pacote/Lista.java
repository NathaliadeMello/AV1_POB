package Pacote;

public class Lista {
	
	//Listar Produto
	public void ListarProd(Produto p) {
		
		System.out("Id:"+ p.getId());
		System.out("C�digo de Barras:"+ p.getCodBarras());
		System.out("SKU:" + p.getSKU());
		System.out("Nome:" + p.Nome);
		System.out("Descri��o:" + p.Descricao);
		System.out("Categoria:" + p.Categoria);
		System.out("Pre�o:" + p.Preco);
		System.out("Peso:" + p.Peso);
		System.out("Fabricante:" + p.Fabricante);
	}
	
	//Listar Produtos
	public void ListarProds(String produtos[]) {
		for(int i=0; i<produtos.length; i++)
		{
			System.out("Produto i:" + produtos[i]);
		}
	}
	
}

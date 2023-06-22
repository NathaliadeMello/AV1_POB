package Pacote;

import java.util.List;

public class Lista {
	
	//Listar Produto
	public void ListarProd(int id, List<Produto> produtos) {
		
		for(Produto p : produtos)
		{
			if(p.getId() == id)
			System.out.printf("Id:"+ p.getId());
			System.out.printf("Código de Barras:"+ p.getCodBarras());
			System.out.printf("SKU:" + p.getSKU());
			System.out.printf("Nome:" + p.Nome);
			System.out.printf("Descrição:" + p.Descricao);
			System.out.printf("Categoria:" + p.Categoria);
			System.out.printf("Preço:" + p.Preco);
			System.out.printf("Peso:" + p.Peso);
			System.out.printf("Fabricante:" + p.Fabricante);
		}
		
		
	}
	
	//Listar Produtos
	public void ListarProds(List<Produto> produtos) {
		int cont = 1;
		for(Produto p : produtos)
		{
				System.out.printf("Produto " +cont);
				System.out.printf("Id:"+ p.getId());
				System.out.printf("Código de Barras:"+ p.getCodBarras());
				System.out.printf("SKU:" + p.getSKU());
				System.out.printf("Nome:" + p.Nome);
				System.out.printf("Descrição:" + p.Descricao);
				System.out.printf("Categoria:" + p.Categoria);
				System.out.printf("Preço:" + p.Preco);
				System.out.printf("Peso:" + p.Peso);
				System.out.printf("Fabricante:" + p.Fabricante);
				
				cont++;
				
		}
	}
	
	public void ExcluirProd(int id, List<Produto> produtos)
	{
		for (Produto p : produtos) {
            if (p.getId() == id) {
                produtos.remove(p);
            }
		
	}
	
}

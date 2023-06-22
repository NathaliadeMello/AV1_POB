package Pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		//Produto p1 = new Produto(1, "111", "a1a", "Coca-cola", "Refrigerante de cola", "Bebidas", 4.99, 300, "Fanta");
		ArrayList<Produto> produtos = new ArrayList();
		Scanner s = new Scanner(System.in);
		Lista l = new Lista();
		
		System.out.println("O que deseja fazer?\n 1- Inserir produto. \n 2- Excluir produto. \n 3- Listar produto. \n 4- listar produtos.");
		int funcao = s.nextInt();
		
		if(funcao == 1)		
		{
			System.out.println("Id:");
			int id = s.nextInt();
			System.out.println("Código de barras:");
			String codigoDeBarras = s.next();
			System.out.println("Sku:");
			String sku = s.next();
			System.out.println("Nome:");
			String nome = s.next();
			System.out.println("Descrição:");
			String descricao = s.next();
			System.out.println("Categoria:");
			String categoria = s.next();
			System.out.println("Preço(R$):");
			double preco = s.nextDouble();
			System.out.println("Peso(Kg):");
			double peso = s.nextDouble();
			System.out.println("Fabricante");
			String fabricante = s.next();
			
			
			Produto p = new Produto(id, codigoDeBarras, sku, nome, descricao, categoria, preco, peso, fabricante);
			produtos.add(p);
			
		}
		
		if(funcao == 2)
			
		{
			System.out.println("Id:");
			int id = s.nextInt();
			
			l.ExcluirProd(id, produtos);
			
			
		}
		
		if(funcao == 3)
		{
			System.out.println("Id:");
			int id = s.nextInt();
			
			l.ListarProd(id, produtos);
		}
		
		if(funcao == 4)
		{
			l.ListarProds(produtos);
		}
		
		
		
		
	}

}

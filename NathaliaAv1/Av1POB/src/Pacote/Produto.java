package Pacote;

public class Produto {
	
	//Atributos
	//ID, código de barras, sku, nome, descrição, categoria, preço, peso e fabricante
	private int Id;
	private String CodBarras;
	private String SKU;
	
	public String Nome;
	public String Descricao;
	public String Categoria;
	public double Preco;
	public double Peso;
	public String Fabricante;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		this.Id = id;
	}
	
	public String getCodBarras() {
		return CodBarras;
	}
	
	public void setCodBarras(String codBarras) {
		this.CodBarras = codBarras;
	}
	
	public String getSKU() {
		
		return SKU;
	}
	
	public void setSKU(String sku) {
		this.SKU = sku;
	}
	
	public Produto(int id, String codBarras, String sku, String nomeInicial, String descricaoInicial, 
			String categoria, double precoInicial, double pesoInicial, String fabricante)
	{
		
		//Incluir Produto
		this.Id = id;
		this.CodBarras = codBarras;
		this.SKU = sku;
		this.Nome = nomeInicial;
		this.Descricao = descricaoInicial;
		this.Categoria = categoria;
		this.Preco = precoInicial;
		this.Peso = pesoInicial;
		this.Fabricante = fabricante;
	}
	

}

package Pacote;

import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private int numero;
    private String tipo;
    private double preco;
    private static List<Quarto> listaQuartos = new ArrayList<>();

    public Quarto(int numero, String tipo, double preco) {
        this.numero = numero;
        this.tipo = tipo;
        this.preco = preco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void incluirQuarto() {
        listaQuartos.add(this);
        System.out.println("Novo quarto incluso");
    }

    public void alterarQuarto() {
        System.out.println("Alteração feita com sucesso");
    }

    public void excluirQuarto() {
        listaQuartos.remove(this);
        System.out.println("Exclusão feita com sucesso");
    }

    public static void listarQuartos() {
        System.out.println("Lista de quartos:");
        for (Quarto quarto : listaQuartos) {
            System.out.println("Número: " + quarto.getNumero());
            System.out.println("Tipo: " + quarto.getTipo());
            System.out.println("Preço: " + quarto.getPreco());
            System.out.println("");
        }
    }
}

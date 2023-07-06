package Pacote;

import java.util.ArrayList;
import java.util.List;

public class Cama {
    private int numQuarto;
    private String tipoCama;
    private static List<Cama> listaCamas = new ArrayList<>();

    public Cama(int numQuarto, String tipoCama) {
        this.numQuarto = numQuarto;
        this.tipoCama = tipoCama;
    }

    public int getNumeroQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public void incluirCama() {
        listaCamas.add(this);
        System.out.println("Nova cama inclusa");
    }

    public void alterarCama() {
        System.out.println("Alteração feita com sucesso");
    }

    public void excluirCama() {
        listaCamas.remove(this);
        System.out.println("Exclusão feita com sucesso");
    }

    public static void listarCamas() {
        System.out.println("Lista de camas:");
        for (Cama cama : listaCamas) {
            System.out.println("Número do Quarto: " + cama.getNumeroQuarto());
            System.out.println("Tipo de Cama: " + cama.getTipoCama());
            System.out.println("");
            
        }
    }
}

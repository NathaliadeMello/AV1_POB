package Pacote;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reserva {
    private Cliente cliente;
    private Quarto quarto;
    private Date dataIn;
    private Date dataOut;
    private static List<Reserva> listaReservas = new ArrayList<>();

    public Reserva(Cliente cliente, Quarto quarto, Date dataIn, Date dataOut) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dataIn = dataIn;
        this.dataOut = dataOut;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Date getDataIn() {
        return dataIn;
    }

    public void setDataIn(Date dataIn) {
        this.dataIn = dataIn;
    }

    public Date getDataOut() {
        return dataOut;
    }

    public void setDataOut(Date dataOut) {
        this.dataOut = dataOut;
    }
    
    
    public void incluirReserva() {
        listaReservas.add(this);
        System.out.println("Nova reserva inclusa");
    }

    public void alterarReserva() {
        System.out.println("Alteração feita com sucesso!");
    }

    public void excluirReserva() {
        listaReservas.remove(this);
        System.out.println("Exclusão com sucesso!");
    }

    public static void listarReservas() {
        System.out.println("Lista de reservas:");
        for (Reserva reserva : listaReservas) {
            System.out.println("Cliente: " + reserva.getCliente().getNome());
            System.out.println("Quarto: " + reserva.getQuarto().getNumero());
            System.out.println("Data de Check-in: " + reserva.getDataIn());
            System.out.println("Data de Check-out: " + reserva.getDataOut());
            System.out.println("");
        }
    }
}

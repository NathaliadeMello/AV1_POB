package Pacote;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String tel;
    private String email;
    private static List<Cliente> listaClientes = new ArrayList<>();
    
    public Cliente(String nome, String cpf, String tel, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getTel() {
        return tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void incluirCliente() {
        listaClientes.add(this);
        System.out.println("Novo cliente cadastrado");
    }
    
    public void alterarCliente() {
        System.out.println("Alteração feita com sucesso");
    }
    
    public void excluirCliente() {
        listaClientes.remove(this);
        System.out.println("Exclusão feita com sucesso");
    }
    
    public static void listarClientes() {
        System.out.println("Lista de clientes:");
        for (Cliente cliente : listaClientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Telefone: " + cliente.getTel());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("");
        }
    }
}

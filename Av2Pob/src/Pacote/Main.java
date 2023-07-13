import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String CLIENTES_FILE_PATH = "Cliente.java";
    private static final String QUARTOS_FILE_PATH = "Quarto.java";
    private static final String CAMAS_FILE_PATH = "Cama.java";
    private static final String RESERVAS_FILE_PATH = "Reserva.java";

    private static List<Cliente> listaClientes = new ArrayList<>();
    private static List<Quarto> listaQuartos = new ArrayList<>();
    private static List<Cama> listaCamas = new ArrayList<>();
    private static List<Reserva> listaReservas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    incluirCliente(scanner);
                    break;
                case 2:
                    alterarCliente(scanner);
                    break;
                case 3:
                    excluirCliente(scanner);
                    break;
                case 4:
                    listarClientes();
                    break;
                case 5:
                    incluirQuarto(scanner);
                    break;
                case 6:
                    alterarQuarto(scanner);
                    break;
                case 7:
                    excluirQuarto(scanner);
                    break;
                case 8:
                    listarQuartos();
                    break;
                case 9:
                    incluirCama(scanner);
                    break;
                case 10:
                    alterarCama(scanner);
                    break;
                case 11:
                    excluirCama(scanner);
                    break;
                case 12:
                    listarCamas();
                    break;
                case 13:
                    incluirReserva(scanner);
                    break;
                case 14:
                    alterarReserva(scanner);
                    break;
                case 15:
                    excluirReserva(scanner);
                    break;
                case 16:
                    listarReservas();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n Olá, suas opções são:");
        System.out.println("1. Novo Cliente");
        System.out.println("2. Alterar Cliente");
        System.out.println("3. Excluir Cliente");
        System.out.println("4. Listar Clientes");
        System.out.println("5. Novo Quarto");
        System.out.println("6. Alterar Quarto");
        System.out.println("7. Excluir Quarto");
        System.out.println("8. Listar Quartos");
        System.out.println("9. Nova Cama");
        System.out.println("10. Alterar Cama");
        System.out.println("11. Excluir Cama");
        System.out.println("12. Listar Camas");
        System.out.println("13. Nova Reserva");
        System.out.println("14. Alterar Reserva");
        System.out.println("15. Excluir Reserva");
        System.out.println("16. Listar Reservas");
        System.out.println("0. Fechar");
        System.out.print("A opção desejada é: ");
    }

    private static void incluirCliente(Scanner scanner) {
        System.out.println("\n Novo Cliente");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf, telefone, email);
        listaClientes.add(cliente);
        System.out.println("Novo cliente cadastrado.");
    }

    private static void alterarCliente(Scanner scanner) {
        System.out.println("\n Alterar Cliente");
        System.out.print("CPF do cliente a ser alterado: ");
        String cpf = scanner.nextLine();

        Cliente cliente = buscarClientePorCpf(cpf);
        if (cliente != null) {
            System.out.print("Novo nome: ");
            String novoNome = scanner.nextLine();
            System.out.print("Novo telefone: ");
            String novoTelefone = scanner.nextLine();
            System.out.print("Novo e-mail: ");
            String novoEmail = scanner.nextLine();

            cliente.setNome(novoNome);
            cliente.setTelefone(novoTelefone);
            cliente.setEmail(novoEmail);

            System.out.println("Cliente alterado.");
        } else {
            System.out.println("CPF inválido.");
        }
    }

    private static void excluirCliente(Scanner scanner) {
        System.out.println("\n Excluir Cliente");
        System.out.print("CPF do cliente a ser excluído: ");
        String cpf = scanner.nextLine();

        Cliente cliente = buscarClientePorCpf(cpf);
        if (cliente != null) {
            listaClientes.remove(cliente);
            System.out.println("Cliente excluído.");
        } else {
            System.out.println("CPF inválido.");
        }
    }

    private static void listarClientes() {
        System.out.println("\nNossos clientes são:");
        for (Cliente cliente : listaClientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Telefone: " + cliente.getTelefone());
            System.out.println("E-mail: " + cliente.getEmail());
            System.out.println("\n");
        }
    }

    private static Cliente buscarClientePorCpf(String cpf) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    private static void incluirQuarto(Scanner scanner) {
        System.out.println("\nNovo Quarto");
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        Quarto quarto = new Quarto(numero, descricao);
        listaQuartos.add(quarto);
        System.out.println("Novo quarto cadastrado");
    }

    private static void alterarQuarto(Scanner scanner) {
        System.out.println("\n Alterar Quarto");
        System.out.print("Número do quarto a ser alterado: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        Quarto quarto = buscarQuartoPorNumero(numero);
        if (quarto != null) {
            System.out.print("Nova descrição: ");
            String novaDescricao = scanner.nextLine();

            quarto.setDescricao(novaDescricao);

            System.out.println("Quarto alterado.");
        } else {
            System.out.println("Não foi encontrado um quarto com esse número.");
        }
    }

    private static void excluirQuarto(Scanner scanner) {
        System.out.println("\nExcluir Qaurto");
        System.out.print("Número do quarto a ser excluído: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        Quarto quarto = buscarQuartoPorNumero(numero);
        if (quarto != null) {
            listaQuartos.remove(quarto);
            System.out.println("Quarto excluído.");
        } else {
            System.out.println("Não foi encontrado um quarto com esse número.");
        }
    }

    private static void listarQuartos() {
        System.out.println("\n Nossos Quartos:");
        for (Quarto quarto : listaQuartos) {
            System.out.println("Número: " + quarto.getNumero());
            System.out.println("Descrição: " + quarto.getDescricao());
            System.out.println("\n");
        }
    }

    private static Quarto buscarQuartoPorNumero(int numero) {
        for (Quarto quarto : listaQuartos) {
            if (quarto.getNumero() == numero) {
                return quarto;
            }
        }
        return null;
    }

    private static void incluirCama(Scanner scanner) {
        System.out.println("\n Nova Cama");
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();

        Cama cama = new Cama(numero, tipo);
        listaCamas.add(cama);
        System.out.println("Nova cama cadastrada.");
    }

    private static void alterarCama(Scanner scanner) {
        System.out.println("\n Alterar Cama");
        System.out.print("Número da cama a ser alterada: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        Cama cama = buscarCamaPorNumero(numero);
        if (cama != null) {
            System.out.print("Novo tipo: ");
            String novoTipo = scanner.nextLine();

            cama.setTipo(novoTipo);

            System.out.println("Cama alterada.");
        } else {
            System.out.println("Não foi encontrada uma cama com esse número.");
        }
    }

    private static void excluirCama(Scanner scanner) {
        System.out.println("\n=== EXCLUSÃO DE CAMA ===");
        System.out.print("Número da cama a ser excluída: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        Cama cama = buscarCamaPorNumero(numero);
        if (cama != null) {
            listaCamas.remove(cama);
            System.out.println("Cama excluída.");
        } else {
            System.out.println("Não foi encontrada uma cama com esse número.");
        }
    }

    private static void listarCamas() {
        System.out.println("\nNossas Camas:");
        for (Cama cama : listaCamas) {
            System.out.println("Número: " + cama.getNumero());
            System.out.println("Tipo: " + cama.getTipo());
            System.out.println("\n");
        }
    }

    private static Cama buscarCamaPorNumero(int numero) {
        for (Cama cama : listaCamas) {
            if (cama.getNumero() == numero) {
                return cama;
            }
        }
        return null;
    }

    private static void incluirReserva(Scanner scanner) {
        System.out.println("\nNova Reserva");
        System.out.print("CPF do cliente: ");
        String cpfCliente = scanner.nextLine();
        System.out.print("Número do quarto: ");
        int numeroQuarto = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Número da cama: ");
        int numeroCama = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Data de chegada: ");
        String dataEntrada = scanner.nextLine();
        System.out.print("Data de saída: ");
        String dataSaida = scanner.nextLine();

        Cliente cliente = buscarClientePorCpf(cpfCliente);
        Quarto quarto = buscarQuartoPorNumero(numeroQuarto);
        Cama cama = buscarCamaPorNumero(numeroCama);

        if (cliente != null && quarto != null && cama != null) {
            Reserva reserva = new Reserva(cliente, quarto, cama, dataEntrada, dataSaida);
            listaReservas.add(reserva);
            System.out.println("Reserva feita.");
        } else {
            System.out.println("Ocorreu um erro, tente novamente.");
        }
    }
private static void alterarReserva(Scanner scanner) {
    System.out.println("\n Alterar Reserva");
    System.out.print("CPF do cliente: ");
    String cpfCliente = scanner.nextLine();
    System.out.print("Número do quarto: ");
    int numeroQuarto = scanner.nextInt();
    scanner.nextLine();

    Reserva reserva = buscarReservaPorClienteEQuarto(cpfCliente, numeroQuarto);
    if (reserva != null) {
        System.out.print("Nova data de chegada (dd/mm/yyyy): ");
        String novaDataEntrada = scanner.nextLine();
        System.out.print("Nova data de saída (dd/mm/yyyy): ");
        String novaDataSaida = scanner.nextLine();

        reserva.setDataEntrada(novaDataEntrada);
        reserva.setDataSaida(novaDataSaida);

        System.out.println("Reserva alterada.");
    } else {
        System.out.println("Ocorreu um erro, tente novamente.");
    }
}

private static void excluirReserva(Scanner scanner) {
    System.out.println("\n=== EXCLUSÃO DE RESERVA ===");
    System.out.print("CPF do cliente: ");
    String cpfCliente = scanner.nextLine();
    System.out.print("Número do quarto: ");
    int numeroQuarto = scanner.nextInt();
    scanner.nextLine();

    Reserva reserva = buscarReservaPorClienteEQuarto(cpfCliente, numeroQuarto);
    if (reserva != null) {
        listaReservas.remove(reserva);
        System.out.println("Reserva excluída.");
    } else {
        System.out.println("Ocorreu um erro, tente novamente.");
    }
}

private static void listarReservas() {
    System.out.println("\nNossas Reservas:");
    for (Reserva reserva : listaReservas) {
        System.out.println("Cliente: " + reserva.getCliente().getNome());
        System.out.println("Quarto: " + reserva.getQuarto().getNumero());
        System.out.println("Cama: " + reserva.getCama().getNumero());
        System.out.println("Data de chegada: " + reserva.getDataEntrada());
        System.out.println("Data de saída: " + reserva.getDataSaida());
        System.out.println("\n");
    }
}

private static Reserva buscarReservaPorClienteEQuarto(String cpfCliente, int numeroQuarto) {
    for (Reserva reserva : listaReservas) {
        if (reserva.getCliente().getCpf().equals(cpfCliente) && reserva.getQuarto().getNumero() == numeroQuarto) {
            return reserva;
        }
    }
    return null;
}

}

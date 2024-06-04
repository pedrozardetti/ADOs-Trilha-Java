package ADO9RECURS;

import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);
    public static Consulta consulta = new Consulta();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        int opcao = 0;

        System.out.println("-- BEM VINDO AO AGENDAMENTO DA NOSSA CLÍNICA");
        System.out.println("Informe o que você deseja!");
        System.out.println("1. Cadastrar Paciente");
        System.out.println("2. Cadastrar Médico");
        System.out.println("3. Listar Pacientes");
        System.out.println("4. Listar Médicos");
        System.out.println("5. Buscar Paciente");
        System.out.println("6. Buscar Médico");
        System.out.println("0. Sair");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informe seu nome");
                sc.nextLine();
                String nomePaciente = sc.nextLine();

                System.out.println("Informe seu CPF");
                String cpf = sc.nextLine();

                System.out.println("Informe a data de nascimento");
                String dataNas = sc.nextLine();

                System.out.println("Informe seu principal sintoma");
                String sintoma = sc.nextLine();

                Agendamento agendamento = new Agendamento(nomePaciente, cpf, dataNas, sintoma);
                consulta.cadastrarPaciente(agendamento);
                break;

            case 2:
                System.out.println("Informe o nome");
                sc.nextLine();
                String nomeMedico = sc.nextLine();

                System.out.println("Informe o CRM");
                String crm = sc.nextLine();

                System.out.println("Informe sua especialidade");
                String especialidade = sc.nextLine();

                Agendamento agendamento2 = new Agendamento(nomeMedico, crm, especialidade);

                consulta.cadastrarMedico(agendamento2);
                break;

            case 3:
                consulta.listarPacientes();
                break;

            case 4:
                consulta.listarMedicos();
                break;

            case 5:
                System.out.println("Informe o CPF do paciente que deseja procurar");
                sc.nextLine();
                String buscarCpf = sc.nextLine();
                consulta.buscarPaciente(buscarCpf);
                break;

            case 6:
                System.out.println("Informe o CRM do médico que deseja procurar");
                sc.nextLine();
                String buscarCrm = sc.nextLine();
                consulta.buscarMedico(buscarCrm);
                break;

            case 0:
                System.out.println("Saindo do sistema...");
                return;

        }
        menu();
    }
}

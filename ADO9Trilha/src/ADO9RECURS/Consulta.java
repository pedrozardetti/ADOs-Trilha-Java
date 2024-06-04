package ADO9RECURS;

import java.util.ArrayList;

public class Consulta {

    private ArrayList<Agendamento> pacientes = new ArrayList<>();
    private ArrayList<Agendamento> medicos = new ArrayList<>();

    public void cadastrarPaciente(Agendamento agendamento) {
        pacientes.add(agendamento);
        System.out.println("O paciente foi cadastrado!");
        System.out.println("Nome: " + agendamento.getNomePaciente());
        System.out.println("CPF: " + agendamento.getCpf());
        System.out.println("Data de nascimento: " + agendamento.getDataNasc());
        System.out.println("Sintoma Principal: " + agendamento.getSintoma());
    }

    public void cadastrarMedico(Agendamento agendamento) {
        medicos.add(agendamento);
        System.out.println("O médico foi cadastrado!");
        System.out.println("Nome: " + agendamento.getNomeMedico());
        System.out.println("CRM: " + agendamento.getCrm());
        System.out.println("Especialidade: " + agendamento.getEspecialidade());
    }

    public void listarPacientes() {
        if (!pacientes.isEmpty()) {
            System.out.println("Listando todos os pacientes!");
            for (Agendamento agendamento : pacientes) {
                System.out.println(agendamento);
            }
        } else {
            System.out.println("Não temos pacientes para listar!");
        }
    }

    public void listarMedicos() {
        if (!medicos.isEmpty()) {
            System.out.println("Listando todos os médicos");
            for (Agendamento agendamento : medicos) {
                System.out.println(agendamento);
            }
        } else {
            System.out.println("Não temos médicos para listar!");
        }
    }

    public void buscarPaciente(String buscarCpf) {
        boolean found = false;
        for (Agendamento agendamento : pacientes) {
            if (agendamento.getCpf().equalsIgnoreCase(buscarCpf)) {
                System.out.println("Encontramos o paciente");
                System.out.println("Aqui estão suas informações relevantes!");
                System.out.println("Nome: " + agendamento.getNomePaciente());
                System.out.println("CPF: " + agendamento.getCpf());
                System.out.println("Data de nascimento: " + agendamento.getDataNasc());
                System.out.println("Sintoma Principal: " + agendamento.getSintoma());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Não foi possível encontrar este CPF em nossa clínica :(");
        }
    }

    public void buscarMedico(String buscarCrm) {
        boolean found = false;
        for (Agendamento agendamento : medicos) {
            if (agendamento.getCrm().equalsIgnoreCase(buscarCrm)) {
                System.out.println("Encontramos o médico!");
                System.out.println("Aqui estão suas informações relevantes!");
                System.out.println("Nome: " + agendamento.getNomeMedico());
                System.out.println("CRM: " + agendamento.getCrm());
                System.out.println("Especialidade: " + agendamento.getEspecialidade());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Não foi possível encontrar este CRM em nossa clínica :(");
        }
    }
}

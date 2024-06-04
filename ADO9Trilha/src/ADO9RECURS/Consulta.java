package ADO9RECURS;

import java.util.ArrayList;

public class Consulta {

    ArrayList<Agendamento> clinica = new ArrayList<>();

    public void cadastrarPaciente(Agendamento agendamento) {
        clinica.add(agendamento);
        System.out.println("O paciente foi cadastrado!");
        System.out.println("Nome: " + agendamento.getNomePaciente());
        System.out.println("CPF: " + agendamento.getCpf());
        System.out.println("Data de nascimento: " + agendamento.getDataNasc());
        System.out.println("Sintoma Principal: " + agendamento.getSintoma());

    }

    public void cadastrarMedico(Agendamento agendamento2) {
        clinica.add(agendamento2);
        System.out.println("O médico foi cadastrado!");
        System.out.println("Nome: " + agendamento2.getNomeMedico());
        System.out.println("CRM: " + agendamento2.getCrm());
        System.out.println("Especialidade: " + agendamento2.getEspecialidade());
    }

    public void listarPaciente() {
        if (!clinica.isEmpty()) {
            System.out.println("Listando todos os pacientes!");
            for (Agendamento agendamento : clinica) {
                System.out.println(agendamento);
            }
        } else
            System.out.println("Não temos pacientes para listar!");
    }

    public void listarMedicos() {
        if (!clinica.isEmpty()) {
            System.out.println("Listando todos os médicos");
            for (Agendamento agendamento2 : clinica) {
                System.out.println(agendamento2);
            }
        } else
            System.out.println("Não temos médicos para listar!");
    }

    public void buscarPaciente(String buscarCpf) {

        for (Agendamento agendamento : clinica) {
            if (agendamento.getCpf().equalsIgnoreCase(buscarCpf)) {
                System.out.println("Encontramos o paciente");
                System.out.println("Aqui estão suas informações relevantes!");
                System.out.println("Nome: " + agendamento.getNomePaciente());
                System.out.println("CPF: " + agendamento.getCpf());
                System.out.println("Data de nascimento: " + agendamento.getDataNasc());
                System.out.println("Sintoma Principal: " + agendamento.getSintoma());
            } else
                System.out.println("Não foi possível encontrar este CPF em nossa clínica :(");
        }
    }

    public void buscarMedico(String buscarCrm) {
        for (Agendamento agendamento2 : clinica) {
            if (agendamento2.getCrm().equalsIgnoreCase(buscarCrm)) {
                System.out.println("Encontramos o médico!");
                System.out.println("Aqui estão suas informações relevantes!");
                System.out.println("Nome: " + agendamento2.getNomeMedico());
                System.out.println("CRM: " + agendamento2.getCrm());
                System.out.println("Especialidade: " + agendamento2.getEspecialidade());

            } else
                System.out.println("Não foi possível encontrar este CRM em nossa clínica :()");
        }
    }
}

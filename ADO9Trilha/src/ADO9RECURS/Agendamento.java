package ADO9RECURS;

public class Agendamento {

    private String nomePaciente;
    private String cpf;
    private String dataNasc;
    private String sintoma;
    private String nomeMedico;
    private String crm;
    private String especialidade;

    public Agendamento(String nomeMedico, String crm, String especialidade) {
        this.nomeMedico = nomeMedico;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public Agendamento(String nomePaciente, String cpf, String dataNasc, String sintoma) {
        this.nomePaciente = nomePaciente;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.sintoma = sintoma;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String toString() {
        if (nomePaciente != null) {
            return "Nome do paciente - " + nomePaciente + " | CPF - " + cpf + " | Data de Nascimento - " + dataNasc
                    + " | Sintoma - " + sintoma;
        } else {
            return "Nome do médico - " + nomeMedico + " | CRM - " + crm + " | Especialidade - " + especialidade;
        }
    }
}

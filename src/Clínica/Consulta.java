package Clínica;

public class Consulta {

    private String data;
    private String horario;
    private Medico medico;
    private Paciente paciente;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void agendarConsulta(Medico medico, Paciente paciente, String data, String horario) {
        System.out.println("---- Consulta Marcada ---- \n");

        System.out.println("Médico:" + this.getMedico().getNome());
        System.out.println("Paciente:" + this.getPaciente().getNome());
        System.out.println("Data:" + this.getData());
        System.out.println("Hoarario:" + this.getHorario());

    }

    public ReceitaMedica gerarReceita(Paciente paciente, Medico medico, Medicamento medicamento) {
        ReceitaMedica receita = new ReceitaMedica();
        receita.setMedico(medico);
        receita.setPaciente(paciente);
        receita.setMedicamento(medicamento);
        
        System.out.println("---- Receita Médica ---- \n");
        System.out.println("Médico:" + this.getMedico().getNome());
        System.out.println("Paciente:" + this.getPaciente().getNome());
        System.out.println("Medicamento:" + receita.getMedicamento().getNome());

        return receita;
    }

    
}

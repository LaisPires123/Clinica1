package facade;

import Clínica.Consulta;
import Clínica.Medicamento;
import Clínica.Medico;
import Clínica.Paciente;
import Clínica.ReceitaMedica;
import Clínica.ServiçoFarmacia;

public class Fachada {

    private Consulta c;
    private ReceitaMedica rc;
    private ServiçoFarmacia sf;
    private ReceitaMedica receita;

    public Fachada(Consulta c, ServiçoFarmacia sf) {
        super();
        this.c = new Consulta();
        this.sf = new ServiçoFarmacia();
    }

    public void CadrastrarPaciente(String nome, String telefone) {
        Paciente y = new Paciente();
        y.setNome(nome);
        y.setTelefone(telefone);
        System.out.println("Paciente Cadastrado");
        this.c.setPaciente(y);

    }

    public void CadrastrarMedico(String nome, String resgistromedico) {
        Medico l = new Medico();
        l.setNome(nome);
        l.setRegistroMedico(resgistromedico);
        System.out.println("Medico Cadastrado");
        this.c.setMedico(l);

    }

    public void CadrastrarConsulta(String data, String horario) {
        this.c.setData(data);
        this.c.setHorario(horario);

    }

    public void MarcarConsulta(Medico medico, Paciente paciente, String data, String horario) {

        c.agendarConsulta(medico, paciente, data, horario);

    }

    public ReceitaMedica obterReceita(Paciente paciente, Medico medico, Medicamento medicamento) {
        c.gerarReceita(paciente, medico, medicamento);
        System.out.println("\nReceita gerada");

        return receita;

    }

    public void ReceberMedicamento(ReceitaMedica receita) {

        sf.receberMedicamento(receita);
    }

}

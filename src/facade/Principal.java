package facade;

import Clínica.Consulta;
import Clínica.Medicamento;
import Clínica.Medico;
import Clínica.Paciente;
import Clínica.ReceitaMedica;
import Clínica.ServiçoFarmacia;

public class Principal {

    public static void main(String[] args) {

        Consulta consulta = new Consulta();

        ServiçoFarmacia sf = new ServiçoFarmacia();

        Medicamento rivotril = new Medicamento();
        rivotril.setNome("Rivotril");
        Medicamento ibuprofeno = new Medicamento();
        ibuprofeno.setNome("Ibuprofeno");
        Medicamento paracetamol = new Medicamento();
        paracetamol.setNome("Paracetamol");

        sf.setListMedicamentos(rivotril);
        sf.setListMedicamentos(ibuprofeno);
        sf.setListMedicamentos(paracetamol);

        Fachada clinica = new Fachada(consulta, sf);
        System.out.println("Cadastrar Paciente:");
        clinica.CadrastrarPaciente("Cristiane", "40028922");
        System.out.println("\nCadastrar Médico:");
        clinica.CadrastrarMedico("Diana Ferreira", "1987");
        clinica.CadrastrarConsulta("20/09/2020", "18:00");

        ReceitaMedica receita = new ReceitaMedica();
        receita.setMedicamento(paracetamol);
        receita.setMedico(consulta.getMedico());
        receita.setPaciente(consulta.getPaciente());

        System.out.println("-------------\n");
        clinica.MarcarConsulta(consulta.getMedico(), consulta.getPaciente(), consulta.getData(), consulta.getHorario());

        System.out.println("-------------\n");
        clinica.obterReceita(consulta.getPaciente(), consulta.getMedico(), paracetamol);

        System.out.println("-------------\n");

        clinica.ReceberMedicamento(receita);

    }
}

package Clínica;

import java.util.ArrayList;

public class ServiçoFarmacia {

    
    private ArrayList<Medicamento> ListMedicamentos = new ArrayList<>();

    public ArrayList<Medicamento> getListMedicamentos() {
        return ListMedicamentos;
    }

    public void setListMedicamentos(Medicamento medicamento) {
        this.ListMedicamentos.add(medicamento);
        
    }
    

    public void receberMedicamento(ReceitaMedica receita) {
        
      
        for (int i = 0; i < ListMedicamentos.size(); i++) {
            
            if (ListMedicamentos.contains(receita.getMedicamento())) {
                System.out.println("\nMedicação entregue.");

            } else {
                System.out.println("\nMedicação não disponível.");

            }

        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author pablo
 */
public class NMedicamento {
    
    Medicamento ElMedicamento = new Medicamento();
    
    NMedicamento siguiente;

    public Medicamento getElMedicamento() {
        return ElMedicamento;
    }

    public void setElMedicamento(Medicamento ElMedicamento) {
        this.ElMedicamento = ElMedicamento;
    }

    public NMedicamento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NMedicamento siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}

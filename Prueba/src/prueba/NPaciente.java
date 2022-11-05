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
public class NPaciente {
    
    Paciente ElPaciente = new Paciente();
    NPaciente siguiente;

    public Paciente getElPaciente() {
        return ElPaciente;
    }

    public void setElPaciente(Paciente ElPaciente) {
        this.ElPaciente = ElPaciente;
    }

    public NPaciente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NPaciente siguiente) {
        this.siguiente = siguiente;
    }
    
    
}

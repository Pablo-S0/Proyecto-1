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
public class Paciente {
    
    String nombre;
    
    ListaMedicamentos LaLista = new ListaMedicamentos();

    public Paciente(String nombre) {
        this.nombre = nombre;
    }

    public Paciente() {
        this.nombre = "Indefinido";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaMedicamentos getLaLista() {
        return LaLista;
    }

    public void setLaLista(ListaMedicamentos LaLista) {
        this.LaLista = LaLista;
    }
    
    
}

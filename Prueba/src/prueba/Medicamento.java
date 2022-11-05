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
public class Medicamento {
    
    String nombre;
    int usuarios;

    public Medicamento() {
        this.nombre="";
        this.usuarios = 0;
    }

    public Medicamento(String nombre) {
        this.nombre = nombre;
        this.usuarios = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(int usuarios) {
        this.usuarios = usuarios;
    }
    
    
}

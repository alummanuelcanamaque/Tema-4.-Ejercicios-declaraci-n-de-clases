/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coche;

import java.awt.Color;

/**
 *
 * @author Manuel Cañamaque
 */
public class Coche {
    String modelo;
    String color;
    boolean metalizado;
    String matricula;
    int añoFabricacion;

    public Coche(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }
    
    
    public Coche(String modelo, String color, boolean metalizado, String matricula, int añoFabricacion) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.añoFabricacion = añoFabricacion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMetalizado(boolean metalizado) {
        this.metalizado = metalizado;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public boolean isMetalizado() {
        return metalizado;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }
    
    
    
    
}

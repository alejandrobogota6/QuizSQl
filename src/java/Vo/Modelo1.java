/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vo;

/**
 *
 * @author Bogotá
 */
public class Modelo1 {
    
    
    
    private int IdModelo;
    private String NameModelo;
    private int Desicion;

    public Modelo1(int IdModelo, String NameModelo) {
        this.IdModelo = IdModelo;
        this.NameModelo = NameModelo;
  
    }

    public Modelo1() {
    }

    public int getIdModelo() {
        return IdModelo;
    }

    public void setIdModelo(int IdModelo) {
        this.IdModelo = IdModelo;
    }

    public String getNameModelo() {
        return NameModelo;
    }

    public void setNameModelo(String NameModelo) {
        this.NameModelo = NameModelo;
    }

    public int getDesicion() {
        return Desicion;
    }

    public void setDesicion(int Desicion) {
        this.Desicion = Desicion;
    }

    
    
}

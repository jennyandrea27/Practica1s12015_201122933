/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Jenny
 */
public class Personaje {
    String imagen;
    String nombre;
    int pataque;
    int pdefensa;   
    int posx=0;
    int posy=0;
    String tipoataque;
    String tipopersonaje;

    public Personaje(String imagen, String nombre, int pataque, int pdefensa, String tipoataque, String tipopersonaje) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.pataque = pataque;
        this.pdefensa = pdefensa;
        this.tipoataque = tipoataque;
        this.tipopersonaje = tipopersonaje;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPataque() {
        return pataque;
    }

    public void setPataque(int pataque) {
        this.pataque = pataque;
    }

    public int getPdefensa() {
        return pdefensa;
    }

    public void setPdefensa(int pdefensa) {
        this.pdefensa = pdefensa;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public String getTipoataque() {
        return tipoataque;
    }

    public void setTipoataque(String tipoataque) {
        this.tipoataque = tipoataque;
    }

    public String getTipopersonaje() {
        return tipopersonaje;
    }

    public void setTipopersonaje(String tipopersonaje) {
        this.tipopersonaje = tipopersonaje;
    }
}

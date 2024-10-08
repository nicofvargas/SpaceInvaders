package Juego;

import java.awt.Color;

import entorno.Entorno;

public class Bloque {

    //aca la logica del bloque que se va desintegrando de acuerdo a la cantidad de disparos
    //pista posee el atributo salud y la clase misil el atributo daño
    private double x;
    private double y;
    private double alto;
    private double ancho;

    public Bloque(Entorno entorno) {
        this.x=entorno.ancho();
        this.y=entorno.alto();
        this.alto=50;
        this.ancho=50;

    }
    public void dibujar(Entorno entorno) {
        entorno.dibujarRectangulo(this.x,this.y,this.ancho,this.alto,0, Color.red);
    }



}

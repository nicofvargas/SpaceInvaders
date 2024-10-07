package Juego;

import entorno.Entorno;

import java.awt.*;

public class Jugador {
    private double x;
    private double y;
    private double alto;
    private double ancho;
    private double salud;
    private int velocidad;
    private boolean estaVivo;

    public Jugador() {
        this.x=10;
        this.y=10;
        this.alto=30;
        this.ancho=30;
        this.salud=25; //en el atributo de misil como en el juego original creo que de un tiro perdias una vida asique deberia ser 25 el daño
        this.velocidad=2;
        this.estaVivo=true;
    }
    //metodo para dibujar
    public void dibujar(Entorno entorno) {
        entorno.dibujarRectangulo(this.x,this.y,this.ancho,this.alto,0, Color.blue);
    }

    //metodos para mover
    public void moverDerecha() {
        this.x+=velocidad;
    }
    public void moverIzquierda() {
        this.x-=velocidad;
    }
    //colision con bordes de ventana
    public boolean hayColisionIzq() {
        return this.x<=0;
    }
    public boolean hayColisionDer(Entorno entorno) {
        return this.x+this.ancho>= entorno.ancho();
    }

    //metodo para recibir daño(no estoy seguro si de un tiro moria cualquier cosa se cambia
    public boolean estaVivo() {
        return estaVivo;
    }
    public void recibirDmg(int danio) {
        this.salud-=danio;
        if (this.salud<=0) {
            this.estaVivo=false;
        }
    }
}

package Juego;


import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
    // El objeto Entorno que controla el tiempo y otros
    private Entorno entorno;
    private Jugador jugador;
    // Variables y métodos propios de cada grupo
    // ...

    Juego()
    {
        //aca se inician loa totalidad de objetos que son usados en el juego
        this.entorno = new Entorno(this, "Proyecto para TP", 800, 600);
        this.jugador = new Jugador(entorno);
        this.entorno.iniciar();
    }

    /**
     * Durante el juego, el método tick() será ejecutado en cada instante y
     * por lo tanto es el método más importante de esta clase. Aquí se debe
     * actualizar el estado interno del juego para simular el paso del tiempo
     * (ver el enunciado del TP para mayor detalle).
     */
    public void tick()
    {
        jugador.dibujar(entorno);

        //teclas
        if (entorno.estaPresionada(entorno.TECLA_DERECHA)) {
            jugador.moverDerecha(entorno);
        }
        if (entorno.estaPresionada(entorno.TECLA_IZQUIERDA)) {
            jugador.moverIzquierda();
        }

    }


    @SuppressWarnings("unused")
    public static void main(String[] args)
    {
        Juego juego = new Juego();
    }
}

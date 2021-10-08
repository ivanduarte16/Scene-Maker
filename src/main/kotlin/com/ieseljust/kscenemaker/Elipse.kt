@file:JvmName("Elipse")

package com.ieseljust.kscenemaker

import java.awt.Color
import java.awt.Graphics

class Elipse : Figura{
    var r1: Int = 100
    var r2: Int = 100

    constructor() : super()

    constructor(x: Int, y: Int, r1: Int = 100, r2: Int = 100, color: Color = Color.BLACK) : super(x, y, color) {
        //super(x, y, color)
        this.r1 = r1
        this.r2 = r2
    }

    override fun describeMe() {
        /*
        * Mètode que mostra en mode text una descripció de la figura per la consola.
        * S'utilitzarà per al mètode llista de la CLI.
        */
        println("elipse " + x + " " + y + " " + r1 + " " + r2 + " " + color)
    }

    override fun render(g: Graphics) {

        /*
         * Mètode que dibuixa sobre un context gràfic la figura rectangle.
         * S'utilitza per al mètode render() de App.
         *
         * Per dibuixar altres primitives de la classe Graphics, podeu consultar
         * https://docs.oracle.com/javase/10/docs/api/java/awt/Graphics.html
         *
         * Fixeu-vos que això són classes de java que estem utilitzant
         * directament des de Kotlin!
         *
         */

        g.setColor(color)             // Establim el color interior
        g.fillOval(x-r1, y-r2, r1*2, r2*2)    // Dibuixem un rectangle en la posició i mida indicades
    }

}
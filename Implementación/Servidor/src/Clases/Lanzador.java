/* Hecho por:
    - Carlos Andrés Cáceres (202126639)
    - Diego Fernando Victoria (201941366)
Proyecto final - Programación interactiva - Universidad del Valle
 */
package Clases;

public class Lanzador { //Inicio clase Lanzador

    public static void main(String[] args) { //Inicio método principal
        Ventana ObjetoVentana = new Ventana();
        Servidor ObjetoServidor = new Servidor();
        ObjetoVentana.setVisible(true);
        ObjetoServidor.EjecutarServer();
    } //Fin método principal

} //Fin clase Lanzador

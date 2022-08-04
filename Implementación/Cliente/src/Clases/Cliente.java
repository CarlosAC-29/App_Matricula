/* Hecho por:
    - Carlos Andrés Cáceres (202126639)
    - Diego Fernando Victoria (201941366)
Proyecto final - Programación interactiva - Universidad del Valle
 */
package Clases;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Cliente { //Inicio clase Cliente

    //Inicio variables y objetos globales
    private Socket conexion;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    String respuestaServidor, mensajeServidor;
    //Fin variables y objetos globales

    public void ConectarCliente(String mensaje) { //Inicio método que conecta el cliente con el servidor
        try {
            conexion = new Socket("127.0.0.1", 5002);
            entrada = new ObjectInputStream(conexion.getInputStream());
            salida = new ObjectOutputStream(conexion.getOutputStream());
            salida.flush();
            mensajeServidor = mensaje;
            ComunicarAlServidor();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión del cliente con el servidor", "Error", 0);
        }
    } //Fin método que conecta el cliente con el servidor

    public void ComunicarAlServidor() { //Inicio método que realiza la solicitud al servidor
        try {
            salida.writeObject(mensajeServidor);
            salida.flush();
            EscucharServidor();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error de comunicación del cliente al servidor", "Error", 0);
        }
    } //Fin método que realiza la solicitud al servidor

    public void EscucharServidor() { //Inicio método que escucha la respuesta del servidor a la solicitud del cliente
        Boolean condicion = true;
        do {
            try {
                respuestaServidor = (String) entrada.readObject();
                condicion = false;
            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "No ha sido posible leer la respuesta del servidor.", "Error", 0);
            }
        } while (condicion);
        try {
            entrada.close();
            salida.close();
            conexion.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No ha sido posible leer la respuesta del servidor.", "Error", 0);
        }
    } //Fin método que escucha la respuesta del servidor a la solicitud del cliente

} //Fin clase Cliente

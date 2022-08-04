/* Hecho por:
    - Carlos Andrés Cáceres (202126639)
    - Diego Fernando Victoria (201941366)
Proyecto final - Programación interactiva - Universidad del Valle
 */
package Clases;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Servidor { //Inicio clase Servidor

    //Inicio variables y objetos globales
    private ServerSocket server;
    private Socket conexion;
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;
    public String respuestaBD, mensajeSolicitud;
    BD ObjetoBD = new BD();
    Ventana ObjetoVentana = new Ventana();
    //Fin variables y objetos globales

    public void EjecutarServer() { //Inicio método que escucha las solicitudes del cliente.
        try {
            server = new ServerSocket(5002, 5); //Puerto - Número de conexiones
            while (true) {
                ObjetoVentana.AgregarMensaje("Servidor en espera de solicitud");
                conexion = server.accept();
                salida = new ObjectOutputStream(conexion.getOutputStream());
                entrada = new ObjectInputStream(conexion.getInputStream());
                try {
                    mensajeSolicitud = (String) entrada.readObject();
                    ObjetoVentana.AgregarMensaje("Solicitud del cliente recibida.");
                    ComunicarAlCliente(); //mensajeSolicitud
                } catch (ClassNotFoundException ex) {
                }
            }
        } catch (IOException e) {
            ObjetoVentana.AgregarMensaje("Error al ejecutar el servidor.");
        }
        ObjetoVentana.AgregarMensaje("Servidor en espera de solicitud");
    } //Fin método que escucha las solicitudes del cliente.

    public void ComunicarAlCliente() { //Inicio método que responde la solicitud del cliente. - String mensaje
        String[] mensajeSeparado = mensajeSolicitud.split("-");
        ObjetoVentana.AgregarMensaje("Petición: " + mensajeSeparado[0] + ".");
        try {
            switch (mensajeSeparado[0]) { //Inicio respuestas a peticiones del cliente:
                case "Confirmar código": //Método que confirma la existencia de un código de estudiante.
                    respuestaBD = (ObjetoBD.ConsultarCodigo(Integer.parseInt(mensajeSeparado[1]))).toString();
                    break;
                case "Asignar datos": //Método que asigna datos del estudiante a ventana GestionMatricula.
                    respuestaBD = (ObjetoBD.mostrarRegistro(Integer.parseInt(mensajeSeparado[1])));
                    break;
                case "Codigo materia": //Método que comprueba si existe el código de una materia.
                    respuestaBD = (ObjetoBD.consultarMateria(mensajeSeparado[1])).toString();
                    break;
                case "Comprobar matricula": //Comprobar estado de matrícula a un curso por un estudiante.
                    respuestaBD = (ObjetoBD.checkMateria(Integer.parseInt(mensajeSeparado[1]), mensajeSeparado[2])).toString();
                    break;
                case "Consultar creditos": //Método que consulta los créditos de un estudiante.
                    respuestaBD = ObjetoBD.consultarCreditosEstudiante(Integer.parseInt(mensajeSeparado[1])) + "";
                    break;
                case "Creditos asignatura": //Método que consulta la cantidad de créditos de una asignatura.
                    respuestaBD = ObjetoBD.consultarCreditosAsigntura(mensajeSeparado[1]) + "";
                    break;
                case "Matricular materia": //Método que matricula una asignatura.
                    respuestaBD = ObjetoBD.adicionarAsignatura(Integer.parseInt(mensajeSeparado[1]), mensajeSeparado[2]);
                    break;
                case "Cancelar materia": //Método que cancela una asignatura.
                    respuestaBD = ObjetoBD.cancelarAsignatura(Integer.parseInt(mensajeSeparado[1]), mensajeSeparado[2]);
                    break;
                case "Actualizar creditos": //Método que actualiza los créditos de un estudiante.
                    respuestaBD = ObjetoBD.actualizarCreditos(Integer.parseInt(mensajeSeparado[1]), Integer.parseInt(mensajeSeparado[2]));
                    break;
                case "Consultar cupos": //Método que consulta los cupos de una asignatura.
                    respuestaBD = ObjetoBD.consultarCupos(mensajeSeparado[1]) + "";
                    break;
                case "Actualizar cupos": //Método que actualiza los cupos de una asignatura.
                    respuestaBD = ObjetoBD.actualizarCupos(mensajeSeparado[1], Integer.parseInt(mensajeSeparado[2]));
                    break;
                case "Actualizar tabla matricula": //Método que consulta todos los cursos matriculados de un estudiante.
                    respuestaBD = ObjetoBD.CursosMatriculados(mensajeSeparado[1]);
                    mensajeSolicitud = "Datos cursos-" + respuestaBD;
                    ComunicarAlCliente();
                    //salida.write();
                    break;
                case "Datos cursos": //Método para consultar los datos de un grupo de cursos solicitados.
                    respuestaBD = "";
                    for (int i = 2; i < mensajeSeparado.length; i++) {
                        respuestaBD += ObjetoBD.consultarDatosAsigntura(mensajeSeparado[i]) + "/";
                    }
                    break;
                case "Actualizar tabla disponible": //Método que consulta todos los cursos disponibles.
                    respuestaBD = ObjetoBD.CursosMatriculados(".");
                    mensajeSolicitud = "Datos cursos-" + respuestaBD;
                    ComunicarAlCliente();
                    break;
                default: //En cualquier otro caso.
                    respuestaBD = "Error en solicitud a BD.";
                    ObjetoVentana.AgregarMensaje("Error en solicitud a BD.");
                    break;
            } //Fin respuestas a peticiones del cliente.
            salida.writeObject(respuestaBD);
            salida.flush();
            ObjetoVentana.AgregarMensaje("Respuesta a petición completada.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No fue posible responder la solicitud del cliente.", "Error", 0);
        }
    } //Fin método que responde la solicitud del cliente.

} //Fin clase Servidor

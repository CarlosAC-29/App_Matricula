/* Hecho por:
    - Carlos Andrés Cáceres (202126639)
    - Diego Fernando Victoria (201941366)
Proyecto final - Programación interactiva - Universidad del Valle
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BD { //Inicio clase BD

    //Inicio variables y objetos globales
    Statement st = null;
    PreparedStatement sentenciaSQL;
    ResultSet respuestaBD;
    //Contraseñas: Carlitos0229 - Diego2021
    //Puertos: 5432 - 5000
    String consultaSQL, puertoBD = "5432", usuario = "postgres", password = "Carlitos0229", respuesta = "", columna;
    String url = "jdbc:postgresql://localhost:" + puertoBD + "/BD";
    String[] DatosBD = new String[10];
    static Ventana ObjetoVentana = new Ventana();
    //Fin variables y objetos globales

    public Connection conexion() { //Inicio método crear conexión con BD
        Connection conn;
        try {
            conn = DriverManager.getConnection(url, usuario, password);
            if (conn != null) {
                ObjetoVentana.AgregarMensaje("Conexión con base de datos establecida.");
                return conn;
            }
        } catch (SQLException e) {
            ObjetoVentana.AgregarMensaje("No se pudo establecer conexión con la base de datos.");
        }
        return null;
    }//Fin método crear conexión con BD

    public String CursosMatriculados(String ID) { //Inicio método consultar cursos matriculados por un estudiante.
        int contador = 0;
        respuesta = "";
        if (ID.equals(".")) {
            consultaSQL = "select cod_asignatura from asignaturas";
            columna = "cod_asignatura";
        } else {
            consultaSQL = "select * from matriculas where codigo_de_estudiante = " + ID;
            columna = "codigo_de_asignatura";
        }
        try {
            st = conexion().createStatement();
            respuestaBD = st.executeQuery(consultaSQL);
            while (respuestaBD.next()) {
                DatosBD[contador] = respuestaBD.getString(columna);
                contador++;
            }
            for (int i = 0; i < contador; i++) {
                respuesta += "-" + DatosBD[i]; //Probar en el for de arriba
            }
            //ObjetoVentana.AgregarMensaje("Cursos matriculados por '" + ID + "' consultados.");
            return ID + respuesta;
        } catch (SQLException exc) {
            ObjetoVentana.AgregarMensaje("No fue posible consultar los cursos matriculados por '" + ID + "'.");
        }
        return null;
    } //Fin método consultar cursos matriculados por un estudiante.

    public String mostrarAsingnaturas() { //Inicio método consultar los cursos disponibles
        try {
            st = conexion().createStatement();
            respuestaBD = st.executeQuery(consultaSQL);
            while (respuestaBD.next()) {
                DatosBD[0] = respuestaBD.getString("cod_asignatura");
            }
            return respuesta;
        } catch (SQLException exc) {
            ObjetoVentana.AgregarMensaje("No fue posible consultar los cursos disponibles.");
        }
        return null;
    } //Fin método consultar los cursos disponibles

    public String consultarDatosAsigntura(String ID) {
        String extension = "";
        consultaSQL = "select nombre, cupos, creditos from asignaturas Where cod_asignatura = '" + ID + "'";
        try {
            st = conexion().createStatement();
            respuestaBD = st.executeQuery(consultaSQL);
            while (respuestaBD.next()) {
                DatosBD[0] = respuestaBD.getString("nombre");
                DatosBD[1] = respuestaBD.getString("creditos");
                if (columna.equals("cod_asignatura")) {
                    DatosBD[2] = respuestaBD.getString("cupos");
                    extension = "-" + DatosBD[2];
                } else {
                    extension = "";
                }
            }
        } catch (SQLException exc) {
            ObjetoVentana.AgregarMensaje("No fue posible consultar los datos de las asignaturas.");
        }
        return ID + "-" + DatosBD[0] + "-" + DatosBD[1] + extension;
    }

    public Boolean ConsultarCodigo(int ID) { //Inicio método para consultar si un código de estudiante existe.
        consultaSQL = "select cod_estudiante from estudiantes Where cod_estudiante = " + ID;
        try {
            st = conexion().createStatement();
            respuestaBD = st.executeQuery(consultaSQL);
            while (respuestaBD.next()) {
                ObjetoVentana.AgregarMensaje("Código de estudiante confirmado.");
                return true;
            }
        } catch (SQLException exc) {
            ObjetoVentana.AgregarMensaje("No fue posible confirmar el código de estudiante.");
        }
        return false;
    } //Fin método para consultar si un código de estudiante existe.

    public Boolean consultarMateria(String ID) { // Inicio método para consultar si código de materia existe.
        consultaSQL = "select cod_asignatura from asignaturas Where cod_asignatura = '" + ID + "'";
        try {
            st = conexion().createStatement();
            respuestaBD = st.executeQuery(consultaSQL);
            while (respuestaBD.next()) {
                ObjetoVentana.AgregarMensaje("Código de asignatura confirmado.");
                return true;
            }
        } catch (SQLException exc) {
            ObjetoVentana.AgregarMensaje("No fue posible confirmar el código de asignatura.");
        }
        return false;
    }// método para consultar si código de materia existe.

    public String mostrarRegistro(int ID) { //Inicio de metodo consultar datos del estudiante
        consultaSQL = "select * from estudiantes where cod_estudiante = " + ID;
        try {
            st = conexion().createStatement();
            respuestaBD = st.executeQuery(consultaSQL);
            while (respuestaBD.next()) {
                DatosBD[0] = respuestaBD.getString("cod_estudiante");
                DatosBD[1] = respuestaBD.getString("nombre");
                DatosBD[2] = respuestaBD.getString("programa_academico");
                DatosBD[3] = respuestaBD.getDouble("creditos") + "";
            }
            //RespuestaServidor = DatosBD[0] + "-" + DatosBD[1] + "-" + DatosBD[2] + "-" + DatosBD[3];
            ObjetoVentana.AgregarMensaje("Consultar datos del estudiante confirmado.");
            return DatosBD[0] + "-" + DatosBD[1] + "-" + DatosBD[2] + "-" + DatosBD[3];
            //return RespuestaServidor;
        } catch (SQLException exc) {
            ObjetoVentana.AgregarMensaje("No fue posible consultar los datos del estudiante.");
        }
        return null;
    } //Fin de metodo consultar datos estudiante

    public Boolean checkMateria(int ID, String Materia) { //Inicio método comprobar si un estudiante tiene un curso matriculado.
        consultaSQL = "select codigo_de_estudiante, codigo_de_asignatura from matriculas where codigo_de_estudiante = "
                + "" + ID + " And codigo_de_asignatura = " + "'" + Materia + "'";
        try {
            st = conexion().createStatement();
            respuestaBD = st.executeQuery(consultaSQL);
            while (respuestaBD.next()) {
                ObjetoVentana.AgregarMensaje("Comprobar matrícula de un estudiante a un curso confirmado.");
                return true;
            }
        } catch (SQLException exc) {
            ObjetoVentana.AgregarMensaje("No fue posible comprobar la matricula de un estudiante a un curso.");
        }
        return false;
    } //Fin método comprobar si un estudiante tiene un curso matriculado.

    public Double consultarCreditosEstudiante(int ID) { //Inicio método consultar créditos de un estudiante
        consultaSQL = "select creditos from estudiantes Where cod_estudiante = " + ID;
        double num_creditos = 0;
        try {
            st = conexion().createStatement();
            respuestaBD = st.executeQuery(consultaSQL);
            while (respuestaBD.next()) {
                String COD = respuestaBD.getString("creditos");
                num_creditos = Integer.parseInt(COD);
            }
            ObjetoVentana.AgregarMensaje("Créditos del estudiante " + ID + " consultados.");
        } catch (SQLException exc) {
            ObjetoVentana.AgregarMensaje("No fue posible consultar los créditos del estudiante " + ID + ".");
        }
        return num_creditos;
    } //Fin método consultar créditos de un estudiante

    public int consultarCreditosAsigntura(String ID) { //Inicio método consultar créditos de una asignatura
        consultaSQL = "select creditos from asignaturas Where cod_asignatura = '" + ID + "'";
        try {
            st = conexion().createStatement();
            respuestaBD = st.executeQuery(consultaSQL);
            while (respuestaBD.next()) {
                String cupos = respuestaBD.getString("creditos");
                ObjetoVentana.AgregarMensaje("Créditos de la asignatura " + ID + " consultados.");
                return Integer.parseInt(cupos);
            }
        } catch (SQLException exc) {
            ObjetoVentana.AgregarMensaje("No fue posible consultar los créditos de la asignatura " + ID + ".");
        }
        return 0;
    } //Fin método consultar créditos de una asignatura

    public String adicionarAsignatura(int ID, String Materia) { //Inicio método adicionar asignaturas en BD
        consultaSQL = "INSERT INTO matriculas VALUES(?,?)";
        try {
            sentenciaSQL = conexion().prepareStatement(consultaSQL);
            sentenciaSQL.setInt(1, ID);
            sentenciaSQL.setString(2, Materia);
            // insert into libro values(1010,"la Hojarasca",1955,1,1,95000);
            int filasInsertadas = sentenciaSQL.executeUpdate();
            if (filasInsertadas > 0) {
                ObjetoVentana.AgregarMensaje("Asignatura '" + Materia + "' matriculada por '" + ID + "'.");
                return "Asignatura matriculada con éxito";
            }
        } catch (SQLException ex) {
            ObjetoVentana.AgregarMensaje("No fue posible matricular la asignatura '" + Materia + "', solicitada por '" + ID + "'.");
        }
        return "Error al matricular asignatura";
    } //Fin método adicionar asignaturas en BD

    public String cancelarAsignatura(int ID, String Materia) { //Inicio método cancelar asignaturas en BD
        consultaSQL = "DELETE FROM matriculas WHERE codigo_de_estudiante = ? AND codigo_de_asignatura = ?";
        try {
            sentenciaSQL = conexion().prepareStatement(consultaSQL);
            sentenciaSQL.setInt(1, ID);
            sentenciaSQL.setString(2, Materia);
            int rowsDeleted = sentenciaSQL.executeUpdate();
            if (rowsDeleted > 0) {
                ObjetoVentana.AgregarMensaje("Asignatura '" + Materia + "' cancelada por '" + ID + "'.");
                return "Asignatura cancelada con éxito";
            }
        } catch (SQLException ex) {
            ObjetoVentana.AgregarMensaje("No fue posible cancelar la asignatura '" + Materia + "', solicitada por '" + ID + "'.");
        }
        return "No fue posible cancelar la asignatura";
    } //Fin método cancelar asignatura en BD

    public String actualizarCreditos(int ID, int creditos) { //Inicio método actualizar créditos de un estudiante.
        consultaSQL = "UPDATE estudiantes " + "SET creditos =" + creditos + "WHERE  cod_estudiante = " + ID;
        try {
            PreparedStatement statement = conexion().prepareStatement(consultaSQL);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                ObjetoVentana.AgregarMensaje("Créditos de '" + ID + "' actualizados correctamente.");
                return "El registro fue actualizado exitosamente !";
            }
        } catch (SQLException exc) {
            ObjetoVentana.AgregarMensaje("No fue posible actualizar los créditos de '" + ID + "'.");
        }
        return "No se pudo actualizar los créditos";
    } //Fin método actualizar créditos de un estudiante.

    public String consultarCupos(String ID) { //Inicio método consultar cupos en una asignatura
        consultaSQL = "select cupos from asignaturas Where cod_asignatura = '" + ID + "'";
        int num_cupos = 0;
        String cupos;
        try {
            st = conexion().createStatement();
            respuestaBD = st.executeQuery(consultaSQL);
            while (respuestaBD.next()) {
                cupos = respuestaBD.getString("cupos") + "";
                num_cupos = Integer.parseInt(cupos);
                ObjetoVentana.AgregarMensaje("Cupos de '" + ID + "' consultados correctamente.");
            }
        } catch (SQLException exc) {
            ObjetoVentana.AgregarMensaje("No fue posible consultar los cupos de '" + ID + "'.");
        }
        return num_cupos + "";
    } //Fin método consultar cupos en una asignatura

    public String actualizarCupos(String ID, int cupos) { //Inicio método actualizar cupos en una asignatura
        consultaSQL = "UPDATE asignaturas " + "SET cupos=" + cupos + "WHERE  cod_asignatura= '" + ID + "'";
        try {
            sentenciaSQL = conexion().prepareStatement(consultaSQL);
            int rowsUpdated = sentenciaSQL.executeUpdate();
            if (rowsUpdated > 0) {
                ObjetoVentana.AgregarMensaje("Cupos de '" + ID + "' actualizados correctamente.");
                return "Matricula exitosa";
            }
        } catch (SQLException exc) {
            ObjetoVentana.AgregarMensaje("No fue posible actualizar los cupos de '" + ID + "'.");
        }
        return "Error";
    } //Fin método actualizar cupos en una asignatura

} //Fin clase BD

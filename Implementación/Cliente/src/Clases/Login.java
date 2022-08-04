/* Hecho por:
    - Carlos Andrés Cáceres (202126639)
    - Diego Fernando Victoria (201941366)
Proyecto final - Programación interactiva - Universidad del Valle
 */
package Clases;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame { //Inicio ventana Login

    //Inicio variables y objetos globales
    GestionMatricula ObjetoGestion = new GestionMatricula();
    Cliente ObjetoCliente = new Cliente();
    Icon IconoUsuario = new ImageIcon(getClass().getResource("/Imagenes/Usuario.png"));
    Icon IconoInstrucciones = new ImageIcon(getClass().getResource("/Imagenes/Instrucciones.png"));
    //Fin variables y objetos globales

    public Login() { //Inicio constructor
        initComponents();
        this.setLocationRelativeTo(null);
    } //Fin constructor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_Principal = new javax.swing.JPanel();
        JL_LogoUnivalle = new javax.swing.JLabel();
        JL_Titulo = new javax.swing.JLabel();
        JL_SolicitudCodigo = new javax.swing.JLabel();
        JT_CodigoEstudiante = new javax.swing.JTextField();
        Bt_Ingresar = new javax.swing.JButton();
        Bt_Limpiar = new javax.swing.JButton();
        Bt_Creditos = new javax.swing.JButton();
        Bt_Instrucciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Inicio");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        JP_Principal.setBackground(new java.awt.Color(255, 255, 255));
        JP_Principal.setForeground(new java.awt.Color(51, 51, 51));

        JL_LogoUnivalle.setForeground(new java.awt.Color(204, 0, 0));
        JL_LogoUnivalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Univalle.gif"))); // NOI18N

        JL_Titulo.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        JL_Titulo.setForeground(new java.awt.Color(255, 0, 0));
        JL_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Titulo.setText("Gestor de cursos");

        JL_SolicitudCodigo.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JL_SolicitudCodigo.setForeground(new java.awt.Color(51, 51, 51));
        JL_SolicitudCodigo.setText("Ingrese su código de estudiante seguido del código del programa:");

        JT_CodigoEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        JT_CodigoEstudiante.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JT_CodigoEstudiante.setForeground(new java.awt.Color(51, 51, 51));
        JT_CodigoEstudiante.setToolTipText("Código de estudiante - Código del programa académico");
        JT_CodigoEstudiante.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));
        JT_CodigoEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JT_CodigoEstudianteKeyTyped(evt);
            }
        });

        Bt_Ingresar.setBackground(new java.awt.Color(255, 255, 255));
        Bt_Ingresar.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        Bt_Ingresar.setForeground(new java.awt.Color(51, 51, 51));
        Bt_Ingresar.setText("Ingresar");
        Bt_Ingresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        Bt_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_IngresarActionPerformed(evt);
            }
        });

        Bt_Limpiar.setBackground(new java.awt.Color(255, 255, 255));
        Bt_Limpiar.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        Bt_Limpiar.setForeground(new java.awt.Color(51, 51, 51));
        Bt_Limpiar.setText("Limpiar");
        Bt_Limpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        Bt_Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_LimpiarActionPerformed(evt);
            }
        });

        Bt_Creditos.setBackground(new java.awt.Color(255, 255, 255));
        Bt_Creditos.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        Bt_Creditos.setForeground(new java.awt.Color(51, 51, 51));
        Bt_Creditos.setText("Créditos");
        Bt_Creditos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        Bt_Creditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_CreditosActionPerformed(evt);
            }
        });

        Bt_Instrucciones.setBackground(new java.awt.Color(255, 255, 255));
        Bt_Instrucciones.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        Bt_Instrucciones.setForeground(new java.awt.Color(51, 51, 51));
        Bt_Instrucciones.setText("Instrucciones");
        Bt_Instrucciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        Bt_Instrucciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_InstruccionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_PrincipalLayout = new javax.swing.GroupLayout(JP_Principal);
        JP_Principal.setLayout(JP_PrincipalLayout);
        JP_PrincipalLayout.setHorizontalGroup(
            JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_SolicitudCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(JP_PrincipalLayout.createSequentialGroup()
                        .addComponent(JL_LogoUnivalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JL_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(JT_CodigoEstudiante)
                    .addGroup(JP_PrincipalLayout.createSequentialGroup()
                        .addComponent(Bt_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bt_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP_PrincipalLayout.createSequentialGroup()
                        .addComponent(Bt_Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bt_Instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JP_PrincipalLayout.setVerticalGroup(
            JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JL_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JL_LogoUnivalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JL_SolicitudCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JT_CodigoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_Instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_IngresarActionPerformed
        if (!JT_CodigoEstudiante.getText().equals("")) { //En caso de ingresar un código...
            ObjetoCliente.ConectarCliente("Confirmar código-" + JT_CodigoEstudiante.getText());
            if (ObjetoCliente.respuestaServidor.equals("true")) { //Si el código ingresado existe...
                ObjetoGestion.setVisible(true);
                this.setVisible(false);
                ObjetoCliente.ConectarCliente("Asignar datos-" + JT_CodigoEstudiante.getText());
                ObjetoGestion.RespuestaBD = ObjetoCliente.respuestaServidor;
                ObjetoGestion.AsignarDatos();
                ObjetoGestion.LlenarTabla();
            } else { //Si el código ingresado no existe...
                JOptionPane.showMessageDialog(null, "El código ingresado no se encuentra registrado.\nIntente nuevamente.", "Error", 0);
            }
        } else { //En caso de no ingresar un código de estudiante...
            JOptionPane.showMessageDialog(null, "Ingrese el código del estudiante para continuar.\nIntente nuevamente.", "Error", 0);
        }
    }//GEN-LAST:event_Bt_IngresarActionPerformed

    private void Bt_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_LimpiarActionPerformed
        JT_CodigoEstudiante.setText(null);
    }//GEN-LAST:event_Bt_LimpiarActionPerformed

    private void Bt_CreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_CreditosActionPerformed
        JOptionPane.showMessageDialog(null, "Hecho por:\n   - Carlos Andrés Cáceres (202126639)"
                + "\n   - Diego Fernando Victoria (201941366)\nProyecto final\nProgramación interactiva\nUniversidad del Valle"
                + "\nPrimer periodo de 2021", "Proyecto final", -1, IconoUsuario);
    }//GEN-LAST:event_Bt_CreditosActionPerformed

    private void Bt_InstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_InstruccionesActionPerformed
        JOptionPane.showMessageDialog(null, "1. Para ingresar, escriba su código de estudiante."
                + "\n2. Para matricular o cancelar una asignatura, ingrese el código de esta, seleccione el botón"
                + "\n    adicionar o cancelar y por último confirmar."
                + "\n3. Cada vez que matricule o cancele una asignatura, los registros de la tabla se actualizarán."
                + "\n4. La tabla permite visualizar los cursos que tiene matriculados, y los que hay disponibles."
                + "\n5. El número de créditos debe ser mayor o igual a 6 y menor o igual a 18."
                + "\n6. Para matricular un curso, este debe contar con cupos disponibles."
                + "\n7. Para ver los registros del sistema, presione el botón dedicado para ello."
                + "", "Instrucciones gestor de cursos", -1, IconoInstrucciones);
    }//GEN-LAST:event_Bt_InstruccionesActionPerformed

    private void JT_CodigoEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_CodigoEstudianteKeyTyped
        char caracter = evt.getKeyChar();
        if (Character.isLetter(caracter)) { //Si se ingresa una letra...
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese el código númerico del estudiante!", "Error", 0);
        }
        if (JT_CodigoEstudiante.getText().length() >= 8) { //Si se supera el máximo de carácteres...
            getToolkit().beep();
            evt.consume();
            JT_CodigoEstudiante.setText(null);
            JOptionPane.showMessageDialog(null, "Ha ingresado el máximo de dígitos permitidos!", "Error", 0);
        }
    }//GEN-LAST:event_JT_CodigoEstudianteKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int eleccion = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la aplicación?", "Advertencia", JOptionPane.YES_NO_OPTION, 2);
        if (eleccion == JOptionPane.YES_OPTION) { //En caso de desear cerrar la aplicación...
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) { //Inicio método principal
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    } //Fin método principal

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Creditos;
    private javax.swing.JButton Bt_Ingresar;
    private javax.swing.JButton Bt_Instrucciones;
    private javax.swing.JButton Bt_Limpiar;
    private javax.swing.JLabel JL_LogoUnivalle;
    private javax.swing.JLabel JL_SolicitudCodigo;
    private javax.swing.JLabel JL_Titulo;
    private javax.swing.JPanel JP_Principal;
    private javax.swing.JTextField JT_CodigoEstudiante;
    // End of variables declaration//GEN-END:variables

} //Fin ventana Login

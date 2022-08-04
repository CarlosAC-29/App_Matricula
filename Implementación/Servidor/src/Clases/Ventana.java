/* Hecho por:
    - Carlos Andrés Cáceres (202126639)
    - Diego Fernando Victoria (201941366)
Proyecto final - Programación interactiva - Universidad del Valle
 */
package Clases;

import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame { //Inicio clase Ventana

    //Inicio variables y objetos globales
    BD ObjetoBD = new BD();
    //Fin variables y objetos globales

    public Ventana() { //Inicio constructor
        initComponents();
        setLocationRelativeTo(null);
        JTArea_Detalles.setText(">> Servidor iniciado\n"
                + "\n"
                + ">> Recomendaciones e información relevante:\n"
                + ">> 1. La conexión con la base de datos se encuentra en el puerto: " + ObjetoBD.puertoBD + "\n"
                + "          y la contraseña de PGAdmin 4 es: " + ObjetoBD.password + "\n"
                + ">> 2. Para finalizar la conexión cierre esta ventana\n"
                + ">> 3. Para que sea posible la ejecución del cliente, es necesario que \n"
                + "          el servidor siempre esté en ejecución.\n"
                + ">> 4. En esta ventana se registrará toda la información de los procesos\n"
                + "          llevados a cabo entre el cliente y el servidor.\n\n"
                + ">> Procesos:\n");
    } //Fin constructor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_Principal = new javax.swing.JPanel();
        ScrollTextArea = new javax.swing.JScrollPane();
        JTArea_Detalles = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Servidor");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        JPanel_Principal.setBackground(new java.awt.Color(0, 0, 0));
        JPanel_Principal.setForeground(new java.awt.Color(255, 255, 255));

        ScrollTextArea.setBackground(new java.awt.Color(0, 0, 0));
        ScrollTextArea.setForeground(new java.awt.Color(255, 255, 255));
        ScrollTextArea.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JTArea_Detalles.setEditable(false);
        JTArea_Detalles.setBackground(new java.awt.Color(0, 0, 0));
        JTArea_Detalles.setColumns(20);
        JTArea_Detalles.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JTArea_Detalles.setForeground(new java.awt.Color(255, 255, 255));
        JTArea_Detalles.setLineWrap(true);
        JTArea_Detalles.setRows(5);
        JTArea_Detalles.setWrapStyleWord(true);
        ScrollTextArea.setViewportView(JTArea_Detalles);

        javax.swing.GroupLayout JPanel_PrincipalLayout = new javax.swing.GroupLayout(JPanel_Principal);
        JPanel_Principal.setLayout(JPanel_PrincipalLayout);
        JPanel_PrincipalLayout.setHorizontalGroup(
            JPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        JPanel_PrincipalLayout.setVerticalGroup(
            JPanel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int eleccion = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la conexión con la base de datos?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            AgregarMensaje("Cierre del servidor cancelado.");
        }
    }//GEN-LAST:event_formWindowClosing

    public void AgregarMensaje(String Mensaje) { //Inicio método agregar información al panel de datos del servidor.
        JTArea_Detalles.append("\n>> " + Mensaje + ".");
        System.out.println("\n>> " + Mensaje);
    } //Fin método agregar información al panel de datos del servidor.

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_Principal;
    private javax.swing.JTextArea JTArea_Detalles;
    private javax.swing.JScrollPane ScrollTextArea;
    // End of variables declaration//GEN-END:variables

} //Fin clase Ventana

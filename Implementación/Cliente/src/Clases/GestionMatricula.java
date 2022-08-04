/* Hecho por:
    - Carlos Andrés Cáceres (202126639)
    - Diego Fernando Victoria (201941366)
Proyecto final - Programación interactiva - Universidad del Valle
 */
package Clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GestionMatricula extends javax.swing.JFrame { //Inicio ventana GestionMatricula

    //Inicio variables y objetos globales
    static Login ObjetoLogin = new Login();
    static Cliente ObjetoCliente = new Cliente();
    String RespuestaBD;
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    int OperacionCreditos, cupos;
    //Fin variables y objetos globales

    public GestionMatricula() { //Inicio constructor
        initComponents();
        this.setLocationRelativeTo(null);
    } //Fin constructor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtGrupo = new javax.swing.ButtonGroup();
        JP_Principal = new javax.swing.JPanel();
        JL_Titulo = new javax.swing.JLabel();
        JL_LogoUnivalle = new javax.swing.JLabel();
        JTB_AdicionarCurso = new javax.swing.JToggleButton();
        JTB_CancelarCurso = new javax.swing.JToggleButton();
        JScroll_Tabla = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        JL_MostrarCodigo = new javax.swing.JLabel();
        JL_Codigo = new javax.swing.JLabel();
        JL_MostrarNombre = new javax.swing.JLabel();
        JL_Nombre = new javax.swing.JLabel();
        Separador = new javax.swing.JSeparator();
        JL_IconoLibros = new javax.swing.JLabel();
        JL_MostrarPrograma = new javax.swing.JLabel();
        JL_Programa = new javax.swing.JLabel();
        JL_MostrarPrograma1 = new javax.swing.JLabel();
        JL_Creditos = new javax.swing.JLabel();
        JL_MostrarCurso = new javax.swing.JLabel();
        Bt_Confirmar = new javax.swing.JButton();
        JT_CodigoCurso = new javax.swing.JTextField();
        SeparadorInferior = new javax.swing.JSeparator();
        Bt_Regresar = new javax.swing.JButton();
        Bt_Registros = new javax.swing.JButton();
        JTB_CursosDisponibles = new javax.swing.JToggleButton();
        JTB_CursosMatriculados = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestor de cursos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        JP_Principal.setBackground(new java.awt.Color(255, 255, 255));
        JP_Principal.setEnabled(false);

        JL_Titulo.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        JL_Titulo.setForeground(new java.awt.Color(255, 0, 0));
        JL_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Titulo.setText("Gestor de cursos");
        JL_Titulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));

        JL_LogoUnivalle.setForeground(new java.awt.Color(204, 0, 0));
        JL_LogoUnivalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo Univalle.gif"))); // NOI18N

        JTB_AdicionarCurso.setBackground(new java.awt.Color(255, 255, 255));
        JTB_AdicionarCurso.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JTB_AdicionarCurso.setForeground(new java.awt.Color(51, 51, 51));
        JTB_AdicionarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Adicionar.png"))); // NOI18N
        JTB_AdicionarCurso.setText("Adicionar curso");
        JTB_AdicionarCurso.setToolTipText("Para matricular un curso.");
        JTB_AdicionarCurso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        JTB_AdicionarCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTB_AdicionarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTB_AdicionarCursoActionPerformed(evt);
            }
        });

        JTB_CancelarCurso.setBackground(new java.awt.Color(255, 255, 255));
        JTB_CancelarCurso.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JTB_CancelarCurso.setForeground(new java.awt.Color(51, 51, 51));
        JTB_CancelarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        JTB_CancelarCurso.setText("Cancelar curso");
        JTB_CancelarCurso.setToolTipText("Para cancelar un curso.");
        JTB_CancelarCurso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        JTB_CancelarCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTB_CancelarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTB_CancelarCursoActionPerformed(evt);
            }
        });

        JScroll_Tabla.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        JScroll_Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Tabla.setBackground(new java.awt.Color(255, 255, 255));
        Tabla.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        Tabla.setForeground(new java.awt.Color(51, 51, 51));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Cupos", "Créditos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setEnabled(false);
        JScroll_Tabla.setViewportView(Tabla);

        JL_MostrarCodigo.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JL_MostrarCodigo.setForeground(new java.awt.Color(51, 51, 51));
        JL_MostrarCodigo.setText("Código de estudiante:");
        JL_MostrarCodigo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        JL_Codigo.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JL_Codigo.setForeground(new java.awt.Color(51, 51, 51));
        JL_Codigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Codigo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JL_Codigo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));

        JL_MostrarNombre.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JL_MostrarNombre.setForeground(new java.awt.Color(51, 51, 51));
        JL_MostrarNombre.setText("Nombre del estudiante:");
        JL_MostrarNombre.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        JL_Nombre.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JL_Nombre.setForeground(new java.awt.Color(51, 51, 51));
        JL_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Nombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JL_Nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));

        Separador.setBackground(new java.awt.Color(255, 0, 0));
        Separador.setForeground(new java.awt.Color(255, 255, 255));
        Separador.setOrientation(javax.swing.SwingConstants.VERTICAL);

        JL_IconoLibros.setBackground(new java.awt.Color(255, 255, 255));
        JL_IconoLibros.setForeground(new java.awt.Color(51, 51, 51));
        JL_IconoLibros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_IconoLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Libros.png"))); // NOI18N
        JL_IconoLibros.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));

        JL_MostrarPrograma.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JL_MostrarPrograma.setForeground(new java.awt.Color(51, 51, 51));
        JL_MostrarPrograma.setText("Programa:");
        JL_MostrarPrograma.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        JL_Programa.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JL_Programa.setForeground(new java.awt.Color(51, 51, 51));
        JL_Programa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Programa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JL_Programa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));

        JL_MostrarPrograma1.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JL_MostrarPrograma1.setForeground(new java.awt.Color(51, 51, 51));
        JL_MostrarPrograma1.setText("Créditos:");
        JL_MostrarPrograma1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        JL_Creditos.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JL_Creditos.setForeground(new java.awt.Color(51, 51, 51));
        JL_Creditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_Creditos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JL_Creditos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));

        JL_MostrarCurso.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JL_MostrarCurso.setForeground(new java.awt.Color(51, 51, 51));
        JL_MostrarCurso.setText("Código asignatura:");
        JL_MostrarCurso.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JL_MostrarCurso.setEnabled(false);

        Bt_Confirmar.setBackground(new java.awt.Color(255, 255, 255));
        Bt_Confirmar.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        Bt_Confirmar.setForeground(new java.awt.Color(51, 51, 51));
        Bt_Confirmar.setText("Confirmar");
        Bt_Confirmar.setToolTipText("Agregará o cancelará la asignatura solicitada.");
        Bt_Confirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        Bt_Confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Confirmar.setEnabled(false);
        Bt_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_ConfirmarActionPerformed(evt);
            }
        });

        JT_CodigoCurso.setBackground(new java.awt.Color(255, 255, 255));
        JT_CodigoCurso.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JT_CodigoCurso.setForeground(new java.awt.Color(51, 51, 51));
        JT_CodigoCurso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JT_CodigoCurso.setToolTipText("Código del curso");
        JT_CodigoCurso.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));
        JT_CodigoCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        JT_CodigoCurso.setEnabled(false);
        JT_CodigoCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JT_CodigoCursoKeyTyped(evt);
            }
        });

        SeparadorInferior.setBackground(new java.awt.Color(255, 255, 255));
        SeparadorInferior.setForeground(new java.awt.Color(51, 51, 51));

        Bt_Regresar.setBackground(new java.awt.Color(255, 255, 255));
        Bt_Regresar.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        Bt_Regresar.setForeground(new java.awt.Color(51, 51, 51));
        Bt_Regresar.setText("Regresar");
        Bt_Regresar.setToolTipText("Regresa a la pestaña de login.");
        Bt_Regresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        Bt_Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_RegresarActionPerformed(evt);
            }
        });

        Bt_Registros.setBackground(new java.awt.Color(255, 255, 255));
        Bt_Registros.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        Bt_Registros.setForeground(new java.awt.Color(51, 51, 51));
        Bt_Registros.setText("Abrir archivo de registros");
        Bt_Registros.setToolTipText("Abre el bloc con la información de los cursos matriculados y cancelados.");
        Bt_Registros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        Bt_Registros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bt_Registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_RegistrosActionPerformed(evt);
            }
        });

        JTB_CursosDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        BtGrupo.add(JTB_CursosDisponibles);
        JTB_CursosDisponibles.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JTB_CursosDisponibles.setForeground(new java.awt.Color(51, 51, 51));
        JTB_CursosDisponibles.setText("Cursos disponibles");
        JTB_CursosDisponibles.setToolTipText("Listar cursos disponibles para matricular");
        JTB_CursosDisponibles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        JTB_CursosDisponibles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTB_CursosDisponibles.setPreferredSize(new java.awt.Dimension(103, 20));
        JTB_CursosDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTB_CursosDisponiblesActionPerformed(evt);
            }
        });

        JTB_CursosMatriculados.setBackground(new java.awt.Color(255, 255, 255));
        BtGrupo.add(JTB_CursosMatriculados);
        JTB_CursosMatriculados.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        JTB_CursosMatriculados.setForeground(new java.awt.Color(51, 51, 51));
        JTB_CursosMatriculados.setSelected(true);
        JTB_CursosMatriculados.setText("Cursos matriculados");
        JTB_CursosMatriculados.setToolTipText("Listar cursos matriculados por el estudiante.");
        JTB_CursosMatriculados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        JTB_CursosMatriculados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTB_CursosMatriculados.setPreferredSize(new java.awt.Dimension(114, 20));
        JTB_CursosMatriculados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTB_CursosMatriculadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_PrincipalLayout = new javax.swing.GroupLayout(JP_Principal);
        JP_Principal.setLayout(JP_PrincipalLayout);
        JP_PrincipalLayout.setHorizontalGroup(
            JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SeparadorInferior)
                    .addComponent(JScroll_Tabla)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_PrincipalLayout.createSequentialGroup()
                        .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JP_PrincipalLayout.createSequentialGroup()
                                .addComponent(JL_LogoUnivalle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JL_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11)
                                .addComponent(JL_IconoLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(JP_PrincipalLayout.createSequentialGroup()
                                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_PrincipalLayout.createSequentialGroup()
                                            .addComponent(JL_MostrarCodigo)
                                            .addGap(26, 26, 26))
                                        .addGroup(JP_PrincipalLayout.createSequentialGroup()
                                            .addComponent(JL_MostrarNombre)
                                            .addGap(16, 16, 16)))
                                    .addGroup(JP_PrincipalLayout.createSequentialGroup()
                                        .addComponent(JL_MostrarCurso)
                                        .addGap(42, 42, 42)))
                                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JL_Codigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JL_Nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                    .addComponent(JT_CodigoCurso))
                                .addGap(17, 17, 17)))
                        .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTB_CancelarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTB_AdicionarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JP_PrincipalLayout.createSequentialGroup()
                                .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JP_PrincipalLayout.createSequentialGroup()
                                        .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JL_MostrarPrograma)
                                            .addComponent(JL_MostrarPrograma1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JL_Creditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(JL_Programa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(Bt_Confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(JP_PrincipalLayout.createSequentialGroup()
                        .addComponent(JTB_CursosMatriculados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(JTB_CursosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP_PrincipalLayout.createSequentialGroup()
                        .addComponent(Bt_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(Bt_Registros, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JP_PrincipalLayout.setVerticalGroup(
            JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JP_PrincipalLayout.createSequentialGroup()
                        .addComponent(JTB_AdicionarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTB_CancelarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(JL_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JL_LogoUnivalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JL_IconoLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_PrincipalLayout.createSequentialGroup()
                        .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JP_PrincipalLayout.createSequentialGroup()
                                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JL_MostrarCodigo)
                                    .addComponent(JL_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JL_MostrarNombre)
                                    .addComponent(JL_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JP_PrincipalLayout.createSequentialGroup()
                                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JL_Programa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JL_MostrarPrograma))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JL_Creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JL_MostrarPrograma1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bt_Confirmar)
                            .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JL_MostrarCurso)
                                .addComponent(JT_CodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Separador, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTB_CursosDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTB_CursosMatriculados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparadorInferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScroll_Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Regresar)
                    .addComponent(Bt_Registros))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void AsignarDatos() { //Inicio método de asignar datos.
        String[] DatosEstudiante = RespuestaBD.split("-");
        JL_Codigo.setText(DatosEstudiante[0]);
        JL_Nombre.setText(DatosEstudiante[1]);
        switch (DatosEstudiante[2]) { //Asignar programa académico.
            case "Ingenieria en Sistemas":
                JL_Programa.setText("3743");
                break;
            case "Tecnología en Sistemas":
                JL_Programa.setText("2711");
                break;
            default:
                JL_Programa.setText("Error");
                break;
        }
        JL_Creditos.setText(Math.round(Double.parseDouble(DatosEstudiante[3])) + "");
    } //Fin método de asignar datos.

    public void LlenarTabla() { //Inicio método llenar campos de la tabla.
        LimpiarTabla();
        if (JTB_CursosMatriculados.isSelected() == true) {
            ObjetoCliente.ConectarCliente("Actualizar tabla matricula-" + JL_Codigo.getText());
        } else if (JTB_CursosDisponibles.isSelected() == true) {
            ObjetoCliente.ConectarCliente("Actualizar tabla disponible-" + JL_Codigo.getText());
        }
        String Datos[] = ObjetoCliente.respuestaServidor.split("/");
        modelo.addColumn("Código");
        modelo.addColumn("Nombre asignatura");
        modelo.addColumn("Créditos");
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        if (JTB_CursosMatriculados.isSelected() == true) {
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(40);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(300);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(40);
        } else if (JTB_CursosDisponibles.isSelected() == true) {
            modelo.addColumn("Cupos");
            Tabla.getColumnModel().getColumn(0).setPreferredWidth(30);
            Tabla.getColumnModel().getColumn(1).setPreferredWidth(290);
            Tabla.getColumnModel().getColumn(2).setPreferredWidth(30);
            Tabla.getColumnModel().getColumn(3).setPreferredWidth(30);
            Tabla.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        }
        Tabla.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            Tabla.getColumnModel().getColumn(i).setResizable(false);
        }
        Tabla.getTableHeader().setReorderingAllowed(false);
        Tabla.setModel(modelo);
        for (String Dato : Datos) { //int i = 0; i < Datos.length; i++
            String[] Datos1 = Dato.split("-"); //String Datos1[] = Datos[i].split("-");
            modelo.addRow(Datos1);
        }
    } //Fin método llenar campos de la tabla.

    public void LimpiarTabla() { //Inicio método que elimina las columnas de la tabla.
        for (int i = (Tabla.getRowCount() - 1); i >= 0; i--) {
            modelo.removeRow(i);
        }
        modelo.setColumnCount(0);
        Tabla.setModel(modelo);
    } //Fin método que elimina las columnas de la tabla.

    public void LimpiarDatosAsignatura(boolean Accion) { //Inicio método de limpiar datos ingresados.
        JL_MostrarCurso.setEnabled(Accion);
        JT_CodigoCurso.setEnabled(Accion);
        JT_CodigoCurso.setText(null);
        Bt_Confirmar.setEnabled(Accion);
    } //Fin método de limpiar datos ingresados.

    public void escribirArchivo(String mensaje) { //Inicio método que escribe en el archivo de registros.
        File Archivo = new File("src\\Archivos\\Registros.txt");
        if (Archivo.exists()) { //Comprueba si el archivo existe.
            try {
                FileWriter fw = new FileWriter(Archivo, true);
                fw.write(mensaje + "\r\n");
                fw.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No fue posible escribir en archivo de registros.", "Error", 2);
            }
        } else { //Si el archivo no existe o no se encuentra...
            JOptionPane.showMessageDialog(null, "No ha sido posible encontrar el registro del programa.", "Error", 2);
        }
    } //Fin método que escribe en el archivo de registros.

    private void JTB_AdicionarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTB_AdicionarCursoActionPerformed
        if (JTB_CancelarCurso.isSelected() == true) {
            JTB_CancelarCurso.setSelected(false);
        } else if (JTB_AdicionarCurso.isSelected() == true) {
            LimpiarDatosAsignatura(true);
        } else {
            LimpiarDatosAsignatura(false);
        }
    }//GEN-LAST:event_JTB_AdicionarCursoActionPerformed

    private void JTB_CancelarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTB_CancelarCursoActionPerformed
        if (JTB_AdicionarCurso.isSelected() == true) {
            JTB_AdicionarCurso.setSelected(false);
        } else if (JTB_CancelarCurso.isSelected() == true) {
            LimpiarDatosAsignatura(true);
        } else {
            LimpiarDatosAsignatura(false);
        }
    }//GEN-LAST:event_JTB_CancelarCursoActionPerformed

    private void Bt_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_ConfirmarActionPerformed
        if (!JT_CodigoCurso.getText().equals("")) { //Comprobar que el campo código curso no esté vacío.
            ObjetoCliente.ConectarCliente("Codigo materia-" + JT_CodigoCurso.getText());
            if (ObjetoCliente.respuestaServidor.equals("true")) { //Confirmar si el código de asignatura existe.
                ObjetoCliente.ConectarCliente("Consultar creditos-" + JL_Codigo.getText());
                OperacionCreditos = Integer.parseInt(ObjetoCliente.respuestaServidor.replace(".0", ""));
                ObjetoCliente.ConectarCliente("Comprobar matricula-" + JL_Codigo.getText() + "-" + JT_CodigoCurso.getText());
                if ((ObjetoCliente.respuestaServidor.equals("true")) && (JTB_CancelarCurso.isSelected() == true)) {
                    //En caso que el curso esté matriculado y se desee cancelar...
                    ObjetoCliente.ConectarCliente("Creditos asignatura-" + JT_CodigoCurso.getText());
                    OperacionCreditos -= Integer.parseInt(ObjetoCliente.respuestaServidor);
                    if (OperacionCreditos >= 6) { //Comprobar si tiene disponibilidad de créditos para cancelar.
                        ObjetoCliente.ConectarCliente("Cancelar materia-" + JL_Codigo.getText() + "-" + JT_CodigoCurso.getText());
                        JOptionPane.showMessageDialog(null, ObjetoCliente.respuestaServidor, "Información", 1);
                        ObjetoCliente.ConectarCliente("Consultar cupos-" + JT_CodigoCurso.getText());
                        cupos = Integer.parseInt(ObjetoCliente.respuestaServidor);
                        ObjetoCliente.ConectarCliente("Actualizar cupos-" + JT_CodigoCurso.getText() + "-" + (cupos + 1));
                        JL_Creditos.setText(OperacionCreditos + "");
                        ObjetoCliente.ConectarCliente("Actualizar creditos-" + JL_Codigo.getText() + "-" + OperacionCreditos);
                        LlenarTabla();
                        escribirArchivo("El estudiante " + JL_Codigo.getText() + " canceló la asignatura " + JT_CodigoCurso.getText() + ".\n"
                                + "Ahora tiene " + JL_Creditos.getText() + " créditos.");
                    } else { //Si no tiene disponibilidad de créditos para cancelar...
                        JOptionPane.showMessageDialog(null, "No puede tener menos de 6 créditos matriculados.", "Error", 2);
                    }
                } else if ((ObjetoCliente.respuestaServidor.equals("false")) && (JTB_AdicionarCurso.isSelected() == true)) {
                    //En caso de que el curso no esté matriculado y se desee adicionar...
                    ObjetoCliente.ConectarCliente("Consultar cupos-" + JT_CodigoCurso.getText());
                    cupos = Integer.parseInt(ObjetoCliente.respuestaServidor);
                    if (Integer.parseInt(ObjetoCliente.respuestaServidor) >= 1) { //Comprobar disponibilidad de cupos en la asignatura...
                        ObjetoCliente.ConectarCliente("Creditos asignatura-" + JT_CodigoCurso.getText());
                        OperacionCreditos += Integer.parseInt(ObjetoCliente.respuestaServidor);
                        if (OperacionCreditos <= 18) { //Comprobar si tiene disponibilidad de créditos para matricular.
                            ObjetoCliente.ConectarCliente("Matricular materia-" + JL_Codigo.getText() + "-" + JT_CodigoCurso.getText());
                            JOptionPane.showMessageDialog(null, ObjetoCliente.respuestaServidor, "Información", 1);
                            ObjetoCliente.ConectarCliente("Actualizar cupos-" + JT_CodigoCurso.getText() + "-" + (cupos - 1));
                            JL_Creditos.setText(OperacionCreditos + "");
                            ObjetoCliente.ConectarCliente("Actualizar creditos-" + JL_Codigo.getText() + "-" + OperacionCreditos);
                            LlenarTabla();
                            escribirArchivo("El estudiante " + JL_Codigo.getText() + " matriculó la asignatura " + JT_CodigoCurso.getText() + ".\n"
                                    + "Ahora tiene " + JL_Creditos.getText() + " créditos.");
                        } else { //Si no tiene disponibilidad de créditos para matricular...
                            JOptionPane.showMessageDialog(null, "No puede matricular más de 18 créditos.", "Error", 2);
                        }
                    } else if (Integer.parseInt(ObjetoCliente.respuestaServidor) <= 0) { //Si no hay disponibilidad de cupos en la asignatura...
                        JOptionPane.showMessageDialog(null, "El curso que desea matricular no cuenta con cupos disponibles.", "Error", 2);
                    }
                } else if ((ObjetoCliente.respuestaServidor.equals("false")) && (JTB_CancelarCurso.isSelected() == true)) {
                    //En caso de que el curso no esté matriculado y se desee cancelarlo.
                    JOptionPane.showMessageDialog(null, "No es posible cancelar un curso que no tiene matriculado.\nIntente nuevamente.", "Error", 2);
                } else if ((ObjetoCliente.respuestaServidor.equals("true")) && (JTB_AdicionarCurso.isSelected() == true)) {
                    //En caso de que el curso ya esté matriculado y se desee volver a matricularlo.
                    JOptionPane.showMessageDialog(null, "No es posible matricular un curso que ya tiene matriculado.\nIntente nuevamente.", "Error", 2);
                } else { //En cualquier otro caso...
                    JOptionPane.showMessageDialog(null, "No sabemos cómo has generado esta salida, felicitaciones.\nIntente nuevamente.", "Error", 2);
                }
            } else { //Si el código de asignatura no existe...
                JOptionPane.showMessageDialog(null, "El código de asignatura ingresado no existe.\nIntente nuevamente.", "Error", 2);
            }
        } else { //Si el código del curso está vacío...
            JOptionPane.showMessageDialog(null, "Para adicionar un curso, ingrese el código de este\ny presione confirmar.", "Error", 2);
        }
        JTB_AdicionarCurso.setSelected(false);
        JTB_CancelarCurso.setSelected(false);
        LimpiarDatosAsignatura(false);
    }//GEN-LAST:event_Bt_ConfirmarActionPerformed

    private void JT_CodigoCursoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_CodigoCursoKeyTyped
        if (JT_CodigoCurso.getText().length() >= 8) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ha ingresado el máximo de dígitos permitidos!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JT_CodigoCursoKeyTyped

    private void Bt_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_RegresarActionPerformed
        LimpiarTabla();
        ObjetoLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Bt_RegresarActionPerformed

    private void Bt_RegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_RegistrosActionPerformed
        try {
            Runtime.getRuntime().exec("cmd /c start src/Archivos/Registros.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No fue posible abrir el documento.", "Error", 2);
        }
    }//GEN-LAST:event_Bt_RegistrosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int eleccion = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la aplicación?", "Advertencia", JOptionPane.YES_NO_OPTION, 2);
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void JTB_CursosMatriculadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTB_CursosMatriculadosActionPerformed
        LlenarTabla();
    }//GEN-LAST:event_JTB_CursosMatriculadosActionPerformed

    private void JTB_CursosDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTB_CursosDisponiblesActionPerformed
        LlenarTabla();
    }//GEN-LAST:event_JTB_CursosDisponiblesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BtGrupo;
    private javax.swing.JButton Bt_Confirmar;
    private javax.swing.JButton Bt_Registros;
    private javax.swing.JButton Bt_Regresar;
    private javax.swing.JLabel JL_Codigo;
    private javax.swing.JLabel JL_Creditos;
    private javax.swing.JLabel JL_IconoLibros;
    private javax.swing.JLabel JL_LogoUnivalle;
    private javax.swing.JLabel JL_MostrarCodigo;
    private javax.swing.JLabel JL_MostrarCurso;
    private javax.swing.JLabel JL_MostrarNombre;
    private javax.swing.JLabel JL_MostrarPrograma;
    private javax.swing.JLabel JL_MostrarPrograma1;
    private javax.swing.JLabel JL_Nombre;
    private javax.swing.JLabel JL_Programa;
    private javax.swing.JLabel JL_Titulo;
    private javax.swing.JPanel JP_Principal;
    private javax.swing.JScrollPane JScroll_Tabla;
    private javax.swing.JToggleButton JTB_AdicionarCurso;
    private javax.swing.JToggleButton JTB_CancelarCurso;
    private javax.swing.JToggleButton JTB_CursosDisponibles;
    private javax.swing.JToggleButton JTB_CursosMatriculados;
    private javax.swing.JTextField JT_CodigoCurso;
    private javax.swing.JSeparator Separador;
    private javax.swing.JSeparator SeparadorInferior;
    private javax.swing.JTable Tabla;
    // End of variables declaration//GEN-END:variables

} //Fin ventana GestionMatricula 

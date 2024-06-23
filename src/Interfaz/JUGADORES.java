/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import mundial.Estadio;
import mundial.Jugador;
import mundial.Main;
import static mundial.Main.listaJugadores;

/**
 *
 * @author Carla Daniela
 */
public class JUGADORES extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public JUGADORES() {
        initComponents();
        this.setLocationRelativeTo(null);        
        List<Jugador> jugadores = Main.listaJugadores;
    
        StringBuilder jugalList = new StringBuilder();
        for (Jugador jugador : jugadores) {
            jugalList.append(jugador.mostrarInfo()).append("\n");
        }
        lista.setText(jugalList.toString());

        // Show the JScrollPane containing the JTextArea
        lista.setEditable(false); 
        lista.setVisible(true);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        VER = new javax.swing.JToggleButton();
        AREAESTADIO = new javax.swing.JScrollPane();
        lista = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        SALIR = new javax.swing.JToggleButton();
        ESTADIO = new javax.swing.JToggleButton();
        PARTIDO = new javax.swing.JToggleButton();
        JUGADORES = new javax.swing.JToggleButton();
        CREAR = new javax.swing.JToggleButton();
        BARRA = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VER.setBackground(new java.awt.Color(102, 153, 255));
        VER.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        VER.setForeground(new java.awt.Color(255, 255, 255));
        VER.setText("AGREGAR");
        VER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VERActionPerformed(evt);
            }
        });
        getContentPane().add(VER, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));

        lista.setColumns(20);
        lista.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        lista.setRows(5);
        AREAESTADIO.setViewportView(lista);

        getContentPane().add(AREAESTADIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 550, 410));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel2.setText(" MENÚ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 80, 30));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 90, 30));

        SALIR.setBackground(new java.awt.Color(255, 102, 102));
        SALIR.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        SALIR.setForeground(new java.awt.Color(255, 255, 255));
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        getContentPane().add(SALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 160, 40));

        ESTADIO.setBackground(new java.awt.Color(102, 153, 255));
        ESTADIO.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        ESTADIO.setForeground(new java.awt.Color(255, 255, 255));
        ESTADIO.setText("ESTADIOS");
        ESTADIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESTADIOActionPerformed(evt);
            }
        });
        getContentPane().add(ESTADIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 40));

        PARTIDO.setBackground(new java.awt.Color(102, 153, 255));
        PARTIDO.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        PARTIDO.setForeground(new java.awt.Color(255, 255, 255));
        PARTIDO.setText("PARTIDOS");
        PARTIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PARTIDOActionPerformed(evt);
            }
        });
        getContentPane().add(PARTIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 160, 40));

        JUGADORES.setBackground(new java.awt.Color(102, 153, 255));
        JUGADORES.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        JUGADORES.setForeground(new java.awt.Color(255, 255, 255));
        JUGADORES.setText("JUGADORES");
        JUGADORES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUGADORESActionPerformed(evt);
            }
        });
        getContentPane().add(JUGADORES, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 160, 40));

        CREAR.setBackground(new java.awt.Color(102, 153, 255));
        CREAR.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        CREAR.setForeground(new java.awt.Color(255, 255, 255));
        CREAR.setText("CREAR EQUIPOS");
        CREAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREARActionPerformed(evt);
            }
        });
        getContentPane().add(CREAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 40));

        BARRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/barra_mundial (1).png"))); // NOI18N
        BARRA.setText("jLabel2");
        getContentPane().add(BARRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 480));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_mundial.png"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CREARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREARActionPerformed
        new EQUIPOS().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CREARActionPerformed

    private void JUGADORESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUGADORESActionPerformed

    }//GEN-LAST:event_JUGADORESActionPerformed

    private void PARTIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PARTIDOActionPerformed
        new JUGAR().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PARTIDOActionPerformed

    private void ESTADIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESTADIOActionPerformed
        new ESTADIOS().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ESTADIOActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SALIRActionPerformed

    private void VERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VERActionPerformed
        JFrame frame = new JFrame("Información del Jugador");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establecer el fondo azul claro
        frame.getContentPane().setBackground(new Color(173, 216, 230));

        // Crear panel con layout nulo
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setOpaque(false);

        // Crear y ubicar etiquetas
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setBounds(50, 50, 100, 30);
        panel.add(nombreLabel);

        JLabel edadLabel = new JLabel("Edad:");
        edadLabel.setBounds(50, 100, 100, 30);
        panel.add(edadLabel);

        JLabel posicionLabel = new JLabel("Posición:");
        posicionLabel.setBounds(50, 150, 100, 30);
        panel.add(posicionLabel);

        // Crear y ubicar campos de texto
        JTextField nombreField = new JTextField();
        nombreField.setBounds(150, 50, 200, 30);
        panel.add(nombreField);

        JTextField edadField = new JTextField();
        edadField.setBounds(150, 100, 200, 30);
        panel.add(edadField);

        JTextField posicionField = new JTextField();
        posicionField.setBounds(150, 150, 200, 30);
        panel.add(posicionField);

        // Crear y ubicar botón
        JButton aceptarButton = new JButton("Aceptar");
        aceptarButton.setBounds(150, 200, 200, 30);
        panel.add(aceptarButton);

        // Añadir acción al botón
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                int edad;
                try {
                    edad = Integer.parseInt(edadField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese una edad válida.");
                    return;
                }
                String posicion = posicionField.getText();

                // Verificar si el nombre del jugador ya está en la lista
                for (Jugador jugador : listaJugadores) {
                    if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                        JOptionPane.showMessageDialog(frame, "El jugador ya existe.");
                        return;
                    }
                }

                // Agregar el nuevo jugador a la lista
                Main.listaJugadores.add(new Jugador(nombre, edad, posicion));
                JOptionPane.showMessageDialog(frame, "Jugador agregado exitosamente.");
                frame.dispose();
            }
        });      
        // Agregar panel al marco
        frame.add(panel);
        frame.setVisible(true);
        
    }//GEN-LAST:event_VERActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JUGADORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JUGADORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JUGADORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JUGADORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JUGADORES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane AREAESTADIO;
    private javax.swing.JLabel BARRA;
    private javax.swing.JToggleButton CREAR;
    private javax.swing.JToggleButton ESTADIO;
    private javax.swing.JLabel FONDO;
    private javax.swing.JToggleButton JUGADORES;
    private javax.swing.JToggleButton PARTIDO;
    private javax.swing.JToggleButton SALIR;
    private javax.swing.JToggleButton VER;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextArea lista;
    // End of variables declaration//GEN-END:variables

}
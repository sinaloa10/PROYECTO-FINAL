/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fisica;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author ACER
 */
public class Fisica extends javax.swing.JFrame {
    double mob = (4*3.1415926535)*1E-7;
    double pi = 3.1415926535;
    double b, i, n, d, f, q, v, ang, f_l, i2;
    /**
     * Creates new form Fisica
     */
    public Fisica() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setImageLabel(imagen, "src/Images/campos.png");
        bg.add(solenoide);
        bg.add(toroidal);
        bg.add(espira);
        bg.add(cp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vueltas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        corriente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        distancia = new javax.swing.JTextField();
        titulo1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fuerza = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        carga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        velocidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        angulo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        corriente2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fuerza_longi = new javax.swing.JTextField();
        panel2 = new javax.swing.JPanel();
        cp = new javax.swing.JCheckBox();
        espira = new javax.swing.JCheckBox();
        solenoide = new javax.swing.JCheckBox();
        toroidal = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 220));

        panel1.setBackground(new java.awt.Color(102, 102, 102));

        titulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        titulo.setText("Campos magnéticos");

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel1.setText("B=");

        campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel3.setText("N=");

        vueltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vueltasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel2.setText("I=");

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel4.setText("Distancia, longitud o radio =");

        titulo1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        titulo1.setText("Fuerza magnética");

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel5.setText("F=");

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel6.setText("q =");

        carga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel7.setText("v=");

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel8.setText("Ángulo =");

        angulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anguloActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel9.setText("F/L =");

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel10.setText("I2=");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(fuerza, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(carga, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(velocidad))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(angulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel1Layout.createSequentialGroup()
                                                .addComponent(fuerza_longi, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(corriente2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(titulo)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(37, 37, 37))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vueltas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(corriente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(44, 44, 44)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(corriente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(vueltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titulo1)
                .addGap(28, 28, 28)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(fuerza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(angulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(corriente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(fuerza_longi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        panel.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 330, 390));

        panel2.setBackground(new java.awt.Color(102, 102, 102));

        cp.setText("Fuerza mágnetica entre dos conductores paralelos ");

        espira.setText("Campo magnético de una espira circular en x=0");

        solenoide.setText("Campo magnético de un solenoide");

        toroidal.setText("Campo magnético de una bobina toroidal");

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toroidal)
                    .addComponent(solenoide)
                    .addComponent(espira)
                    .addComponent(cp)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toroidal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solenoide)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(espira)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panel.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 300, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoActionPerformed

    private void vueltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vueltasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vueltasActionPerformed

    private void cargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargaActionPerformed

    private void anguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anguloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(toroidal.isSelected()){
            if (campo.getText().contains("?")) {
                this.i = Integer.parseInt(corriente.getText());
                this.n = Integer.parseInt(vueltas.getText());
                this.d = Integer.parseInt(distancia.getText());
                System.out.println((mob*n*i)/((2*pi)*d));
            }else if(vueltas.getText().equals("?")){
                this.i = Double.parseDouble(corriente.getText());
                this.b = Double.parseDouble(campo.getText());
                this.d = Double.parseDouble(distancia.getText());
                System.out.println((2*b*d*pi)/(i*mob));
            }else if(corriente.getText().equals("?")){
                this.n = Double.parseDouble(vueltas.getText());
                this.b = Double.parseDouble(campo.getText());
                this.d = Double.parseDouble(distancia.getText());
                System.out.println((2*pi*b*d)/(mob*n));
            }else if(distancia.getText().equals("?")){
                this.n = Double.parseDouble(vueltas.getText());
                this.b = Double.parseDouble(campo.getText());
                this.i = Double.parseDouble(corriente.getText());
                System.out.println((0.5*i*mob*n)/(b*pi));
            }
        }else if(solenoide.isSelected()){
            if (campo.getText().contains("?")) {
                    this.i = Integer.parseInt(corriente.getText());
                    this.n = Integer.parseInt(vueltas.getText());
                    this.d = Integer.parseInt(distancia.getText());
                    System.out.println((mob*(n/d)*i));
                }else if(vueltas.getText().equals("?")){
                    this.i = Double.parseDouble(corriente.getText());
                    this.b = Double.parseDouble(campo.getText());
                    this.d = Double.parseDouble(distancia.getText());
                    System.out.println((d*b)/(mob*i));
                }else if(corriente.getText().equals("?")){
                    this.n = Double.parseDouble(vueltas.getText());
                    this.b = Double.parseDouble(campo.getText());
                    this.d = Double.parseDouble(distancia.getText());
                    System.out.println((d*b)/(mob*n));
                }else if(distancia.getText().equals("?")){
                    this.n = Double.parseDouble(vueltas.getText());
                    this.b = Double.parseDouble(campo.getText());
                    this.i = Double.parseDouble(corriente.getText());
                    System.out.println((mob*n*i)/b);
                }
        }else if(espira.isSelected()){
                if (campo.getText().contains("?")) {
                    this.i = Double.parseDouble(corriente.getText());
                    this.d = Double.parseDouble(distancia.getText());
                    System.out.println((mob*i)/(2*d));
                }else if(corriente.getText().equals("?")){
                    this.b = Double.parseDouble(campo.getText());
                    this.d = Double.parseDouble(distancia.getText());
                    System.out.println((2*d*b)/mob);
                }else if(distancia.getText().equals("?")){
                    this.i = Double.parseDouble(corriente.getText());
                    this.b = Double.parseDouble(campo.getText());
                    System.out.println((mob*i)/(2*b));
                }
        }else if (cp.isSelected()) {
                if(fuerza_longi.getText().equals("?")){
                    this.i = Double.parseDouble(corriente.getText());
                    this.i2 = Double.parseDouble(corriente2.getText());
                    this.d = Double.parseDouble(distancia.getText());

                    System.out.println((mob*i*i2)/(2*pi*d));
                }else if(distancia.getText().equals("?")){
                    this.i = Double.parseDouble(corriente.getText());
                    this.i2 = Double.parseDouble(corriente2.getText());
                    this.f_l = Double.parseDouble(fuerza_longi.getText());

                    System.out.println((mob*i*i2)/(2*pi*(f_l)));
                }else if(corriente.getText().equals("?")){
                    this.d = Double.parseDouble(distancia.getText());
                    this.i2 = Double.parseDouble(corriente2.getText());
                    this.f_l = Double.parseDouble(fuerza_longi.getText());

                    System.out.println((2*pi*d)/(mob*(f_l)*i2));
                }else if(corriente2.getText().equals("?")){
                    this.i = Double.parseDouble(corriente.getText());
                    this.d = Double.parseDouble(distancia.getText());
                    this.f_l = Double.parseDouble(fuerza_longi.getText());

                    System.out.println((mob*pi*d)/(mob*(f_l)*i));
                }
            }else{
                if(fuerza.getText().equals("?")){
                    this.q = Double.parseDouble(carga.getText());
                    this.v = Double.parseDouble(velocidad.getText());
                    this.b = Double.parseDouble(campo.getText());
                    System.out.println(q*v*b); 
                }else if(carga.getText().equals("?")){
                    this.f = Double.parseDouble(fuerza.getText());
                    this.v = Double.parseDouble(velocidad.getText());
                    this.b = Double.parseDouble(campo.getText());
                    System.out.println(f/(v*b)); 
                }else if(campo.getText().equals("?")){
                    this.q = Double.parseDouble(carga.getText());
                    this.v = Double.parseDouble(velocidad.getText());
                    this.f = Double.parseDouble(fuerza.getText());
                    System.out.println(f/(q*v)); 
                }else if(velocidad.getText().equals("?")){
                    this.q = Double.parseDouble(carga.getText());
                    this.f = Double.parseDouble(fuerza.getText());
                    this.b = Double.parseDouble(campo.getText());
                    System.out.println(f/(q*b)); 
                }
                
        }
        
        
        
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
            java.util.logging.Logger.getLogger(Fisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fisica().setVisible(true);
            }
        });
    }
    
    private void setImageLabel(JLabel imagen, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
        imagen.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angulo;
    private javax.swing.ButtonGroup bg;
    private javax.swing.JTextField campo;
    private javax.swing.JTextField carga;
    private javax.swing.JTextField corriente;
    private javax.swing.JTextField corriente2;
    private javax.swing.JCheckBox cp;
    private javax.swing.JTextField distancia;
    private javax.swing.JCheckBox espira;
    private javax.swing.JTextField fuerza;
    private javax.swing.JTextField fuerza_longi;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JCheckBox solenoide;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JCheckBox toroidal;
    private javax.swing.JTextField velocidad;
    private javax.swing.JTextField vueltas;
    // End of variables declaration//GEN-END:variables
}

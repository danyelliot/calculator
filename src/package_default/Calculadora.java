
package package_default;

/**
 *
 * @author danyelliot
 */
public class Calculadora extends javax.swing.JFrame {
    
    double num , ans = 0  ;
    int pul = 0 , operacion ; // pul = pulsaciones
        
    public Calculadora() {
        initComponents();
    }
    public void Operaciones(){
        switch (operacion) {
            case 1 : //suma
                jTextField2.setText(jTextField2.getText()+jTextField1.getText());
                ans = num + Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                
                pul = 0 ;
                break ;
            case 2 : //resta
                jTextField2.setText(jTextField2.getText()+jTextField1.getText());
                ans = num - Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                pul = 0 ;
                break ;
            case 3 : //multiplicacion
                jTextField2.setText(jTextField2.getText()+jTextField1.getText());
                ans = num * Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                pul = 0 ;
                break ;
            case 4 : //division
                jTextField2.setText(jTextField2.getText()+jTextField1.getText());
                ans = num / Double.parseDouble(jTextField1.getText());
                jTextField1.setText(Double.toString(ans));
                pul = 0 ;
                break ;
        }      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        numero1 = new javax.swing.JButton();
        numero2 = new javax.swing.JButton();
        numero3 = new javax.swing.JButton();
        boton_resta = new javax.swing.JButton();
        numero4 = new javax.swing.JButton();
        numero5 = new javax.swing.JButton();
        numero6 = new javax.swing.JButton();
        boton_multiplicacion = new javax.swing.JButton();
        numero7 = new javax.swing.JButton();
        numero8 = new javax.swing.JButton();
        numero9 = new javax.swing.JButton();
        boton_division = new javax.swing.JButton();
        boton_ac = new javax.swing.JButton();
        boton_potencia = new javax.swing.JButton();
        boton_raiz = new javax.swing.JButton();
        boton_borrar = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        numero0 = new javax.swing.JButton();
        boton_igual = new javax.swing.JButton();
        boton_suma = new javax.swing.JButton();
        boton_answer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora DESI");
        setBackground(new java.awt.Color(204, 204, 204));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        numero1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        numero1.setText("1");
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });

        numero2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        numero2.setText("2");
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });

        numero3.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        numero3.setText("3");
        numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero3ActionPerformed(evt);
            }
        });

        boton_resta.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        boton_resta.setText("-");
        boton_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_restaActionPerformed(evt);
            }
        });

        numero4.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        numero4.setText("4");
        numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ActionPerformed(evt);
            }
        });

        numero5.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        numero5.setText("5");
        numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero5ActionPerformed(evt);
            }
        });

        numero6.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        numero6.setText("6");
        numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero6ActionPerformed(evt);
            }
        });

        boton_multiplicacion.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        boton_multiplicacion.setText("*");
        boton_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_multiplicacionActionPerformed(evt);
            }
        });

        numero7.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        numero7.setText("7");
        numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero7ActionPerformed(evt);
            }
        });

        numero8.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        numero8.setText("8");
        numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero8ActionPerformed(evt);
            }
        });

        numero9.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        numero9.setText("9");
        numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero9ActionPerformed(evt);
            }
        });

        boton_division.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        boton_division.setText("÷");
        boton_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_divisionActionPerformed(evt);
            }
        });

        boton_ac.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        boton_ac.setText("AC");
        boton_ac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_acActionPerformed(evt);
            }
        });

        boton_potencia.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        boton_potencia.setText("x^2");
        boton_potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_potenciaActionPerformed(evt);
            }
        });

        boton_raiz.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        boton_raiz.setText("√");
        boton_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_raizActionPerformed(evt);
            }
        });

        boton_borrar.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        boton_borrar.setText("←");
        boton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrarActionPerformed(evt);
            }
        });

        decimal.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        numero0.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        numero0.setText("0");

        boton_igual.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        boton_igual.setText("=");
        boton_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_igualActionPerformed(evt);
            }
        });

        boton_suma.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        boton_suma.setText("+");
        boton_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_sumaActionPerformed(evt);
            }
        });

        boton_answer.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        boton_answer.setText("Ans");
        boton_answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_answerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numero7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_division, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton_answer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_answer, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_ac, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_division, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
        jTextField1.setText(jTextField1.getText()+"1");
    }//GEN-LAST:event_numero1ActionPerformed

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
        jTextField1.setText(jTextField1.getText()+"2");
    }//GEN-LAST:event_numero2ActionPerformed

    private void numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero3ActionPerformed
        jTextField1.setText(jTextField1.getText()+"3");
    }//GEN-LAST:event_numero3ActionPerformed

    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero4ActionPerformed
        jTextField1.setText(jTextField1.getText()+"4");
    }//GEN-LAST:event_numero4ActionPerformed

    private void numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero5ActionPerformed
        jTextField1.setText(jTextField1.getText()+"5");
    }//GEN-LAST:event_numero5ActionPerformed

    private void numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero6ActionPerformed
        jTextField1.setText(jTextField1.getText()+"6");
    }//GEN-LAST:event_numero6ActionPerformed

    private void numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero7ActionPerformed
        jTextField1.setText(jTextField1.getText()+"7");
    }//GEN-LAST:event_numero7ActionPerformed

    private void numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero8ActionPerformed
        jTextField1.setText(jTextField1.getText()+"8");
    }//GEN-LAST:event_numero8ActionPerformed

    private void numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero9ActionPerformed
        jTextField1.setText(jTextField1.getText()+"9");
    }//GEN-LAST:event_numero9ActionPerformed

    private void boton_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sumaActionPerformed

        if (pul != 0){
            Operaciones();
        }
        else{
            pul++ ;
            num = Double.parseDouble(jTextField1.getText());
            //jTextField2.setText(jTextField2.getText()+" + ");
            operacion = 1 ;
            jTextField2.setText(jTextField1.getText()+" + ");
            jTextField1.setText("");
            
        }
        
    }//GEN-LAST:event_boton_sumaActionPerformed

    private void boton_answerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_answerActionPerformed
        jTextField1.setText(Double.toString(ans));
    }//GEN-LAST:event_boton_answerActionPerformed

    private void boton_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_restaActionPerformed
        if (pul != 0){
            Operaciones();
        }
        else{
            pul++ ;
            num = Double.parseDouble(jTextField1.getText());
            //jTextField2.setText(jTextField2.getText()+" + ");
            jTextField2.setText(jTextField1.getText()+" - ");
            operacion = 2 ;
            jTextField1.setText("");
        }
    }//GEN-LAST:event_boton_restaActionPerformed

    private void boton_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_multiplicacionActionPerformed
        if (pul != 0){
            Operaciones();
        }
        else{
            pul++ ;
            num = Double.parseDouble(jTextField1.getText());
            //jTextField2.setText(jTextField2.getText()+" + ");
            jTextField2.setText(jTextField1.getText()+" * ");
            operacion = 3 ;
            jTextField1.setText("");
        }
    }//GEN-LAST:event_boton_multiplicacionActionPerformed

    private void boton_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_divisionActionPerformed
        if (pul != 0){
            Operaciones();
        }
        else{
            pul++ ;
            num = Double.parseDouble(jTextField1.getText());
            //jTextField2.setText(jTextField2.getText()+" + ");
            jTextField2.setText(jTextField1.getText()+" ÷ ");
            operacion = 4 ;
            jTextField1.setText("");
        }
    }//GEN-LAST:event_boton_divisionActionPerformed

    private void boton_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_igualActionPerformed
        Operaciones();
    }//GEN-LAST:event_boton_igualActionPerformed

    private void boton_acActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_acActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        
    }//GEN-LAST:event_boton_acActionPerformed

    private void boton_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_raizActionPerformed
        jTextField2.setText("√"+jTextField1.getText());
        num = Double.parseDouble(jTextField1.getText());
        
        ans = Math.sqrt(num);
        jTextField1.setText(Double.toString(ans));
    }//GEN-LAST:event_boton_raizActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        jTextField1.setText(jTextField1.getText()+".");
    }//GEN-LAST:event_decimalActionPerformed

    private void boton_potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_potenciaActionPerformed
        jTextField2.setText(jTextField1.getText()+"^2");
        num = Double.parseDouble(jTextField1.getText());
        ans = Math.pow(num,2);
        jTextField1.setText(Double.toString(ans));
    }//GEN-LAST:event_boton_potenciaActionPerformed

    private void boton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarActionPerformed
        String string = jTextField1.getText();
			jTextField1.setText("");
			for(int i=0;i<string.length()-1;i++) {
				jTextField1.setText(jTextField1.getText()+string.charAt(i));
			}
        
    }//GEN-LAST:event_boton_borrarActionPerformed
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ac;
    private javax.swing.JButton boton_answer;
    private javax.swing.JButton boton_borrar;
    private javax.swing.JButton boton_division;
    private javax.swing.JButton boton_igual;
    private javax.swing.JButton boton_multiplicacion;
    private javax.swing.JButton boton_potencia;
    private javax.swing.JButton boton_raiz;
    private javax.swing.JButton boton_resta;
    private javax.swing.JButton boton_suma;
    private javax.swing.JButton decimal;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton numero0;
    private javax.swing.JButton numero1;
    private javax.swing.JButton numero2;
    private javax.swing.JButton numero3;
    private javax.swing.JButton numero4;
    private javax.swing.JButton numero5;
    private javax.swing.JButton numero6;
    private javax.swing.JButton numero7;
    private javax.swing.JButton numero8;
    private javax.swing.JButton numero9;
    // End of variables declaration//GEN-END:variables
}

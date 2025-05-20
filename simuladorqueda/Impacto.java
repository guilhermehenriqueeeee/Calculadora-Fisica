package guilherme.simuladorqueda;
        
import javax.swing.JOptionPane;

public class Impacto extends javax.swing.JFrame {

    // As ações do botão (Calcular e Limpar), pra quando apertar ele fazer o que foi programado
    public Impacto() {
        initComponents(); // Inicializando todo o meu layout
        btnCalcular.addActionListener(this::calcularImpacto); // Associa o método calcularImpacto ao botão CALCULAR.  
        btnLimpar.addActionListener(this::limparCampos); // Associa o método limparCampos ao botão LIMPAR.
    }
    // </editor-fold>

    @SuppressWarnings("unchecked") // Abaixo estão todos os componentes do meu layout, não pode ser modificado
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAltura = new javax.swing.JLabel();
        lblDistancia = new javax.swing.JLabel();
        lblMassa = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        inputAltura = new javax.swing.JTextField();
        inputDistancia = new javax.swing.JTextField();
        inputMassa = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador de Física");
        setResizable(false);

        lblAltura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAltura.setText("Altura em metros:");

        lblDistancia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDistancia.setText("Distância de frenagem:");

        lblMassa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMassa.setText("Massa da pessoa:");

        btnCalcular.setBackground(new java.awt.Color(0, 204, 0));
        btnCalcular.setText("CALCULAR");

        inputAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAlturaActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setText("CÁLCULO DA QUEDA - FÍSICA");

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        btnLimpar.setBackground(new java.awt.Color(255, 0, 0));
        btnLimpar.setText("LIMPAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAltura)
                                    .addComponent(lblDistancia)
                                    .addComponent(lblMassa))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(inputMassa)
                                    .addComponent(inputDistancia)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnLimpar)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblTitulo)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputMassa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAltura)
                        .addGap(18, 18, 18)
                        .addComponent(lblDistancia)
                        .addGap(18, 18, 18)
                        .addComponent(lblMassa)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Esta função foi gerada automaticamente, mas não esta sendo usada aqui
    private void inputAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAlturaActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_inputAlturaActionPerformed

    // Função para calculo de impacto, contendo as entradas do programa: altura, distancia e massa
    private void calcularImpacto(java.awt.event.ActionEvent evt) {
        double altura, distancia, massa;

    // Implementei os try/catch para quando o usuário colocar um valor inválido para altura
    try {
        altura = Double.parseDouble(inputAltura.getText());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Altura inválida. Insira um número válido.", "Erro de Altura",
            JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Implementei os try/catch para quando o usuário colocar um valor inválido para distância
    try {
        distancia = Double.parseDouble(inputDistancia.getText());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Distância inválida. Insira um número válido.", "Erro de Distancia",
            JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Implementei os try/catch para quando o usuário colocar um valor inválido para massa
    try {
        massa = Double.parseDouble(inputMassa.getText());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Massa inválida. Insira um número válido.", "Erro de Massa",
            JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Verificando o input de altura, se caso for menor/igual que 0 ou maior que 5, ele mostra pro usuario que o valor está inválido
    if (altura <= 0 || altura > 5) {
        JOptionPane.showMessageDialog(
            this,
            "Altura inválida. Insira um número válido.",
            "Erro de Altura",
            JOptionPane.ERROR_MESSAGE
        );
        return;
    }
    
    // Verificando o input da distancia, se caso for menor que 0.01 (lembrando que esta em metros)
    if (distancia < 0.01) {
        JOptionPane.showMessageDialog(
            this,
            "Distância inválida. Insira um número válido.",
            "Erro de Distância",
            JOptionPane.ERROR_MESSAGE
        );
        return;
        
    // Verificando o input da massa, se caso for menor que 1 (coloquei 1 porque é o minimo que um bebe pode pesar, se caso nascer com algum problema)
    }
    if (massa < 1) {
        JOptionPane.showMessageDialog(
            this,
            "Massa inválida. Insira um número válido.",
            "Erro de Massa",
            JOptionPane.ERROR_MESSAGE
        );
        return;
    }

    // As formulas criadas para o calculo de velocidade, aceleração, força resultante e etc..
    final double g = 9.8;
    double velocidade = Math.sqrt(2 * g * altura);
    double aceleracao = -(velocidade * velocidade) / (2 * distancia);
    double forcaResultante = massa * Math.abs(aceleracao);
    double peso = massa * g;
    double forcaTotal = forcaResultante + peso;

    //Aqui esta printando pro usuario a resposta no campo txtArea que foi criado no Layout
    txtResultado.setText(String.format("""
                                       
        Velocidade ao atingir o solo: %.2f m/s
        Aceleração média: %.2f m/s²
        Força média exercida pelo solo: %.2f N""",
        velocidade, Math.abs(aceleracao), forcaTotal
    ));
}
    
    // Esta é a função do botão LIMPAR, para resetar todos os input e a area destinada a resposta do programa
    private void limparCampos(java.awt.event.ActionEvent evt) {
    inputAltura.setText("");
    inputDistancia.setText("");
    inputMassa.setText("");
    txtResultado.setText("");
}
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Impacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Impacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Impacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Impacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> { //Cria e exibe a janela principal   
            new Impacto().setVisible(true);
        });
    }

    // Todos do meu layout criado, botoões, label, textField..
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JTextField inputAltura;
    private javax.swing.JTextField inputDistancia;
    private javax.swing.JTextField inputMassa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblDistancia;
    private javax.swing.JLabel lblMassa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}

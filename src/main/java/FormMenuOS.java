// Joao Victor Queiroz de Lima Ra.: 2051524
public class FormMenuOS extends javax.swing.JFrame {

    private static FormMenuOS instancia;

    private FormMenuOS() { initComponents(); }

    // Sobrecarga do construtor
    private FormMenuOS(String titulo) {
        this();
        setTitle(titulo);
    }


    //MÉTODO SINGLETON
    public static FormMenuOS geraForm() {
        if (instancia == null) instancia = new FormMenuOS();
        return instancia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotTitulo = new javax.swing.JLabel();
        btAbrirOS = new javax.swing.JButton();
        btConsultarOS = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Ordem de Servico");

        rotTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28));
        rotTitulo.setText("MENU ORDEM DE SERVICO");
        rotTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btAbrirOS.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btAbrirOS.setText("Abrir Ordem de Servico");
        btAbrirOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btAbrirOSActionPerformed(evt); }
        });

        btConsultarOS.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btConsultarOS.setText("Consultar Ordem de Servico");
        btConsultarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btConsultarOSActionPerformed(evt); }
        });

        btVoltar.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btVoltarActionPerformed(evt); }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rotTitulo)
                    .addComponent(btAbrirOS, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rotTitulo)
                .addGap(30, 30, 30)
                .addComponent(btAbrirOS)
                .addGap(12, 12, 12)
                .addComponent(btConsultarOS)
                .addGap(20, 20, 20)
                .addComponent(btVoltar)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAbrirOSActionPerformed(java.awt.event.ActionEvent evt) { FormCadOS.geraForm().setVisible(true); }
    private void btConsultarOSActionPerformed(java.awt.event.ActionEvent evt) { FormConsOS.geraForm().setVisible(true); }
    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) { dispose(); instancia = null; }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrirOS;
    private javax.swing.JButton btConsultarOS;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel rotTitulo;
    // End of variables declaration//GEN-END:variables
}

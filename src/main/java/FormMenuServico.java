// Joao Victor Queiroz de Lima Ra.: 2051524
public class FormMenuServico extends javax.swing.JFrame {

    private static FormMenuServico instancia;

    private FormMenuServico() { initComponents(); }

    // Sobrecarga do construtor
    private FormMenuServico(String titulo) {
        this();
        setTitle(titulo);
    }


    //MÉTODO SINGLETON
    public static FormMenuServico geraForm() {
        if (instancia == null) instancia = new FormMenuServico();
        return instancia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotTitulo = new javax.swing.JLabel();
        btMaterial = new javax.swing.JButton();
        btPrestacao = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Servico");

        rotTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28));
        rotTitulo.setText("MENU SERVICO");
        rotTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btMaterial.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btMaterial.setText("Material");
        btMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btMaterialActionPerformed(evt); }
        });

        btPrestacao.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btPrestacao.setText("Prestacao de Servico");
        btPrestacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btPrestacaoActionPerformed(evt); }
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
                    .addComponent(btMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPrestacao, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rotTitulo)
                .addGap(30, 30, 30)
                .addComponent(btMaterial)
                .addGap(12, 12, 12)
                .addComponent(btPrestacao)
                .addGap(20, 20, 20)
                .addComponent(btVoltar)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMaterialActionPerformed(java.awt.event.ActionEvent evt) { FormCadMaterial.geraForm().setVisible(true); }
    private void btPrestacaoActionPerformed(java.awt.event.ActionEvent evt) { FormCadPrestacao.geraForm().setVisible(true); }
    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) { dispose(); instancia = null; }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMaterial;
    private javax.swing.JButton btPrestacao;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel rotTitulo;
    // End of variables declaration//GEN-END:variables
}

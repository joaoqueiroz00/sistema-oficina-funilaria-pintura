// Joao Victor Queiroz de Lima Ra.: 2051524
public class FormMenuVeiculo extends javax.swing.JFrame {

    private static FormMenuVeiculo instancia;

    private FormMenuVeiculo() { initComponents(); }

    // Sobrecarga do construtor
    private FormMenuVeiculo(String titulo) {
        this();
        setTitle(titulo);
    }


    //MÉTODO SINGLETON
    public static FormMenuVeiculo geraForm() {
        if (instancia == null) instancia = new FormMenuVeiculo();
        return instancia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotTitulo = new javax.swing.JLabel();
        btCarro = new javax.swing.JButton();
        btMoto = new javax.swing.JButton();
        btCaminhonete = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Veiculo");

        rotTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28));
        rotTitulo.setText("MENU VEICULO");
        rotTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btCarro.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btCarro.setText("Carro");
        btCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btCarroActionPerformed(evt); }
        });

        btMoto.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btMoto.setText("Moto");
        btMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btMotoActionPerformed(evt); }
        });

        btCaminhonete.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btCaminhonete.setText("Caminhonete");
        btCaminhonete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btCaminhoneteActionPerformed(evt); }
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
                    .addComponent(btCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCaminhonete, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rotTitulo)
                .addGap(30, 30, 30)
                .addComponent(btCarro)
                .addGap(12, 12, 12)
                .addComponent(btMoto)
                .addGap(12, 12, 12)
                .addComponent(btCaminhonete)
                .addGap(20, 20, 20)
                .addComponent(btVoltar)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCarroActionPerformed(java.awt.event.ActionEvent evt) { FormCadCarro.geraForm().setVisible(true); }
    private void btMotoActionPerformed(java.awt.event.ActionEvent evt) { FormCadMoto.geraForm().setVisible(true); }
    private void btCaminhoneteActionPerformed(java.awt.event.ActionEvent evt) { FormCadCaminhonete.geraForm().setVisible(true); }
    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) { dispose(); instancia = null; }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCaminhonete;
    private javax.swing.JButton btCarro;
    private javax.swing.JButton btMoto;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel rotTitulo;
    // End of variables declaration//GEN-END:variables
}

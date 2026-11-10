// Joao Victor Queiroz de Lima Ra.: 2051524
public class FormMenuPessoa extends javax.swing.JFrame {

    private static FormMenuPessoa instancia;

    private FormMenuPessoa() {
        initComponents();
    }

    // Sobrecarga do construtor
    private FormMenuPessoa(String titulo) {
        this();
        setTitle(titulo);
    }


    //MÉTODO SINGLETON
    public static FormMenuPessoa geraForm() {
        if (instancia == null) instancia = new FormMenuPessoa();
        return instancia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotTitulo = new javax.swing.JLabel();
        btCliente = new javax.swing.JButton();
        btProfissional = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Pessoa");

        rotTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28));
        rotTitulo.setText("MENU PESSOA");
        rotTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btCliente.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btCliente.setText("Cliente");
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });

        btProfissional.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btProfissional.setText("Profissional");
        btProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProfissionalActionPerformed(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(rotTitulo)
                    .addComponent(btCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rotTitulo)
                .addGap(30, 30, 30)
                .addComponent(btCliente)
                .addGap(12, 12, 12)
                .addComponent(btProfissional)
                .addGap(20, 20, 20)
                .addComponent(btVoltar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {
        FormCadCliente.geraForm().setVisible(true);
    }

    private void btProfissionalActionPerformed(java.awt.event.ActionEvent evt) {
        FormCadProfissional.geraForm().setVisible(true);
    }

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        instancia = null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btProfissional;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel rotTitulo;
    // End of variables declaration//GEN-END:variables
}

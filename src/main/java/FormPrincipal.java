// Apache NetBeans 24
// Joao Victor Queiroz de Lima Ra.: 2051524
public class FormPrincipal extends javax.swing.JFrame {

    private static FormPrincipal instancia;

    private FormPrincipal() {
        initComponents();
    }

    // Sobrecarga do construtor
    private FormPrincipal(String titulo) {
        this();
        setTitle(titulo);
    }


    //MÉTODO SINGLETON
    public static FormPrincipal geraForm() {
        if (instancia == null) instancia = new FormPrincipal();
        return instancia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotTitulo = new javax.swing.JLabel();
        btMenuPessoa = new javax.swing.JButton();
        btMenuVeiculo = new javax.swing.JButton();
        btMenuServico = new javax.swing.JButton();
        btMenuOS = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        menuBarPrincipal = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        itemMenuPessoa = new javax.swing.JMenuItem();
        itemMenuVeiculo = new javax.swing.JMenuItem();
        itemMenuServico = new javax.swing.JMenuItem();
        itemMenuOS = new javax.swing.JMenuItem();
        menuArquivo = new javax.swing.JMenu();
        itemSair = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        itemSobre = new javax.swing.JMenuItem();

        menuCadastros.setText("Cadastros");
        itemMenuPessoa.setText("Menu Pessoa");
        itemMenuPessoa.addActionListener(evt -> btMenuPessoaActionPerformed(evt));
        itemMenuVeiculo.setText("Menu Veiculo");
        itemMenuVeiculo.addActionListener(evt -> btMenuVeiculoActionPerformed(evt));
        itemMenuServico.setText("Menu Servico");
        itemMenuServico.addActionListener(evt -> btMenuServicoActionPerformed(evt));
        itemMenuOS.setText("Menu Ordem de Servico");
        itemMenuOS.addActionListener(evt -> btMenuOSActionPerformed(evt));
        menuCadastros.add(itemMenuPessoa);
        menuCadastros.add(itemMenuVeiculo);
        menuCadastros.add(itemMenuServico);
        menuCadastros.add(itemMenuOS);

        menuArquivo.setText("Arquivo");
        itemSair.setText("Sair");
        itemSair.addActionListener(evt -> btSairActionPerformed(evt));
        menuArquivo.add(itemSair);

        menuAjuda.setText("Ajuda");
        itemSobre.setText("Sobre");
        itemSobre.addActionListener(evt -> javax.swing.JOptionPane.showMessageDialog(this,
                "Sistema Oficina de Funilaria e Pintura\nJoao Victor Queiroz de Lima Ra.: 2051524",
                "Sobre", javax.swing.JOptionPane.INFORMATION_MESSAGE));
        menuAjuda.add(itemSobre);

        menuBarPrincipal.add(menuCadastros);
        menuBarPrincipal.add(menuArquivo);
        menuBarPrincipal.add(menuAjuda);
        setJMenuBar(menuBarPrincipal);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Oficina de Funilaria e Pintura");

        rotTitulo.setFont(new java.awt.Font("Segoe UI", 1, 28));
        rotTitulo.setText("OFICINA DE FUNILARIA E PINTURA");
        rotTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btMenuPessoa.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btMenuPessoa.setText("Menu Pessoa");
        btMenuPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuPessoaActionPerformed(evt);
            }
        });

        btMenuVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btMenuVeiculo.setText("Menu Veiculo");
        btMenuVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuVeiculoActionPerformed(evt);
            }
        });

        btMenuServico.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btMenuServico.setText("Menu Servico");
        btMenuServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuServicoActionPerformed(evt);
            }
        });

        btMenuOS.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btMenuOS.setText("Menu Ordem de Servico");
        btMenuOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuOSActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Segoe UI", 1, 16));
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
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
                    .addComponent(btMenuPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMenuVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMenuServico, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMenuOS, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rotTitulo)
                .addGap(30, 30, 30)
                .addComponent(btMenuPessoa)
                .addGap(12, 12, 12)
                .addComponent(btMenuVeiculo)
                .addGap(12, 12, 12)
                .addComponent(btMenuServico)
                .addGap(12, 12, 12)
                .addComponent(btMenuOS)
                .addGap(20, 20, 20)
                .addComponent(btSair)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMenuPessoaActionPerformed(java.awt.event.ActionEvent evt) {
        FormMenuPessoa.geraForm().setVisible(true);
    }

    private void btMenuVeiculoActionPerformed(java.awt.event.ActionEvent evt) {
        FormMenuVeiculo.geraForm().setVisible(true);
    }

    private void btMenuServicoActionPerformed(java.awt.event.ActionEvent evt) {
        FormMenuServico.geraForm().setVisible(true);
    }

    private void btMenuOSActionPerformed(java.awt.event.ActionEvent evt) {
        FormMenuOS.geraForm().setVisible(true);
    }

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {
        int resp = javax.swing.JOptionPane.showConfirmDialog(
                this, "Deseja realmente sair?", "Sair",
                javax.swing.JOptionPane.YES_NO_OPTION);
        if (resp == 0) System.exit(0);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {}
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormPrincipal.geraForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMenuOS;
    private javax.swing.JButton btMenuPessoa;
    private javax.swing.JButton btMenuServico;
    private javax.swing.JButton btMenuVeiculo;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel rotTitulo;
    private javax.swing.JMenuBar menuBarPrincipal;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem itemMenuPessoa;
    private javax.swing.JMenuItem itemMenuVeiculo;
    private javax.swing.JMenuItem itemMenuServico;
    private javax.swing.JMenuItem itemMenuOS;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JMenuItem itemSobre;
    // End of variables declaration//GEN-END:variables
}

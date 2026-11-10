// Joao Victor Queiroz de Lima Ra.: 2051524
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadCliente extends javax.swing.JFrame {

    private static FormCadCliente instancia;
    private BDCliente bdCliente = BDCliente.getInstancia();

    private FormCadCliente() { initComponents(); configurarAtualizacaoAutomatica(); }

    // Sobrecarga do construtor
    private FormCadCliente(String titulo) {
        this();
        setTitle(titulo);
    }


    //MÉTODO SINGLETON
    public static FormCadCliente geraForm() {
        if (instancia == null) instancia = new FormCadCliente();
        return instancia;
    }


    private void configurarAtualizacaoAutomatica() {
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowActivated(java.awt.event.WindowEvent evt) {
                atualizarTabela();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotTitulo = new javax.swing.JLabel();
        rotNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        rotCpf = new javax.swing.JLabel();
        cxCpf = new javax.swing.JTextField();
        rotTelefone = new javax.swing.JLabel();
        cxTelefone = new javax.swing.JTextField();
        rotRua = new javax.swing.JLabel();
        cxRua = new javax.swing.JTextField();
        rotNumero = new javax.swing.JLabel();
        cxNumero = new javax.swing.JTextField();
        rotBairro = new javax.swing.JLabel();
        cxBairro = new javax.swing.JTextField();
        rotCidade = new javax.swing.JLabel();
        cxCidade = new javax.swing.JTextField();
        rotCodigo = new javax.swing.JLabel();
        cxCodigo = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");

        rotTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22));
        rotTitulo.setText("CADASTRO DE CLIENTE");

        rotNome.setFont(new java.awt.Font("Segoe UI", 1, 14));
        rotNome.setText("Nome.....:");
        rotCpf.setFont(new java.awt.Font("Segoe UI", 1, 14));
        rotCpf.setText("CPF......:");
        rotTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14));
        rotTelefone.setText("Telefone.:");
        rotRua.setFont(new java.awt.Font("Segoe UI", 1, 14));
        rotRua.setText("Rua......:");
        rotNumero.setFont(new java.awt.Font("Segoe UI", 1, 14));
        rotNumero.setText("Numero...:");
        rotBairro.setFont(new java.awt.Font("Segoe UI", 1, 14));
        rotBairro.setText("Bairro...:");
        rotCidade.setFont(new java.awt.Font("Segoe UI", 1, 14));
        rotCidade.setText("Cidade...:");
        rotCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14));
        rotCodigo.setText("Codigo...:");

        tabCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] { "Codigo", "Nome", "CPF", "Telefone", "Cidade" }
        ));
        jScrollPane1.setViewportView(tabCliente);

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btCadastrarActionPerformed(evt); }
        });

        btConsultar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btConsultar.setText("Consultar CPF");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btConsultarActionPerformed(evt); }
        });

        btAlterar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btAlterarActionPerformed(evt); }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btExcluirActionPerformed(evt); }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btLimparActionPerformed(evt); }
        });

        btVoltar.setFont(new java.awt.Font("Segoe UI", 1, 13));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { btVoltarActionPerformed(evt); }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        int lblW = 90;
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotNome, javax.swing.GroupLayout.PREFERRED_SIZE, lblW, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5).addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotCpf, javax.swing.GroupLayout.PREFERRED_SIZE, lblW, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5).addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, lblW, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5).addComponent(cxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotRua, javax.swing.GroupLayout.PREFERRED_SIZE, lblW, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5).addComponent(cxRua, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotNumero, javax.swing.GroupLayout.PREFERRED_SIZE, lblW, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5).addComponent(cxNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotBairro, javax.swing.GroupLayout.PREFERRED_SIZE, lblW, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5).addComponent(cxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotCidade, javax.swing.GroupLayout.PREFERRED_SIZE, lblW, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5).addComponent(cxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, lblW, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5).addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrar).addGap(6)
                        .addComponent(btConsultar).addGap(6)
                        .addComponent(btAlterar).addGap(6)
                        .addComponent(btExcluir).addGap(6)
                        .addComponent(btLimpar).addGap(6)
                        .addComponent(btVoltar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15)
                .addComponent(rotTitulo)
                .addGap(15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNome).addComponent(cxNome))
                .addGap(6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCpf).addComponent(cxCpf))
                .addGap(6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotTelefone).addComponent(cxTelefone))
                .addGap(6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotRua).addComponent(cxRua))
                .addGap(6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNumero).addComponent(cxNumero))
                .addGap(6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotBairro).addComponent(cxBairro))
                .addGap(6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCidade).addComponent(cxCidade))
                .addGap(6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCodigo).addComponent(cxCodigo))
                .addGap(12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar).addComponent(btConsultar)
                    .addComponent(btAlterar).addComponent(btExcluir)
                    .addComponent(btLimpar).addComponent(btVoltar))
                .addGap(12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Cliente c = new Cliente();
            c.setNome(cxNome.getText());
            c.setCpf(cxCpf.getText());
            c.setTelefone(cxTelefone.getText());
            Endereco e = new Endereco();
            e.setRua(cxRua.getText());
            e.setNumero(Integer.parseInt(cxNumero.getText()));
            e.setBairro(cxBairro.getText());
            e.setCidade(cxCidade.getText());
            c.setEndereco(e);
            c.setCodigo(Integer.parseInt(cxCodigo.getText()));
            bdCliente.inserir(c);
            JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela();
            limpar();
        } catch (NomeInvalidoException ex) {
            JOptionPane.showMessageDialog(this, "Nome invalido!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Numero ou codigo invalido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {
        Cliente c = bdCliente.consultar(cxCpf.getText().trim());
        if (c != null) {
            cxNome.setText(c.getNome());
            cxTelefone.setText(c.getTelefone());
            cxRua.setText(c.getEndereco().getRua());
            cxNumero.setText(String.valueOf(c.getEndereco().getNumero()));
            cxBairro.setText(c.getEndereco().getBairro());
            cxCidade.setText(c.getEndereco().getCidade());
            cxCodigo.setText(String.valueOf(c.getCodigo()));
            JOptionPane.showMessageDialog(this, "Cliente encontrado!", "Consulta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Cliente nao encontrado.", "Consulta", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {
        String cpf = cxCpf.getText().trim();
        if (bdCliente.consultar(cpf) == null) {
            JOptionPane.showMessageDialog(this, "Cliente nao encontrado! Consulte um CPF existente antes de alterar.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Cliente c = new Cliente();
            c.setNome(cxNome.getText());
            c.setCpf(cpf);
            c.setTelefone(cxTelefone.getText());
            Endereco e = new Endereco();
            e.setRua(cxRua.getText());
            e.setNumero(Integer.parseInt(cxNumero.getText()));
            e.setBairro(cxBairro.getText());
            e.setCidade(cxCidade.getText());
            c.setEndereco(e);
            c.setCodigo(Integer.parseInt(cxCodigo.getText()));
            bdCliente.alterar(c);
            JOptionPane.showMessageDialog(this, "Cliente alterado com sucesso!", "Alteracao", JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela();
            limpar();
        } catch (NomeInvalidoException ex) {
            JOptionPane.showMessageDialog(this, "Nome invalido!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Numero ou codigo invalido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        String cpf = cxCpf.getText().trim();
        if (bdCliente.excluir(cpf)) {
            JOptionPane.showMessageDialog(this, "Cliente excluido com sucesso!", "Exclusao", JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela();
            limpar();
        } else {
            JOptionPane.showMessageDialog(this, "Cliente nao encontrado.", "Exclusao", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) { limpar(); }

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) { dispose(); instancia = null; }

    private void limpar() {
        cxNome.setText(""); cxCpf.setText(""); cxTelefone.setText("");
        cxRua.setText(""); cxNumero.setText(""); cxBairro.setText("");
        cxCidade.setText(""); cxCodigo.setText("");
        cxNome.requestFocus();
    }

    public void atualizarTabela() {
        DefaultTableModel m = (DefaultTableModel) tabCliente.getModel();
        m.setRowCount(0);
        for (Cliente c : bdCliente.getBdCliente()) {
            m.addRow(new Object[]{ c.getCodigo(), c.getNome(), c.getCpf(), c.getTelefone(), c.getEndereco().getCidade() });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxBairro;
    private javax.swing.JTextField cxCidade;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JTextField cxCpf;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNumero;
    private javax.swing.JTextField cxRua;
    private javax.swing.JTextField cxTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotBairro;
    private javax.swing.JLabel rotCidade;
    private javax.swing.JLabel rotCodigo;
    private javax.swing.JLabel rotCpf;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotNumero;
    private javax.swing.JLabel rotRua;
    private javax.swing.JLabel rotTelefone;
    private javax.swing.JLabel rotTitulo;
    private javax.swing.JTable tabCliente;
    // End of variables declaration//GEN-END:variables
}

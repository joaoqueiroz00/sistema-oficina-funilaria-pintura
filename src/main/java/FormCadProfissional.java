// Joao Victor Queiroz de Lima Ra.: 2051524
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadProfissional extends javax.swing.JFrame {

    private static FormCadProfissional instancia;
    private BDProfissional bdProfissional = BDProfissional.getInstancia();

    private FormCadProfissional() { initComponents(); configurarAtualizacaoAutomatica(); }

    // Sobrecarga do construtor
    private FormCadProfissional(String titulo) {
        this();
        setTitle(titulo);
    }


    //MÉTODO SINGLETON
    public static FormCadProfissional geraForm() {
        if (instancia == null) instancia = new FormCadProfissional();
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
        rotEspecialidade = new javax.swing.JLabel();
        cxEspecialidade = new javax.swing.JTextField();
        rotSalario = new javax.swing.JLabel();
        cxSalario = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabProfissional = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Profissional");

        rotTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22));
        rotTitulo.setText("CADASTRO DE PROFISSIONAL");

        int fw = 14;
        rotNome.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotNome.setText("Nome.........:");
        rotCpf.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotCpf.setText("CPF..........:");
        rotTelefone.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotTelefone.setText("Telefone.....:");
        rotRua.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotRua.setText("Rua..........:");
        rotNumero.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotNumero.setText("Numero.......:");
        rotBairro.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotBairro.setText("Bairro.......:");
        rotCidade.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotCidade.setText("Cidade.......:");
        rotEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotEspecialidade.setText("Especialidade:");
        rotSalario.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotSalario.setText("Salario......:");

        tabProfissional.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[] { "Nome", "CPF", "Especialidade", "Salario" }
        ));
        jScrollPane1.setViewportView(tabProfissional);

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 13)); btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(evt -> btCadastrarActionPerformed(evt));
        btConsultar.setFont(new java.awt.Font("Segoe UI", 1, 13)); btConsultar.setText("Consultar CPF");
        btConsultar.addActionListener(evt -> btConsultarActionPerformed(evt));
        btAlterar.setFont(new java.awt.Font("Segoe UI", 1, 13)); btAlterar.setText("Alterar");
        btAlterar.addActionListener(evt -> btAlterarActionPerformed(evt));
        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 13)); btExcluir.setText("Excluir");
        btExcluir.addActionListener(evt -> btExcluirActionPerformed(evt));
        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 13)); btLimpar.setText("Limpar");
        btLimpar.addActionListener(evt -> limpar());
        btVoltar.setFont(new java.awt.Font("Segoe UI", 1, 13)); btVoltar.setText("Voltar");
        btVoltar.addActionListener(evt -> { dispose(); instancia = null; });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        int lblW = 110; int fldW = 250;
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotTitulo)
                    .addGroup(row(layout, rotNome, lblW, cxNome, fldW))
                    .addGroup(row(layout, rotCpf, lblW, cxCpf, 150))
                    .addGroup(row(layout, rotTelefone, lblW, cxTelefone, 150))
                    .addGroup(row(layout, rotRua, lblW, cxRua, fldW))
                    .addGroup(row(layout, rotNumero, lblW, cxNumero, 80))
                    .addGroup(row(layout, rotBairro, lblW, cxBairro, 200))
                    .addGroup(row(layout, rotCidade, lblW, cxCidade, 200))
                    .addGroup(row(layout, rotEspecialidade, lblW, cxEspecialidade, 200))
                    .addGroup(row(layout, rotSalario, lblW, cxSalario, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrar).addGap(6).addComponent(btConsultar)
                        .addGap(6).addComponent(btAlterar).addGap(6).addComponent(btExcluir)
                        .addGap(6).addComponent(btLimpar).addGap(6).addComponent(btVoltar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(15)
                .addComponent(rotTitulo).addGap(15)
                .addGroup(vrow(layout, rotNome, cxNome)).addGap(6)
                .addGroup(vrow(layout, rotCpf, cxCpf)).addGap(6)
                .addGroup(vrow(layout, rotTelefone, cxTelefone)).addGap(6)
                .addGroup(vrow(layout, rotRua, cxRua)).addGap(6)
                .addGroup(vrow(layout, rotNumero, cxNumero)).addGap(6)
                .addGroup(vrow(layout, rotBairro, cxBairro)).addGap(6)
                .addGroup(vrow(layout, rotCidade, cxCidade)).addGap(6)
                .addGroup(vrow(layout, rotEspecialidade, cxEspecialidade)).addGap(6)
                .addGroup(vrow(layout, rotSalario, cxSalario)).addGap(12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar).addComponent(btConsultar)
                    .addComponent(btAlterar).addComponent(btExcluir)
                    .addComponent(btLimpar).addComponent(btVoltar)).addGap(12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private javax.swing.GroupLayout.Group row(javax.swing.GroupLayout l, javax.swing.JLabel lbl, int lw, javax.swing.JTextField fld, int fw) {
        return l.createSequentialGroup()
            .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, lw, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5).addComponent(fld, javax.swing.GroupLayout.PREFERRED_SIZE, fw, javax.swing.GroupLayout.PREFERRED_SIZE);
    }
    private javax.swing.GroupLayout.Group vrow(javax.swing.GroupLayout l, javax.swing.JComponent a, javax.swing.JComponent b) {
        return l.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(a).addComponent(b);
    }

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Profissional p = new Profissional();
            p.setNome(cxNome.getText());
            p.setCpf(cxCpf.getText());
            p.setTelefone(cxTelefone.getText());
            Endereco e = new Endereco();
            e.setRua(cxRua.getText()); e.setNumero(Integer.parseInt(cxNumero.getText()));
            e.setBairro(cxBairro.getText()); e.setCidade(cxCidade.getText());
            p.setEndereco(e);
            p.setEspecialidade(cxEspecialidade.getText());
            p.setSalario(Double.parseDouble(cxSalario.getText()));
            bdProfissional.inserir(p);
            JOptionPane.showMessageDialog(this, "Profissional cadastrado!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela(); limpar();
        } catch (NomeInvalidoException ex) {
            JOptionPane.showMessageDialog(this, "Nome invalido!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ValorInvalidoException ex) {
            JOptionPane.showMessageDialog(this, "Salario deve ser maior que zero!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Valores numericos invalidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {
        Profissional p = bdProfissional.consultar(cxCpf.getText().trim());
        if (p != null) {
            cxNome.setText(p.getNome()); cxTelefone.setText(p.getTelefone());
            cxRua.setText(p.getEndereco().getRua()); cxNumero.setText(String.valueOf(p.getEndereco().getNumero()));
            cxBairro.setText(p.getEndereco().getBairro()); cxCidade.setText(p.getEndereco().getCidade());
            cxEspecialidade.setText(p.getEspecialidade()); cxSalario.setText(String.valueOf(p.getSalario()));
            JOptionPane.showMessageDialog(this, "Profissional encontrado!", "Consulta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Profissional nao encontrado.", "Consulta", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {
        String cpf = cxCpf.getText().trim();
        if (bdProfissional.consultar(cpf) == null) {
            JOptionPane.showMessageDialog(this, "Profissional nao encontrado! Consulte um CPF existente antes de alterar.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Profissional p = new Profissional();
            p.setNome(cxNome.getText());
            p.setCpf(cpf);
            p.setTelefone(cxTelefone.getText());
            Endereco e = new Endereco();
            e.setRua(cxRua.getText()); e.setNumero(Integer.parseInt(cxNumero.getText()));
            e.setBairro(cxBairro.getText()); e.setCidade(cxCidade.getText());
            p.setEndereco(e);
            p.setEspecialidade(cxEspecialidade.getText());
            p.setSalario(Double.parseDouble(cxSalario.getText()));
            bdProfissional.alterar(p);
            JOptionPane.showMessageDialog(this, "Profissional alterado com sucesso!", "Alteracao", JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela(); limpar();
        } catch (NomeInvalidoException ex) {
            JOptionPane.showMessageDialog(this, "Nome invalido!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ValorInvalidoException ex) {
            JOptionPane.showMessageDialog(this, "Salario deve ser maior que zero!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Valores numericos invalidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        String cpf = cxCpf.getText().trim();
        if (bdProfissional.excluir(cpf)) {
            JOptionPane.showMessageDialog(this, "Profissional excluido com sucesso!", "Exclusao", JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela(); limpar();
        } else {
            JOptionPane.showMessageDialog(this, "Profissional nao encontrado.", "Exclusao", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpar() {
        cxNome.setText(""); cxCpf.setText(""); cxTelefone.setText("");
        cxRua.setText(""); cxNumero.setText(""); cxBairro.setText("");
        cxCidade.setText(""); cxEspecialidade.setText(""); cxSalario.setText("");
        cxNome.requestFocus();
    }

    public void atualizarTabela() {
        DefaultTableModel m = (DefaultTableModel) tabProfissional.getModel();
        m.setRowCount(0);
        for (Profissional p : bdProfissional.getBdProfissional()) {
            m.addRow(new Object[]{ p.getNome(), p.getCpf(), p.getEspecialidade(), p.getSalario() });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar, btConsultar, btAlterar, btExcluir, btLimpar, btVoltar;
    private javax.swing.JTextField cxBairro, cxCidade, cxCpf, cxEspecialidade;
    private javax.swing.JTextField cxNome, cxNumero, cxRua, cxSalario, cxTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotBairro, rotCidade, rotCpf, rotEspecialidade;
    private javax.swing.JLabel rotNome, rotNumero, rotRua, rotSalario, rotTelefone, rotTitulo;
    private javax.swing.JTable tabProfissional;
    // End of variables declaration//GEN-END:variables
}

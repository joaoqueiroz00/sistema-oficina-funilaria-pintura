// Joao Victor Queiroz de Lima Ra.: 2051524
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadCarro extends javax.swing.JFrame {

    private static FormCadCarro instancia;
    private BDCarro bdCarro = BDCarro.getInstancia();

    private FormCadCarro() { initComponents(); configurarAtualizacaoAutomatica(); }

    // Sobrecarga do construtor
    private FormCadCarro(String titulo) {
        this();
        setTitle(titulo);
    }

    //MÉTODO SINGLETON
    public static FormCadCarro geraForm() {
        if (instancia == null) instancia = new FormCadCarro();
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
        rotPlaca = new javax.swing.JLabel(); cxPlaca = new javax.swing.JTextField();
        rotMarca = new javax.swing.JLabel(); cxMarca = new javax.swing.JTextField();
        rotModelo = new javax.swing.JLabel(); cxModelo = new javax.swing.JTextField();
        rotCor = new javax.swing.JLabel(); cxCor = new javax.swing.JTextField();
        rotPortas = new javax.swing.JLabel(); cxPortas = new javax.swing.JTextField();
        rotCambio = new javax.swing.JLabel(); cxCambio = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton(); btConsultar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton(); btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton(); btVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane(); tabCarro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Carro");
        rotTitulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); rotTitulo.setText("CADASTRO DE CARRO");
        int fw = 14;
        rotPlaca.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotPlaca.setText("Placa...:");
        rotMarca.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotMarca.setText("Marca...:");
        rotModelo.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotModelo.setText("Modelo..:");
        rotCor.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotCor.setText("Cor.....:");
        rotPortas.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotPortas.setText("Portas..:");
        rotCambio.setFont(new java.awt.Font("Segoe UI", 1, fw)); rotCambio.setText("Cambio..:");
        tabCarro.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"Placa","Marca","Modelo","Cor","Portas","Cambio"}));
        jScrollPane1.setViewportView(tabCarro);
        btCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 13)); btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(evt -> btCadastrarActionPerformed(evt));
        btConsultar.setFont(new java.awt.Font("Segoe UI", 1, 13)); btConsultar.setText("Consultar Placa");
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
        int lw = 80, fw2 = 200;
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotTitulo)
                    .addGroup(r(layout,rotPlaca,lw,cxPlaca,120)).addGroup(r(layout,rotMarca,lw,cxMarca,fw2))
                    .addGroup(r(layout,rotModelo,lw,cxModelo,fw2)).addGroup(r(layout,rotCor,lw,cxCor,fw2))
                    .addGroup(r(layout,rotPortas,lw,cxPortas,60)).addGroup(r(layout,rotCambio,lw,cxCambio,fw2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrar).addGap(6).addComponent(btConsultar)
                        .addGap(6).addComponent(btAlterar).addGap(6).addComponent(btExcluir)
                        .addGap(6).addComponent(btLimpar).addGap(6).addComponent(btVoltar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(15)
                .addComponent(rotTitulo).addGap(15)
                .addGroup(v(layout,rotPlaca,cxPlaca)).addGap(6).addGroup(v(layout,rotMarca,cxMarca)).addGap(6)
                .addGroup(v(layout,rotModelo,cxModelo)).addGap(6).addGroup(v(layout,rotCor,cxCor)).addGap(6)
                .addGroup(v(layout,rotPortas,cxPortas)).addGap(6).addGroup(v(layout,rotCambio,cxCambio)).addGap(12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar).addComponent(btConsultar)
                    .addComponent(btAlterar).addComponent(btExcluir)
                    .addComponent(btLimpar).addComponent(btVoltar)).addGap(12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private javax.swing.GroupLayout.Group r(javax.swing.GroupLayout l,javax.swing.JLabel lb,int lw,javax.swing.JTextField f,int fw){
        return l.createSequentialGroup().addComponent(lb,javax.swing.GroupLayout.PREFERRED_SIZE,lw,javax.swing.GroupLayout.PREFERRED_SIZE).addGap(5).addComponent(f,javax.swing.GroupLayout.PREFERRED_SIZE,fw,javax.swing.GroupLayout.PREFERRED_SIZE);}
    private javax.swing.GroupLayout.Group v(javax.swing.GroupLayout l,javax.swing.JComponent a,javax.swing.JComponent b){
        return l.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(a).addComponent(b);}

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Carro c = new Carro();
            c.setPlaca(cxPlaca.getText()); c.setMarca(cxMarca.getText());
            c.setModelo(cxModelo.getText()); c.setCor(cxCor.getText());
            c.setPortas(Integer.parseInt(cxPortas.getText())); c.setCambio(cxCambio.getText());
            bdCarro.inserir(c);
            JOptionPane.showMessageDialog(this,"Carro cadastrado!","Cadastro",JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela(); limpar();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,"Numero de portas invalido!","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {
        Carro c = bdCarro.consultar(cxPlaca.getText().trim());
        if (c != null) {
            cxMarca.setText(c.getMarca()); cxModelo.setText(c.getModelo()); cxCor.setText(c.getCor());
            cxPortas.setText(String.valueOf(c.getPortas())); cxCambio.setText(c.getCambio());
            JOptionPane.showMessageDialog(this,"Carro encontrado!","Consulta",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,"Carro nao encontrado.","Consulta",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {
        String placa = cxPlaca.getText().trim();
        if (bdCarro.consultar(placa) == null) {
            JOptionPane.showMessageDialog(this,"Carro nao encontrado! Consulte uma placa existente antes de alterar.","Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Carro c = new Carro();
            c.setPlaca(placa); c.setMarca(cxMarca.getText());
            c.setModelo(cxModelo.getText()); c.setCor(cxCor.getText());
            c.setPortas(Integer.parseInt(cxPortas.getText())); c.setCambio(cxCambio.getText());
            bdCarro.alterar(c);
            JOptionPane.showMessageDialog(this,"Carro alterado com sucesso!","Alteracao",JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela(); limpar();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,"Numero de portas invalido!","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {
        String placa = cxPlaca.getText().trim();
        if (bdCarro.excluir(placa)) {
            JOptionPane.showMessageDialog(this,"Carro excluido com sucesso!","Exclusao",JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela(); limpar();
        } else {
            JOptionPane.showMessageDialog(this,"Carro nao encontrado.","Exclusao",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void limpar() {
        cxPlaca.setText(""); cxMarca.setText(""); cxModelo.setText("");
        cxCor.setText(""); cxPortas.setText(""); cxCambio.setText(""); cxPlaca.requestFocus();
    }
    public void atualizarTabela() {
        DefaultTableModel m = (DefaultTableModel) tabCarro.getModel(); m.setRowCount(0);
        for (Carro c : bdCarro.getBdCarro()) m.addRow(new Object[]{c.getPlaca(),c.getMarca(),c.getModelo(),c.getCor(),c.getPortas(),c.getCambio()});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar, btConsultar, btAlterar, btExcluir, btLimpar, btVoltar;
    private javax.swing.JTextField cxCambio, cxCor, cxMarca, cxModelo, cxPlaca, cxPortas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotCambio, rotCor, rotMarca, rotModelo, rotPlaca, rotPortas, rotTitulo;
    private javax.swing.JTable tabCarro;
    // End of variables declaration//GEN-END:variables
}

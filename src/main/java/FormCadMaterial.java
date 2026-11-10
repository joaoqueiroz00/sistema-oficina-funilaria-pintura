// Joao Victor Queiroz de Lima Ra.: 2051524
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadMaterial extends javax.swing.JFrame {
    private static FormCadMaterial instancia;
    private BDMaterial bdMaterial = BDMaterial.getInstancia();
    private FormCadMaterial(){initComponents();configurarAtualizacaoAutomatica();}

    // Sobrecarga do construtor
    private FormCadMaterial(String titulo) {
        this();
        setTitle(titulo);
    }

    //MÉTODO SINGLETON
    public static FormCadMaterial geraForm(){if(instancia==null)instancia=new FormCadMaterial();return instancia;}


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
    private void initComponents(){
        rotTitulo=new javax.swing.JLabel();
        rotDescricao=new javax.swing.JLabel();cxDescricao=new javax.swing.JTextField();
        rotValor=new javax.swing.JLabel();cxValor=new javax.swing.JTextField();
        rotStatus=new javax.swing.JLabel();cxStatus=new javax.swing.JTextField();
        rotQtd=new javax.swing.JLabel();cxQtd=new javax.swing.JTextField();
        rotMarca=new javax.swing.JLabel();cxMarca=new javax.swing.JTextField();
        btCadastrar=new javax.swing.JButton();btConsultar=new javax.swing.JButton();
        btAlterar=new javax.swing.JButton();btExcluir=new javax.swing.JButton();
        btLimpar=new javax.swing.JButton();btVoltar=new javax.swing.JButton();
        jScrollPane1=new javax.swing.JScrollPane();tabMaterial=new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);setTitle("Cadastro de Material");
        rotTitulo.setFont(new java.awt.Font("Segoe UI",1,22));rotTitulo.setText("CADASTRO DE MATERIAL");
        rotDescricao.setFont(new java.awt.Font("Segoe UI",1,14));rotDescricao.setText("Descricao.:");
        rotValor.setFont(new java.awt.Font("Segoe UI",1,14));rotValor.setText("Valor.....:");
        rotStatus.setFont(new java.awt.Font("Segoe UI",1,14));rotStatus.setText("Status....:");
        rotQtd.setFont(new java.awt.Font("Segoe UI",1,14));rotQtd.setText("Quantidade:");
        rotMarca.setFont(new java.awt.Font("Segoe UI",1,14));rotMarca.setText("Marca.....:");
        tabMaterial.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{},new String[]{"Descricao","Valor","Status","Qtd","Marca"}));
        jScrollPane1.setViewportView(tabMaterial);
        btCadastrar.setFont(new java.awt.Font("Segoe UI",1,13));btCadastrar.setText("Cadastrar");btCadastrar.addActionListener(evt->btCadastrarActionPerformed(evt));
        btConsultar.setFont(new java.awt.Font("Segoe UI",1,13));btConsultar.setText("Consultar");btConsultar.addActionListener(evt->btConsultarActionPerformed(evt));
        btAlterar.setFont(new java.awt.Font("Segoe UI",1,13));btAlterar.setText("Alterar");btAlterar.addActionListener(evt->btAlterarActionPerformed(evt));
        btExcluir.setFont(new java.awt.Font("Segoe UI",1,13));btExcluir.setText("Excluir");btExcluir.addActionListener(evt->btExcluirActionPerformed(evt));
        btLimpar.setFont(new java.awt.Font("Segoe UI",1,13));btLimpar.setText("Limpar");btLimpar.addActionListener(evt->limpar());
        btVoltar.setFont(new java.awt.Font("Segoe UI",1,13));btVoltar.setText("Voltar");btVoltar.addActionListener(evt->{dispose();instancia=null;});

        javax.swing.GroupLayout layout=new javax.swing.GroupLayout(getContentPane());getContentPane().setLayout(layout);
        int lw=100;
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotTitulo)
                    .addGroup(r(layout,rotDescricao,lw,cxDescricao,250)).addGroup(r(layout,rotValor,lw,cxValor,100))
                    .addGroup(r(layout,rotStatus,lw,cxStatus,150)).addGroup(r(layout,rotQtd,lw,cxQtd,80))
                    .addGroup(r(layout,rotMarca,lw,cxMarca,200))
                    .addGroup(layout.createSequentialGroup().addComponent(btCadastrar).addGap(6).addComponent(btConsultar).addGap(6).addComponent(btAlterar).addGap(6).addComponent(btExcluir).addGap(6).addComponent(btLimpar).addGap(6).addComponent(btVoltar))
                    .addComponent(jScrollPane1,javax.swing.GroupLayout.PREFERRED_SIZE,540,javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20,Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(15).addComponent(rotTitulo).addGap(15)
                .addGroup(v(layout,rotDescricao,cxDescricao)).addGap(6).addGroup(v(layout,rotValor,cxValor)).addGap(6)
                .addGroup(v(layout,rotStatus,cxStatus)).addGap(6).addGroup(v(layout,rotQtd,cxQtd)).addGap(6).addGroup(v(layout,rotMarca,cxMarca)).addGap(12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btCadastrar).addComponent(btConsultar).addComponent(btAlterar).addComponent(btExcluir).addComponent(btLimpar).addComponent(btVoltar)).addGap(12)
                .addComponent(jScrollPane1,javax.swing.GroupLayout.PREFERRED_SIZE,130,javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(15,Short.MAX_VALUE)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private javax.swing.GroupLayout.Group r(javax.swing.GroupLayout l,javax.swing.JLabel lb,int lw,javax.swing.JTextField f,int fw){return l.createSequentialGroup().addComponent(lb,javax.swing.GroupLayout.PREFERRED_SIZE,lw,javax.swing.GroupLayout.PREFERRED_SIZE).addGap(5).addComponent(f,javax.swing.GroupLayout.PREFERRED_SIZE,fw,javax.swing.GroupLayout.PREFERRED_SIZE);}
    private javax.swing.GroupLayout.Group v(javax.swing.GroupLayout l,javax.swing.JComponent a,javax.swing.JComponent b){return l.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(a).addComponent(b);}

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt){
        try{Material m=new Material();m.setDescricao(cxDescricao.getText());m.setValor(Double.parseDouble(cxValor.getText()));m.setStatus(cxStatus.getText());m.setQuantidade(Integer.parseInt(cxQtd.getText()));m.setMarca(cxMarca.getText());bdMaterial.inserir(m);JOptionPane.showMessageDialog(this,"Material cadastrado!","Cadastro",JOptionPane.INFORMATION_MESSAGE);atualizarTabela();limpar();}
        catch(ValorInvalidoException ex){JOptionPane.showMessageDialog(this,"Valor deve ser maior que zero!","Erro",JOptionPane.ERROR_MESSAGE);}
        catch(NumberFormatException ex){JOptionPane.showMessageDialog(this,"Valor ou quantidade invalidos!","Erro",JOptionPane.ERROR_MESSAGE);}
    }
    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt){
        Material m=bdMaterial.consultar(cxDescricao.getText().trim());
        if(m!=null){cxValor.setText(String.valueOf(m.getValor()));cxStatus.setText(m.getStatus());cxQtd.setText(String.valueOf(m.getQuantidade()));cxMarca.setText(m.getMarca());JOptionPane.showMessageDialog(this,"Material encontrado!","Consulta",JOptionPane.INFORMATION_MESSAGE);}
        else{JOptionPane.showMessageDialog(this,"Material nao encontrado.","Consulta",JOptionPane.ERROR_MESSAGE);}
    }
    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt){
        String desc=cxDescricao.getText().trim();
        if(bdMaterial.consultar(desc)==null){JOptionPane.showMessageDialog(this,"Material nao encontrado! Consulte uma descricao existente antes de alterar.","Erro",JOptionPane.ERROR_MESSAGE);return;}
        try{Material m=new Material();m.setDescricao(desc);m.setValor(Double.parseDouble(cxValor.getText()));m.setStatus(cxStatus.getText());m.setQuantidade(Integer.parseInt(cxQtd.getText()));m.setMarca(cxMarca.getText());bdMaterial.alterar(m);JOptionPane.showMessageDialog(this,"Material alterado com sucesso!","Alteracao",JOptionPane.INFORMATION_MESSAGE);atualizarTabela();limpar();}
        catch(ValorInvalidoException ex){JOptionPane.showMessageDialog(this,"Valor deve ser maior que zero!","Erro",JOptionPane.ERROR_MESSAGE);}
        catch(NumberFormatException ex){JOptionPane.showMessageDialog(this,"Valor ou quantidade invalidos!","Erro",JOptionPane.ERROR_MESSAGE);}
    }
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt){
        String desc=cxDescricao.getText().trim();
        if(bdMaterial.excluir(desc)){JOptionPane.showMessageDialog(this,"Material excluido com sucesso!","Exclusao",JOptionPane.INFORMATION_MESSAGE);atualizarTabela();limpar();}
        else{JOptionPane.showMessageDialog(this,"Material nao encontrado.","Exclusao",JOptionPane.ERROR_MESSAGE);}
    }
    private void limpar(){cxDescricao.setText("");cxValor.setText("");cxStatus.setText("");cxQtd.setText("");cxMarca.setText("");cxDescricao.requestFocus();}
    public void atualizarTabela(){DefaultTableModel m=(DefaultTableModel)tabMaterial.getModel();m.setRowCount(0);for(Material mat:bdMaterial.getBdMaterial())m.addRow(new Object[]{mat.getDescricao(),mat.getValor(),mat.getStatus(),mat.getQuantidade(),mat.getMarca()});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar,btConsultar,btAlterar,btExcluir,btLimpar,btVoltar;
    private javax.swing.JTextField cxDescricao,cxMarca,cxQtd,cxStatus,cxValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotDescricao,rotMarca,rotQtd,rotStatus,rotTitulo,rotValor;
    private javax.swing.JTable tabMaterial;
    // End of variables declaration//GEN-END:variables
}

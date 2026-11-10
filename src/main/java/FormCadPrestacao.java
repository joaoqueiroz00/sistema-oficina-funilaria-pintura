// Joao Victor Queiroz de Lima Ra.: 2051524
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadPrestacao extends javax.swing.JFrame {
    private static FormCadPrestacao instancia;
    private BDPrestacaoServico bdPrestacao = BDPrestacaoServico.getInstancia();
    private FormCadPrestacao(){initComponents();configurarAtualizacaoAutomatica();}

    // Sobrecarga do construtor
    private FormCadPrestacao(String titulo) {
        this();
        setTitle(titulo);
    }

    //MÉTODO SINGLETON
    public static FormCadPrestacao geraForm(){if(instancia==null)instancia=new FormCadPrestacao();return instancia;}


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
        rotHoras=new javax.swing.JLabel();cxHoras=new javax.swing.JTextField();
        rotTipo=new javax.swing.JLabel();cxTipo=new javax.swing.JTextField();
        btCadastrar=new javax.swing.JButton();btConsultar=new javax.swing.JButton();
        btAlterar=new javax.swing.JButton();btExcluir=new javax.swing.JButton();
        btLimpar=new javax.swing.JButton();btVoltar=new javax.swing.JButton();
        jScrollPane1=new javax.swing.JScrollPane();tabPrestacao=new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);setTitle("Cadastro de Prestacao de Servico");
        rotTitulo.setFont(new java.awt.Font("Segoe UI",1,22));rotTitulo.setText("PRESTACAO DE SERVICO");
        rotDescricao.setFont(new java.awt.Font("Segoe UI",1,14));rotDescricao.setText("Descricao.:");
        rotValor.setFont(new java.awt.Font("Segoe UI",1,14));rotValor.setText("Valor.....:");
        rotStatus.setFont(new java.awt.Font("Segoe UI",1,14));rotStatus.setText("Status....:");
        rotHoras.setFont(new java.awt.Font("Segoe UI",1,14));rotHoras.setText("Horas.....:");
        rotTipo.setFont(new java.awt.Font("Segoe UI",1,14));rotTipo.setText("Tipo Serv.:");
        tabPrestacao.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{},new String[]{"Descricao","Valor","Status","Horas","Tipo"}));
        jScrollPane1.setViewportView(tabPrestacao);
        btCadastrar.setFont(new java.awt.Font("Segoe UI",1,13));btCadastrar.setText("Cadastrar");btCadastrar.addActionListener(evt->btCadastrarActionPerformed(evt));
        btConsultar.setFont(new java.awt.Font("Segoe UI",1,13));btConsultar.setText("Consultar");btConsultar.addActionListener(evt->btConsultarActionPerformed(evt));
        btAlterar.setFont(new java.awt.Font("Segoe UI",1,13));btAlterar.setText("Alterar");btAlterar.addActionListener(evt->btAlterarActionPerformed(evt));
        btExcluir.setFont(new java.awt.Font("Segoe UI",1,13));btExcluir.setText("Excluir");btExcluir.addActionListener(evt->btExcluirActionPerformed(evt));
        btLimpar.setFont(new java.awt.Font("Segoe UI",1,13));btLimpar.setText("Limpar");btLimpar.addActionListener(evt->limpar());
        btVoltar.setFont(new java.awt.Font("Segoe UI",1,13));btVoltar.setText("Voltar");btVoltar.addActionListener(evt->{dispose();instancia=null;});

        javax.swing.GroupLayout layout=new javax.swing.GroupLayout(getContentPane());getContentPane().setLayout(layout);int lw=100;
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotTitulo)
                    .addGroup(r(layout,rotDescricao,lw,cxDescricao,250)).addGroup(r(layout,rotValor,lw,cxValor,100))
                    .addGroup(r(layout,rotStatus,lw,cxStatus,150)).addGroup(r(layout,rotHoras,lw,cxHoras,80))
                    .addGroup(r(layout,rotTipo,lw,cxTipo,200))
                    .addGroup(layout.createSequentialGroup().addComponent(btCadastrar).addGap(6).addComponent(btConsultar).addGap(6).addComponent(btAlterar).addGap(6).addComponent(btExcluir).addGap(6).addComponent(btLimpar).addGap(6).addComponent(btVoltar))
                    .addComponent(jScrollPane1,javax.swing.GroupLayout.PREFERRED_SIZE,540,javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20,Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(15).addComponent(rotTitulo).addGap(15)
                .addGroup(v(layout,rotDescricao,cxDescricao)).addGap(6).addGroup(v(layout,rotValor,cxValor)).addGap(6)
                .addGroup(v(layout,rotStatus,cxStatus)).addGap(6).addGroup(v(layout,rotHoras,cxHoras)).addGap(6).addGroup(v(layout,rotTipo,cxTipo)).addGap(12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btCadastrar).addComponent(btConsultar).addComponent(btAlterar).addComponent(btExcluir).addComponent(btLimpar).addComponent(btVoltar)).addGap(12)
                .addComponent(jScrollPane1,javax.swing.GroupLayout.PREFERRED_SIZE,130,javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(15,Short.MAX_VALUE)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private javax.swing.GroupLayout.Group r(javax.swing.GroupLayout l,javax.swing.JLabel lb,int lw,javax.swing.JTextField f,int fw){return l.createSequentialGroup().addComponent(lb,javax.swing.GroupLayout.PREFERRED_SIZE,lw,javax.swing.GroupLayout.PREFERRED_SIZE).addGap(5).addComponent(f,javax.swing.GroupLayout.PREFERRED_SIZE,fw,javax.swing.GroupLayout.PREFERRED_SIZE);}
    private javax.swing.GroupLayout.Group v(javax.swing.GroupLayout l,javax.swing.JComponent a,javax.swing.JComponent b){return l.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(a).addComponent(b);}

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt){
        try{PrestacaoServico p=new PrestacaoServico();p.setDescricao(cxDescricao.getText());p.setValor(Double.parseDouble(cxValor.getText()));p.setStatus(cxStatus.getText());p.setHoras(Double.parseDouble(cxHoras.getText()));p.setTipoServico(cxTipo.getText());bdPrestacao.inserir(p);JOptionPane.showMessageDialog(this,"Prestacao cadastrada!","Cadastro",JOptionPane.INFORMATION_MESSAGE);atualizarTabela();limpar();}
        catch(ValorInvalidoException ex){JOptionPane.showMessageDialog(this,"Valor deve ser maior que zero!","Erro",JOptionPane.ERROR_MESSAGE);}
        catch(NumberFormatException ex){JOptionPane.showMessageDialog(this,"Valor ou horas invalidos!","Erro",JOptionPane.ERROR_MESSAGE);}
    }
    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt){
        PrestacaoServico p=bdPrestacao.consultar(cxDescricao.getText().trim());
        if(p!=null){cxValor.setText(String.valueOf(p.getValor()));cxStatus.setText(p.getStatus());cxHoras.setText(String.valueOf(p.getHoras()));cxTipo.setText(p.getTipoServico());JOptionPane.showMessageDialog(this,"Prestacao encontrada!","Consulta",JOptionPane.INFORMATION_MESSAGE);}
        else{JOptionPane.showMessageDialog(this,"Prestacao nao encontrada.","Consulta",JOptionPane.ERROR_MESSAGE);}
    }
    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt){
        String desc=cxDescricao.getText().trim();
        if(bdPrestacao.consultar(desc)==null){JOptionPane.showMessageDialog(this,"Prestacao nao encontrada! Consulte uma descricao existente antes de alterar.","Erro",JOptionPane.ERROR_MESSAGE);return;}
        try{PrestacaoServico p=new PrestacaoServico();p.setDescricao(desc);p.setValor(Double.parseDouble(cxValor.getText()));p.setStatus(cxStatus.getText());p.setHoras(Double.parseDouble(cxHoras.getText()));p.setTipoServico(cxTipo.getText());bdPrestacao.alterar(p);JOptionPane.showMessageDialog(this,"Prestacao alterada com sucesso!","Alteracao",JOptionPane.INFORMATION_MESSAGE);atualizarTabela();limpar();}
        catch(ValorInvalidoException ex){JOptionPane.showMessageDialog(this,"Valor deve ser maior que zero!","Erro",JOptionPane.ERROR_MESSAGE);}
        catch(NumberFormatException ex){JOptionPane.showMessageDialog(this,"Valor ou horas invalidos!","Erro",JOptionPane.ERROR_MESSAGE);}
    }
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt){
        String desc=cxDescricao.getText().trim();
        if(bdPrestacao.excluir(desc)){JOptionPane.showMessageDialog(this,"Prestacao excluida com sucesso!","Exclusao",JOptionPane.INFORMATION_MESSAGE);atualizarTabela();limpar();}
        else{JOptionPane.showMessageDialog(this,"Prestacao nao encontrada.","Exclusao",JOptionPane.ERROR_MESSAGE);}
    }
    private void limpar(){cxDescricao.setText("");cxValor.setText("");cxStatus.setText("");cxHoras.setText("");cxTipo.setText("");cxDescricao.requestFocus();}
    public void atualizarTabela(){DefaultTableModel m=(DefaultTableModel)tabPrestacao.getModel();m.setRowCount(0);for(PrestacaoServico p:bdPrestacao.getBdPrestacao())m.addRow(new Object[]{p.getDescricao(),p.getValor(),p.getStatus(),p.getHoras(),p.getTipoServico()});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar,btConsultar,btAlterar,btExcluir,btLimpar,btVoltar;
    private javax.swing.JTextField cxDescricao,cxHoras,cxStatus,cxTipo,cxValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotDescricao,rotHoras,rotStatus,rotTipo,rotTitulo,rotValor;
    private javax.swing.JTable tabPrestacao;
    // End of variables declaration//GEN-END:variables
}

// Joao Victor Queiroz de Lima Ra.: 2051524
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadCaminhonete extends javax.swing.JFrame {
    private static FormCadCaminhonete instancia;
    private BDCaminhonete bdCaminhonete = BDCaminhonete.getInstancia();
    private FormCadCaminhonete(){initComponents();configurarAtualizacaoAutomatica();}

    // Sobrecarga do construtor
    private FormCadCaminhonete(String titulo) {
        this();
        setTitle(titulo);
    }

    //MÉTODO SINGLETON
    public static FormCadCaminhonete geraForm(){if(instancia==null)instancia=new FormCadCaminhonete();return instancia;}


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
        rotTitulo=new javax.swing.JLabel();rotPlaca=new javax.swing.JLabel();cxPlaca=new javax.swing.JTextField();
        rotMarca=new javax.swing.JLabel();cxMarca=new javax.swing.JTextField();rotModelo=new javax.swing.JLabel();cxModelo=new javax.swing.JTextField();
        rotCor=new javax.swing.JLabel();cxCor=new javax.swing.JTextField();rotCarga=new javax.swing.JLabel();cxCarga=new javax.swing.JTextField();
        rotEixos=new javax.swing.JLabel();cxEixos=new javax.swing.JTextField();
        btCadastrar=new javax.swing.JButton();btConsultar=new javax.swing.JButton();btAlterar=new javax.swing.JButton();btExcluir=new javax.swing.JButton();btLimpar=new javax.swing.JButton();btVoltar=new javax.swing.JButton();
        jScrollPane1=new javax.swing.JScrollPane();tabCaminhonete=new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);setTitle("Cadastro de Caminhonete");
        rotTitulo.setFont(new java.awt.Font("Segoe UI",1,22));rotTitulo.setText("CADASTRO DE CAMINHONETE");
        rotPlaca.setFont(new java.awt.Font("Segoe UI",1,14));rotPlaca.setText("Placa......:");
        rotMarca.setFont(new java.awt.Font("Segoe UI",1,14));rotMarca.setText("Marca......:");
        rotModelo.setFont(new java.awt.Font("Segoe UI",1,14));rotModelo.setText("Modelo.....:");
        rotCor.setFont(new java.awt.Font("Segoe UI",1,14));rotCor.setText("Cor........:");
        rotCarga.setFont(new java.awt.Font("Segoe UI",1,14));rotCarga.setText("Carga Max..:");
        rotEixos.setFont(new java.awt.Font("Segoe UI",1,14));rotEixos.setText("Eixos......:");
        tabCaminhonete.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{},new String[]{"Placa","Marca","Modelo","Cor","Carga Max","Eixos"}));
        jScrollPane1.setViewportView(tabCaminhonete);
        btCadastrar.setFont(new java.awt.Font("Segoe UI",1,13));btCadastrar.setText("Cadastrar");btCadastrar.addActionListener(evt->btCadastrarActionPerformed(evt));
        btConsultar.setFont(new java.awt.Font("Segoe UI",1,13));btConsultar.setText("Consultar Placa");btConsultar.addActionListener(evt->btConsultarActionPerformed(evt));
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
                    .addGroup(r(layout,rotPlaca,lw,cxPlaca,120)).addGroup(r(layout,rotMarca,lw,cxMarca,200))
                    .addGroup(r(layout,rotModelo,lw,cxModelo,200)).addGroup(r(layout,rotCor,lw,cxCor,200))
                    .addGroup(r(layout,rotCarga,lw,cxCarga,100)).addGroup(r(layout,rotEixos,lw,cxEixos,60))
                    .addGroup(layout.createSequentialGroup().addComponent(btCadastrar).addGap(6).addComponent(btConsultar).addGap(6).addComponent(btAlterar).addGap(6).addComponent(btExcluir).addGap(6).addComponent(btLimpar).addGap(6).addComponent(btVoltar))
                    .addComponent(jScrollPane1,javax.swing.GroupLayout.PREFERRED_SIZE,560,javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20,Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(15).addComponent(rotTitulo).addGap(15)
                .addGroup(v(layout,rotPlaca,cxPlaca)).addGap(6).addGroup(v(layout,rotMarca,cxMarca)).addGap(6)
                .addGroup(v(layout,rotModelo,cxModelo)).addGap(6).addGroup(v(layout,rotCor,cxCor)).addGap(6)
                .addGroup(v(layout,rotCarga,cxCarga)).addGap(6).addGroup(v(layout,rotEixos,cxEixos)).addGap(12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btCadastrar).addComponent(btConsultar).addComponent(btAlterar).addComponent(btExcluir).addComponent(btLimpar).addComponent(btVoltar)).addGap(12)
                .addComponent(jScrollPane1,javax.swing.GroupLayout.PREFERRED_SIZE,130,javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(15,Short.MAX_VALUE)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private javax.swing.GroupLayout.Group r(javax.swing.GroupLayout l,javax.swing.JLabel lb,int lw,javax.swing.JTextField f,int fw){return l.createSequentialGroup().addComponent(lb,javax.swing.GroupLayout.PREFERRED_SIZE,lw,javax.swing.GroupLayout.PREFERRED_SIZE).addGap(5).addComponent(f,javax.swing.GroupLayout.PREFERRED_SIZE,fw,javax.swing.GroupLayout.PREFERRED_SIZE);}
    private javax.swing.GroupLayout.Group v(javax.swing.GroupLayout l,javax.swing.JComponent a,javax.swing.JComponent b){return l.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(a).addComponent(b);}

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt){
        try{Caminhonete c=new Caminhonete();c.setPlaca(cxPlaca.getText());c.setMarca(cxMarca.getText());c.setModelo(cxModelo.getText());c.setCor(cxCor.getText());c.setCargaMax(Double.parseDouble(cxCarga.getText()));c.setEixos(Integer.parseInt(cxEixos.getText()));bdCaminhonete.inserir(c);JOptionPane.showMessageDialog(this,"Caminhonete cadastrada!","Cadastro",JOptionPane.INFORMATION_MESSAGE);atualizarTabela();limpar();}catch(NumberFormatException ex){JOptionPane.showMessageDialog(this,"Valores numericos invalidos!","Erro",JOptionPane.ERROR_MESSAGE);}
    }
    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt){
        Caminhonete c=bdCaminhonete.consultar(cxPlaca.getText().trim());
        if(c!=null){cxMarca.setText(c.getMarca());cxModelo.setText(c.getModelo());cxCor.setText(c.getCor());cxCarga.setText(String.valueOf(c.getCargaMax()));cxEixos.setText(String.valueOf(c.getEixos()));JOptionPane.showMessageDialog(this,"Caminhonete encontrada!","Consulta",JOptionPane.INFORMATION_MESSAGE);}
        else{JOptionPane.showMessageDialog(this,"Caminhonete nao encontrada.","Consulta",JOptionPane.ERROR_MESSAGE);}
    }
    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt){
        String placa=cxPlaca.getText().trim();
        if(bdCaminhonete.consultar(placa)==null){JOptionPane.showMessageDialog(this,"Caminhonete nao encontrada! Consulte uma placa existente antes de alterar.","Erro",JOptionPane.ERROR_MESSAGE);return;}
        try{Caminhonete c=new Caminhonete();c.setPlaca(placa);c.setMarca(cxMarca.getText());c.setModelo(cxModelo.getText());c.setCor(cxCor.getText());c.setCargaMax(Double.parseDouble(cxCarga.getText()));c.setEixos(Integer.parseInt(cxEixos.getText()));bdCaminhonete.alterar(c);JOptionPane.showMessageDialog(this,"Caminhonete alterada com sucesso!","Alteracao",JOptionPane.INFORMATION_MESSAGE);atualizarTabela();limpar();}catch(NumberFormatException ex){JOptionPane.showMessageDialog(this,"Valores numericos invalidos!","Erro",JOptionPane.ERROR_MESSAGE);}
    }
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt){
        String placa=cxPlaca.getText().trim();
        if(bdCaminhonete.excluir(placa)){JOptionPane.showMessageDialog(this,"Caminhonete excluida com sucesso!","Exclusao",JOptionPane.INFORMATION_MESSAGE);atualizarTabela();limpar();}
        else{JOptionPane.showMessageDialog(this,"Caminhonete nao encontrada.","Exclusao",JOptionPane.ERROR_MESSAGE);}
    }
    private void limpar(){cxPlaca.setText("");cxMarca.setText("");cxModelo.setText("");cxCor.setText("");cxCarga.setText("");cxEixos.setText("");cxPlaca.requestFocus();}
    public void atualizarTabela(){DefaultTableModel m=(DefaultTableModel)tabCaminhonete.getModel();m.setRowCount(0);for(Caminhonete c:bdCaminhonete.getBdCaminhonete())m.addRow(new Object[]{c.getPlaca(),c.getMarca(),c.getModelo(),c.getCor(),c.getCargaMax(),c.getEixos()});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar,btConsultar,btAlterar,btExcluir,btLimpar,btVoltar;
    private javax.swing.JTextField cxCarga,cxCor,cxEixos,cxMarca,cxModelo,cxPlaca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotCarga,rotCor,rotEixos,rotMarca,rotModelo,rotPlaca,rotTitulo;
    private javax.swing.JTable tabCaminhonete;
    // End of variables declaration//GEN-END:variables
}

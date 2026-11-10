// Joao Victor Queiroz de Lima Ra.: 2051524
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCadOS extends javax.swing.JFrame {
    private static FormCadOS instancia;
    private BDOS bdOS = BDOS.getInstancia();
    private BDCliente bdCliente = BDCliente.getInstancia();
    private BDProfissional bdProfissional = BDProfissional.getInstancia();
    private BDCarro bdCarro = BDCarro.getInstancia();
    private BDMoto bdMoto = BDMoto.getInstancia();
    private BDCaminhonete bdCaminhonete = BDCaminhonete.getInstancia();
    private BDMaterial bdMaterial = BDMaterial.getInstancia();
    private BDPrestacaoServico bdPrestacao = BDPrestacaoServico.getInstancia();

    private FormCadOS(){initComponents();configurarAtualizacaoAutomatica();}

    // Sobrecarga do construtor
    private FormCadOS(String titulo) {
        this();
        setTitle(titulo);
    }

    //MÉTODO SINGLETON
    public static FormCadOS geraForm(){if(instancia==null)instancia=new FormCadOS();return instancia;}


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
        rotNumOS=new javax.swing.JLabel();cxNumOS=new javax.swing.JTextField();
        rotDataEntrada=new javax.swing.JLabel();cxDataEntrada=new javax.swing.JTextField();
        rotPrevisao=new javax.swing.JLabel();cxPrevisao=new javax.swing.JTextField();
        rotObservacao=new javax.swing.JLabel();cxObservacao=new javax.swing.JTextField();
        rotCpfCliente=new javax.swing.JLabel();cxCpfCliente=new javax.swing.JTextField();
        rotCpfProfissional=new javax.swing.JLabel();cxCpfProfissional=new javax.swing.JTextField();
        rotPlacaVeiculo=new javax.swing.JLabel();cxPlacaVeiculo=new javax.swing.JTextField();
        rotDescServico=new javax.swing.JLabel();cxDescServico=new javax.swing.JTextField();
        btAbrir=new javax.swing.JButton();btAlterar=new javax.swing.JButton();btExcluir=new javax.swing.JButton();btLimpar=new javax.swing.JButton();btVoltar=new javax.swing.JButton();
        jScrollPane1=new javax.swing.JScrollPane();tabOS=new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);setTitle("Abrir Ordem de Servico");
        rotTitulo.setFont(new java.awt.Font("Segoe UI",1,22));rotTitulo.setText("ABRIR ORDEM DE SERVICO");
        int fw=14;
        rotNumOS.setFont(new java.awt.Font("Segoe UI",1,fw));rotNumOS.setText("Numero OS...........:");
        rotDataEntrada.setFont(new java.awt.Font("Segoe UI",1,fw));rotDataEntrada.setText("Data Entrada........:");
        rotPrevisao.setFont(new java.awt.Font("Segoe UI",1,fw));rotPrevisao.setText("Previsao............:");
        rotObservacao.setFont(new java.awt.Font("Segoe UI",1,fw));rotObservacao.setText("Observacao..........:");
        rotCpfCliente.setFont(new java.awt.Font("Segoe UI",1,fw));rotCpfCliente.setText("CPF Cliente.........:");
        rotCpfProfissional.setFont(new java.awt.Font("Segoe UI",1,fw));rotCpfProfissional.setText("CPF Profissional....:");
        rotPlacaVeiculo.setFont(new java.awt.Font("Segoe UI",1,fw));rotPlacaVeiculo.setText("Placa Veiculo.......:");
        rotDescServico.setFont(new java.awt.Font("Segoe UI",1,fw));rotDescServico.setText("Descricao Servico...:");

        tabOS.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{},new String[]{"Num OS","Data","Previsao","CPF Cliente","Placa","Servico"}));
        jScrollPane1.setViewportView(tabOS);
        btAbrir.setFont(new java.awt.Font("Segoe UI",1,13));btAbrir.setText("Abrir OS");btAbrir.addActionListener(evt->btAbrirActionPerformed(evt));
        btAlterar.setFont(new java.awt.Font("Segoe UI",1,13));btAlterar.setText("Alterar");btAlterar.addActionListener(evt->btAlterarActionPerformed(evt));
        btExcluir.setFont(new java.awt.Font("Segoe UI",1,13));btExcluir.setText("Excluir");btExcluir.addActionListener(evt->btExcluirActionPerformed(evt));
        btLimpar.setFont(new java.awt.Font("Segoe UI",1,13));btLimpar.setText("Limpar");btLimpar.addActionListener(evt->limpar());
        btVoltar.setFont(new java.awt.Font("Segoe UI",1,13));btVoltar.setText("Voltar");btVoltar.addActionListener(evt->{dispose();instancia=null;});

        javax.swing.GroupLayout layout=new javax.swing.GroupLayout(getContentPane());getContentPane().setLayout(layout);int lw=170;
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotTitulo)
                    .addGroup(r(layout,rotNumOS,lw,cxNumOS,80)).addGroup(r(layout,rotDataEntrada,lw,cxDataEntrada,120))
                    .addGroup(r(layout,rotPrevisao,lw,cxPrevisao,120)).addGroup(r(layout,rotObservacao,lw,cxObservacao,250))
                    .addGroup(r(layout,rotCpfCliente,lw,cxCpfCliente,150)).addGroup(r(layout,rotCpfProfissional,lw,cxCpfProfissional,150))
                    .addGroup(r(layout,rotPlacaVeiculo,lw,cxPlacaVeiculo,120)).addGroup(r(layout,rotDescServico,lw,cxDescServico,250))
                    .addGroup(layout.createSequentialGroup().addComponent(btAbrir).addGap(6).addComponent(btAlterar).addGap(6).addComponent(btExcluir).addGap(6).addComponent(btLimpar).addGap(6).addComponent(btVoltar))
                    .addComponent(jScrollPane1,javax.swing.GroupLayout.PREFERRED_SIZE,600,javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20,Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(15).addComponent(rotTitulo).addGap(15)
                .addGroup(v(layout,rotNumOS,cxNumOS)).addGap(6).addGroup(v(layout,rotDataEntrada,cxDataEntrada)).addGap(6)
                .addGroup(v(layout,rotPrevisao,cxPrevisao)).addGap(6).addGroup(v(layout,rotObservacao,cxObservacao)).addGap(6)
                .addGroup(v(layout,rotCpfCliente,cxCpfCliente)).addGap(6).addGroup(v(layout,rotCpfProfissional,cxCpfProfissional)).addGap(6)
                .addGroup(v(layout,rotPlacaVeiculo,cxPlacaVeiculo)).addGap(6).addGroup(v(layout,rotDescServico,cxDescServico)).addGap(12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btAbrir).addComponent(btAlterar).addComponent(btExcluir).addComponent(btLimpar).addComponent(btVoltar)).addGap(12)
                .addComponent(jScrollPane1,javax.swing.GroupLayout.PREFERRED_SIZE,130,javax.swing.GroupLayout.PREFERRED_SIZE).addContainerGap(15,Short.MAX_VALUE)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private javax.swing.GroupLayout.Group r(javax.swing.GroupLayout l,javax.swing.JLabel lb,int lw,javax.swing.JTextField f,int fw){return l.createSequentialGroup().addComponent(lb,javax.swing.GroupLayout.PREFERRED_SIZE,lw,javax.swing.GroupLayout.PREFERRED_SIZE).addGap(5).addComponent(f,javax.swing.GroupLayout.PREFERRED_SIZE,fw,javax.swing.GroupLayout.PREFERRED_SIZE);}
    private javax.swing.GroupLayout.Group v(javax.swing.GroupLayout l,javax.swing.JComponent a,javax.swing.JComponent b){return l.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(a).addComponent(b);}

    // Busca o Cliente, Profissional, Veiculo e Servico ja cadastrados a partir dos dados digitados.
    // Retorna null e mostra a mensagem de erro correspondente se algum nao for encontrado.
    private OrdemServico montarOS() {
        Cliente cliente = bdCliente.consultar(cxCpfCliente.getText().trim());
        if (cliente == null) {
            JOptionPane.showMessageDialog(this, "Cliente nao encontrado! Cadastre o cliente antes de abrir a OS.", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        Profissional profissional = bdProfissional.consultar(cxCpfProfissional.getText().trim());
        if (profissional == null) {
            JOptionPane.showMessageDialog(this, "Profissional nao encontrado! Cadastre o profissional antes de abrir a OS.", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        String placa = cxPlacaVeiculo.getText().trim();
        Veiculo veiculo = bdCarro.consultar(placa);
        if (veiculo == null) veiculo = bdMoto.consultar(placa);
        if (veiculo == null) veiculo = bdCaminhonete.consultar(placa);
        if (veiculo == null) {
            JOptionPane.showMessageDialog(this, "Veiculo nao encontrado! Cadastre o veiculo antes de abrir a OS.", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        String descServico = cxDescServico.getText().trim();
        Servico servico = bdMaterial.consultar(descServico);
        if (servico == null) servico = bdPrestacao.consultar(descServico);
        if (servico == null) {
            JOptionPane.showMessageDialog(this, "Servico/Material nao encontrado! Cadastre antes de abrir a OS.", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        OrdemServico os = new OrdemServico();
        os.setNumeroOS(Integer.parseInt(cxNumOS.getText()));
        os.setDataEntrada(cxDataEntrada.getText());
        os.setPrevisao(cxPrevisao.getText());
        os.setObservacao(cxObservacao.getText());
        os.setCliente(cliente);
        os.setProfissional(profissional);
        os.setVeiculo(veiculo);
        os.setServico(servico);
        return os;
    }

    private void btAbrirActionPerformed(java.awt.event.ActionEvent evt){
        try{
            OrdemServico os = montarOS();
            if (os == null) return;
            bdOS.inserir(os);
            JOptionPane.showMessageDialog(this,"Ordem de Servico aberta com sucesso!","Abertura de OS",JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela();limpar();
        }catch(NumberFormatException ex){JOptionPane.showMessageDialog(this,"Numero da OS invalido!","Erro",JOptionPane.ERROR_MESSAGE);}
    }

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt){
        try{
            String numOS = cxNumOS.getText().trim();
            if (bdOS.consultar(numOS) == null) {
                JOptionPane.showMessageDialog(this,"OS nao encontrada! Informe um numero de OS existente para alterar.","Erro",JOptionPane.ERROR_MESSAGE);
                return;
            }
            OrdemServico os = montarOS();
            if (os == null) return;
            bdOS.alterar(os);
            JOptionPane.showMessageDialog(this,"Ordem de Servico alterada com sucesso!","Alteracao",JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela();limpar();
        }catch(NumberFormatException ex){JOptionPane.showMessageDialog(this,"Numero da OS invalido!","Erro",JOptionPane.ERROR_MESSAGE);}
    }

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt){
        String numOS = cxNumOS.getText().trim();
        if (bdOS.excluir(numOS)) {
            JOptionPane.showMessageDialog(this,"Ordem de Servico excluida com sucesso!","Exclusao",JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela();limpar();
        } else {
            JOptionPane.showMessageDialog(this,"OS nao encontrada.","Exclusao",JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpar(){cxNumOS.setText("");cxDataEntrada.setText("");cxPrevisao.setText("");cxObservacao.setText("");cxCpfCliente.setText("");cxCpfProfissional.setText("");cxPlacaVeiculo.setText("");cxDescServico.setText("");cxNumOS.requestFocus();}
    public void atualizarTabela(){DefaultTableModel m=(DefaultTableModel)tabOS.getModel();m.setRowCount(0);for(OrdemServico os:bdOS.getBdOS())m.addRow(new Object[]{os.getNumeroOS(),os.getDataEntrada(),os.getPrevisao(),os.getCliente().getCpf(),os.getVeiculo().getPlaca(),os.getServico().getDescricao()});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrir,btAlterar,btExcluir,btLimpar,btVoltar;
    private javax.swing.JTextField cxCpfCliente,cxCpfProfissional,cxDataEntrada,cxDescServico,cxNumOS,cxObservacao,cxPlacaVeiculo,cxPrevisao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotCpfCliente,rotCpfProfissional,rotDataEntrada,rotDescServico,rotNumOS,rotObservacao,rotPlacaVeiculo,rotPrevisao,rotTitulo;
    private javax.swing.JTable tabOS;
    // End of variables declaration//GEN-END:variables
}

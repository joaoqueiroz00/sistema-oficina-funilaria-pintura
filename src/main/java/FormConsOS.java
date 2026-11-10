// Joao Victor Queiroz de Lima Ra.: 2051524
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormConsOS extends javax.swing.JFrame {
    private static FormConsOS instancia;
    private BDOS bdOS = BDOS.getInstancia();
    private FormConsOS(){initComponents();configurarAtualizacaoAutomatica();}

    // Sobrecarga do construtor
    private FormConsOS(String titulo) {
        this();
        setTitle(titulo);
    }

    //MÉTODO SINGLETON
    public static FormConsOS geraForm(){if(instancia==null)instancia=new FormConsOS();return instancia;}


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
        rotNumOS=new javax.swing.JLabel(); cxNumOS=new javax.swing.JTextField();
        btConsultar=new javax.swing.JButton(); btLimpar=new javax.swing.JButton(); btVoltar=new javax.swing.JButton();
        jScrollPane1=new javax.swing.JScrollPane(); tabOS=new javax.swing.JTable();
        areaResultado=new javax.swing.JTextArea();
        jScrollPane2=new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Ordem de Servico");
        rotTitulo.setFont(new java.awt.Font("Segoe UI",1,22)); rotTitulo.setText("CONSULTAR ORDEM DE SERVICO");
        rotNumOS.setFont(new java.awt.Font("Segoe UI",1,14)); rotNumOS.setText("Numero OS:");
        tabOS.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{},new String[]{"Num OS","Data Entrada","Previsao","Observacao"}));
        jScrollPane1.setViewportView(tabOS);
        areaResultado.setEditable(false); areaResultado.setFont(new java.awt.Font("Monospaced",0,13));
        areaResultado.setRows(8); jScrollPane2.setViewportView(areaResultado);
        btConsultar.setFont(new java.awt.Font("Segoe UI",1,13)); btConsultar.setText("Consultar");
        btConsultar.addActionListener(evt->btConsultarActionPerformed(evt));
        btLimpar.setFont(new java.awt.Font("Segoe UI",1,13)); btLimpar.setText("Limpar");
        btLimpar.addActionListener(evt->limpar());
        btVoltar.setFont(new java.awt.Font("Segoe UI",1,13)); btVoltar.setText("Voltar");
        btVoltar.addActionListener(evt->{dispose();instancia=null;});


        javax.swing.GroupLayout layout=new javax.swing.GroupLayout(getContentPane()); getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rotTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rotNumOS,javax.swing.GroupLayout.PREFERRED_SIZE,90,javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5).addComponent(cxNumOS,javax.swing.GroupLayout.PREFERRED_SIZE,100,javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup().addComponent(btConsultar).addGap(8).addComponent(btLimpar).addGap(8).addComponent(btVoltar))
                    .addComponent(jScrollPane1,javax.swing.GroupLayout.PREFERRED_SIZE,500,javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2,javax.swing.GroupLayout.PREFERRED_SIZE,500,javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20,Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(15).addComponent(rotTitulo).addGap(15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(rotNumOS).addComponent(cxNumOS)).addGap(12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btConsultar).addComponent(btLimpar).addComponent(btVoltar)).addGap(12)
                .addComponent(jScrollPane1,javax.swing.GroupLayout.PREFERRED_SIZE,120,javax.swing.GroupLayout.PREFERRED_SIZE).addGap(10)
                .addComponent(jScrollPane2,javax.swing.GroupLayout.PREFERRED_SIZE,150,javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15,Short.MAX_VALUE)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt){
        String num=cxNumOS.getText().trim();
        DefaultTableModel m=(DefaultTableModel)tabOS.getModel(); m.setRowCount(0); areaResultado.setText("");
        OrdemServico os = bdOS.consultar(num);
        if (os != null) {
            m.addRow(new Object[]{os.getNumeroOS(),os.getDataEntrada(),os.getPrevisao(),os.getObservacao()});
            areaResultado.setText(os.exibirOS());
            JOptionPane.showMessageDialog(this,"OS encontrada!","Consulta",JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,"OS nao encontrada.","Consulta",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void limpar(){ cxNumOS.setText(""); areaResultado.setText(""); atualizarTabela(); }

    public void atualizarTabela(){
        DefaultTableModel m=(DefaultTableModel)tabOS.getModel();
        m.setRowCount(0);
        for(OrdemServico os:bdOS.getBdOS()){
            m.addRow(new Object[]{os.getNumeroOS(),os.getDataEntrada(),os.getPrevisao(),os.getObservacao()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaResultado;
    private javax.swing.JButton btConsultar,btLimpar,btVoltar;
    private javax.swing.JTextField cxNumOS;
    private javax.swing.JScrollPane jScrollPane1,jScrollPane2;
    private javax.swing.JLabel rotNumOS,rotTitulo;
    private javax.swing.JTable tabOS;
    // End of variables declaration//GEN-END:variables
}

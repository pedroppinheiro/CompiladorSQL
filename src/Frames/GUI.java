package Frames;

import AnalisadorLexico.AnaliseLexica;
import AnalisadorLexico.CadeiaDeTokens;
import LogErros.LogErros;
import AnalisadorLexico.TabelaDeSimbolos;
import AnalisadorSintatico.AnaliseSintatica;
import Codigo.CodigoFonte;
import Dicionario.Palavras;
import Efeitos.AutoIndentAction;
import Efeitos.ColumnFitAdapter;
import Efeitos.CurrentLineHighlighter;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.UnsupportedLookAndFeelException;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        URL urlImg = this.getClass().getResource("/img/New database.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlImg);
        this.setIconImage(imagemTitulo);
        setSize(800, 600);
        setLocationRelativeTo(null);
        entradaTextArea.requestFocus(true);
        CurrentLineHighlighter.install(entradaTextArea);
        entradaTextArea.registerKeyboardAction(new AutoIndentAction(), KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), JComponent.WHEN_FOCUSED);
        TabelaSimbolos.getTableHeader().addMouseListener(new ColumnFitAdapter());
        Palavras.iniciarDicionario();
    }
    
    AnaliseLexica afd = new AnaliseLexica();
    AnaliseSintatica as = new AnaliseSintatica();
    LogErros erro;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        LinhasLabel = new javax.swing.JLabel();
        CompilarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        entradaTextArea = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        saidaTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaSimbolos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tokensTextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CompilarMenu = new javax.swing.JMenuItem();
        SairMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        SobreMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador SQL");
        setMinimumSize(new java.awt.Dimension(600, 400));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        LinhasLabel.setText("1:0");

        CompilarBtn.setText("Compilar");
        CompilarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompilarBtnActionPerformed(evt);
            }
        });

        entradaTextArea.setColumns(20);
        entradaTextArea.setRows(5);
        entradaTextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entradaTextAreaMouseClicked(evt);
            }
        });
        entradaTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                entradaTextAreaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(entradaTextArea);

        saidaTextArea.setColumns(20);
        saidaTextArea.setEditable(false);
        saidaTextArea.setFont(new java.awt.Font("Monospaced", 0, 11));
        saidaTextArea.setRows(5);
        jScrollPane4.setViewportView(saidaTextArea);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Saída - CompiladorSQL (run)", jPanel8);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CompilarBtn)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LinhasLabel))
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LinhasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompilarBtn))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Código Fonte", jPanel2);

        TabelaSimbolos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Índice", "Conteúdo", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabelaSimbolos);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tabela de Símbolos", jPanel3);

        tokensTextArea.setColumns(20);
        tokensTextArea.setEditable(false);
        tokensTextArea.setLineWrap(true);
        tokensTextArea.setRows(5);
        jScrollPane3.setViewportView(tokensTextArea);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadeia de Tokens", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );

        jMenu1.setText("Arquivo");

        CompilarMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        CompilarMenu.setText("Compilar");
        CompilarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompilarMenuActionPerformed(evt);
            }
        });
        jMenu1.add(CompilarMenu);

        SairMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        SairMenu.setText("Sair");
        SairMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairMenuActionPerformed(evt);
            }
        });
        jMenu1.add(SairMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        SobreMenu.setText("Sobre");
        SobreMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreMenuActionPerformed(evt);
            }
        });
        jMenu2.add(SobreMenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CompilarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompilarBtnActionPerformed
        Executar();
}//GEN-LAST:event_CompilarBtnActionPerformed

    private void CompilarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompilarMenuActionPerformed
        Executar();
}//GEN-LAST:event_CompilarMenuActionPerformed

    private void SobreMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreMenuActionPerformed
        Frames.Sobre sobre = new Frames.Sobre();
        sobre.setVisible(true);
}//GEN-LAST:event_SobreMenuActionPerformed

    private void SairMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairMenuActionPerformed
        System.exit(0);
}//GEN-LAST:event_SairMenuActionPerformed

    private void entradaTextAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entradaTextAreaKeyReleased

        setLinhasLabel(getCurrentLineNumber() + ":" + getCurrentChar());

    }//GEN-LAST:event_entradaTextAreaKeyReleased

    private void entradaTextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entradaTextAreaMouseClicked

        setLinhasLabel(getCurrentLineNumber() + ":" + getCurrentChar());
    }//GEN-LAST:event_entradaTextAreaMouseClicked

    private void Executar() {

        LogErros.setEncontrado(false);
        Limpar();
        Compilar();
    }

    private void Limpar() {

        CadeiaDeTokens.LimparCadeia();
        TabelaDeSimbolos.LimparTabelaSimbolos();

        //limpa o jTable
        javax.swing.table.DefaultTableModel dtm =
                (javax.swing.table.DefaultTableModel) TabelaSimbolos.getModel();

        for (int i = (dtm.getRowCount() - 1); i >= 0; --i) {
            dtm.removeRow(i);
        }
        //fim

        //limpar a cadeia de tokens
        tokensTextArea.setText("");
        //fim

        saidaTextArea.setText("");

        TabelaDeSimbolos.simbolo.clear();
        TabelaDeSimbolos.respectivosIndices.clear();
        TabelaDeSimbolos.saida = false;


    }

    private void Compilar() {

        CodigoFonte.setCodigoFonte(entradaTextArea.getText());

        erro = afd.Executar();
        if (erro.getEncontrado()) {
            Limpar();
            saidaTextArea.setText("Erro na Análise Léxica\n" + erro.getNome() + ". Perto de: " + erro.getLocalizacao() + "\n" + erro.getMensagem() + ".");
        } else {
            erro = as.Executar();
            if (erro.getEncontrado()) {
                Limpar();
                saidaTextArea.setText("Erro na Análise Sintática\n" + erro.getNome() + ". Perto de: " + erro.getLocalizacao() + "\n" + erro.getMensagem() + ".");
            } else {
                saidaTextArea.setText("run:\nCOMPILADO COM SUCESSO");
                TabelaDeSimbolos();
                CadeiaDeTokens();
            }
        }
    }

    private void TabelaDeSimbolos() {

        javax.swing.table.DefaultTableModel dtm =
                (javax.swing.table.DefaultTableModel) TabelaSimbolos.getModel();

        List<String> tabelaDeSimbolos = TabelaDeSimbolos.getTabelaDeSimbolos();
        for (int i = 0; i != tabelaDeSimbolos.size(); i += 3) {
            dtm.addRow(new Object[]{
                        tabelaDeSimbolos.get(i),
                        tabelaDeSimbolos.get(i + 1),
                        tabelaDeSimbolos.get(i + 2)
                    });
        }
    }

    private void CadeiaDeTokens() {
        tokensTextArea.append("Cadeia de Tokens gerada:\n\n");
        List<String> cadeiaDeTokens = CadeiaDeTokens.getCadeiaDeTokens();
        for (int i = 0; i < cadeiaDeTokens.size(); i++) {
            tokensTextArea.append(cadeiaDeTokens.get(i));
        }
    }

    public int getCurrentLineNumber() {
        int line;
        int caretPosition = entradaTextArea.getCaretPosition();
        javax.swing.text.Element root =
                entradaTextArea.getDocument().getDefaultRootElement();
        line = root.getElementIndex(caretPosition) + 1;
        return line;
    }

    public int getCurrentChar() {
        return entradaTextArea.getCaretPosition();
    }

    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CompilarBtn;
    private javax.swing.JMenuItem CompilarMenu;
    private javax.swing.JLabel LinhasLabel;
    private javax.swing.JMenuItem SairMenu;
    private javax.swing.JMenuItem SobreMenu;
    private javax.swing.JTable TabelaSimbolos;
    private javax.swing.JTextArea entradaTextArea;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea saidaTextArea;
    private javax.swing.JTextArea tokensTextArea;
    // End of variables declaration//GEN-END:variables

    public void setLinhasLabel(String texto) {
        LinhasLabel.setText(texto);
    }
}

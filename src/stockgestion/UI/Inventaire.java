/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockgestion.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import stockgestion.Controlleur.ArticleControlleur;
import stockgestion.Entite.*;

/**
 *
 * @author rubeus
 */
public class Inventaire extends javax.swing.JFrame {
    private static Inventaire instance = null;

    private Inventaire() {
        initComponents();
        addActionListeners();
        setTitle("Inventaire");
        refreshTable(ArticleControlleur.getInstance().getAllArticles());
    }
    
    public static Inventaire getInstance(){
        if(instance == null){
            instance = new Inventaire();
        }
        return instance;
    }
    
    private void addActionListeners(){
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Inventaire.this.setVisible(false);
                InterfaceUtilisateur.getInstance().setVisible(true);
            }
        });
    }
    
    public void refreshTable(List<Article> listArticles){
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        for(Article article: listArticles){
            tableModel.addRow(new Object[] {article.getNom(), article.getQuantite(), article.listFournisseurToString(), article.getPrix()});
        }
        table.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        back = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menuItemImprimer = new javax.swing.JMenuItem();
        menuItemAjouterArticle = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Quantite", "Fournisseur", "Prix unitaire"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        back.setText("Back");

        menu.setText("Options");

        menuItemImprimer.setText("Imprimer la page");
        menu.add(menuItemImprimer);

        menuItemAjouterArticle.setText("Ajouter un article");
        menu.add(menuItemAjouterArticle);

        menuBar.add(menu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(369, 369, 369))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemAjouterArticle;
    private javax.swing.JMenuItem menuItemImprimer;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

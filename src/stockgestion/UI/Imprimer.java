package stockgestion.UI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class Imprimer extends javax.swing.JFrame {
    private static Imprimer instance = null;
    
    private Imprimer() {
        initComponents();
        setTitle("Page d'impression");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        setBackground(Color.white);
        
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.CENTER);
        Font font1 = new Font("Verdana", Font.BOLD, 26);
        title.setFont(font1);
        title.setOpaque(true);
        title.setBackground(Color.WHITE);
        
        text.setEditable(false);
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setOpaque(true);
        text.setFocusable(false); 
        Font font2 = new Font("Verdana", Font.PLAIN, 16);
        text.setFont(font2);
    }
    
    public static Imprimer getInstance(){
        if(instance == null){
            instance = new Imprimer();
        }
        return instance;
    }
    
    public void println(String string){
        text.append(string + "\n");
        text.setCaretPosition(text.getDocument().getLength());
    }
    
    public void newPage(String string){
        this.setVisible(true);
        title.setText(string);
        text.setText("");
        text.setCaretPosition(text.getDocument().getLength());
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
        text = new javax.swing.JTextArea();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea text;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
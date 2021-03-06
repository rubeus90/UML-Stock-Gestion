package stockgestion.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import stockgestion.Controlleur.FournisseurControlleur;
import stockgestion.Entite.Fournisseur;
import stockgestion.Outil.Verificateur;

public class ViewFournisseur extends javax.swing.JFrame {
    private static ViewFournisseur instance = null;
    private Fournisseur fournisseur;
    private boolean isViewMode = true;
    
    private ViewFournisseur() {
        initComponents();
        addActionListeners();
    }
    
    public static ViewFournisseur getInstance(){
        if(instance == null){
            instance = new ViewFournisseur();
        }
        return instance;
    }
    
    private void addActionListeners(){
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ViewFournisseur.this.setVisible(false);
                Inventaire.getInstance().setVisible(true);
                stockgestion.StockGestion.getInstance().refreshUI();
            }
        });
        
        editer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(isViewMode){
                    editFournisseurMode();
                } else{
                    //Editer le fournisseur dans la BDD
                    if(Verificateur.isValideFournisseur(nom, adresse, codePostal, numTel)){
                        fournisseur.setNom(nom.getText());
                        fournisseur.setAdresse(adresse.getText());
                        fournisseur.setCodePostal(Integer.parseInt(codePostal.getText()));
                        fournisseur.setNumeroTelephone(Integer.parseInt(numTel.getText()));

                        FournisseurControlleur.getInstance().editer(fournisseur);

                        viewFournisseurMode(fournisseur);
                    }                    
                }
            }
        });
    }
    
    public void viewFournisseurMode(Fournisseur fournisseur){
        isViewMode = true;
        this.fournisseur = fournisseur;     
        
        nom.setText(fournisseur.getNom());
        nom.setEditable(false);
        
        adresse.setText(fournisseur.getAdresse()+"");
        adresse.setEditable(false);
        
        codePostal.setText(fournisseur.getCodePostal()+"");
        codePostal.setEditable(false);
        
        numTel.setText(fournisseur.getNumeroTelephone()+"");
        numTel.setEditable(false);
        
        editer.setText("Editer");
        
        setTitle("Fournisseur");
    }
    
    public void editFournisseurMode(){
        isViewMode = false;
        nom.setEditable(true);        
        adresse.setEditable(true);        
        codePostal.setEditable(true);        
        numTel.setEditable(true);        
        editer.setText("OK");        
        setTitle("Editer le fournisseur");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        codePostalLabel = new javax.swing.JLabel();
        numTelLabel = new javax.swing.JLabel();
        adresse = new javax.swing.JTextField();
        codePostal = new javax.swing.JTextField();
        numTel = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        editer = new javax.swing.JButton();
        nomLabel = new javax.swing.JLabel();
        adresseLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back.setText("Retour");

        codePostalLabel.setText("Code postal");

        numTelLabel.setText("Numéro de téléphone");

        editer.setText("Editer");

        nomLabel.setText("Nom");

        adresseLabel.setText("Adresse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(688, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(146, 146, 146)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(88, 88, 88)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(adresseLabel)
                                .addComponent(nomLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(adresse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codePostalLabel)
                                .addGap(28, 28, 28)
                                .addComponent(codePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numTelLabel)
                                .addGap(28, 28, 28)
                                .addComponent(numTel, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(editer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(146, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(540, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomLabel)
                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adresseLabel)
                        .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codePostalLabel)
                        .addComponent(codePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numTelLabel)
                        .addComponent(numTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(47, 47, 47)
                    .addComponent(editer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(142, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresse;
    private javax.swing.JLabel adresseLabel;
    private javax.swing.JButton back;
    private javax.swing.JTextField codePostal;
    private javax.swing.JLabel codePostalLabel;
    private javax.swing.JButton editer;
    private javax.swing.JTextField nom;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JTextField numTel;
    private javax.swing.JLabel numTelLabel;
    // End of variables declaration//GEN-END:variables
}

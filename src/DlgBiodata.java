
import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author COMPUTER
 */
public class DlgBiodata extends javax.swing.JDialog {

    private FrmBiodata myparent;

    /**
     * Creates new form DlgBiodata
     */
    public DlgBiodata(FrmBiodata parent, boolean modal) {
        super(parent, modal);
        initComponents();
        myparent = parent;
        generateData();
        setLocationRelativeTo(null);
    }

    public void generateData() {
        //Data
        String name = "Name\t: " + myparent.txtNama.getText();
        String birthplace = "Birth Place\t: " + myparent.txtPlace.getText();
        String birthdate = "Birth Date\t: " + myparent.spiDate.getValue() + " - " + myparent.spiMonth.getValue() + " - " + myparent.spiYear.getValue();
        String gender = null;
        if (myparent.rboMale.isSelected()) {
            gender = "Gender\t: " + myparent.rboMale.getText();
        } else if (myparent.rboFemale.isSelected()) {
            gender = "Gender\t: " + myparent.rboFemale.getText();
        } else {
            gender = "Gender\t: ";
        }
        String height = "Height\t: " + myparent.sliHeight.getValue() + " cm";
        String weight = "Weight\t: " + myparent.sliWeight.getValue() + " kg";
        String adrress = "Adrress\t: " + myparent.txaAddress.getText();

        String education = "";
        String[] educa = education.split(", ");
        if (myparent.chkTk.getModel().isSelected()) {
            education = education + myparent.chkTk.getText();
        }
        if (myparent.chkSd.getModel().isSelected()) {
            education = education + myparent.chkSd.getText();
        }
        if (myparent.chkSmp.getModel().isSelected()) {
            education = education + myparent.chkSmp.getText();
        }
        if (myparent.chkSmuSmk.getModel().isSelected()) {
            education = education + myparent.chkSmuSmk.getText();
        }
        if (myparent.chkS1.getModel().isSelected()) {
            education = education + myparent.chkS1.getText();
        }
        if (myparent.chkS2.getModel().isSelected()) {
            education = education + myparent.chkS2.getText();
        }
        if (myparent.chkS3.getModel().isSelected()) {
            education = education + myparent.chkS3.getText();
        } else {
            education = "";
        }
//        for(String educa1 : educa){
//            String[] scell = educa1.split(", ");
//            (scell[0], scell[1], scell[2], scell[3], scell[4]);
//        }

        //BMI(Body Index Mass)
        double heightBMI = myparent.sliHeight.getValue();
        double weightBMI = myparent.sliWeight.getValue();
        DecimalFormat Value = new DecimalFormat("#.##");
        double BMI = (weightBMI / ((heightBMI / 100) * (heightBMI / 100)));
        BMI = Double.valueOf(Value.format(BMI));

        String BMII = null;
        String category = null;
        if (myparent.rboMale.isSelected()) {
            if (BMI < 17) {
                BMII = "Your Body Index Mass (BMI) : " + BMI;
                category = "Your Weight is Under Weight";
            } else if (BMI >= 17 || BMI <= 23) {
                BMII = "Your Body Index Mass (BMI) : " + BMI;
                category = "Your Weight is Normal";
            } else if (BMI >= 23 || BMI <= 27) {
                BMII = "Your Body Index Mass (BMI) : " + BMI;
                category = "Your Weight is Over Weight";
            } else if (BMI > 27) {
                BMII = "Your Body Index Mass (BMI) : " + BMI;
                category = "Your Weight is Obesity";
            }
        } else if (myparent.rboFemale.isSelected()) {
            if (BMI < 18) {
                BMII = "Your Body Index Mass (BMI) : " + BMI;
                category = "Your Weight is Under Weight";
            } else if (BMI >= 18 || BMI <= 25) {
                BMII = "Your Body Index Mass (BMI) : " + BMI;
                category = "Your Weight is Normal";
            } else if (BMI >= 25 || BMI <= 27) {
                BMII = "Your Body Index Mass (BMI) : " + BMI;
                category = "Your Weight is Over Weight";
            } else if (BMI > 27) {
                BMII = "Your Body Index Mass (BMI) : " + BMI;
                category = "Your Weight is Obesity";
            }
        } else {
            BMII = "Your Body Index Mass (BMI) : 0.0 ";
            category = "Your Weight is ...";
        }

        //dlgBiodataShow
        txaBiodata.setText(name + "\n" + birthplace + "\n" + birthdate
                + "\n" + gender + "\n" + height + "\n" + weight
                + "\n" + adrress + "\n" + "Education\t: " + education + "\n"
                + "\n" + BMII + "\n" + category);
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
        txaBiodata = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txaBiodata.setColumns(20);
        txaBiodata.setRows(5);
        jScrollPane1.setViewportView(txaBiodata);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaBiodata;
    // End of variables declaration//GEN-END:variables
}

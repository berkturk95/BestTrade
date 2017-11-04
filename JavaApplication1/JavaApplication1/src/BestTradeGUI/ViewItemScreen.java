/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BestTradeGUI;

/**
 *
 * @author ibrah
 */
public class ViewItemScreen extends javax.swing.JPanel {

    /**
     * Creates new form ViewItem
     */
    public ViewItemScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        Photo = new javax.swing.JLabel();
        Category = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        Condition = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        DescriptionText = new javax.swing.JLabel();
        CategoryText = new javax.swing.JLabel();
        PriceText = new javax.swing.JLabel();
        ConditionText = new javax.swing.JLabel();
        sendMessageButton = new javax.swing.JButton();

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        Photo.setBackground(new java.awt.Color(0, 0, 255));
        Photo.setText("Photo");

        Category.setText("Category");

        Price.setText("Price");

        Condition.setText("Condition");

        Description.setText("Description");

        DescriptionText.setText("DescriptionText");

        CategoryText.setText("CategoryText");

        PriceText.setText("PriceText");

        ConditionText.setText("ConditionText");

        sendMessageButton.setText("Send Message");
        sendMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Description)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Category)
                                    .addComponent(Price)
                                    .addComponent(Condition))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ConditionText)
                                    .addComponent(PriceText)
                                    .addComponent(CategoryText))))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(sendMessageButton)
                .addGap(84, 84, 84)
                .addComponent(DescriptionText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Category)
                    .addComponent(CategoryText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price)
                    .addComponent(PriceText)
                    .addComponent(Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Condition)
                    .addComponent(ConditionText))
                .addGap(18, 18, 18)
                .addComponent(Description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescriptionText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sendMessageButton)
                        .addGap(43, 43, 43))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonActionPerformed

    private void sendMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendMessageButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Category;
    public javax.swing.JLabel CategoryText;
    public javax.swing.JLabel Condition;
    public javax.swing.JLabel ConditionText;
    public javax.swing.JLabel Description;
    public javax.swing.JLabel DescriptionText;
    public javax.swing.JLabel Photo;
    public javax.swing.JLabel Price;
    public javax.swing.JLabel PriceText;
    public javax.swing.JButton backButton;
    public javax.swing.JButton sendMessageButton;
    // End of variables declaration//GEN-END:variables
}

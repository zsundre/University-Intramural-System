import java.awt.*;
import javax.swing.*;

class CreateTeam extends JPanel 
{
    private JPanel contentPane;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> sportDropDown;
    private javax.swing.JComboBox<String> divisionDropDown;
    private javax.swing.JLabel teamNameLbl;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JLabel sportLbl;
    private javax.swing.JLabel divisionLbl;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JRadioButton coEdRadioBtn;
    private javax.swing.JTextField teamNameText;
    // End of variables declaration//GEN-END:variables

    public CreateTeam(JPanel panel) 
    {
        initComponents();


        contentPane = panel;

        //construct components
//        jcomp4 = new JButton ("openNewWindow");
//        jcomp4.addActionListener( new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
//                cardLayout.next(contentPane);
//            }
//        });
//        add(jcomp4);
    }

    private void initComponents() {

        setOpaque(true);
        setBackground(Color.GREEN.darker().darker());

        buttonGroup1 = new javax.swing.ButtonGroup();
        teamNameLbl = new javax.swing.JLabel();
        genderLbl = new javax.swing.JLabel();
        teamNameText = new javax.swing.JTextField();
        maleRadioBtn = new javax.swing.JRadioButton();
        femaleRadioBtn = new javax.swing.JRadioButton();
        coEdRadioBtn = new javax.swing.JRadioButton();
        sportLbl = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        sportDropDown = new javax.swing.JComboBox<>();
        divisionLbl = new javax.swing.JLabel();
        divisionDropDown = new javax.swing.JComboBox<>();

        teamNameLbl.setText("Team Name:");

        genderLbl.setText("Gender");

        buttonGroup1.add(maleRadioBtn);
        maleRadioBtn.setText("Male");
        maleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(femaleRadioBtn);
        femaleRadioBtn.setText("Female");
        femaleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(coEdRadioBtn);
        coEdRadioBtn.setText("Co-Ed");
        coEdRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coEdRadioBtnActionPerformed(evt);
            }
        });

        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String teamName = teamNameText.getText();
                //String password = passwordText.getText();
            }
        });

        sportLbl.setText("Sport");

        submitBtn.setText("Submit");

        cancelBtn.setText("Cancel");

        sportDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        divisionLbl.setText("Division");

        divisionDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a","ad" }));



        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(cancelBtn)
                                                .addGap(18, 18, 18)
                                                .addComponent(submitBtn))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(teamNameLbl)
                                                        .addComponent(genderLbl)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addComponent(sportLbl))
                                                        .addComponent(divisionLbl))
                                                .addGap(55, 55, 55)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(divisionDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(coEdRadioBtn)
                                                        .addComponent(femaleRadioBtn)
                                                        .addComponent(maleRadioBtn)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(teamNameText)
                                                                .addComponent(sportDropDown, 0, 183, Short.MAX_VALUE)))
                                                .addGap(0, 305, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(170, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(teamNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(teamNameLbl))
                                .addGap(47, 47, 47)
                                .addComponent(maleRadioBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(femaleRadioBtn)
                                        .addComponent(genderLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(coEdRadioBtn)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sportDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sportLbl))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(divisionLbl)
                                        .addComponent(divisionDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(submitBtn)
                                        .addComponent(cancelBtn))
                                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void maleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }

    private void femaleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }

    private void coEdRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }

    @Override
    public Dimension getPreferredSize()
    {
        return (new Dimension(500, 500));
    }
}
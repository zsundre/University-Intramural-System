import javax.swing.*;
import java.awt.*;

class DeleteStudent extends JPanel
{
    private JPanel contentPane;
    private JPanel nextPanel;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel studentIdLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField studentIdText;
    // End of variables declaration//GEN-END:variables

    public DeleteStudent(JPanel panel) {
        initComponents();
        contentPane = panel;
        CreateAccount createAccount = new CreateAccount(nextPanel);
        setOpaque(true);

        //construct components
//        jcomp4.addActionListener( new ActionListener()
//        {
//            public void actionPerformed(ActionEvent e)
//            {
//                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
//                cardLayout.next(contentPane);
//            }
//        });

    }


    private void initComponents() {

        studentIdLbl = new javax.swing.JLabel();
        studentIdText = new javax.swing.JTextField();
        titleLbl = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        studentIdLbl.setText("StudentID:");

        titleLbl.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        titleLbl.setText("Delete Student");

        submitBtn.setText("Submit");

        cancelBtn.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(studentIdLbl)
                                                .addGap(74, 74, 74)
                                                .addComponent(studentIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 111, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(titleLbl)
                                                                .addGap(106, 106, 106))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(cancelBtn)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(submitBtn)
                                                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleLbl)
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(studentIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studentIdLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(submitBtn)
                                        .addComponent(cancelBtn))
                                .addContainerGap())
        );
    }

    @Override
    public Dimension getPreferredSize()
    {
        return (new Dimension(400, 100));
    }
}
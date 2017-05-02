import java.awt.*;
import javax.swing.*;

class AdminMain extends JPanel
{
    private JPanel contentPane;
    private JPanel nextPanel;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editAccountBtn;
    private javax.swing.JButton addAdminBtn;
    private javax.swing.JButton addTeamBtn;
    private javax.swing.JButton signOutBtn;
    private javax.swing.JButton editScheduleBtn;
    private javax.swing.JButton deleteStudentBtn;
    private javax.swing.JButton deleteAdmin;
    private javax.swing.JButton deleteRef;
    private javax.swing.JButton deleteScoreKeeperBtn;
    private javax.swing.JButton deleteTeamBtn;
    private javax.swing.JButton addRefBtn;
    private javax.swing.JButton addScoreKeeperBtn;
    private javax.swing.JLabel editLbl;
    private javax.swing.JLabel deleteLbl;
    private javax.swing.JLabel addLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel studentInformationLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public AdminMain(JPanel panel) {
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

        jSeparator1 = new javax.swing.JSeparator();
        editLbl = new javax.swing.JLabel();
        editAccountBtn = new javax.swing.JButton();
        editScheduleBtn = new javax.swing.JButton();
        deleteStudentBtn = new javax.swing.JButton();
        deleteAdmin = new javax.swing.JButton();
        deleteLbl = new javax.swing.JLabel();
        deleteRef = new javax.swing.JButton();
        deleteScoreKeeperBtn = new javax.swing.JButton();
        deleteTeamBtn = new javax.swing.JButton();
        addLbl = new javax.swing.JLabel();
        addRefBtn = new javax.swing.JButton();
        addScoreKeeperBtn = new javax.swing.JButton();
        addAdminBtn = new javax.swing.JButton();
        addTeamBtn = new javax.swing.JButton();
        signOutBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        studentInformationLbl = new javax.swing.JLabel();

        editLbl.setText("Edit");

        editAccountBtn.setText("Edit Account");

        editScheduleBtn.setText("Edit Schedule");

        deleteStudentBtn.setText("Delete Student");

        deleteAdmin.setText("Delete Admin");

        deleteLbl.setText("Delete");

        deleteRef.setText("Delete Ref");

        deleteScoreKeeperBtn.setText("Delete ScoreKeeper");

        deleteTeamBtn.setText("Delete Team");

        addLbl.setText("Add");

        addRefBtn.setText("Add Ref");

        addScoreKeeperBtn.setText("Add ScoreKeeper");

        addAdminBtn.setText("Add Admin");

        addTeamBtn.setText("Add Team");

        signOutBtn.setText("Sign Out");

        titleLbl.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        titleLbl.setText("Admin Main");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        studentInformationLbl.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        studentInformationLbl.setText("Student Information:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(editLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(editAccountBtn)
                                        .addComponent(editScheduleBtn)
                                        .addComponent(deleteStudentBtn)
                                        .addComponent(deleteAdmin)
                                        .addComponent(deleteLbl)
                                        .addComponent(deleteRef)
                                        .addComponent(deleteScoreKeeperBtn)
                                        .addComponent(deleteTeamBtn)
                                        .addComponent(addLbl)
                                        .addComponent(addRefBtn)
                                        .addComponent(addScoreKeeperBtn)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(addTeamBtn)
                                                .addComponent(addAdminBtn)))
                                .addGap(29, 29, 29)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(titleLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(signOutBtn))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(studentInformationLbl)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(editLbl)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(editAccountBtn))
                                                        .addComponent(titleLbl))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(editScheduleBtn)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(deleteLbl)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(deleteStudentBtn)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(deleteAdmin)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(deleteRef)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(deleteScoreKeeperBtn)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(deleteTeamBtn)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(addLbl)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(addRefBtn)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(addScoreKeeperBtn)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(addAdminBtn)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(addTeamBtn))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(studentInformationLbl)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(signOutBtn)))
                                .addContainerGap())
        );
    }

    @Override
    public Dimension getPreferredSize()
    {
        return (new Dimension(400, 100));
    }
}
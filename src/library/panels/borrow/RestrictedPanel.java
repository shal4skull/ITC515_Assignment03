/*
 * Decompiled with CFR 0_115.
 */
package library.panels.borrow;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import library.interfaces.IBorrowUIListener;
import library.panels.borrow.ABorrowPanel;

public class RestrictedPanel
extends ABorrowPanel {
    private static final long serialVersionUID = 1;
    private JLabel lblBorrowerId;
    private JLabel lblBorrowerName;
    private JLabel lblBorrowerContact;
    private JLabel lblOverdue;
    private JLabel lblLoanLimit;
    private JLabel lblFineLimit;
    private JButton btnCompleted;
    private JButton btnCancel;
    private JTextArea existingLoanListTA;
    private JLabel lblErrMesg;

    public RestrictedPanel(final IBorrowUIListener listener) {
        this.setLayout(null);
        this.setBorder(new TitledBorder(null, "Scanning", 4, 2, null, null));
        this.setBounds(12, 23, 460, 640);
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(null, "Current Loan", 4, 2, null, null));
        panel_2.setBounds(10, 289, 434, 242);
        this.add(panel_2);
        panel_2.setLayout(null);
        JPanel panel_4 = new JPanel();
        panel_4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Pending Loan List", 4, 2, null, null));
        panel_4.setBounds(10, 107, 414, 126);
        panel_2.add(panel_4);
        panel_4.setLayout(null);
        JScrollPane pendingLoanListSCL = new JScrollPane();
        pendingLoanListSCL.setBounds(10, 18, 394, 96);
        panel_4.add(pendingLoanListSCL);
        JTextArea pendingLoanListTA = new JTextArea();
        pendingLoanListTA.setFont(new Font("Tahoma", 0, 11));
        pendingLoanListSCL.setViewportView(pendingLoanListTA);
        JPanel panel_5 = new JPanel();
        panel_5.setBorder(new TitledBorder(null, "Current Book", 4, 2, null, null));
        panel_5.setBounds(10, 18, 414, 89);
        panel_2.add(panel_5);
        panel_5.setLayout(null);
        JScrollPane currentBookSCL = new JScrollPane();
        currentBookSCL.setBounds(10, 18, 394, 60);
        panel_5.add(currentBookSCL);
        JTextArea currentBookTA = new JTextArea();
        currentBookTA.setFont(new Font("Tahoma", 0, 11));
        currentBookTA.setEditable(false);
        currentBookSCL.setViewportView(currentBookTA);
        JPanel panel_3 = new JPanel();
        panel_3.setLayout(null);
        panel_3.setBorder(new TitledBorder(null, "Borrower Details", 4, 2, null, null));
        panel_3.setBounds(10, 25, 434, 252);
        this.add(panel_3);
        JLabel lbl_11 = new JLabel("Id: ");
        lbl_11.setBounds(12, 20, 20, 14);
        panel_3.add(lbl_11);
        this.lblBorrowerId = new JLabel("123");
        this.lblBorrowerId.setForeground(Color.BLUE);
        this.lblBorrowerId.setBackground(Color.LIGHT_GRAY);
        this.lblBorrowerId.setBounds(32, 20, 46, 14);
        panel_3.add(this.lblBorrowerId);
        JLabel label = new JLabel("Name: ");
        label.setBounds(81, 20, 46, 14);
        panel_3.add(label);
        this.lblBorrowerName = new JLabel("Fred Nurke");
        this.lblBorrowerName.setForeground(Color.BLUE);
        this.lblBorrowerName.setBackground(Color.LIGHT_GRAY);
        this.lblBorrowerName.setBounds(126, 21, 156, 14);
        panel_3.add(this.lblBorrowerName);
        JLabel label_2 = new JLabel("Contact:");
        label_2.setBounds(282, 21, 56, 14);
        panel_3.add(label_2);
        this.lblBorrowerContact = new JLabel("02 63384931");
        this.lblBorrowerContact.setForeground(Color.BLUE);
        this.lblBorrowerContact.setBounds(338, 21, 86, 14);
        panel_3.add(this.lblBorrowerContact);
        JPanel panel_6 = new JPanel();
        panel_6.setLayout(null);
        panel_6.setBorder(new TitledBorder(null, "Existing Loans", 4, 2, null, null));
        panel_6.setBounds(10, 112, 414, 129);
        panel_3.add(panel_6);
        JScrollPane existingLoanListSCL = new JScrollPane();
        existingLoanListSCL.setBounds(10, 22, 394, 96);
        panel_6.add(existingLoanListSCL);
        this.existingLoanListTA = new JTextArea();
        this.existingLoanListTA.setFont(new Font("Tahoma", 0, 11));
        this.existingLoanListTA.setEditable(false);
        this.existingLoanListTA.setBackground(new Color(248, 248, 248));
        existingLoanListSCL.setViewportView(this.existingLoanListTA);
        JPanel panel_7 = new JPanel();
        panel_7.setLayout(null);
        panel_7.setBorder(new TitledBorder(null, "Borrowing Restrictions", 4, 2, null, null));
        panel_7.setBounds(10, 46, 414, 66);
        panel_3.add(panel_7);
        this.lblOverdue = new JLabel("");
        this.lblOverdue.setForeground(Color.RED);
        this.lblOverdue.setFont(new Font("Tahoma", 0, 11));
        this.lblOverdue.setBounds(10, 18, 354, 14);
        panel_7.add(this.lblOverdue);
        this.lblFineLimit = new JLabel("");
        this.lblFineLimit.setForeground(Color.RED);
        this.lblFineLimit.setFont(new Font("Tahoma", 0, 11));
        this.lblFineLimit.setBounds(10, 32, 354, 14);
        panel_7.add(this.lblFineLimit);
        this.lblLoanLimit = new JLabel("");
        this.lblLoanLimit.setForeground(Color.RED);
        this.lblLoanLimit.setFont(new Font("Tahoma", 0, 11));
        this.lblLoanLimit.setBounds(10, 46, 354, 14);
        panel_7.add(this.lblLoanLimit);
        this.btnCompleted = new JButton("Completed");
        this.btnCompleted.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                listener.scansCompleted();
            }
        });
        this.btnCompleted.setFont(new Font("Tahoma", 0, 14));
        this.btnCompleted.setBounds(69, 544, 127, 35);
        this.add(this.btnCompleted);
        this.btnCompleted.setEnabled(false);
        this.btnCancel = new JButton("Cancel");
        this.btnCancel.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                listener.cancelled();
            }
        });
        this.btnCancel.setFont(new Font("Tahoma", 0, 14));
        this.btnCancel.setBounds(271, 544, 127, 35);
        this.add(this.btnCancel);
        this.lblErrMesg = new JLabel();
        this.lblErrMesg.setForeground(Color.RED);
        this.lblErrMesg.setFont(new Font("Tahoma", 1, 14));
        this.lblErrMesg.setBounds(12, 592, 434, 29);
        this.add(this.lblErrMesg);
    }

    @Override
    public void displayMemberDetails(int memberID, String memberName, String memberPhone) {
        this.lblBorrowerId.setText(Integer.valueOf(memberID).toString());
        this.lblBorrowerName.setText(memberName);
        this.lblBorrowerContact.setText(memberPhone);
    }

    @Override
    public void displayOverDueMessage() {
        this.lblOverdue.setText("Borrower has overdue loans");
    }

    @Override
    public void displayAtLoanLimitMessage() {
        this.lblLoanLimit.setText("Borrower has reached maximum number of borrowed items");
    }

    @Override
    public void displayOutstandingFineMessage(float amountOwing) {
        this.lblFineLimit.setText(String.format("Borrower has outstanding fines. Amount owing: $%.2f", Float.valueOf(amountOwing)));
    }

    @Override
    public void displayOverFineLimitMessage(float amountOwing) {
        this.lblFineLimit.setText(String.format("Borrower has exceeded fine limit. Amount owing: $%.2f", Float.valueOf(amountOwing)));
    }

    @Override
    public void displayExistingLoan(String loanDetails) {
        this.existingLoanListTA.setText(loanDetails);
        this.existingLoanListTA.setCaretPosition(0);
    }

    @Override
    public void displayErrorMessage(String errorMesg) {
        this.lblErrMesg.setText(errorMesg);
    }

}


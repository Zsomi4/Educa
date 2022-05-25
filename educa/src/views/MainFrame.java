package views;

import java.awt.FlowLayout;
import java.awt.BorderLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
    JPanel mainPanel;
    public DefaultComboBoxModel<String> groupmodel;
    public JComboBox<String> groupCombo;

    public DefaultListModel<String> studentModel;
    public JList<String> studentList;
    JScrollPane scrollPane;
    public MainFrame() {
        this.setMainComponent();
        this.setMainPanel();
        this.setMainFrame();
    }
    private void setMainComponent() {
        this.groupmodel = new DefaultComboBoxModel<>();
        this.groupCombo = new JComboBox<>(this.groupmodel);

        studentModel = new DefaultListModel<>();
        studentList = new JList<>(studentModel);
        scrollPane = new JScrollPane(studentList);
    }
    private void setMainPanel() {
        this.mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        this.mainPanel.add(this.groupCombo, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
    }
    private void setMainFrame() {
        this.add(this.mainPanel);
        setTitle("Diákok osztályok szerint");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }
}
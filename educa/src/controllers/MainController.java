package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        mainFrame = new MainFrame();
        mainModel = new MainModel();
        mainModel.groupList.forEach(group -> {
            this.mainFrame.groupmodel.addElement(group.name);
        });
        setEvents();
    }
    private void setEvents() {
        mainFrame.groupCombo.addActionListener(e -> onActionGroupCombo());
    }
    private void onActionGroupCombo() {
        int i = mainFrame.groupCombo.getSelectedIndex();
        int selectedGroupId = i + 1;
        int groupId = i + 1;
        mainFrame.studentModel.clear();
        mainModel.studentList.forEach(student -> {
            if(selectedGroupId == student.groupId) {
                mainFrame.studentModel.addElement(student.name);
            }
        });
    }
    
}
package com.hutubill.GUI.panel;

import com.hutubill.util.ColorUtil;
import com.hutubill.util.GUIUtil;

import javax.swing.*;

public class BackupPanel extends JPanel {
    static {
        GUIUtil.useLNF();
    }

    public static BackupPanel instance = new BackupPanel();

    JButton backup = new JButton("备份");

    private BackupPanel(){
        GUIUtil.setColor(ColorUtil.blueColor,backup);
        this.add(backup);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(BackupPanel.instance);
    }

}

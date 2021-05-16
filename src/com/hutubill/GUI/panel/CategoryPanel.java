package com.hutubill.GUI.panel;

import com.hutubill.GUI.model.CategoryTableModel;
import com.hutubill.util.ColorUtil;
import com.hutubill.util.GUIUtil;

import javax.swing.*;
import java.awt.*;

public class CategoryPanel extends JPanel {

    static {
        GUIUtil.useLNF();
    }

    public static CategoryPanel instance = new CategoryPanel();

    JButton addnew = new JButton("新增");
    JButton edite = new JButton("编辑");
    JButton delete = new JButton("删除");

    CategoryTableModel ctm = new CategoryTableModel();
    JTable jt = new JTable(ctm);

    private CategoryPanel(){
        GUIUtil.setColor(ColorUtil.blueColor,addnew,edite,delete);
        this.setLayout(new BorderLayout());
        JScrollPane jp = new JScrollPane(jt);
        this.add(jp,BorderLayout.CENTER);

        JPanel p = new JPanel();
        p.add(addnew);
        p.add(edite);
        p.add(delete);

        this.add(p,BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        GUIUtil.showPanel(CategoryPanel.instance);
    }

}

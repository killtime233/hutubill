package com.hutubill.GUI.panel;

import com.hutubill.GUI.model.CategoryComboBoxModel;
import com.hutubill.util.ColorUtil;
import com.hutubill.util.GUIUtil;
import org.jdesktop.swingx.JXDatePicker;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class RecordPanel extends JPanel {
    static {
        GUIUtil.useLNF();
    }

    public static RecordPanel instance = new RecordPanel();

     JLabel spend = new JLabel("花费￥");
     JLabel category = new JLabel("分类");
     JLabel remark = new JLabel("备注");
     JLabel date = new JLabel("日期");

    public JTextField vspend = new JTextField("0");
    public CategoryComboBoxModel cbm = new CategoryComboBoxModel();
    public JComboBox vcategory = new JComboBox(cbm);
    public JTextField vremark = new JTextField();
    public JXDatePicker datePicker = new JXDatePicker(new Date());

    JButton submit = new JButton("记一笔");



    private RecordPanel(){
        this.setLayout(new BorderLayout());
        GUIUtil.setColor(ColorUtil.grayColor,spend,category,remark,date);
        GUIUtil.setColor(ColorUtil.blueColor,submit);
        JPanel p = new JPanel();
        p.add(submit);

        this.add(north(),BorderLayout.NORTH);
        this.add(p,BorderLayout.CENTER);


    }

    private JPanel north(){
        int gap =40;
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4,2,gap,gap));
        p.add(spend);
        p.add(vspend);
        p.add(category);
        p.add(vcategory);
        p.add(remark);
        p.add(vremark);
        p.add(date);
        p.add(datePicker);
        return p;


    }

    public static void main(String[] args) {
        GUIUtil.showPanel(RecordPanel.instance);
    }


}

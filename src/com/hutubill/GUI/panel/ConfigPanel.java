package com.hutubill.GUI.panel;

import com.hutubill.util.ColorUtil;
import com.hutubill.util.GUIUtil;

import javax.swing.*;
import java.awt.*;

public class ConfigPanel extends JPanel {
    static {
        GUIUtil.useLNF();
    }

    public static ConfigPanel instance = new ConfigPanel();

    JLabel budget = new JLabel("本月预算");
    JLabel diretory = new JLabel("Mysql安装目录");

    public JTextField vbudget = new JTextField("0");
    public JTextField vdiretory = new JTextField();

    JButton update = new JButton("更新");

    private ConfigPanel(){
        this.setLayout(new BorderLayout());
        GUIUtil.setColor(ColorUtil.blueColor,update);
        JPanel jp = new JPanel();
        int gap =80;
        jp.setLayout(new GridLayout(4,1,gap,gap));
        jp.add(budget);
        jp.add(vbudget);
        jp.add(diretory);
        jp.add(vdiretory);

        this.add(jp,BorderLayout.NORTH);

        JPanel p = new JPanel();
        p.add(update);
        this.add(p,BorderLayout.CENTER);




    }

    public static void main(String[] args) {
        GUIUtil.showPanel(ConfigPanel.instance);
    }
}

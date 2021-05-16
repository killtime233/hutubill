package com.hutubill.GUI.panel;

import com.hutubill.util.ColorUtil;
import com.hutubill.util.GUIUtil;
import sun.tools.jps.Jps;

import javax.swing.*;

public class Recoverpanel extends JPanel {
    static {
        GUIUtil.useLNF();
    }

    public static Recoverpanel instance = new Recoverpanel();

    JButton backup = new JButton("恢复");

    private Recoverpanel(){
        GUIUtil.setColor(ColorUtil.blueColor,backup);
        this.add(backup);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(Recoverpanel.instance);
    }
}

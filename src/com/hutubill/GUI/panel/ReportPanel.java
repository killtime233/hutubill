package com.hutubill.GUI.panel;

import com.hutubill.util.ChartUtil;
import com.hutubill.util.GUIUtil;

import javax.swing.*;
import java.awt.*;

public class ReportPanel extends JPanel {
    static {
        GUIUtil.useLNF();

    }

    public static ReportPanel instance = new ReportPanel();

      JLabel reportcharts = new JLabel();
      Image image = ChartUtil.getImage(400,300);

      private ReportPanel(){
          this.setLayout(new BorderLayout());
          Image image = ChartUtil.getImage(400,300);
          ImageIcon icon = new ImageIcon(image);
          reportcharts.setIcon(icon);
          this.add(reportcharts);

      }

    public static void main(String[] args) {
        GUIUtil.showPanel(ReportPanel.instance);
    }




}

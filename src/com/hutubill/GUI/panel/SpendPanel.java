package com.hutubill.GUI.panel;

import com.hutubill.util.CenterPanel;
import com.hutubill.util.CircleProgressBar;
import com.hutubill.util.ColorUtil;
import com.hutubill.util.GUIUtil;
import sun.misc.JavaLangAccess;
import sun.tools.jps.Jps;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SpendPanel extends JPanel{
    static {
        GUIUtil.useLNF();
    }

    public static SpendPanel instance = new SpendPanel();
    JLabel lMonthSpend = new JLabel("本月消费");
    JLabel lTodaySpend = new JLabel("今日消费");
    JLabel lAvgSpendPerDay = new JLabel("日均消费");
    JLabel lMonthLeft = new JLabel("本月剩余");
    JLabel lDayAvgAvailable = new JLabel("日均可用");
    JLabel lMonthLeftDay = new JLabel("距离月末");

    public JLabel vMonthSpend = new JLabel("--");
    public JLabel vTodaySpend = new JLabel("--");
    public JLabel vAvgSpendPerDay = new JLabel("--");
    public JLabel vMonthLeft = new JLabel("--");
    public JLabel vDayAvgAvailable = new JLabel("--");
    public JLabel vMonthLeftDay = new JLabel("--");

    CircleProgressBar bar;

    private SpendPanel(){
        this.setLayout(new BorderLayout());
        bar = new CircleProgressBar();
        bar.setBackgroundColor(ColorUtil.blueColor);
        GUIUtil.setColor(ColorUtil.grayColor,lMonthSpend,lTodaySpend,lAvgSpendPerDay,lMonthLeft,lDayAvgAvailable,lMonthLeftDay,vAvgSpendPerDay,
                vAvgSpendPerDay,vMonthLeft,vDayAvgAvailable,vMonthLeftDay);
        GUIUtil.setColor(ColorUtil.blueColor,vMonthSpend,vTodaySpend);

        vMonthSpend.setFont(new Font("微软雅黑",Font.BOLD,23));
        vTodaySpend.setFont(new Font("微软雅黑",Font.BOLD,23));

        add(south(),BorderLayout.SOUTH);
        add(center(),BorderLayout.CENTER);

    }

    private JPanel south(){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2,4));
        p.add(lAvgSpendPerDay);
        p.add(lMonthLeft);
        p.add(lDayAvgAvailable);
        p.add(lMonthLeftDay);
        p.add(vAvgSpendPerDay);
        p.add(vMonthLeft);
        p.add(vDayAvgAvailable);
        p.add(vMonthLeftDay);

        return p;

    }

    private JPanel center(){
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(bar,BorderLayout.CENTER);
        p.add(west(),BorderLayout.WEST);

        return p;

    }

    private JPanel west(){
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4,1));
        p.add(lMonthSpend);
        p.add(vMonthSpend);
        p.add(lTodaySpend);
        p.add(vTodaySpend);

        return p;



    }

    public static void main(String[] args) {
        GUIUtil.showPanel(new SpendPanel());
    }


}

package com.hutubill;

import com.hutubill.util.CircleProgressBar;
import com.hutubill.util.ColorUtil;
import com.hutubill.util.GUIUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
//        GUIUtil.useLNF();
//        JPanel p = new JPanel();
//        p.add(new JButton("按钮1"));
//        p.add(new JButton("按钮2"));
//        GUIUtil.showPanel(p);
//        JFrame f = new JFrame("LoL");
//        f.setSize(400, 300);
//        f.setLocation(200, 200);
//
//        f.setLayout(new FlowLayout());
//
//        JProgressBar pb = new JProgressBar();
//
//        //进度条最大100
//        pb.setMaximum(100);
//        //当前进度是50
//        pb.setValue(50);
//        //显示当前进度
//        pb.setStringPainted(true);
//
//        f.add(pb);
//
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        f.setVisible(true);
        GUIUtil.useLNF();
        //面板
        JPanel p = new JPanel();
        //进度条组件
        CircleProgressBar cpb = new CircleProgressBar();
        cpb.setBackgroundColor(ColorUtil.blueColor);
        cpb.setProgress(0);
        //按钮
        JButton b = new JButton("点击");
        //添加组件
        p.setLayout(new BorderLayout());
        p.add(cpb, BorderLayout.CENTER);
        p.add(b, BorderLayout.SOUTH);
        //显示面板
        GUIUtil.showPanel(p);

        //给按钮加监听
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new SwingWorker() {

                    @Override
                    protected Object doInBackground() throws Exception {
                        for (int i = 0; i < 100; i++) {
                            cpb.setProgress(i + 1);
                            cpb.setForegroundColor(ColorUtil.getByPercentage(i + 1));
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                        }
                        return null;
                    }

                }.execute();

            }
        });



    }
}

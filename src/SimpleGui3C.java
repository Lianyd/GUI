//import java.awt.event.*;
//import java.awt.*;
//import javax.swing.*;
////画一个渐变色的椭圆
//public class SimpleGui3C implements ActionListener {
//    JFrame frame;
//
//    public static void main(String[] args) {
//        SimpleGui3C gui = new SimpleGui3C();
//        gui.go();
//    }
//
//    public void go() {
//        frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JButton button = new JButton("change colors");
//        button.addActionListener(this);
//
//        MyDrawPanel drawPanel = new MyDrawPanel();
//
//        frame.getContentPane().add(BorderLayout.SOUTH, button);
//        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
//        frame.setSize(300, 300);  //frame窗口的大小
//        frame.setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent event){
//        frame.repaint();
//    }
//}
//

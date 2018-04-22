import  javax.swing.*;
import java.awt.*;
//放置按钮（button）
public class SimpleGui1 {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JButton button0 = new JButton("Center");
        JButton button1 = new JButton("East");
        JButton button2 = new JButton("North");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//在关闭窗口后结束程序

        frame.getContentPane().add(BorderLayout.CENTER,button0);
        frame.getContentPane().add(BorderLayout.EAST,button1);
        frame.getContentPane().add(BorderLayout.NORTH,button2);

        frame.setSize(50,50);

        frame.setVisible(true);

    }
}

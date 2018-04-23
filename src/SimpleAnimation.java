import javax.swing.*;
import java.awt.*;

//简单动画演示
public class SimpleAnimation {
    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;
            drawPanel.repaint();

            try {
                Thread.sleep(50);
            } catch (Exception ex) {
            }
        }
    }

    public class MyDrawPanel extends JPanel {   //这是一个内部类
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);//每次画圆圈前将背景用白色填充，避免留下上一次画圆的重影
            g.fillRect(0,0,this.getWidth(),this.getHeight()); // 内部类可以调用外部类的参数

            g.setColor(Color.orange);
            g.fillOval(x, y, 40, 40);
        }
    }
}

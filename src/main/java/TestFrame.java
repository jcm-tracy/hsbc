import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame {

    static Frame frm = new Frame("TestFrame");
    static Label lab = new Label("Java王者归来");
    static Button btn = new Button("Click me");

    //委派事件
    //担任事件倾听者和拥有事件处理者
    static class MyListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            frm.setBackground(Color.gray);
        }
    }

    public static void main(String[] args) {

       /* JFrame frame = new JFrame("第一个窗口");
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setBackground(new Color(255,255,0));
        frame.setLocation(200,100);
        frame.add(new Label("Java"));
        frame.setName("My Win");*/

        //这些是设置了标签的

        /*frm.setLayout(null);
        frm.setSize(300,300);
        frm.setBackground(Color.yellow);
        lab.setForeground(Color.blue);
        lab.setBackground(Color.pink);
        lab.setAlignment(Label.CENTER);
        lab.setLocation(50,80);
        lab.setSize(150,50);
        lab.setFont(new Font("Serief",Font.BOLD+Font.ITALIC,18));
        btn.setBounds(100,80,100,50);
        frm.add(lab);
        frm.add(btn);
        frm.setVisible(true);*/

        //下面设置按钮Button

        /*frm.setLayout(null);
        frm.setSize(300,200);
        frm.setBackground(Color.yellow);
        btn.setBounds(100,80,100,50);
        frm.add(btn);
        frm.setVisible(true);*/



        frm.setLayout(new FlowLayout());
        frm.setSize(200,120);
        frm.setBackground(Color.yellow);
        btn.addActionListener(new MyListener());
        frm.add(btn);
        frm.setVisible(true);
        





    }
}

package view;

import controller.MouseExampleController;
import model.MouseExampleModel;

import javax.swing.*;
import java.awt.*;

public class MouseExampleView extends JFrame {
    private MouseExampleModel model;
    private JPanel jPanel_mouse;
    private JPanel jPanel_info;
    private JLabel jLabel_position;
    private JLabel jLabel_empty_2;
    private JLabel jLabel_x;
    private JLabel jLabel_count;
    private JLabel jLabel_y;
    private JLabel jLabel_count_value;
    private JLabel jLabel_checkIn;
    private JLabel jLabel_checkIn_value;
    private JLabel jLabel_empty_1;


    public MouseExampleView()  {
        this.model = new MouseExampleModel();
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("Mouse Example");
        this.setSize(1000,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        MouseExampleController ac = new MouseExampleController(this);
        Font font = new Font("Times New Roman", Font.BOLD,30);

        jPanel_mouse = new JPanel();
        jPanel_mouse.setBackground(Color.CYAN);
        jPanel_mouse.addMouseListener(ac);
        jPanel_mouse.addMouseMotionListener(ac);

        jPanel_info = new JPanel();
        jPanel_info.setLayout(new GridLayout(3,3,15,10));

        jLabel_position = new JLabel("Position: ");
        jLabel_position.setFont(font);

        jLabel_x = new JLabel("x: ");
        jLabel_x.setFont(font);

        jLabel_y = new JLabel("y: ");
        jLabel_y.setFont(font);

        jLabel_count = new JLabel("Count: ");
        jLabel_count.setFont(font);

        jLabel_count_value = new JLabel("n");
        jLabel_count_value.setFont(font);

        jLabel_checkIn = new JLabel("Mouse is in componet: ");
        jLabel_checkIn.setFont(font);

        jLabel_checkIn_value = new JLabel("no");
        jLabel_checkIn_value.setFont(font);

        jLabel_empty_1 = new JLabel();
        jLabel_empty_2 = new JLabel();

        jPanel_info.add(jLabel_position);
        jPanel_info.add(jLabel_x);
        jPanel_info.add(jLabel_y);
        jPanel_info.add(jLabel_count);
        jPanel_info.add(jLabel_count_value);
        jPanel_info.add(jLabel_empty_1);
        jPanel_info.add(jLabel_checkIn);
        jPanel_info.add(jLabel_checkIn_value);
        jPanel_info.add(jLabel_empty_2);

        this.setLayout(new BorderLayout(10,10));
        this.add(jPanel_mouse,BorderLayout.CENTER);
        this.add(jPanel_info, BorderLayout.SOUTH);

    }
    public void click() {
        this.model.addClick();
        this.jLabel_count_value.setText(this.model.getCount()+"");
    }
    public void enter(){
        this.model.enter();;
        this.jLabel_checkIn_value.setText(this.model.getCheckIn()+"");
    }
    public void exit(){
        this.model.exit();
        this.jLabel_checkIn_value.setText(this.model.getCheckIn()+"");
    }
    public void update(int x, int y){
        this.model.setX(x);
        this.model.setY(y);
        this.jLabel_x.setText(this.model.getX()+"");
        this.jLabel_y.setText(this.model.getY()+"");
    }
}

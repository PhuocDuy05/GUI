/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package GiaoDienTinhToan;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
// *
 * @author ADMIN
 */
public class TinhToanDonGian extends JFrame {
    private JLabel lb1,lb2,lb3;
   private JTextField txt1,txt2,txtkq;
   private JButton btCong,btTru,btNhan, btChia;

    public TinhToanDonGian() {
        setTitle("tinh toan don gian");
        taogiaodien();
        pack();
//        setSize(400,300);
        setLocationRelativeTo(null);
    }

    private void taogiaodien() {
        JPanel p1 =new JPanel();
        p1.setLayout(new GridLayout (3,2,5,5));
        p1.add(lb1=new JLabel("Số 1"));
        p1.add(txt1=new JTextField());
        p1.add(lb2=new JLabel("Số 2"));
        p1.add(txt2=new JTextField());
        p1.add(lb3=new JLabel("Kết quả"));
        p1.add(txtkq=new JTextField());
        
        JPanel p2 = new JPanel();
        p2.add(btCong=new JButton("Cộng"));
        p2.add(btTru=new JButton("Trừ"));
        p2.add(btNhan=new JButton("Nhân"));
        p2.add(btChia=new JButton("Chia"));
        
        
        setLayout(new BorderLayout());
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);

        //cong
        btCong.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                double x= Double.parseDouble(txt1.getText());
                double y= Double.parseDouble(txt2.getText());
                double kq= x+y;
                txtkq.setText(String.valueOf(kq));
            }
        });
        
        //tru
        btTru.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                double x= Double.parseDouble(txt1.getText());
                double y= Double.parseDouble(txt2.getText());
                double kq= x-y;
                txtkq.setText(String.valueOf(kq));
            }
        });
        //nhan
        btNhan.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                double x= Double.parseDouble(txt1.getText());
                double y= Double.parseDouble(txt2.getText());
                double kq= x*y;
                txtkq.setText(String.valueOf(kq));
            }
        });
        //chia
        btChia.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                double x= Double.parseDouble(txt1.getText());
                double y= Double.parseDouble(txt2.getText());
                double kq= x/y;
                txtkq.setText(String.valueOf(kq));
            }
        });
    }
    public static void main(String[] args) {
        TinhToanDonGian frm= new TinhToanDonGian();
        frm.setVisible(true);
    }
}

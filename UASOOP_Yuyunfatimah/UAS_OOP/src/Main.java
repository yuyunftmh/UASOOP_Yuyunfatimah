import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[]args){
        JFrame window = new JFrame("");
        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new FlowLayout());

        JButton button = new JButton("Tampilkan Data");
        window.add(button);

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                kendaraan kendaraan = new kendaraan("Beat Street ", 1998) {
                    @Override
                    public void getInfo() {

                    }
                };
                kendaraan.getInfo();
                pengemudi pengemudi = new pengemudi("Yuyun Fatimah" , 19);
                pengemudi.setKendaraan(kendaraan);

                System.out.println("Name :" + pengemudi.getName());
                System.out.println("Usia:" + pengemudi.getUsia());
                System.out.println("mobil :" + pengemudi.getKendaraan().tahunProduksi);
            }
        });

        window.setVisible(true);
    }
}
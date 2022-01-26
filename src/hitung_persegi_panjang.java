import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hitung_persegi_panjang {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("hitung_persegi_panjang");
        frame.setContentPane(new hitung_persegi_panjang().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public hitung_persegi_panjang() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int p,l,hasil;
                p=Integer.parseInt(textField1.getText());
                l=Integer.parseInt(textField2.getText());

                hasil=p*l;
                textField3.setText(Integer.toString(hasil));
            }
        });
    }
}

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel receipt_info = new JLabel();
    JLabel item1 = new JLabel();
    JLabel item2 = new JLabel();
    JLabel item3 = new JLabel();
    JLabel item4 = new JLabel();
    JLabel item5 = new JLabel();
    JLabel item6 = new JLabel();
    JLabel item7 = new JLabel();
    JLabel item8 = new JLabel();
    JLabel item9 = new JLabel();
    JLabel item10 = new JLabel();
    JLabel item11 = new JLabel();
    JLabel item12 = new JLabel();
    JLabel item13 = new JLabel();
    JLabel item14 = new JLabel();
    JLabel item15 = new JLabel();

    NewWindow(){
        item1.setText((Button.receipts[0]));
        item2.setText((Button.receipts[1]));
        item3.setText((Button.receipts[2]));
        item4.setText((Button.receipts[3]));
        item5.setText((Button.receipts[4]));
        item6.setText((Button.receipts[5]));
        item7.setText((Button.receipts[6]));
        item8.setText((Button.receipts[7]));
        item9.setText((Button.receipts[8]));
        item10.setText((Button.receipts[9]));
        item11.setText((Button.receipts[10]));
        item12.setText((Button.receipts[11]));
        item13.setText((Button.receipts[12]));
        item14.setText((Button.receipts[13]));
        item15.setText((Button.receipts[14]));



        frame.setTitle("Menu");
        frame.setSize(500, 750);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLayout(new GridLayout(16,1));

        receipt_info.setText("Receipt N.O 104 23/06/21");
        receipt_info.setFont(new Font("Helvetica",Font.ITALIC,30));
        receipt_info.setForeground(Color.BLACK);
        frame.add(receipt_info);
        frame.add(item1);
        frame.add(item2);
        frame.add(item3);
        frame.add(item4);
        frame.add(item5);
        frame.add(item6);
        frame.add(item7);
        frame.add(item8);
        frame.add(item9);
        frame.add(item10);
        frame.add(item11);
        frame.add(item12);
        frame.add(item13);
        frame.add(item14);
        frame.add(item15);

    }
}

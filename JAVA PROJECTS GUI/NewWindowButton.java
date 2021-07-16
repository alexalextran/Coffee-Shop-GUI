
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class NewWindowButton implements ActionListener{
    static JButton Submit;
    static JButton Clear;
    
    NewWindowButton(){
    Submit = new JButton("Submit Order"); 
    Submit.addActionListener(this);
    Clear = new JButton("Clear");
    Clear.addActionListener(this);
    

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Submit){
            NewWindow receipt = new NewWindow(); 
    }
        if(e.getSource()==Clear){
            Button.Cuppacino.setState(false); 
            Button.Mocha.setState(false);
            Button.Expresso.setState(false);
            Button.Flat_White.setState(false);
            Button.Latte.setState(false);
            Button.Iced_Americano.setState(false);
            Button.Iced_Frappe.setState(false);
            Button.Iced_Latte.setState(false);
            Button.Iced_Machiatto.setState(false);
            Button.Iced_Tea.setState(false);
            Button.Avo_Toast.setState(false);
            Button.Bannana_Bread.setState(false);
            Button.Choc_Cookie.setState(false);
            Button.Crossoint.setState(false);
            Button.Fruit_Muffin.setState(false);
            Button.counter = 0;
            for(int i = 0; i < Button.receipts.length; i++){
                Button.receipts[i] = (" ");
            }
        }
}
}





import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class Menu_Screen extends JFrame {
    
    static JFrame frame;
    static JPanel middleleft;
    static JPanel middleright;
    Menu_Screen(){
        
        new Button();
        
        Border border = BorderFactory.createLineBorder(Color.BLACK, 5);
       
        JPanel west = new JPanel();
        JPanel north = new JPanel();
        JPanel westleft = new JPanel();
        JPanel westright = new JPanel();
        JPanel middle = new JPanel();
        
        west.setBackground(new Color(160,82,45));
        west.setBorder(border);
        north.setBackground(Color.LIGHT_GRAY);
        westleft.setBackground(Color.LIGHT_GRAY);
        westright.setBackground(Color.LIGHT_GRAY);
        middle.setBackground(Color.LIGHT_GRAY);

        north.setPreferredSize(new Dimension(100, 75));
        west.setPreferredSize(new Dimension(550, 100));
        west.setLayout(new GridLayout(3,1));
        

        ImageIcon coldcoffee = new ImageIcon("src/coldcoffee.png");
        ImageIcon hotcoffee = new ImageIcon("src/hotcoffee.png");
        ImageIcon sides = new ImageIcon("src/sides.png");
        ImageIcon logo = new ImageIcon("src/coffeelogo.png");
        ImageIcon menuphoto = new ImageIcon("src/menu.png");
        ImageIcon cartimage = new ImageIcon("src/cart.png");

        JLabel logotext = new JLabel();
        logotext.setText("By Alex Tran");
        logotext.setForeground(Color.WHITE);
        logotext.setFont(new Font("Helvetica",Font.ITALIC,30));
        logotext.setIcon(logo);
        JLabel menu = new JLabel();
        menu.setText("Please Order From The Menu, Thank You!");
        menu.setForeground(Color.WHITE);
        menu.setFont(new Font("Helvetica",Font.BOLD+Font.ITALIC,15));
        menu.setIcon(menuphoto);
        JLabel cart = new JLabel();
        cart.setText("Cart");
        cart.setForeground(Color.BLACK);
        cart.setFont(new Font("Helvetica",Font.ITALIC,30));
        cart.setIcon(cartimage);
        

        north.setLayout(new GridLayout(1,2));
        north.add(menu);
        north.add(logotext);
        
        
        JLabel Hcoffee = new JLabel();
        Hcoffee.setText("Hot Coffee");
        Hcoffee.setIcon(hotcoffee);
        Hcoffee.setForeground(Color.WHITE);
        Hcoffee.setFont(new Font("Helvetica",Font.BOLD+Font.ITALIC,15));
        JPanel toppanel = new JPanel();
        toppanel.setLayout(new GridLayout(3,2));
        toppanel.setBackground(new Color(101,67,33));
        Hcoffee.setIconTextGap(54);
        toppanel.add(Hcoffee);  
        toppanel.add(Button.Cuppacino);
        toppanel.add(Button.Mocha);
        toppanel.add(Button.Latte);
        toppanel.add(Button.Flat_White);
        toppanel.add(Button.Expresso);
        

        JLabel Ccoffee = new JLabel();
        Ccoffee.setText("Cold Coffee");
        Ccoffee.setIcon(coldcoffee);
        Ccoffee.setForeground(Color.WHITE);
        Ccoffee.setFont(new Font("Helvetica",Font.BOLD+Font.ITALIC,15));
        JPanel middlepanel = new JPanel();
        middlepanel.setLayout(new GridLayout(3,2));
        middlepanel.setBackground(new Color(159,105,52));
        Ccoffee.setIconTextGap(30);
        middlepanel.add(Ccoffee);
        middlepanel.add(Button.Iced_Latte);
        middlepanel.add(Button.Iced_Americano);
        middlepanel.add(Button.Iced_Frappe);
        middlepanel.add(Button.Iced_Machiatto);
        middlepanel.add(Button.Iced_Tea);



        JLabel side = new JLabel();
        side.setText("Sides");
        side.setIcon(sides);
        side.setForeground(Color.WHITE);
        side.setFont(new Font("Helvetica",Font.BOLD+Font.ITALIC,15));
        JPanel bottompanel = new JPanel();
        bottompanel.setLayout(new GridLayout(3,2));
        bottompanel.setBackground(new Color(194,130,68));
        side.setIconTextGap(40);
        bottompanel.add(side);
        bottompanel.add(Button.Choc_Cookie);
        bottompanel.add(Button.Crossoint);
        bottompanel.add(Button.Bannana_Bread);
        bottompanel.add(Button.Fruit_Muffin);
        bottompanel.add(Button.Avo_Toast);

        west.add(toppanel);
        west.add(middlepanel);
        west.add(bottompanel);
    
        JLabel size = new JLabel();
        size.setText("Sizes");
        size.setFont(new Font("Helvetica",Font.ITALIC,30));
        middleleft = new JPanel();
        middleleft.setBackground(Color.WHITE);
        middleright = new JPanel();
        middleright.setBackground(Color.WHITE);

        JLabel small = new JLabel();
        small.setText("Small $3 ");
        small.setFont(new Font("Helvetica",Font.ITALIC,30));
        JLabel medium = new JLabel();
        medium.setText("Medium $4 ");
        medium.setFont(new Font("Helvetica",Font.ITALIC,30));
        JLabel large = new JLabel();
        large.setText("Large $5 ");
        large.setFont(new Font("Helvetica",Font.ITALIC,30));

        middle.setLayout(new GridLayout(1,2));
        middle.add(middleleft);
        middleleft.setLayout(new GridLayout(10,1));
        middle.add(middleright);
        middleright.setLayout(new GridLayout(10,1));
        middleleft.add(cart);
        middleright.add(size);
        new NewWindowButton();
        middleleft.add(NewWindowButton.Submit);
        middleleft.add(NewWindowButton.Clear);
        middleright.add(small);
        middleright.add(medium);
        middleright.add(large);
        middleright.setBorder(border);
        middleleft.setBorder(border);
        
       

        frame = new JFrame();
        frame.setTitle("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1250, 750);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.WHITE);
        frame.add(north,BorderLayout.NORTH);
        frame.add(west,BorderLayout.WEST);
        frame.add(middle,BorderLayout.CENTER);
        
        
        
    }
    public static void main(String[] args){
        new Menu_Screen();
    }
   

   
}
import java.awt.Checkbox;
import javax.swing.JOptionPane;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;



public class Button  {
    
   static Checkbox Cuppacino;
    static Checkbox Mocha;
    static Checkbox Latte;
    static Checkbox Flat_White;
    static Checkbox Expresso;

    static Checkbox Iced_Latte;
    static Checkbox Iced_Machiatto;
    static Checkbox Iced_Frappe;
    static Checkbox Iced_Tea;
    static Checkbox Iced_Americano;
    
    static Checkbox Choc_Cookie;
    static Checkbox Crossoint;
    static Checkbox Bannana_Bread;
    static Checkbox Fruit_Muffin;
    static Checkbox Avo_Toast;
    
   
    static String[] sizes = {"Large", "Medium", "Small"};
    static String[] receipts = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",};
    static int counter = 0;
    
    Button(){
        ImageIcon sizesphoto = new ImageIcon("src/sizesphoto.png");
        Cuppacino = new Checkbox("Cappucino");
        Mocha = new Checkbox("Mocha");
        Latte = new Checkbox("Latte");
        Flat_White = new Checkbox("Flat White");
        Expresso = new Checkbox("Expresso");
     
        Iced_Latte = new Checkbox("Iced Latte");
        Iced_Machiatto = new Checkbox("Iced Macchiato");
        Iced_Frappe = new Checkbox("Iced Frappe");
        Iced_Tea = new Checkbox("Iced Tea");
        Iced_Americano = new Checkbox("Iced Americano");

        Choc_Cookie = new Checkbox("Choc Cookie");
        Crossoint = new Checkbox("Croissant");
        Bannana_Bread = new Checkbox("Bannana Bread");
        Fruit_Muffin = new Checkbox("Fruit Muffin");
        Avo_Toast = new Checkbox("Avo Toast");

        Cuppacino.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent ie) {
          if(Cuppacino.getState()==true){
         JOptionPane.showOptionDialog(null, "Please Select Size! ", "sizes", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, sizesphoto, sizes, 0);
         receipts[counter] = "Cuppacino";
         counter++;
         }
         }  
          });

          Mocha.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
      if(Mocha.getState()==true){
          JOptionPane.showOptionDialog(null, "Please Select Size! ", "sizes", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, sizesphoto, sizes, 0);
          receipts[counter] = "Mocha";
         counter++;
      }
   }  
});

         Latte.addItemListener(new ItemListener() {
         @Override
         public void itemStateChanged(ItemEvent ie) {
      if(Latte.getState()==true){
          JOptionPane.showOptionDialog(null, "Please Select Size! ", "sizes", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, sizesphoto, sizes, 0);
          receipts[counter] = "Latte";
         counter++;
      }
   }  
});

   Flat_White.addItemListener(new ItemListener() {
   @Override
   public void itemStateChanged(ItemEvent ie) {
      if (Flat_White.getState()==true){
      JOptionPane.showOptionDialog(null, "Please Select Size! ", "sizes", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, sizesphoto, sizes, 0);
      receipts[counter] = "Flat White";
         counter++;
      }
   }  
});

      Expresso.addItemListener(new ItemListener() { 
    @Override
          public void itemStateChanged(ItemEvent ie) {
     if(Expresso.getState()==true){
      JOptionPane.showOptionDialog(null, "Please Select Size! ", "sizes", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, sizesphoto, sizes, 0);
      receipts[counter] = "Expresso";
         counter++;
      }
   }  
});

Iced_Americano.addItemListener(new ItemListener() { 
   @Override
         public void itemStateChanged(ItemEvent ie) {
     if(Iced_Americano.getState()==true){
      JOptionPane.showOptionDialog(null, "Please Select Size! ", "sizes", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, sizesphoto, sizes, 0);
      receipts[counter] = "Iced Americano";
         counter++;
      }
   }  
});

   Iced_Frappe.addItemListener(new ItemListener() { 
   @Override
         public void itemStateChanged(ItemEvent ie) {
     if(Iced_Frappe.getState()==true){
      JOptionPane.showOptionDialog(null, "Please Select Size! ", "sizes", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, sizesphoto, sizes, 0);
      receipts[counter] = "Iced Frappe";
         counter++;
      }
   }  
});
Iced_Latte.addItemListener(new ItemListener() { 
   @Override
         public void itemStateChanged(ItemEvent ie) {
      if(Iced_Latte.getState()==true){
      JOptionPane.showOptionDialog(null, "Please Select Size! ", "sizes", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, sizesphoto, sizes, 0);
      receipts[counter] = "Iced Latte";
         counter++;
      }
   }  
});
Iced_Machiatto.addItemListener(new ItemListener() { 
   @Override
         public void itemStateChanged(ItemEvent ie) {
     if(Iced_Machiatto.getState()==true){
      JOptionPane.showOptionDialog(null, "Please Select Size! ", "sizes", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, sizesphoto, sizes, 0);
      receipts[counter] = "Iced Machiatto";
         counter++;
      }
   }  
});

Iced_Tea.addItemListener(new ItemListener() { 
   @Override
         public void itemStateChanged(ItemEvent ie) {
     if(Iced_Tea.getState()==true){
      JOptionPane.showOptionDialog(null, "Please Select Size! ", "sizes", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, sizesphoto, sizes, 0);
      receipts[counter] = "Iced Tea";
         counter++;
      }
   }  
});


Choc_Cookie.addItemListener(new ItemListener() { 
   @Override
         public void itemStateChanged(ItemEvent ie) {
     if(Choc_Cookie.getState()==true){
      receipts[counter] = "Choc Cookie";
         counter++;
      }
   }  
});

Crossoint.addItemListener(new ItemListener() { 
   @Override
         public void itemStateChanged(ItemEvent ie) {
     if(Crossoint.getState()==true){
      receipts[counter] = "Crossoint";
         counter++;
      }
   }  
});

Bannana_Bread.addItemListener(new ItemListener() { 
   @Override
         public void itemStateChanged(ItemEvent ie) {
     if(Bannana_Bread.getState()==true){
      receipts[counter] = "Bannana Bread";
         counter++;
      }
   }  
});
        
Fruit_Muffin.addItemListener(new ItemListener() { 
   @Override
         public void itemStateChanged(ItemEvent ie) {
     if(Fruit_Muffin.getState()==true){
      receipts[counter] = "Fruit Muffin";
         counter++;
      }
   }  
});

Avo_Toast.addItemListener(new ItemListener() { 
   @Override
         public void itemStateChanged(ItemEvent ie) {
     if(Avo_Toast.getState()==true){
      receipts[counter] = "Avo Toast";
         counter++;
      }
   }  
});


            

        
    }
    
    
}


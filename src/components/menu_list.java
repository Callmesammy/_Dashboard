
package components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class menu_list extends javax.swing.JPanel {
  
    public Mondel_Menu data;
    public boolean isSelected() {
        return selected;
    }

   
 
    private boolean selected;
    public menu_list(Mondel_Menu data) {
        this.data = data;
        initComponents();
        if(data.getType()==Mondel_Menu.MenuType.MENU){
           ibiname.setText(data.getName());
           ibicon.setIcon(data.addIcon());
        }else{
              if(data.getType()==Mondel_Menu.MenuType.ICON){
            ibicon.setIcon(data.addIcon());
            ibiname.setText(data.getIcon());
            
        }else{
                   if(data.getType()==Mondel_Menu.MenuType.EMPTY){
                       ibiname.setText(" ");
                   }
              }
                
                }
        
        
    }

    
    
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibicon = new javax.swing.JLabel();
        ibiname = new javax.swing.JLabel();

        ibiname.setText("Enter Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ibicon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ibiname, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ibicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ibiname, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
   protected void paintComponent(Graphics g) {
       if(selected){
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibicon;
    private javax.swing.JLabel ibiname;
    // End of variables declaration//GEN-END:variables
}

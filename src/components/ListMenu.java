
package components;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;




public class ListMenu <E extends Object> extends JList <E>{

    
    private DefaultListModel model;
    private int selectedIndex = -1;
    
    public ListMenu() {
    model = new DefaultListModel();
        addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
        if(SwingUtilities.isLeftMouseButton(e)){
            int index = locationToIndex(e.getPoint());
            Object o = model.getElementAt(index);
            if (o instanceof Mondel_Menu){
                Mondel_Menu data = new Mondel_Menu();
                if(data.getType()==Mondel_Menu.MenuType.MENU){
                    selectedIndex = index;
                }
           
            }else{
                selectedIndex = index;
            }
            repaint();
        }
        }
        });
        setModel(model);
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
               Mondel_Menu data = new Mondel_Menu();
                if(value instanceof Mondel_Menu){
                   data = (Mondel_Menu)value;
               }else{
                   data = new Mondel_Menu("1", "drfd", Mondel_Menu.MenuType.EMPTY);
               }
                menu_list men = new menu_list(data);
                men.setSelected(selectedIndex == index);
                return men;
            }
           
            };
            
        
    }

     public void addItem(Mondel_Menu data){
                model.addElement(data);
  
        }
        
    
}
    


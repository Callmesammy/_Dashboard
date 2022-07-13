
package components;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Mondel_Menu {

    Mondel_Menu(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return the Type
     */
    public MenuType getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(MenuType Type) {
        this.Type = Type;
    }
    private String name;
    private String icon;
    private MenuType Type;

    public Mondel_Menu() {
    }

    public Mondel_Menu(String name, String icon, MenuType Type) {
        this.name = name;
        this.icon = icon;
        this.Type = Type;
    }
    
    public Icon addIcon(){
        return new ImageIcon(getClass().getResource("/icon2/" +icon+ ".png"));
    }
 public enum MenuType  {
    MENU, ICON, EMPTY
}
    
}

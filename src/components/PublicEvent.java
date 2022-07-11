
package components;


public class PublicEvent {
  
   
    private static PublicEvent instance;
    private EventLogin EventLogin;
    
    public static PublicEvent install(){
        
    if (instance == null){
        instance = new PublicEvent();
    }
    return instance;
}
    

    public PublicEvent() {
    
 
    }
    
    public void addEventLogin (EventLogin event){
        this.EventLogin=event;
        
    }
    public EventLogin getEventLogin(){
        return EventLogin;
    }
    
}
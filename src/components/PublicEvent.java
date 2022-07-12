
package components;


public class PublicEvent {
  
   
    private static PublicEvent instance;
    private EventLogin EventLogin;
    private EventMain eventMain;
    
    public static PublicEvent install(){
        
    if (instance == null){
        instance = new PublicEvent();
    }
    return instance;
}
    

    public void addEventmain (EventMain event){
        this.eventMain = event;
    }
    
    public EventMain getEventMain(){
        return eventMain;
    }
    
    public EventMain addEventMain(){
        return eventMain;
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
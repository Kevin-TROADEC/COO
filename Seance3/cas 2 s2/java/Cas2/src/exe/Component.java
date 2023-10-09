package exe;


public interface Component { 
     double getPrice();
     boolean validateConfiguration();
     void accept(IVisitor v);
    
     }
    
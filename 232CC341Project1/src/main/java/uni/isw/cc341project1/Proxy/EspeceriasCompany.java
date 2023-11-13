
package uni.isw.cc341project1.Proxy;

import java.util.List;

public class EspeceriasCompany {
    private Factory especeriaFactory;
    private int especeria;
    
    public EspeceriasCompany(){
        especeriaFactory = new ProxyEspeceriaFactory();
        especeria = 100;
    }
    
    public void sellEspeceria(){
        especeria -= 1; 
    }
    
    public int getEspeceriaQuantity(){
        return especeria;
    }
    
    public List<String> startEspeceriaFactory(){
        return especeriaFactory.initializeFactory();
    }
}


package uni.isw.cc341project1.Proxy;

import java.util.List;
import java.util.ArrayList;

public class RealEspeceriaFactory implements Factory {
    
    List<String> especeriaMachine;
    
    @Override
    public List<String> initializeFactory(){
        especeriaMachine = new ArrayList<String>();
        for(int i=0; i<5; i++){
            System.out.println("Machine: " + i + " initialized");
            especeriaMachine.add("Machine " + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        
        return especeriaMachine;
    }
}

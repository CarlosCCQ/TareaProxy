
package uni.isw.cc341project1.Proxy;

import java.util.List;

public class ProxyEspeceriaFactory implements Factory{
    private Factory realFactory;
    
    public ProxyEspeceriaFactory(){
        System.out.println("Creating Proxy Factory");
    }
    
    @Override
    public List<String> initializeFactory(){
        if(realFactory == null){
            realFactory = new RealEspeceriaFactory();
        }
        return realFactory.initializeFactory();
    }
}

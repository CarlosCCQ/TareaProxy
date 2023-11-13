
package uni.isw.cc341project1.Proxy;

public class MainProxy {
    public static void main(String[] args){
        EspeceriasCompany especeriasCompany = new EspeceriasCompany();
        
        System.out.println("Selling especeria");
        System.out.println(especeriasCompany.getEspeceriaQuantity());
        especeriasCompany.sellEspeceria();
        especeriasCompany.sellEspeceria();
        especeriasCompany.sellEspeceria();
        System.out.println(especeriasCompany.getEspeceriaQuantity());
        System.out.println("--------------------------------------");
        
        System.out.println("Preparing especerias");
        especeriasCompany.startEspeceriaFactory();
    }
}

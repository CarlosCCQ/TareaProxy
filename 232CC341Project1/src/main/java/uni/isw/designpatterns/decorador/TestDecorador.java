

package uni.isw.designpatterns.decorador;

public class TestDecorador {
    public static void main(String[] args){
        Automovil carro = new AutomovilEstandar("Toyota");
        carro.start();
        carro.accel();
        carro.stop();
        System.out.println("--------------------------------");
        Automovil carroelectrico = new AutomovilElectricoFeature(new AutomovilEstandar("Toyota Corolla Cross"));
        
        carroelectrico.start();
        carroelectrico.accel();
        carroelectrico.stop();
    }
}

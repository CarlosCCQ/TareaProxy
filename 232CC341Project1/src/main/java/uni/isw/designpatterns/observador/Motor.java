
package uni.isw.designpatterns.observador;

public class Motor implements Observador{

    @Override
    public void update() {
        System.out.println("Subir la potencia, velocidad, revoluciones, etc");
    }
    
}


package uni.isw.designpatterns.decorador;

public class AutomovilEstandar implements Automovil{
    
    private String nombre;

    public AutomovilEstandar(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public void start() {
        System.out.println("Prendiendo el Automovil");
    }

    @Override
    public void accel() {
        System.out.println("Realizando aceleracion estandar");
    }

    @Override
    public void stop() {
        System.out.println("frenado estandar");
    }
    
}

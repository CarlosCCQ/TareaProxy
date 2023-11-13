
package uni.isw.designpatterns.decorador;

public abstract class AutomovilDecorador implements Automovil{
    private Automovil auto;

    public AutomovilDecorador(Automovil auto) {
        this.auto = auto;
    }

    public Automovil getAuto() {
        return auto;
    }
}

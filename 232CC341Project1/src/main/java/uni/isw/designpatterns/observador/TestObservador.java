
package uni.isw.designpatterns.observador;

public class TestObservador {
    public static void main(String[] args){
        Motor v8 = new Motor();
        Acelerador x = new Acelerador();
        x.enlazarObservador(v8);
        x.pisarElAcelerador();
        System.out.println("-----------------------------");
        Motor v1 = new Motor();
        Motor v2 = new Motor();
        Motor v3 = new Motor();
        Motor v4 = new Motor();
        Acelerador y = new Acelerador();
        y.enlazarObservador(v1);
        y.enlazarObservador(v2);
        y.enlazarObservador(v3);
        y.enlazarObservador(v4);
        y.pisarElAcelerador();
    }
}

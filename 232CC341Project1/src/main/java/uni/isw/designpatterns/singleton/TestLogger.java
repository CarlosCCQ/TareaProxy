
package uni.isw.designpatterns.singleton;

public class TestLogger {
    
    public static void main(String[] args){
        Logger logger = Logger.getInstace();
        logger.log("prueba");
        Logger logger_1 = Logger.getInstace();
        Logger logger_2 = Logger.getInstace();
        logger_1.setValue("prueba_1");
        System.out.println(logger_2.getValue());
    }
}

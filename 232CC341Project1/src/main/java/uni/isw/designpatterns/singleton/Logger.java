
package uni.isw.designpatterns.singleton;

public class Logger {
    private static Logger log;
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private Logger() {
    }
    
    public static synchronized Logger getInstace(){
        if(log==null)
            log = new Logger();
        return log;
    }

    public void log(String msg){
        System.out.println(msg);
    }
    
    
    
}

package my.kafka.app.kafka;

public class Data {
    private static Data currentData = new Data(); 
    private String param1 = "";
    private String param2 = "";
    public static Data shared() { 
        return currentData; 
    } 

    /** Don't let anyone else instantiate this class */ 
    private Data() {}

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam1() {
        return this.param1;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public String getParam2() {
        return this.param2;
    }
}
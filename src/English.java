import java.util.HashMap;
import java.util.Map;

public class English extends Subject {

    public String transalte (String animal){
        Map<String, String> map = new HashMap<String, String>();
        map.put("pes", "dog");
        map.put("macka", "cat");
        map.put("korytnacka", "turtle");
        map.put("had", "snake");
        map.put("krava", "cow");
        map.put("kon", "horse");
        map.put("mys", "mouse");
        map.put("ryba", "fish");

        return map.get(animal);
    }
}

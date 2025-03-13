import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        Map<String,String>map=
        new HashMap<String,String>();

        map.put("1","기아");
        map.put("2","삼성");
        map.put("3","엘지");
        
        System.out.println(("요소의 사이즈"+map.size()));

        if(map.containsValue("엘지")){
            map.remove(("3"));

        System.out.println("요소의 사이즈"+map.size());
        System.out.println("2위팀"+map.get("2"));
        }
    }
}

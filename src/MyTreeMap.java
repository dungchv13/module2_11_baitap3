import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {

        String str = "dog cat Dog cat pig chicken pig cat dog chicken cat pig pig dog cow cow raven snake snake";
        str = str.toLowerCase();
        String[] s1 = str.split(" ");

        Map<String,Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < s1.length; i++) {
            if(!treeMap.containsKey(s1[i])){
                treeMap.put(s1[i],1);
            }else{
                treeMap.replace(s1[i],treeMap.get(s1[i])+1);
            }
        }

        for (String key:treeMap.keySet()) {
            System.out.println(key +" : "+treeMap.get(key));
        }


    }

}

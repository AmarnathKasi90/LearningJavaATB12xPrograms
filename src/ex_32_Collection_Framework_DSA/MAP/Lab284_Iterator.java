    package ex_32_Collection_Framework_DSA.MAP;

    import java.util.HashMap;
    import java.util.Map;

    public class Lab284_Iterator {
        public static void main(String[] args) {
            Map <String,Integer>m = new HashMap();

            m.put("id",12);
            m.put("id1",23);
            m.put("id2",34);
            m.put("id3",45);
            m.put("id4",65);
            m.put("id5",98);

            for(Map.Entry<String,Integer> entry: m.entrySet()){
                System.out.println(entry.getKey() +"=> "+ entry.getValue());
            }

        }
    }

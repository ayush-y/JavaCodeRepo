import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear", "Zebra", "Lion", "Ant");
        System.out.println(list);
        sortInDesc(list);
        System.out.println(list);

    }
    public static void sortInDesc(List<String> strList){
        Collections.sort(strList, new java.util.Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if(s.equals(t1)){
                    return 0;
                } else if (s.charAt(0) < t1.charAt(0)){
                    return 1;
                } else
                    return -1;
            }
        });
    }
}

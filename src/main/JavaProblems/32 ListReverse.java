import java.util.Arrays;
import java.util.List;

class ListReverse {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        reverse(list, 2, 7);
        System.out.println(list);
    }

    private static void reverse(List<Integer> list, int x, int y) {
        //Collections.reverse(list);
        for (int i = 0; i < list.size()/2; i++) {
            ListSwapping.swap(list, i, list.size()-1-i);
        }
    }

}

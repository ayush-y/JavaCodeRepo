import java.util.Arrays;
import java.util.List;

class ListSwapping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        swap(list, 2, 7);
        System.out.println(list);

    }
    public static void swap(List<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);

    }
}

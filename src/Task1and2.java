import java.util.*;

public class Task1and2 {
    public static void main(String[] args) {

        List<Integer> list = getList(10, 1, 10);
        System.out.println("We get random List: ");
        System.out.println(list);
        findMinMaxAverage(list);
        removeEven(list);
        System.out.println("List after removed even numbers: ");
        System.out.println(list);
    }

    public static void removeEven(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) % 2 == 0) {
                l.remove(i--);
            }
        }
    }

    public static void findMinMaxAverage(List<Integer> l) {
        int sum = 0;
        for (int x : l) {
            sum+=x;
        }
        System.out.printf("Minimum is %d, maximum is %d and average %.2f \n",
                Collections.min(l), Collections.max(l), sum*1.0/l.size());
    }

    public static List<Integer> getList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            list.add(r.nextInt(min, max + 1));
        }
        return list;
    }
}

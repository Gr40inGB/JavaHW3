[Task1and2.java](src%2FTask1and2.java)
```java
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
```


[Task3.java](src%2FTask3.java)

```java
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
//        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//        Вывести название каждой планеты и количество его повторений в списке.
        List<String> allPlanet = new ArrayList<>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
        List<String> l = getRandomPlanet(allPlanet);
        System.out.println(l);
        countPlanet(allPlanet, l);
    }

    public static void countPlanet(List<String> allPlanet, List<String> l) {
        System.out.print("in list we have: ");
        for (String p : allPlanet) {
            System.out.printf("\n%s %s ",Collections.frequency(l,p), p);
        }
    }

    public static List<String> getRandomPlanet(List<String> allPlanet) {
        List<String> l = new ArrayList<>();
        Random r = new Random();
        int randomSize = r.nextInt(16, 30);
        while (randomSize > 0) {
            l.add(allPlanet.get(r.nextInt(0, 8)));
            randomSize--;
        }
        return l;
    }
}
```
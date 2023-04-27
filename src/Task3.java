import java.util.*;

public class Task3 {
    public static void main(String[] args) {
//        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//        Вывести название каждой планеты и количество его повторений в списке.
        List<String> allPlanet = new ArrayList<>(Arrays.asList("Mercury", "Venus",
                "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"));
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

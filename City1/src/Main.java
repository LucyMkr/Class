import java.util.Scanner;
class City {
    String name = "Not defined";
    int population;
    int age;
    String location;
}
public class Main {

    public static void main(String[] args) {
        City First = new City();
        First.population = 20591;
        First.age = 1273;
        First.location = "the North-Eastern part of Syunik province";

        if (First.name == "Not defined") {
            System.out.println("Please, input name data");
            Scanner nameScan = new Scanner(System.in);
            First.name = nameScan.next();
            System.out.println(First.name + " " + First.population + " " + First.age + " " + First.name + " " + First.location + " ");
        } else {
            System.out.println(First.name + " " + First.population + " " + First.age + " " + First.name + " " + First.location + " ");
        }
    }
}

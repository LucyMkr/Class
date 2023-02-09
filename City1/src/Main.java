import java.util.Scanner;

class City1 {

    String name = "Not defined";
    int population;
    int age;
    String location;


    City1() {
    }
}

class Main {

    public static void main(String[] args) {
        City1 First = new City1();
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



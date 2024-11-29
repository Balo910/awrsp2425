import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {

    private static final String[] names = {"Adam, Barbara, Czesław, Daria, Edward, Faustyna, Grzegorz, Hanna, Ireneusz, Justyna"};
    private static final String[] surnames = {"Kowal, Leśniak, Łoś, Małek, Niedziela, Orka, Polak, Rudewicz, Sosna, Topielec"};
    private static final String[] companies = {"Wallmart, Zelmer, Adidas, Biedronka, CCC, Deichmann, E-leclerc, Fiji Water, Google, Honda"};
    private static final String[] streets = {"Imbirowa, Jana Pawła II, Królewska, Lubelska, Morska, Nowa, Orla, Piłsudskiego, Rumiankowa, Szeroka"};
    private static final String[] cities = {"Toruń, Warszawa, Zabrze, Bielsko-Biała, Częstochowa, Elbląg, Frombork, Gorzów Wielkopolski, Hrubieszów, Iława"};
    private static final Random RANDOM = new Random();


    public List<Person> generatePeopleList(int n) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            people.add(generatePerson());
        }
        return people;
    }

    public Person generatePerson() {
        
    }
}



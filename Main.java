import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        CardIndexPets cardIndexPets = new CardIndexPets();

        Person person = new Person("Вася", 23, true);
        Pet dog = new Pet(1, "Шарик", person, 10);
        Pet cat = new Pet(2, "Мурзик", person, 5);

        try {
            cardIndexPets.add(dog);
            cardIndexPets.add(cat);
            Optional<Pet> find = cardIndexPets.findByName("Шарик");
            find.ifPresent(System.out::println);
            cardIndexPets.print();
            cardIndexPets.updateById(2, new Pet(2, "Васька", person, 7));
            cardIndexPets.print();
        } catch (DuplicateException e) {
            e.printStackTrace();
        }
    }

}

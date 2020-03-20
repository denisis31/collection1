import java.util.*;

public class CardIndexPets {

    private List<Pet> pets = new ArrayList<>(); // список домашних животных


    public void add(Pet pet) throws DuplicateException {
        if (pets.contains(pet)) {
            throw new DuplicateException("Данное животное уже содержится в картотеке!");
        }
        pets.add(pet);
    }


    public Optional<Pet> findByName(String name) {
        for (Pet pet : pets) {
            if (pet.getName().equals(name)) {
                return Optional.of(pet);
            }
        }
        return Optional.empty();
    }


    public void updateById(int id, Pet pet) {
        for (Pet oldPet : pets) {
            if (oldPet.getId() == id) {
                oldPet.setName(pet.getName());
                oldPet.setOwner(pet.getOwner());
                oldPet.setWeight(pet.getWeight());
            }
        }
    }


    public void print() {
        Comparator<Person> personComparator = Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge);
        Comparator<Pet> petComparator = Comparator.comparing(Pet::getOwner, personComparator)
                .thenComparing(Pet::getName)
                .thenComparing(Pet::getWeight);

        List<Pet> copy = new ArrayList<>(pets);
        copy.sort(petComparator);
        for (Pet pet : copy) {
            System.out.println(pet);
        }
    }

}

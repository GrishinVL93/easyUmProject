package javafullschool.part1.interfaces;

public class Main {
    public static void main(String[] args) {
        Cat kotik = new Cat();
        kotik.say();

        Dog pesik = new Dog();
        pesik.say();

        findOwner(kotik);
        findOwner(pesik);

       /* System.out.println(((Cat)kotik).getOwner());
        System.out.println(((Dog)pesik).getOwner());*/

        ((Cat) kotik).getOwner();
        //

    }

    public static void findOwner(AbstractAnimal animal){
        if(animal.getClass() == Cat.class){
            animal.setOwner("Cat_owner");
        }

        if(animal.getClass() == Dog.class){
            animal.setOwner("Dog_owner");
        }
    }
}

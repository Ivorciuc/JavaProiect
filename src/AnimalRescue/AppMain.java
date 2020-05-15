package AnimalRescue;

public class AppMain {

    public static void main(String[] args){
       Dog rex = new Dog();
       rex.setName("Rex");
       rex.setAge(10);
       rex.setColor("brown");
       rex.setRace("Ciobanesc");
       rex.setChipnr(166);
       rex.setWeight(23);
       rex.setNivelulStariiDeSanatate(10);
       rex.setNivelulSenzatieiDeFoame(4);
       rex.setNivelulStariiDeSpirit(8);
       rex.setMancarePreferata("Bones");
       rex.setActivitatePreferata("Sleeping");



       System.out.println(" \nThis is the first dog: \n");

       System.out.println("Name: " + rex.getName());
       System.out.println("Color: " + rex.getColor());
       System.out.println("Age: " + rex.getAge());
       System.out.println("Weight: " + rex.getWeight());
       System.out.println("CipNr: " + rex.getChipnr());
       System.out.println("Race: " + rex.getRace());
       System.out.println("Favorite food: " + rex.getMancarePreferata());
       System.out.println("Favorite activity: " + rex.getActivitatePreferata());
       System.out.println("Level of health: " + rex.getNivelulStariiDeSanatate());
       System.out.println("Level of hunger: " + rex.getNivelulSenzatieiDeFoame());
       System.out.println("Mood level: " + rex.getNivelulStariiDeSpirit());
       rex.speaks();



       Cat kitty = new Cat();
       kitty.setName("Kitty");
       kitty.setAge(2);
       kitty.setColor("white");
       kitty.setRace("Siameza");
       kitty.setChipnr(423);
       kitty.setWeight(5);
       kitty.setNivelulStariiDeSanatate(10);
       kitty.setNivelulSenzatieiDeFoame(1);
       kitty.setNivelulStariiDeSpirit(10);
       kitty.setMancarePreferata("Fish");
       kitty.setActivitatePreferata("Walking");

       System.out.println(" \nThis is the first cat: \n");

       System.out.println("Name: " + kitty.getName());
       System.out.println("Color: " + kitty.getColor());
       System.out.println("Age: " + kitty.getAge());
       System.out.println("Weight: " + kitty.getWeight());
       System.out.println("CipNr: " + kitty.getChipnr());
       System.out.println("Race: " + kitty.getRace());
       System.out.println("Favorite food: " + kitty.getMancarePreferata());
       System.out.println("Favorite activity: " + kitty.getActivitatePreferata());
       System.out.println("Level of health: " + kitty.getNivelulStariiDeSanatate());
       System.out.println("Level of hunger: " + kitty.getNivelulSenzatieiDeFoame());
       System.out.println("Mood level: " + kitty.getNivelulStariiDeSpirit());
       kitty.speaks();

       Goat macarena = new Goat();
       kitty.setName("Macarena");
       kitty.setAge(1);
       kitty.setColor("white");
       kitty.setWeight(15);
       kitty.setNivelulStariiDeSanatate(10);
       kitty.setNivelulSenzatieiDeFoame(1);
       kitty.setNivelulStariiDeSpirit(10);
       kitty.setMancarePreferata("Grass");

       System.out.println(" \nThis is the first cat: \n");

       System.out.println("Name: " + kitty.getName());
       System.out.println("Color: " + kitty.getColor());
       System.out.println("Age: " + kitty.getAge());
       System.out.println("Weight: " + kitty.getWeight());
       System.out.println("Favorite food: " + kitty.getMancarePreferata());
       System.out.println("Level of health: " + kitty.getNivelulStariiDeSanatate());
       System.out.println("Level of hunger: " + kitty.getNivelulSenzatieiDeFoame());
       System.out.println("Mood level: " + kitty.getNivelulStariiDeSpirit());
       macarena.speaks();



       Girl ana = new Girl();
       ana.setNume("Ana");
       ana.setAge(14);
       ana.setMoney(1000);

       System.out.println("\nThis is the girl: \n");

       System.out.println("Name: " + ana.getNume());
       System.out.println("Age: " + ana.getAge());
       System.out.println("Money: " + ana.getMoney());

       Boy alex = new Boy();
       alex.setNume("Alex");
       alex.setAge(13);
       alex.setMoney(250);

       System.out.println("\nThis is the boy: \n");

       System.out.println("Name: " + alex.getNume());
       System.out.println("Age: " + alex.getAge());
       System.out.println("Money: " + alex.getMoney());


       Veterinarian bogdan = new Veterinarian();
       bogdan.setName("Bogdan");
       bogdan.setAge(44);
       bogdan.setSpecialization("Muscles");

       System.out.println("\nThis is the veterinarian: \n");

       System.out.println("Name: " + bogdan.getName());
       System.out.println("Age " + bogdan.getAge());
       System.out.println("Specialization: " + bogdan.getSpecialization());


       DogFood oase = new DogFood();
       oase.setNumeMancare("Bones");
       oase.setCantitate(100);

       System.out.println("\nThis is the animal food: \n");

       System.out.println("First food: " + oase.getNumeMancare());
       System.out.println("Amount: " + oase.getCantitate());

       CatFood fish = new CatFood();
       fish.setNumeMancare("Fish");
       fish.setCantitate(23);
       fish.setExpirationDate("02/06/2020");

       System.out.println("\nThis is the animal food: \n");

       System.out.println("First food: " + fish.getNumeMancare());
       System.out.println("Amount: " + fish.getCantitate());
       System.out.println("Expiration Date: " + fish.getExpirationDate());


       Activities activities = new Activities();
       activities.setActivity("");
       activities.setActivity("");
       activities.setActivity("");
       activities.setActivity("");
       activities.setActivity("");
       activities.setActivity("");


       System.out.println("\nThose are the activities: \n");

       System.out.println("Running..." + activities.getActivity());
       System.out.println("Walking..." + activities.getActivity());
       System.out.println("Sitting..." + activities.getActivity());
       System.out.println("Barking..." + activities.getActivity());
       System.out.println("Playing..." + activities.getActivity());
       System.out.println("Sleeping..." + activities.getActivity());














    }


}

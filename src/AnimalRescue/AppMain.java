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
       rex.setNivelulSenzatieiDeFoame(1);
       rex.setNivelulStariiDeSpirit(10);
       rex.setMancarePreferata("Bones");
       rex.setActivitatePreferata("Walking");


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


       Girl ana = new Girl();
       ana.setNume("Ana");
       ana.setMoney(1000);

       System.out.println("\nThis is the girl: \n");

       System.out.println("Name: " + ana.getNume());
       System.out.println("Money: " + ana.getMoney());


       Veterinarian alex = new Veterinarian();
       alex.setName("Alex");
       alex.setSpecialization("Muscles");

       System.out.println("\nThis is the veterinarian: \n");

       System.out.println("Name: " + alex.getName());
       System.out.println("Specialization: " + alex.getSpecialization());


       AnimalFood animalFood = new AnimalFood();
       animalFood.setNumeMancare("Boabe");
       animalFood.setNumeMancare1("Oase");
       animalFood.setCantitate(100);

       System.out.println("\nThis is the animal food: \n");

       System.out.println("First food: " + animalFood.getNumeMancare());
       System.out.println("Second food: " + animalFood.getNumeMancare1());
       System.out.println("Amount: " + animalFood.getCantitate());

       Activities activities = new Activities();
       activities.setRunning("Running..");
       activities.setWalking("Walking..");
       activities.setSitting("Sitting..");
       activities.setBarking("Barking..");
       activities.setPlaying("Playing..");


       System.out.println("\nThose are the activities: \n");

       System.out.println(activities.getRunning());
       System.out.println(activities.getWalking());
       System.out.println(activities.getSitting());
       System.out.println(activities.getBarking());
       System.out.println(activities.getPlaying());












    }


}

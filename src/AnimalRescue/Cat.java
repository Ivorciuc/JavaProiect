package AnimalRescue;

public class Cat extends Animal {
    private String race;
    private int chipNr;
    private float weight;

    private String activitatePreferata;



    public String getRace(){
        return race;
    }

    public void setRace(String race){
        this.race = race;
    }

    public int getChipnr(){
        return chipNr;
    }

    public void setChipnr(int chipnr){
        this.chipNr = chipnr;
    }

    public float getWeight(){
        return weight;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }



    public String getActivitatePreferata(){
        return activitatePreferata;
    }

    public void setActivitatePreferata(String activitatePreferata){
        this.activitatePreferata = activitatePreferata;
    }



    public void eat(){
        System.out.println("Eating..");
    }

    public void run(){
        System.out.println("Running..");
    }

    public void sleep(){
        System.out.println("ZzzZZzz..");
    }

    public void walk(){
        System.out.println("Paw \n Paw");
    }

    public void play(){
        System.out.println("Playing..");
    }
}

package AnimalRescue;

public class Dog extends Animal {

    private String race;
    private int chipNr;
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

    public String getActivitatePreferata(){
        return activitatePreferata;
    }

    public void setActivitatePreferata(String activitatePreferata){
        this.activitatePreferata = activitatePreferata;
    }

    public void speaks(){
        System.out.println("Woof!");
    }

    public void eat(){
        System.out.println("Bones");
    }

    public void run(){
        System.out.println("With 35 km/h ");
    }

    public void sleep(){
        System.out.println("ZzzZzzZzz");
    }




}

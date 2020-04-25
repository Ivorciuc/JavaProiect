package AnimalRescue;

public class Dog {
    private String name;
    private int age;
    private String color;
    private String race;
    private int chipNr;
    private float weight;
    private int nivelulStariiDeSanatate;
    private int nivelulSenzatieiDeFoame;
    private int nivelulStariiDeSpirit;
    private String mancarePreferata;
    private String activitatePreferata;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

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

    public int getNivelulStariiDeSanatate(){
        return nivelulStariiDeSanatate;
    }

    public void setNivelulStariiDeSanatate(int nivelulstariidesanatate){
        this.nivelulStariiDeSanatate = nivelulstariidesanatate;
    }

    public int getNivelulSenzatieiDeFoame(){
        return nivelulSenzatieiDeFoame;
    }

    public void setNivelulSenzatieiDeFoame(int nivelulsenzatieidefoame){
        this.nivelulSenzatieiDeFoame = nivelulsenzatieidefoame;
    }

    public int getNivelulStariiDeSpirit(){
        return nivelulStariiDeSpirit;
    }

    public void setNivelulStariiDeSpirit(int nivelulstariidespirit){
        this.nivelulStariiDeSpirit = nivelulstariidespirit;
    }

    public String getMancarePreferata(){
        return mancarePreferata;
    }

    public void setMancarePreferata(String mancarePreferata){
        this.mancarePreferata = mancarePreferata;
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

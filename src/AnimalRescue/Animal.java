package AnimalRescue;

public class Animal {
    private String name;
    private int age;
    private String color;
    private float weight;
    private int nivelulStariiDeSanatate;
    private int nivelulSenzatieiDeFoame;
    private int nivelulStariiDeSpirit;
    private String mancarePreferata;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getNivelulStariiDeSanatate() {
        return nivelulStariiDeSanatate;
    }

    public void setNivelulStariiDeSanatate(int nivelulStariiDeSanatate) {
        this.nivelulStariiDeSanatate = nivelulStariiDeSanatate;
    }

    public int getNivelulSenzatieiDeFoame() {
        return nivelulSenzatieiDeFoame;
    }

    public void setNivelulSenzatieiDeFoame(int nivelulSenzatieiDeFoame) {
        this.nivelulSenzatieiDeFoame = nivelulSenzatieiDeFoame;
    }

    public int getNivelulStariiDeSpirit() {
        return nivelulStariiDeSpirit;
    }

    public void setNivelulStariiDeSpirit(int nivelulStariiDeSpirit) {
        this.nivelulStariiDeSpirit = nivelulStariiDeSpirit;
    }

    public String getMancarePreferata() {
        return mancarePreferata;
    }

    public void setMancarePreferata(String mancarePreferata) {
        this.mancarePreferata = mancarePreferata;
    }

    public void speaks(){
        System.out.println("Speak..");
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void run(){
        System.out.println("Running...");
    }

    public void sleep(){
        System.out.println("ZzzZzzZzz");
    }


    }


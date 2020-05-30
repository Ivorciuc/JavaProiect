package AnimalRescue;

public abstract class Food {
    private String numeMancare;

    private int cantitate;

    public String getNumeMancare(){
        return numeMancare;
    }

    public void setNumeMancare(String numeMancare){
        this.numeMancare = numeMancare;
    }


    public int getCantitate(){
        return cantitate;
    }

    public void setCantitate(int cantitate){
        this.cantitate = cantitate;
    }

    public abstract void ExpirationDate();




}

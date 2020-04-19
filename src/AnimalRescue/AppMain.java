package AnimalRescue;

public class AppMain {

    public static void main(String[] args){

       Dog myObject = new Dog();
       System.out.println(myObject.age);

       Girl myObject1 = new Girl();
       System.out.println(myObject1.Nume);
       System.out.println(myObject1.Money);

       AnimalFood myObject2 = new AnimalFood();
       System.out.println(myObject2.NumeMancare);
       System.out.println(myObject2.NumeMancare1);

       Veterinarian myObject3 = new Veterinarian();
       System.out.println(myObject3.Specializare);

       Activities myObject4 = new Activities();
       System.out.println(myObject4.Nume1);

    }


}

import java.util.ArrayList;


public class PettingZooApp {

    public void run() {
        System.out.println();
        System.out.println("========================================");
        System.out.println();

        System.out.println();
        System.out.println("Making a new PettingZoo object....");
        PettingZoo zoo = new PettingZoo();

        System.out.println();
        System.out.println("Adding some llamas to the zoo....");
        
        System.out.println("Adding Old Spitty, an adult....");
        Llama llama = new Llama("Old Spitty");
        llama.growUp();
        zoo.add(llama);
        
        System.out.println("Adding Alice, a baby....");
        llama = new Llama("Alice");
        zoo.add(llama);
  
        
        System.out.println("Adding Sally, a baby....");
        llama = new Llama("Sally");
        zoo.add(llama);

        System.out.println();
        System.out.println("Here is a look at the petting zoo:");
        System.out.println(zoo);

 
        System.out.println();
        System.out.println("Searching for all babies....");
        ArrayList<Llama> babies = zoo.allBabies();

        System.out.println();
        System.out.println("Here are the results: ");
        System.out.println(babies);

        System.out.println();
        System.out.println("========================================");
        System.out.println();
        

    }

}


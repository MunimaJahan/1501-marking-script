import java.util.ArrayList;

public class PettingZoo {
    
    private ArrayList<Llama> llamaList = new ArrayList<Llama>();
    private ArrayList<Llama> babiesList = new ArrayList<Llama>();
    private ArrayList<Llama> adultList = new ArrayList<Llama>();
    
    public void add(Llama llama) {
        llamaList.add(llama);
    }

    public ArrayList<Llama> allBabies() {
        
        for(Llama currentLlama : llamaList) {
            if(currentLlama.isBaby()) {
                babiesList.add(currentLlama);
            }
        }
        return babiesList;
    }

    public ArrayList<Llama> allAdults() {
        
        for(Llama currentLlama : llamaList) {
            if(!currentLlama.isBaby()) {
                adultList.add(currentLlama);
            }
        }
        return adultList;
    }
    
    public String toString() {
        ArrayList<String> babiesString = new ArrayList<String>();
        ArrayList<String> adultsString = new ArrayList<String>();
        for(Llama currentLlama : llamaList) { {
            if(currentLlama.isBaby()) {
                babiesString.add(currentLlama.toString());
            }
        }    
        }
        for(Llama currentLlama : llamaList) { {
            if(!currentLlama.isBaby()) {
                adultsString.add(currentLlama.toString());
            }
        }           
        }
        return "BABIES:" + babiesString + " ADULTS:" + adultsString;
    }

}

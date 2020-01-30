import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Quiz: PettingZoo: filter babies")
public class FilterBabies_Tests {


    private Llama adultLlamaCalled(String name) {
        Llama theLlama = new Llama(name);
        theLlama.growUp();
        return theLlama;
    }
    
    private Llama babyLlamaCalled(String name) {
        return new Llama(name);
    }
    
    @Test
    @DisplayName("a newly created zoo returns an empty list when filtered by babies")
    public void newly_created_one_returns_empty_results_for_filter() {
        PettingZoo zoo = new PettingZoo();

        ArrayList<Llama> filteredResults = zoo.allBabies();

        assertEquals(Collections.emptyList(), filteredResults);
    }

    @Test
    @DisplayName("returns an empty list when no llamas satisfy filter")
    public void returns_empty_list_when_no_llamas_satisfy_filter() {
        PettingZoo zoo = new PettingZoo();

        zoo.add(adultLlamaCalled("Bernard"));
        zoo.add(adultLlamaCalled("Leonard"));

        ArrayList<Llama> filteredResults = zoo.allBabies();

        assertEquals(Collections.emptyList(), filteredResults);
    }

    @Test
    @DisplayName("returns all llamas in same order when all llamas satisfy filter")
    public void returns_all_llamas_in_order_when_all_llamas_satisfy_filter() {
        PettingZoo zoo = new PettingZoo();

        Llama miney = babyLlamaCalled("MINECRAFT!!!");
        zoo.add(miney);
        
        Llama namiko = babyLlamaCalled("Namiko");
        zoo.add(namiko);
        
        Llama bernard = babyLlamaCalled("Bernard");
        zoo.add(bernard);

        ArrayList<Llama> filteredResults = zoo.allBabies();

        ArrayList<Llama> expectedResults = new ArrayList<Llama>();

        expectedResults.add(miney);
        expectedResults.add(namiko);
        expectedResults.add(bernard);

        assertEquals(expectedResults, filteredResults);
    }


    @Test
    @DisplayName("returns only llamas that satisfy the filter")
    public void returns_only_llamas_that_satisfy_filter() {
        PettingZoo zoo = new PettingZoo();

        Llama miney = adultLlamaCalled("MINECRAFT!!!");
        zoo.add(miney);
        
        Llama bernard = babyLlamaCalled("Bernard");
        zoo.add(bernard);
        
        Llama namiko = adultLlamaCalled("Namiko");       
        zoo.add(namiko);
        
        Llama aphro = babyLlamaCalled("Aphrodite");
        zoo.add(aphro);
       

        ArrayList<Llama> filteredResults = zoo.allBabies();

        ArrayList<Llama> expectedResults = new ArrayList<Llama>();

        expectedResults.add(bernard);
        expectedResults.add(aphro);


        assertEquals(expectedResults, filteredResults);
    }

    
}

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Quiz: RoomInventory: toString Tests")
public class ToString_Tests {

    
    private Llama adultLlamaCalled(String name) {
        Llama theLlama = new Llama(name);
        theLlama.growUp();
        return theLlama;
    }
    
    private Llama babyLlamaCalled(String name) {
        return new Llama(name);
    }
    
    
    @Test
    @DisplayName("empty zoo")
    public void empty_zoo() {
        PettingZoo zoo = new PettingZoo(); 
        
        assertEquals("BABIES:[] ADULTS:[]", zoo.toString());
    }
    
    @Test
    @DisplayName("one baby zoo")
    public void one_baby_zoo() { 
        PettingZoo zoo = new PettingZoo(); 
        
        zoo.add(babyLlamaCalled("foo"));
        
        assertEquals("BABIES:[foo (B)] ADULTS:[]", zoo.toString());
    }
    
    @Test
    @DisplayName("one adult zoo")
    public void one_adult_zoo() {
        PettingZoo zoo = new PettingZoo();
        
        zoo.add(adultLlamaCalled("bar"));
        
        assertEquals("BABIES:[] ADULTS:[bar (A)]", zoo.toString());
    }
    
    @Test
    @DisplayName("one baby, one adult zoo")
    public void one_baby_one_adult_zoo() {
        PettingZoo zoo = new PettingZoo();
        
        zoo.add(babyLlamaCalled("Eggy"));
        zoo.add(adultLlamaCalled("Boris"));
        
        
        assertEquals("BABIES:[Eggy (B)] ADULTS:[Boris (A)]", zoo.toString());
    }
    
    @Test
    @DisplayName("two babies, two adults zoo")
    public void two_baby_two_adult_zoo() {
        PettingZoo zoo = new PettingZoo();
        
        zoo.add(babyLlamaCalled("Nigel"));
        zoo.add(babyLlamaCalled("Oz"));
        
        zoo.add(adultLlamaCalled("Celli"));
        zoo.add(adultLlamaCalled("Zoot"));
        
        
        assertEquals("BABIES:[Nigel (B), Oz (B)] ADULTS:[Celli (A), Zoot (A)]", zoo.toString());
    }
    
}

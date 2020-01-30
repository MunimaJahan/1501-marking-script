public class Llama {

    private String name;
    private boolean isBaby;

    public Llama(String name) {
        this.name = name;
        isBaby = true;
    }

    public String getName() {
        return name;
    }
    
    public boolean isBaby() {
        return isBaby;
    }

    public void growUp() {
        isBaby = false;
    }

    private String ageAbbrev() {
        if (isBaby) {
            return "B";
        } else {
            return "A";
        }
    }
    
    @Override
    public String toString() {
        return String.format("%s (%s)", name, ageAbbrev());
    }

}

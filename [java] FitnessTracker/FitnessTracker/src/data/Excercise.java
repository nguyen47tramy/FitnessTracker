
package data;

/**
 *
 * @author nguyen47tramy
 */
public abstract class Excercise {
    private String id;
    private String name;
    private String eqipmentNeeded;
    private int set;
    private int rep;
    private String description;

    public Excercise(String id, String name, String eqipmentNeeded, int set, int rep, String description) {
        this.id = id;
        this.name = name;
        this.eqipmentNeeded = eqipmentNeeded;
        this.set = set;
        this.rep = rep;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEqipmentNeeded() {
        return eqipmentNeeded;
    }

    public void setEqipmentNeeded(String eqipmentNeeded) {
        this.eqipmentNeeded = eqipmentNeeded;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public int getRep() {
        return rep;
    }

    public void setRep(int rep) {
        this.rep = rep;
    }
    
    public String getDescription(){
        return description;
    }
            
    public void setDescription(String description){
        this.description = description;
    }
    
    public abstract double calculateCaloriesBurned();
    
    public abstract double calculateDuration();
    
    
}

// 4.Write a program for multilevel inheritance such that Country is inherited from Continent. State is inherited from Country. Display the place, State, Country and Continent.
 
class Continent {
    protected String continentName;
    public Continent(String continentName) {
    this.continentName = continentName;
    }
    public String getContinentName() {
    return continentName;
    }
    }
    // Derived class Country inherits from Continent
    class Country extends Continent {
    protected String countryName;
    public Country(String continentName, String countryName) {
    super(continentName);
    this.countryName = countryName;
    }
    public String getCountryName() {
    return countryName;
    }
    }
    // Derived class State inherits from Country
    class State extends Country {
    protected String stateName;
    public State(String continentName, String countryName, String stateName) {
    super(continentName, countryName);
    this.stateName = stateName;
    }
    public String getStateName() {
    return stateName;
    }
    }
    // Main class
    public class placeHierarchy {
    public static void main(String[] args) {
    // Create an instance of State
    State myState = new State("North America", "United States", "California");
    // Display place, state, country, and continent
    System.out.println(" Place: " + myState.getStateName());
    System.out.println(" State: " + myState.getStateName());
    System.out.println(" Country:" + myState.getCountryName());
    System.out.println(" Continent:" + myState.getContinentName());
    }
    }
import java.util.HashMap;

public class maps {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", null);
    capitalCities.put(null, "New Dehli");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("Norway", "Oslo"); // Duplicate
    capitalCities.put("USA", "Washington DC");
    capitalCities.put("bulgaria", "Sofia");

    capitalCities.containsKey("bulgaria");
    capitalCities.remove("USA");

    System.out.println(capitalCities);
  }
}
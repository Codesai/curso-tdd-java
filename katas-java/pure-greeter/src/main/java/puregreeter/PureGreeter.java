package puregreeter;

public class PureGreeter {
    public String greeter(int currentHour, String name) {
        if (currentHour < 0 || currentHour > 23 ) {
           throw new IllegalArgumentException("Hour must be between 0 and 23"); 
        }
        if (currentHour >= 6 && currentHour < 12) {
            return  "¡Buenos días " + name + "!";
        } else if (currentHour < 6 || currentHour >= 20) {
            return  "¡Buenas noches " + name + "!";
        } else {
            return  "¡Buenas tardes " + name + "!";
        }
    }
}
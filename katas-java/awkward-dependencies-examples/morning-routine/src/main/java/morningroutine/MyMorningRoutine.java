package morningroutine;

import java.time.LocalDateTime;

public class MyMorningRoutine {
    public void whatShouldIDoNow() {
        LocalDateTime now = LocalDateTime.now();
        int currentHour = now.getHour();
        if (currentHour == 6) {
            System.out.println("Do exercise");
        } else if (currentHour == 7) {
            System.out.println("Read and study");
        } else if (currentHour == 8) {
            System.out.println("Have breakfast");
        } else {
            System.out.println("No activity");
        }
    }
}

package course_duration;

import java.util.Date;

public class Course {
    private final String name;
    private long startTime;
    private long durationInMinutes;

    public Course(String name) {
        this.name = name;
        durationInMinutes = 0;
    }

    public void start() {
        startTime = new Date().getTime();
    }

    public void end() {
        var endTime = new Date().getTime();
        durationInMinutes = (endTime - startTime) / (1000 * 60);
    }

    public boolean isShort() {
        var tenMinutes = 10 * 60;
        return durationInMinutes < tenMinutes;
    }

    public boolean isLong() {
        return !isShort();
    }

    public String getTitle() {
        return name + " course in " + getCollege() + " college";
    }

    private String getCollege() {
        String college = System.getenv("COLLEGE");
        if (college == null) {
            return "not found";
        }
        return college;
    }
}

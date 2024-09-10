package tire_pressure_variation;

public class Alarm {
    private static final double LowPressureThreshold = 17;
    private static final double HighPressureThreshold = 21;

    private final Sensor sensor = new Sensor();

    private boolean alarmOn = false;

    public void check() {
        double psiPressureValue = sensor.popNextPressurePsiValue();

        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue) {
            if (!isAlarmOn()) {
                alarmOn = true;
                System.out.println("Alarm activated!");
            }
        } else {
            if (isAlarmOn()) {
                alarmOn = false;
                System.out.println("Alarm deactivated!");
            }
        }
    }

    private boolean isAlarmOn() {
        return alarmOn;
    }
}

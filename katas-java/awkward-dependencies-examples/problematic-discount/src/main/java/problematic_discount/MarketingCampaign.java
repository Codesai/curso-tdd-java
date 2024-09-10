package problematic_discount;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZonedDateTime;


public class MarketingCampaign {
    public boolean isActive() {
        return ZonedDateTime.now().toInstant().toEpochMilli() % 2 == 0;
    }

    public boolean isCrazySalesDay() {
        return LocalDate.now().getDayOfWeek().equals(DayOfWeek.FRIDAY);
    }
}

package ch10.ex03;

import java.time.DayOfWeek;
import java.util.Objects;

class WorkDay {
    boolean isWorkDay(final DayOfWeek day) {
        // I cannot understand the reason why I have to use else sentence.
        if (Objects.equals(day, DayOfWeek.SATURDAY)) return false;
        if (Objects.equals(day, DayOfWeek.SUNDAY)) return false;
        return true;
    }

    boolean isWorkDaySwitchSentence(final DayOfWeek day) {
        // Maybe this is better.
        switch (day) {
            case SATURDAY:
            case FRIDAY:
                return false;
            default: return true;
        }
    }
}

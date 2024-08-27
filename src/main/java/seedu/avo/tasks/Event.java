package seedu.avo.tasks;

import java.time.LocalDate;

import seedu.avo.utils.DateTime;

public class Event extends Task {
    private final LocalDate startTime;
    private final LocalDate endTime;
    public Event(String name, LocalDate startTime, LocalDate endTime) {
        super(name);
        this.startTime = startTime;
        this.endTime = endTime;
    }
    @Override
    public boolean isOccurringOnDate(LocalDate date) {
        boolean isOnStartTime = date.equals(startTime);
        boolean isOnEndTime = date.equals(endTime);
        boolean isBetweenStartTimeAndEndTime = date.isAfter(startTime) && date.isBefore(endTime);
        return isOnStartTime || isOnEndTime || isBetweenStartTimeAndEndTime;
    }
    @Override
    public String formatData() {
        String startTimeStr = DateTime.format(startTime);
        String endTimeStr = DateTime.format(endTime);
        return String.format("E : %s : %s : %s", super.formatData(), startTimeStr, endTimeStr);
    }
    @Override
    public String toString() {
        String startTimeStr = DateTime.format(startTime);
        String endTimeStr = DateTime.format(endTime);
        return String.format("[E] %s (from: %s to: %s)", super.toString(), startTimeStr, endTimeStr);
    }
}

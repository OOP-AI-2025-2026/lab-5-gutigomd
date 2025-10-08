package ua.opnu.timespan;

public class TimeSpan {

    private int totalMinutes;

    public TimeSpan() {
        this.totalMinutes = 0;
    }

    public TimeSpan(int minutes) {
        if (minutes < 0) {
            this.totalMinutes = 0;
        } else {
            this.totalMinutes = minutes;
        }
    }

    public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            this.totalMinutes = 0;
        } else {
            this.totalMinutes = hours * 60 + minutes;
        }
    }

    public TimeSpan(TimeSpan other) {
        if (other == null) {
            this.totalMinutes = 0;
        } else {
            this.totalMinutes = other.totalMinutes;
        }
    }

    public void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            return;
        }
        this.totalMinutes += hours * 60 + minutes;
    }

    public void add(int minutes) {
        if (minutes < 0) {
            return;
        }
        this.totalMinutes += minutes;
    }

    public void add(TimeSpan timespan) {
        if (timespan == null) {
            return;
        }
        this.totalMinutes += timespan.totalMinutes;
    }

    public void subtract(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            return;
        }
        int minutesToSubtract = hours * 60 + minutes;
        if (minutesToSubtract > this.totalMinutes) {
            return;
        }
        this.totalMinutes -= minutesToSubtract;
    }

    public void subtract(int minutes) {
        if (minutes < 0) {
            return;
        }
        if (minutes > this.totalMinutes) {
            return;
        }
        this.totalMinutes -= minutes;
    }

    public void subtract(TimeSpan timespan) {
        if (timespan == null) {
            return;
        }
        if (timespan.totalMinutes > this.totalMinutes) {
            return;
        }
        this.totalMinutes -= timespan.totalMinutes;
    }

    public int getHours() {
        return totalMinutes / 60;
    }

    public int getMinutes() {
        return totalMinutes % 60;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", getHours(), getMinutes());
    }
}
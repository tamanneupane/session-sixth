package training.day19;

public enum WeekDay {
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

    private int abbr;

    WeekDay(int abbr){
        this.abbr = abbr;
    }

    public int getAbbr() {
        return abbr;
    }
}

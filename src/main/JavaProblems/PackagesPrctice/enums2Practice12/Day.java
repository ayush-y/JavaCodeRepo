package PackagesPrctice.enums2Practice12;

public enum Day {
    MONDAY(false),
    TUESDAY(false),
    WENSDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean isWeekDay;

    Day(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }
    public String getType(){
        return isWeekDay ? "Weekday": "weekend";
    }
}

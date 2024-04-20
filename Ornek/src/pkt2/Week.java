/**
 * Takvimde haftayi temsil eder
 */
public class Week {
    private int weekNumber; // Hafta numarasi
    private int year; // yil bilgisi

    /**
     * Belirtilen hafta numarası ve yıl ile bir Week nesnesi oluşturur.
     *
     * @param weekNumber The number of the week.
     * @param year       The year to which the week belongs.
     */
    public Week(int weekNumber, int year) {
        this.weekNumber = weekNumber;
        this.year = year;
    }

    /**
     * Retrieves the number of the week.
     *
     * @return The week number.
     */
    public int getWeekNumber() {
        return weekNumber;
    }

    /**
     * Sets the number of the week.
     *
     * @param weekNumber The week number to set.
     */
    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    /**
     * Retrieves the year to which the week belongs.
     *
     * @return The year.
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year to which the week belongs.
     *
     * @param year The year to set.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns a string representation of the Week object.
     *
     * @return A string representing the week in the format "Week <weekNumber> of <year>".
     */
    @Override
    public String toString() {
        return "Week " + weekNumber + " of " + year;
    }
}

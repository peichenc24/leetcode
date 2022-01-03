import java.time.DayOfWeek;
import java.time.LocalDate;
class SolutionCN {
    public String dayOfTheWeek(int day, int month, int year) {
        DayOfWeek dow = LocalDate.of(year,month,day).getDayOfWeek();
        String capitalizeStr="";
        String s = String.valueOf(dow).toLowerCase();
        String firstLetter=s.substring(0,1);
        String remainingLetters=s.substring(1);
        capitalizeStr+=firstLetter.toUpperCase()+remainingLetters;
        return capitalizeStr;
    }
}
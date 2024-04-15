package certification;


public class NotebookData {
    private String day;
    private String month;
    private String year;

    private NotebookData(String day,String month, String year){
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public static NotebookData NoteData(String day,String month, String year){
        if (day == null) {
            throw new NullPointerException("Пустое значение");
        }
        if(!day.matches("[0-9]*")){
            throw new RuntimeException("Формат даты не правильное. Пример: dd,mm,yyyy");
        }
        if(day.length() > 2 | day.length() < 2){
            throw new RuntimeException("Формат даты не правильное. Пример: dd,mm,yyyy");
        }


        if (month == null) {
            throw new NullPointerException("Пустое значение");
        }
        if(!month.matches("[0-9/]*")){
            throw new RuntimeException("Формат даты не правильное. Пример: dd,mm,yyyy");
        }
        if(month.length() > 2 | month.length() < 2){
            throw new RuntimeException("Формат даты не правильное. Пример: dd,mm,yyyy");
        }


        if (year == null) {
            throw new NullPointerException("Пустое значение");
        }
        if(!year.matches("[0-9/]*")){
            throw new RuntimeException("Формат даты не правильное. Пример: dd,mm,yyyy");
        }
        if(year.length() > 4 | year.length() < 4){
            throw new RuntimeException("Формат даты не правильное. Пример: dd,mm,yyyy");
        }

        return new NotebookData(day, month, year);
    }

    @Override
    public String toString() {
        return String.format("%s.%s.%s", day,month,year);
    }
}

package certification;

public class NotebookNumber {
    private String number;

    private NotebookNumber(String number){
        this.number = number;
    }
    public static  NotebookNumber NoteNumder(String number){
        if (number == null){
            throw new NullPointerException("Пустое значение");
        }
        if(number.length() > 12 | (number.length() > 11)){
            throw new RuntimeException("Формат номера не правильное.");
        }
        if(!number.matches("[0-9+]*")){
            throw new RuntimeException("Используйте только цифры также допустим знак +");
        }


        return new NotebookNumber(number);
    }

    @Override
    public String toString() {
        return String.format("%s",number);
    }
}

package certification;

public class NotebookFloor {
    private String floor;

    private NotebookFloor(String floor){
        if(floor.equals("f")){
            this.floor = "жен";
        }
        if(floor.equals("m")){
            this.floor = "муж";
        }
    }

    public static NotebookFloor NoteFloor(String floor){
        if(floor == null){
            throw new NullPointerException("пустое знчение");
        }
        if(floor.length() > 1){
            throw new RuntimeException("Неправильный формат! Введите: 'f'- женский пол или 'm'- муской пол");
        }
        if(!floor.matches("[MmFf]")){
            throw new RuntimeException("Неправильный формат! Введите: 'f'- женский пол или 'm'- муской пол");
        }

        return new NotebookFloor(floor);
    }

    @Override
    public String toString() {
        return String.format("%s",floor);
    }
}

package certification;


import java.io.InputStream;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        NotebookName name;
        NotebookData data;
        NotebookNumber number;
        NotebookFloor floor;
        try {
            name = NotebookName.NoteName("Name","SurName","MidName");
            data = NotebookData.NoteData("11","22","3333");
            number = NotebookNumber.NoteNumder("89991328267");
            floor = NotebookFloor.NoteFloor("m");

        } catch (NullPointerException e) {
            throw new NullPointerException("e.getMessage()");
        } catch (NumberFormatException a) {
            throw new NumberFormatException(" NumberFormatException");
        }


        System.out.printf("%s_%s_%s_%s", name, data, number, floor);

    }

}

package certification;


import java.util.concurrent.atomic.AtomicReference;

import certification.notebook.NotebookData;
import certification.notebook.NotebookFloor;
import certification.notebook.NotebookName;
import certification.notebook.NotebookNumber;
import certification.saveFille.NewFile;

public class Program {

    public static void main(String[] args) {

        String a = "aa";
        NotebookName name;
        NotebookData data;
        NotebookNumber number;
        NotebookFloor floor;
        try {
            name = NotebookName.NoteName("aaaassaaaaaa", "SurName", "MidName");
            data = NotebookData.NoteData("11", "22", "3333");
            number = NotebookNumber.NoteNumder("89991328267");
            floor = NotebookFloor.NoteFloor("m");

        } catch (NullPointerException e) {
            throw new NullPointerException("e.getMessage()");
        } catch (NumberFormatException e) {
            throw new NumberFormatException(e.getLocalizedMessage());
        }
        NewFile file = new NewFile();

        file.SaveFile(name,data,floor,number);


    }


}

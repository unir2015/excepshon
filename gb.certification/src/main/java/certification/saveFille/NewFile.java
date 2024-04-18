package certification.saveFille;


import certification.interfase.SaveFile;
import certification.notebook.NotebookData;
import certification.notebook.NotebookFloor;
import certification.notebook.NotebookName;
import certification.notebook.NotebookNumber;

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;

public class NewFile implements SaveFile {


    public  void SaveFile(NotebookName name, NotebookData data, NotebookFloor floor, NotebookNumber number) {
        try {
            File file = new File("Notesbook.txt");
            if (!file.exists())
                file.createNewFile();

//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write(String.valueOf(name));
//            bw.write(String.valueOf(data));
//            bw.write(String.valueOf(floor));
//            bw.write(String.valueOf(number));
//            bw.write("\n");
//
//            bw.close();
            PrintWriter pw = new PrintWriter(file);
            pw.write(String.valueOf(name));
            pw.write(String.valueOf(data));
            pw.write(String.valueOf(floor));
            pw.write(String.valueOf(number));
            pw.println("\r\n");

            pw.close();


        } catch (IOException e) {
            System.out.println("Ошибка при создании файла" + e.getMessage());

        }finally {

        }
    }
}

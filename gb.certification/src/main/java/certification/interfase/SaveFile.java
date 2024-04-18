package certification.interfase;

import certification.notebook.NotebookData;
import certification.notebook.NotebookFloor;
import certification.notebook.NotebookName;
import certification.notebook.NotebookNumber;

public interface SaveFile {
    public  void SaveFile(NotebookName name, NotebookData data, NotebookFloor floor, NotebookNumber number);
}

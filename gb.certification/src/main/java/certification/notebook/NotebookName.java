package certification.notebook;

public class NotebookName  {
    private int id;
    private  String name;
    private String surName;
    private String midName;

    private NotebookName(String name, String surName, String midName){
        this.name = name;
        this.surName = surName;
        this.midName = midName;
        this.id= id + 1;
    }

//    public Date basicData(String name, String surName, String midName){
//
//        if (name == null || name.length() < 3){
//            throw  new RuntimeException("Имя введено некорректно");
//        }
//        if (surName == null || surName.length() < 3){
//            throw  new RuntimeException("Фамилия введено некорректно");
//        }
//        if (midName == null || midName.length() < 3){
//            throw  new RuntimeException("Очество введено некорректно");
//        }
//
//    }


    public static NotebookName NoteName(String name, String surName, String midName){
        if (name == null){
            throw  new NullPointerException("Вы не вели имя");}
        if (name.length() < 3){
            throw  new RuntimeException("Имя введено некорректно");}
        if(!name.matches("[a-z,A-Zа-яА-Я]*")){
            throw new RuntimeException("Видите Имя через зяпятую без пробела остальные знаки запрешены");}


        if (surName.length() < 3){
            throw  new RuntimeException("Фамилия введено некорректно");
        }
        if (surName == null){
            throw  new NullPointerException("Вы не вели Фамилию");
        }
        if(!surName.matches("[a-zA-Zа-яА-Я]*")){
            throw new RuntimeException("Видите Фамилию через зяпятую без пробела остальные знаки запрешены");
        }


        if (midName.length() < 3){
            throw  new RuntimeException("Очество введено некорректно");
        }
        if (midName == null){
            throw  new NullPointerException("Вы не вели Очество");
        }
        if(!midName.matches("[a-zA-Zа-яА-Я]*")){
            throw new RuntimeException("Видите Очество через зяпятую без пробела остальные знаки запрешены");
        }



        return new NotebookName(name, surName,midName);

    }

    @Override
    public String toString() {
        return String.format("%d_%s_%s_%s",id, name,surName,midName);

    }
}

package task2;

abstract public class AbstractHandler {

    protected String fileName;

    public AbstractHandler(String fileName){
        this.fileName = fileName;
    }
    void create(){
        System.out.println("Універсальний шаблон створення файлу" + fileName);
    }

    void open(){
        System.out.println("Універсальний шаблон відкриття файлу" + fileName);
    }

    void edit(){
        System.out.println("Універсальний шаблон редагування файлу" + fileName);
    }
    void save(){
        System.out.println("Універсальний шаблон збереження файлу" + fileName);
    }
}

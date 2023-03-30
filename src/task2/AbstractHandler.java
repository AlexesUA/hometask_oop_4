package task2;

abstract public class AbstractHandler {

    void create(){
        System.out.println("Універсальний шаблон створення файлу.");
    }

    void open(){
        System.out.println("Універсальний шаблон відкриття файлу.");
    }

    void edit(){
        System.out.println("Універсальний шаблон редагування файлу.");
    }
    void save(){
        System.out.println("Універсальний шаблон збереження файлу.");
    }
}

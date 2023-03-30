package task2;

public class XMLHandler extends AbstractHandler{

    @Override
    void create() {
        System.out.println("Створення XML файлу.");
    }

    @Override
    void open() {
        System.out.println("Відкриття XML файлу.");
    }

    @Override
    void edit() {
        System.out.println("Редагування XML файлу.");
    }

    @Override
    void save() {
        System.out.println("Збереження XML файлу.");
    }
}

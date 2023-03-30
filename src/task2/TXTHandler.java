package task2;

public class TXTHandler extends AbstractHandler{

    @Override
    void create() {
        System.out.println("Створення TXT файлу.");
    }

    @Override
    void open() {
        System.out.println("Відкриття TXT файлу.");
    }

    @Override
    void edit() {
        System.out.println("Редагування TXT файлу.");
    }

    @Override
    void save() {
        System.out.println("Збереження TXT файлу.");
    }
}

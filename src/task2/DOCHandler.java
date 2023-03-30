package task2;

public class DOCHandler extends AbstractHandler{
    @Override
    void create() {
        System.out.println("Створення DOC файлу.");
    }

    @Override
    void open() {
        System.out.println("Відкриття DOC файлу.");
    }

    @Override
    void edit() {
        System.out.println("Редагування DOC файлу.");
    }

    @Override
    void save() {
        System.out.println("Збереження DOC файлу.");
    }
}

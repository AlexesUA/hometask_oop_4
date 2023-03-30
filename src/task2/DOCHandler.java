package task2;

public class DOCHandler extends AbstractHandler{

    public DOCHandler(String fileName){
        super(fileName);
    }

    @Override
    void create() {
        System.out.println("Створення DOC файлу " + fileName);
    }

    @Override
    void open() {
        System.out.println("Відкриття DOC файлу " + fileName);
    }

    @Override
    void edit() {
        System.out.println("Редагування DOC файлу " + fileName);
    }

    @Override
    void save() {
        System.out.println("Збереження DOC файлу " + fileName);
    }
}

package task2;

public class XMLHandler extends AbstractHandler{

    public XMLHandler(String fileName){
        super(fileName);
    }

    @Override
    void create() {
        System.out.println("Створення XML файлу " + fileName);
    }

    @Override
    void open() {
        System.out.println("Відкриття XML файлу " + fileName);
    }

    @Override
    void edit() {
        System.out.println("Редагування XML файлу " + fileName);
    }

    @Override
    void save() {
        System.out.println("Збереження XML файлу " + fileName);
    }
}

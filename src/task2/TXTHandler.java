package task2;

public class TXTHandler extends AbstractHandler{

    public TXTHandler(String fileName){
        super(fileName);
    }

    @Override
    void create() {
        System.out.println("Створення TXT файлу " + fileName);
    }

    @Override
    void open() {
        System.out.println("Відкриття TXT файлу " + fileName);
    }

    @Override
    void edit() {
        System.out.println("Редагування TXT файлу " + fileName);
    }

    @Override
    void save() {
        System.out.println("Збереження TXT файлу " + fileName);
    }
}

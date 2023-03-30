package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);

        AbstractHandler newDocument = null;
        boolean createKey = false;
        do {
            System.out.print("Введіть назву файла: ");
            String fileName = scInput.nextLine();
            String[] splitFileName = fileName.split("\\.");
            String extension = splitFileName[splitFileName.length-1].toLowerCase();
            switch (extension) {
                case "txt" -> {
                    newDocument = new TXTHandler(fileName);
                    createKey = true;
                }
                case "xml" -> {
                    newDocument = new XMLHandler(fileName);
                    createKey = true;
                }
                case "doc", "docx" -> {
                    newDocument = new DOCHandler(fileName);
                    createKey = true;
                }
                default -> {
                    char inputKey;
                    do {
                        System.out.print("Невідомий формат файлу. Використати универсальний шаблон? (y/n): ");
                        inputKey = scInput.nextLine().toLowerCase().charAt(0);
                    } while (inputKey != 'y' && inputKey != 'n');
                    if (inputKey == 'y') {
                        //newDocument = new AbstractHandler();
                        System.out.println("Помилка. Неможливо створити екземпляр абстрактного класу.");
                    } else {
                        System.out.println("Невідомий формат файлу. Спробуйте ще.");
                    }
                }
            }

        }while(!createKey);

        if(newDocument != null) {
            newDocument.create();
            newDocument.open();
            newDocument.edit();
            newDocument.save();
        }
    }
}

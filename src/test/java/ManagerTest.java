import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ManagerTest {

    @Test
    public void testAdd(){
        Manager manager = new Manager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли");
        manager.addMovie("Номер один");
        manager.addMovie("Титаник");
        manager.addMovie("Такси");
        manager.addMovie("Форсаж");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-неведимка", "Тролли", "Номер один", "Титаник", "Такси", "Форсаж"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals (expected, actual);

    }

    @Test
    public void testFindLast() {
        Manager manager = new Manager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Тролли");
        manager.addMovie("Номер один");
        manager.addMovie("Титаник");
        manager.addMovie("Такси");
        manager.addMovie("Форсаж");

        manager.findLast();

        String[] expected = {"Форсаж", "Такси", "Титаник", "Номер один", "Тролли", "Человек-неведимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindOverLimit() {
        Manager manager = new Manager(15);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");

        String[] expected = {"Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLessLimit() {
        Manager manager = new Manager(4);

        manager.addMovie("Бладшот");
        manager.addMovie("Вперед");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентельмены");


        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}

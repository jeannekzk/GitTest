import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * [11:12] Пунченко Евгений
 * Создать набор классов для работы со списком, два метода
 * - первый принимает N и возвращает список N первых чисел,
 * второй метод принимает N возвращает первые N четных чисел
 * .Вторая ветка создать класс Автомобиль и реализовать наследование
 * от транспортного средства
 */
public class ListService {
        Vehicle vehicle=new Car();
        vehicle.move();
        Car car=(Car) vehicle;
        car.openDoor();


    public static List<Integer> numEven(int n) {
        return IntStream.rangeClosed(0, n).boxed().collect(Collectors.toList());
    }
}
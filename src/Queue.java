import java.util.LinkedList;
import java.util.List;

public class Queue<Integer> {
    public LinkedList<Integer> list;

    // создать пустой список
    public Queue() {
        list = new LinkedList<>();
    }

    // создать заполненный список из Array
    public Queue(List<Integer> element) {
        list = new LinkedList<>(element);
    }

    // помещает элемент в конец очереди
    public void enqueue(Integer element) {
        list.add(element);
    }

    // возвращает первый элемент из очереди и удаляет его
    public Integer dequeue() {
        return list.pollFirst();
    }

    // возвращает первый элемент из очереди, не удаляя
    public Integer first() {
        return list.peekFirst();
    }

    // возвращает число элементов списка
    public int size() {
        return list.size();
    }

    // возвращает элемент списка с индексом element
    public Integer get(int element) {
        return list.get(element);
    }
}

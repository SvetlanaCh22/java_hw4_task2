// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

// Чубченко Светлана

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        // создаем связанный список
        Queue queue = new Queue<>(Arrays.asList(1, 2, 3, 4, 5));
        // помещаем элемент в конец очереди
        queue.enqueue(6);
        // возвращаем первый элемент из очереди и удаляем его
        System.out.println("First (and deleted): " + queue.dequeue());
        // возвращает первый элемент из очереди, не удаляя
        // теперь там уже цифра 2, так как 1 мы удалили в коде выше
        System.out.println("First: " + queue.first());
        // выводим весь список на экран
        System.out.print("List after process: ");
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.get(i) + " ");
        }
    }
}


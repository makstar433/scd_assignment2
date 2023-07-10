public class QMain {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>(5);
        System.out.println(queue.isEmpty());  // Output: true

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.size());     // Output: 3
        System.out.println(queue.peek());     // Output: 1

        System.out.println(queue.dequeue());  // Output: 1
        System.out.println(queue.dequeue());  // Output: 2

        System.out.println(queue.isEmpty());  // Output: false
        System.out.println(queue.size());     // Output: 1

    }
}
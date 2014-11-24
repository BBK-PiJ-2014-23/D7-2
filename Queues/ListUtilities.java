public class ListUtilities {
    public static Queue arrayToQueue(int[] array) {
        Queue queue = new Queue();
        for (int i = 0; i < array.length; i++) {
            queue.insert(array[i]);
        }
        return queue;
    }
}
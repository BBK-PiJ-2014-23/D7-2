public class ListUtilities {
    public static Stack arrayToStack(int[] array) {
        Stack stack = new Stack();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        return stack;
    }
}
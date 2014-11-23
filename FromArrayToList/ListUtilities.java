public class ListUtilities {
    public static IntegerList arrayToLinkedList(int[] array) {
        IntegerList intList = new IntegerList();
        for (int i = 0; i < array.length; i++) {
            intList.add(array[i]);
        }
        return intList;
    }
}
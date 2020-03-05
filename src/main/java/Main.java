public class Main {
    public static void main(String[] args) {
        GenericClass<String>     stringInstance = new GenericClass<>();
        stringInstance.setObject("Test");
        System.out.println(stringInstance.getObject()); // print out Test
        GenericClass<Integer> integerInstance = new GenericClass<>();
        integerInstance.setObject(1000);
        System.out.println(integerInstance.getObject()); // print out 1000


        GenericClass<String[]> stringArray = new GenericClass<>();
        stringArray.printArrayContent(new String[] { "U", "M", "U", "Z", "I", " ", "M", "Y", " ","H","E","L","L"});   // pass a string array

        GenericClass<Integer[]> integerArray = new GenericClass<>();
        integerArray.printArrayContent(new Integer[] {2,3,4,7,3,4});
    }
}

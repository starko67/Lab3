package lab3;

public class Obolochki {
    public static void main(String[] args){
        //1
        Double doubleObject1 = Double.valueOf(3.14);
        Double doubleObject2 = Double.valueOf("2.718");
        //2
        String strValue = "5.678";
        double doubleValue = Double.parseDouble(strValue);
        //3
        Double doubleObject = Double.valueOf(7.123);

        double primitiveDouble = doubleObject.doubleValue();
        float primitiveFloat = doubleObject.floatValue();
        long primitiveLong = doubleObject.longValue();
        int primitiveInt = doubleObject.intValue();
        short primitiveShort = doubleObject.shortValue();
        byte primitiveByte = doubleObject.byteValue();
        //4
        System.out.println("Значение объекта Double: " + doubleObject);
        //5
        double number = 3.14;
        String d = Double.toString(number);
    }
}

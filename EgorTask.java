import java.util.Scanner;

public class EgorTask {
    public static void main(String[] args) {

        System.out.println("1. BYTE:");
        System.out.println("   Об'єм пам'яті: " + Byte.BYTES + " байт (" + Byte.SIZE + " біт)");
        System.out.println("   Межі: від " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);

        System.out.println("\n2. SHORT:");
        System.out.println("   Об'єм пам'яті: " + Short.BYTES + " байт (" + Short.SIZE + " біт)");
        System.out.println("   Межі: від " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);

        System.out.println("\n3. INT (INTEGER):");
        System.out.println("   Об'єм пам'яті: " + Integer.BYTES + " байт (" + Integer.SIZE + " біт)");
        System.out.println("   Межі: від " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);

        System.out.println("\n4. LONG:");
        System.out.println("   Об'єм пам'яті: " + Long.BYTES + " байт (" + Long.SIZE + " біт)");
        System.out.println("   Межі: від " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);

        System.out.println("\n5. FLOAT:");
        System.out.println("   Об'єм пам'яті: " + Float.BYTES + " байт (" + Float.SIZE + " біт)");
        System.out.println("   Межі: від " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);

        System.out.println("\n6. DOUBLE:");
        System.out.println("   Об'єм пам'яті: " + Double.BYTES + " байт (" + Double.SIZE + " біт)");
        System.out.println("   Межі: від " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);
        System.out.println("--------------------------------------------------------\n");

        Scanner reader = new Scanner(System.in);
        System.out.println("*** ПРАКТИЧНА ЧАСТИНА: ВВЕДЕННЯ ДАНИХ ***");

        System.out.print("Вкажіть число для типу byte (-128...127): ");
        String strByte = reader.nextLine();
        byte valByte = Byte.parseByte(strByte);
        System.out.println("-> Успішно записано byte: " + valByte + "\n");

        System.out.print("Вкажіть число для типу short: ");
        String strShort = reader.nextLine();
        short valShort = Short.parseShort(strShort);
        System.out.println("-> Успішно записано short: " + valShort + "\n");

        System.out.print("Вкажіть ціле число для типу int: ");
        String strInt = reader.nextLine();
        int valInt = Integer.parseInt(strInt);
        System.out.println("-> Успішно записано int: " + valInt + "\n");

        System.out.print("Вкажіть велике число для типу long: ");
        String strLong = reader.nextLine();
        long valLong = Long.parseLong(strLong);
        System.out.println("-> Успішно записано long: " + valLong + "\n");

        System.out.print("Вкажіть дробове число для float (через крапку): ");
        String strFloat = reader.nextLine();
        float valFloat = Float.parseFloat(strFloat);
        System.out.println("-> Успішно записано float: " + valFloat + "\n");

        System.out.print("Вкажіть дробове число для double (через крапку): ");
        String strDouble = reader.nextLine();
        double valDouble = Double.parseDouble(strDouble);
        System.out.println("-> Успішно записано double: " + valDouble + "\n");

        System.out.print("Вкажіть логічне значення для boolean (true/false): ");
        String strBool = reader.nextLine();
        boolean valBool = Boolean.parseBoolean(strBool);
        System.out.println("-> Успішно записано boolean: " + valBool + "\n");

        System.out.println("=== Тестування завершено. Усі рядки перетворено! ===");

        reader.close();
    }
}

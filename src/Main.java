import java.util.*;
public class Main {
    public static void main(String[] args) {
        LaptopFil l = new LaptopFil();
        l.addLaptops(new Laptops("HP", 8, 512, "Windows", 32));
        l.addLaptops(new Laptops("Dell", 16, 1024, "Linux", 64));
        l.addLaptops(new Laptops("Apple", 16, 512, "macOS", 64));
        Map<Object, Object> filter = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("“Введите цифру, соответствующую необходимому критерию:\n" +
                "1 - Название\n"+
                "2 - ОЗУ\n" +
                "3 - Объем ЖД\n" +
                "4 - Операционная система\n" +
                "5 - Процессор");
        int n = in.nextInt();
        switch (n){
            case 1: System.out.println("Введите названия для, соответствующего критерия:\n"+
                    "HP,\n"+
                    "Dell,\n"+
                    "Apple");
                String y = in.nextLine();
                filter.put("Names",y);
                break;
            case 2 : System.out.println("Введите цифру для, соответствующего критерия:\n"+
                    "8,\n"+
                    "16,\n"+
                    "16\n");
                int r = in.nextInt();
                filter.put("RAM",r);
                break;
            case 3 : System.out.println("Введите цифру для, соответствующего критерия:\n"+
                    "512,\n"+
                    "1024,\n"+
                    "512\n");
                int k = in.nextInt();
                filter.put("RailwayVolume",k);
                break;
            case 4:System.out.println("Введите названия для, соответствующего критерия:\n"+
                    "Windows,\n"+
                    "Linux,\n"+
                    "macOS");
                String x = in.nextLine();
                filter.put("Os",x);
                break;
            case 5: System.out.println("Введите цифру для, соответствующего критерия:\n"+
                    "32,\n"+
                    "64,\n"+
                    "64\n");
                int e = in.nextInt();
                filter.put("Processor",e);
                break;
        }

        l.filterLaptop(filter);
    }
}
package Interview;

public class StringParser {
    public static void main(String[] args) {
        String input = "java//Program:TEST=2?Authentication=3*;";

        String[] parts = input.split("[/:?*]+");
        System.out.println("part0:" + parts[0]);
        System.out.println("part1:" + parts[1]);

        for (int i = 2; i < parts.length; i++) {
            if (parts[i].contains("=")) {
                String[] keyValue = parts[i].split("=");
                if (keyValue.length == 2) {
                    String key = keyValue[0].substring(0, 1).toUpperCase() + keyValue[0].substring(1).toLowerCase();
                    System.out.println(key + " = " + keyValue[1]);
                }
                //   System.out.println(keyValue[i]);
            }
        }
    }


}

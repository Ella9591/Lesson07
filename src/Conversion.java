import java.util.Scanner;

public class Conversion {

    static final double UAH_to_USD = 2.03716;
    static final double UAH_to_EUR = 3.03295;
    static final double USD_to_UAH = 26.91;
    static final double USD_to_EUR = 0.88495;
    static final double EUR_to_UAH = 30.34;
    static final double EUR_to_USD = 1.13;

    static double hd(double a) {
        return a * UAH_to_USD;
    }

    static double he(double a) {
        return a * UAH_to_EUR;
    }

    static double dh(double a) {
        return a * USD_to_UAH;
    }

    static double de(double a) {
        return a * USD_to_EUR;
    }

    static double eh(double a) {
        return a * EUR_to_UAH;
    }

    static double ed(double a) {
        return a * EUR_to_USD;
    }
    static void conversion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите вашу валюту.\nВозможные валюты:" +
                "\nГривна(h), долар(d), евро(e).");
        String a = sc.next();
        while (true) {
            if (a.equals("h") || a.equals("e") || a.equals("d")) {
                System.out.println("Введите в какую валюту вы хотите " +
                        "конвертировать.\nВозможные валюты:");
                break;
            } else {
                System.out.println("Введите: h d или e.");
                a = sc.next();
            }
        }
        switch (a) {
            case "e":
                System.out.println("Гривна(h), долар(d).");
                break;
            case "d":
                System.out.println("Гривна(h), евро(e).");
                break;
            case "h":
                System.out.println("Долар(d), евро(e).");
                break;
        }
        String b = sc.next();
        while (true) {
            if ((b.equals("h") || b.equals("e") || b.equals("d")) && !(a.equals(b))) {
                System.out.println("Введите теперь сколько вы хотите компилировать " +
                        "в выбраную валюту.\nЗначение дожно быть больше нуля.");
                break;
            } else if (a.equals(b)) {
                System.out.println("Мы не можем конвертировать две одинаковые валюты.");
                switch (a) {
                    case "e":
                        System.out.println("Введите: h или d.");
                        break;
                    case "d":
                        System.out.println("Введите: h или e.");
                        break;
                    case "h":
                        System.out.println("Введите: d или e.");
                        break;
                }
            } else
                switch (a) {
                    case "e":
                        System.out.println("Введите: h или d.");
                        break;
                    case "d":
                        System.out.println("Введите: h или e.");
                        break;
                    case "h":
                        System.out.println("Введите: d или e.");
                        break;
                }
            b = sc.next();
        }
        double c = sc.nextDouble();
        while (true) {
            if (c > 0) {
                System.out.println("\nВвывод:");
                break;
            } else if (c < 0)
                System.out.println("Введите число больше нуля");
            else
                System.out.println("Введите число:");
            c = sc.nextDouble();
        }
        switch (a + b) {
            case "hd":
                System.out.println(hd(c));
                break;
            case "he":
                System.out.println(he(c));
                break;
            case "dh":
                System.out.println(dh(c));
                break;
            case "de":
                System.out.println(de(c));
                break;
            case "eh":
                System.out.println(eh(c));
                break;
            case "ed":
                System.out.println(ed(c));
                break;
        }
    }

    public static void main(String[] args) {
        conversion();
    }
}

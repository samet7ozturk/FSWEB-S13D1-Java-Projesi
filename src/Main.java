public class Main {
    public static void main(String[] args) {
        System.out.println("Havlayan Köpeğimiz Testleri :");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("Yaş Tespiti Testleri :");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("Oyuncu Kedi Testleri :");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("Alan Hesaplama Testleri :");
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
        System.out.println("Daire Hesaplama Testleri :");
        System.out.println(area2(5.0));
        System.out.println(area2(-1));
    }

    public static boolean shouldWakeUp(boolean isDogBarking, int num2) {
        if (num2 < 0 || num2 > 23) {
            return false;
        }

        if (isDogBarking && (num2 < 8 || num2 > 22)) {
            return true;
        }

        return false;
    }
    public static boolean hasTeen(int num1, int num2, int num3) {
        if (13 < num1 && num1 <= 19) {
            return true;
        }

        if (13 < num2 && num2 <= 19) {
            return true;
        }

        if (13 < num3 && num3 <= 19) {
            return true;
        }

        return false;
    }

    public static boolean isCatPlaying(boolean season, int temp) {
        if (season == true) {
            if(35 < temp && temp <= 45) {
                return true;
            }
        } else if (season == false) {
            if(25 < temp && temp <= 35) {
                return true;
            }
        }
        return false;
    }

    public static double area(double edge1, double edge2) {
        if (edge1 < 0 || edge2 < 0) {
           return -1;
        } else {
            return edge1*edge2;
        }
    }

    public static double area2(double radius ) {
        if (radius < 0) {
            return -1;
        } else {
            return radius*radius*Math.PI;
        }
    }
}
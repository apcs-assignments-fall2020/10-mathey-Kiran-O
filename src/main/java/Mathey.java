public class Mathey {
    public static int max(int x, int y){
        if (x > y){
            return x;

        }
        else {
            return y;
        }
    }

    public static double max(double x, double y){
        if (x > y){
            return x;

        }
        else {
            return y;
        }
    }

    public static int max(int x, int y, int z){
        return max(x, max(y, z));
    }

    public static double max(double x, double y, double z){
        return max(x ,max(y, z));
    }

    public static int max(int x, int y, int z, int q){
        int qwe = max(x ,max(y, z));
        return max(qwe, q);
    }

    public static int randomInteger(int a, int b){
        return (int) (Math.random()*(b-a+1))+a;

    }

    public static int randomInteger(int b){
        return (int) (Math.random()*(b+1));

    }

}
public class Main {
    public static void main(String[] args) {
        int[] intArray={1,2,3,4};
        double [] doubleArray ={1.0,2.0,3.0,4.0};
        String[] stringArray= {"eins","zwei","drei","vier"};
    }

    public static void auslesen(int[] array){
        for(int currentInt : array){
            System.out.println(currentInt);
        }
    }

    public static void auslesen(double[] array){
        for(double currentDouble : array){
            System.out.println(currentDouble);
        }
    }

    public static void auslesen(String[] array){
        for(String currentString : array){
            System.out.println(currentString);
        }
    }

    public static <Type> void  auslesen(Type[] array){
        for(Type currentType : array){
            System.out.println(currentType);
        }
    }

}




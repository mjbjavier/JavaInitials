public class casting {
    public static void main(String[] args) {
        // (animalista) en 1 año ubicar 30 perros
        // cuantos perritos ubique en un mes?
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESTIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //EXACTITUD
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        double c = a/b;
        System.out.println(c);

         char n = '1';//muy importante el uso de comillas simple y dobles
         int nI = n;

        System.out.println(nI);

        short nS =(short) n;
        System.out.println(nS);

    }
}

public class matematicOperations {
    public static void main(String[] args) {
        //para manejar datos matematicaso el tipo de dato que mas conviene es double
        double x = 2.1;
        double y = 3;
        // metodo ceil devuelve un número entero dependiendo del valor que tengamos designado en double x
        // es una especie de redondeo hacia arriba / devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        // del mismo modo para el caso del metodo floor /  devuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        // devuelve un número elevado a otro
        System.out.println(Math.pow(x,y));

        // si necesito saber que dato es mayor
        System.out.println(Math.max(x,y));

        // devuelve raíz cuadrada
        System.out.println(Math.sqrt(y));

        //calcular el área de un círculo
        // pi * r2
        // asumamos que el valor de y es el radio
        System.out.println(Math.PI * Math.pow(y,2));

        //calcular el área de una esfera
        // 4*PI*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        // volumen de una esfera
        // se calcula a partir de 4/3*PI * r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));


    }
}

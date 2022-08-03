public class incrementDecrement {
    public static void main(String[] args) {
        //counter de vidas de personaje de un videojuego
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4
        //técnica postfija
        //sin embargo podemos tambien escribirlo así
        lives--; //decremento
        System.out.println(lives); //3

        // sin embargo supongamos que gano una vida
        lives++; //incremento
        System.out.println(lives);//4

        //técnica prefija
        //gana un regalo por ganar una vida
        //int gift = 100 + lives++; //postfijo así primero accedemos al dato
        int gift1 = 100 + ++lives; //prefijo asi obtenemos el dato incrementado
        System.out.println(gift1);
        System.out.println(lives); //5


    }
}

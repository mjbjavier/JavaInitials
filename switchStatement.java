public class switchStatement {
    public static void main(String[] args) {

        // programa para elegir el modo de pantalla
        String colorModeSelected = "Dark"; //esta variable es la que vamos a evaluar

        switch (colorModeSelected){
            case "Ligth":
                System.out.println("SeleccionÃ³ Ligth mode");
                break;
            case "Nigth":
                System.out.println("SeleccionÃ³ Nigth mode");
                break;
            case "Blue Dark":
                System.out.println("SeleccionÃ³ Blue Dark mode");
                break;
            case "Dark":
                System.out.println("Selecciono Drak mode");
                break;
        }
    }
}

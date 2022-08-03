public class ifStatement {
    public static void main(String[] args) {
        // programa para dispositivo movil para enviar un archivo via Bluetooth
        //necesitamos verificar si el Bluetooth esta habilitado o no
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if(isBluetoothEnabled){
            //send file
            fileSended++;
            System.out.println("Archivo enviado");
        }else {
            System.out.println("Por favor enciende tu Bluetooth");
        }
        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}

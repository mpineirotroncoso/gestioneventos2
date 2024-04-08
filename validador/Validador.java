public class Validador implements IValidador {
    @Override
    public void Validador(int num) {
        if(num%2==0) {
            System.out.println("El numero "+num+" es par");
        } else {
            System.out.println("El numero "+num+" es impar");
        }
    }
}

package negocio;

public class MainCarro {
    static void main() {
        Carro c1 = new Carro();
        Carro c2 =  new Carro();

      /*  c1.velocidad = 100;
        c1.potencia = 5;*/
        c1.setVelocidad(100);
        c1.setPotencia(5);

        c2.setVelocidad(-50);
        c2.setPotencia(-2);

       // System.out.println("La velocidad es "+c1.velocidad+" y la potencia es "+c1.potencia);
        System.out.println("La velocidad es "+c1.getVelocidad()+" y la potencia es "+c1.getPotencia());
        System.out.println("La velocidad es "+c2.getVelocidad()+" y la potencia es "+c2.getPotencia());
        c1.acelerar();
        c1.frenar();

    }

}

package negocio;

public class MainCarro {
    static void main() {
        Carro c1 = new Carro(2,60);
        Carro c2 = new Carro(-5, -100);
        Carro c3 = new Carro(2,50);


       /* c1.setVelocidad(60);
        c1.setPotencia(2);

        c2.setVelocidad(-100);
        c2.setPotencia(-5);

        c3.setPotencia(2);
        c3.setVelocidad(50); */



        System.out.println("La velocidad del carro 1 es "+c1.getVelocidad()+" y la potencia es "+c1.getPotencia());
        System.out.println("La velocidad del carro 2 es "+c2.getVelocidad()+" y la potencia es "+c2.getPotencia());
        System.out.println("La velocidad del carro 3 es "+c3.getVelocidad()+" y la potencia es "+c3.getPotencia());
        c1.acelerar();
        c1.frenar();

    }

}

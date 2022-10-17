public class segundaParte {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        
        miCoche.incrementarPuerta();
        miCoche.incrementarPuerta();
        miCoche.incrementarPuerta();
        miCoche.incrementarPuerta();
        
        System.out.println(miCoche.numPuertas);
    }   
}

class Coche {
    public int numPuertas = 4;
    
    public void incrementarPuerta() {
        this.numPuertas++;
    }
}

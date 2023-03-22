import com.rosario.animales.oviparos.Oviparos;
import com.rosario.animales.viviparos.Viviparos;

public class Main {
    public static void main(String[] args) {
        peces();
        aves();
        anfibios();
        reptiles();
        mamiferos();
    }

    public static void peces() {
        Oviparos oviparo = new Oviparos();
        oviparo.setNombre("Trucha");
        oviparo.setCantidadHuevos(20000);
        oviparo.setTipoFecundacion("Externo");
        oviparo.setAlimentacion("Alimento");
        oviparo.setColor("Gris");
        oviparo.setDesplazamiento("Nadando");
        oviparo.setHabitad("Pecera");
        oviparo.setNumeroOjos(2);
        oviparo.setPeso("12 kilos");
        oviparo.setTamanio(80f);

        System.out.println("El nombre es: " + oviparo.getNombre() +
                "\n Cantidad de Huevos: " + oviparo.getCantidadHuevos() +
                "\n Tipo de Fecundacion: " + oviparo.getTipoFecundacion() +
                "\n Alimentacion: " + oviparo.getAlimentacion() +
                "\n Color: " + oviparo.getColor() +
                "\n Tipo de Desplazamiento: " + oviparo.getDesplazamiento() +
                "\n Tipo de Habitad: " + oviparo.getHabitad() +
                "\n Numero de Ojos: " + oviparo.getNumeroOjos() +
                "\n Cuanto Pesa: " + oviparo.getPeso() +
                "\n Cuanto Mide: " + oviparo.getTamanio() + "centimetros");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");

    }

    public static void aves() {
        Oviparos oviparo = new Oviparos();
        oviparo.setNombre("Periquito");
        oviparo.setCantidadHuevos(6);
        oviparo.setTipoFecundacion("Externo");
        oviparo.setAlimentacion("Alimento");
        oviparo.setColor("Azul y amarillo");
        oviparo.setDesplazamiento("vuela");
        oviparo.setHabitad("Nomada");
        oviparo.setNumeroOjos(2);
        oviparo.setPeso("40 gramos ");
        oviparo.setTamanio(18);
        oviparo.setNumeroPatas(2);

        System.out.println("El nombre es: " + oviparo.getNombre() +
                "\n Cantidad de Huevos: " + oviparo.getCantidadHuevos() +
                "\n Tipo de Fecundacion: " + oviparo.getTipoFecundacion() +
                "\n Alimentacion: " + oviparo.getAlimentacion() +
                "\n Color: " + oviparo.getColor() +
                "\n Tipo de Desplazamiento: " + oviparo.getDesplazamiento() +
                "\n Tipo de Habitad: " + oviparo.getHabitad() +
                "\n Numero de Ojos: " + oviparo.getNumeroOjos() +
                "\n Cuanto Pesa: " + oviparo.getPeso() +
                "\n Cuanto Mide: " + oviparo.getTamanio() + "centimetros" +
                "\n Numero de Patas: " + oviparo.getNumeroPatas());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");

    }

    public static void anfibios() {
        Oviparos oviparo = new Oviparos();
        oviparo.setNombre("Rana");
        oviparo.setCantidadHuevos(2309);
        oviparo.setTipoFecundacion("Externo");
        oviparo.setAlimentacion("Mosquitos");
        oviparo.setColor("Verde");
        oviparo.setDesplazamiento("Saltos");
        oviparo.setHabitad("Lagos");
        oviparo.setNumeroOjos(2);
        oviparo.setPeso("4.3 gramos");
        oviparo.setTamanio(11);
        oviparo.setNumeroPatas(4);

        System.out.println("El nombre es: " + oviparo.getNombre() +
                "\n Cantidad de Huevos: " + oviparo.getCantidadHuevos() +
                "\n Tipo de Fecundacion: " + oviparo.getTipoFecundacion() +
                "\n Alimentacion: " + oviparo.getAlimentacion() +
                "\n Color: " + oviparo.getColor() +
                "\n Tipo de Desplazamiento: " + oviparo.getDesplazamiento() +
                "\n Tipo de Habitad: " + oviparo.getHabitad() +
                "\n Numero de Ojos: " + oviparo.getNumeroOjos() +
                "\n Cuanto Pesa: " + oviparo.getPeso() +
                "\n Cuanto Mide: " + oviparo.getTamanio() + "centimetros" +
                "\n Numero de Patas: " + oviparo.getNumeroPatas());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");
    }

    public static void reptiles() {
        Oviparos oviparo = new Oviparos();
        oviparo.setNombre("Cocodrilo");
        oviparo.setCantidadHuevos(60);
        oviparo.setTipoFecundacion("Externa");
        oviparo.setAlimentacion("Peces");
        oviparo.setColor("Verde oscuro");
        oviparo.setDesplazamiento("Arrastrando");
        oviparo.setHabitad("Lagunas y rios ");
        oviparo.setNumeroOjos(2);
        oviparo.setPeso("730 gramos ");
        oviparo.setTamanio(6);
        oviparo.setNumeroPatas(4);

        System.out.println("El nombre es: " + oviparo.getNombre() +
                "\n Cantidad de Huevos: " + oviparo.getCantidadHuevos() +
                "\n Tipo de Fecundacion: " + oviparo.getTipoFecundacion() +
                "\n Alimentacion: " + oviparo.getAlimentacion() +
                "\n Color: " + oviparo.getColor() +
                "\n Tipo de Desplazamiento: " + oviparo.getDesplazamiento() +
                "\n Tipo de Habitad: " + oviparo.getHabitad() +
                "\n Numero de Ojos: " + oviparo.getNumeroOjos() +
                "\n Cuanto Pesa: " + oviparo.getPeso() +
                "\n Cuanto Mide: " + oviparo.getTamanio() + "Metros" +
                "\n Numero de Patas: " + oviparo.getNumeroPatas());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

    }

    public static void mamiferos() {
        Viviparos viviparo = new Viviparos();
        viviparo.setNombre("Vaca");
        viviparo.setColor("Blanco con negro");
        viviparo.setPeso("600 Kg");
        viviparo.setTamanio(1.40f);
        viviparo.setMetodoReproduccion("Fecundación interna");
        viviparo.setNumeroHijos(1);
        viviparo.setAlimentacion("Normalmente de pasto y hierbas");
        viviparo.setDesplazamiento("Terrestre");
        viviparo.setNumeroOjos(2);
        viviparo.setNumeroPatas(4);
        viviparo.setHabitad("Todo el mundo, normalmente domésticas");

        System.out.println("El nombre del mamifero es; " + viviparo.getNombre() +
                "\n El color de la vaca normalmente es: " + viviparo.getColor() +
                "\n El peso de la vaca normalmente es de: " + viviparo.getPeso() +
                "\n El tamaño de una vaca promedio es de: " + viviparo.getTamanio() + " " + "mts" +
                "\n El método de reproducción de una vaca es: " + viviparo.getMetodoReproduccion() +
                "\n El número de hijos habitual de una vaca es de: " + viviparo.getNumeroHijos() +
                "\n Las vacas se alimentan de:" + viviparo.getAlimentacion() +
                "\n Las vacas se desplazan de forma: " + viviparo.getDesplazamiento() +
                "\n A menos que tengan problemas genéticos, las vacas suelen tener: " + viviparo.getNumeroOjos()
                + " " + "ojos" + " " + "y" + " " + viviparo.getNumeroPatas() + " " + "patas" +
                "\n Usualmente las vacas habitan en: " + viviparo.getHabitad()+
                "");
    }
}
//
package lab.pkg2_joeldiaz;

/**
 * @author usuario
 */
public class Casas {
    
    private int num; 
    private int bloque; 
    private double largo;
    private double ancho;
    private boolean posesion; //si ya fué comprada
    private int pisos;
    private int banos;
    private int cuartos;
    private String dueno; //dueño
    private String ing; //ingeniero a cargo
    private int estado;
    private String color;
    /*
        1) Listas
        2) Construcción
        3) Construcción en espera
        4) Espera de demolición
    */

    public Casas() {
    }

    public Casas(int num, int bloque, double largo, double ancho, boolean posesion, int pisos, int banos, int cuartos, String dueno, String ing, int estado, String color) {
        this.num = num;
        this.bloque = bloque;
        this.largo = largo;
        this.ancho = ancho;
        this.posesion = posesion;
        this.pisos = pisos;
        this.banos = banos;
        this.cuartos = cuartos;
        this.dueno = dueno;
        this.ing = ing;
        this.estado = estado;
        this.color = color;        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isPosesion() {
        return posesion;
    }

    public void setPosesion(boolean posesion) {
        this.posesion = posesion;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public String getIng() {
        return ing;
    }

    public void setIng(String ing) {
        this.ing = ing;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        String est="";
        
        switch(estado){
            case 1: est="Lista";
                break;
            case 2: est="En construcción";
                break;
            case 3: est="Construcción en espera";
                break;
            case 4: est="Espera de demolición";
                break;
        }
        
        if (posesion==true){
            return "Numero: "+num+"\nBloque: "+bloque+"\nLargo: "+largo+"\nAncho: "+ancho+"\nEn posesión de: "+dueno+"\nPisos: "+pisos+"\nBaños: "+banos+"\nCuartos: "+cuartos+"\nIngeniero a cargo: "+ing+"\nEstado: "+est+"\nColor: "+color;
        } else {
            return "Numero: "+num+"\nBloque: "+bloque+"\nLargo: "+largo+"\nAncho: "+ancho+"\nNo ha sido comprada"+"\nPisos: "+pisos+"\nBaños"+banos+"\nCuartos: "+cuartos+"\nIngeniero a cargo: "+ing+"\nEstado: "+est+"\nColor: "+color;
        }
    }
    
}

package clases;

public class ClaseCuadrilátero {
   int lad1, lad2; 

    public ClaseCuadrilátero(int lad1, int lad2) {
        this.lad1 = lad1;
        this.lad2 = lad2;
    }

    public ClaseCuadrilátero(int lad1) {
        this.lad1 = this.lad2=lad1;
    }
   
    public int area(){
        return lad1*lad2;
    }
    
    public int perimetro(){
        return (lad1+lad2)*2;
    }
    public static void main(String[] args){
    ClaseCuadrilátero ob1 = new ClaseCuadrilátero(6 ,4 );
        System.out.println("Rectángualo: ");
        System.out.println("El área del rectángulo es = "+ob1.area());
        System.out.println("El perímetro del rectángulo es = "+ob1.perimetro());

        ClaseCuadrilátero ob2 = new ClaseCuadrilátero(10);
        System.out.println("Cuadrado: ");
        System.out.println("El área del cuadrado es = "+ob2.area());
        System.out.println("El perímetro del cuadrado es = "+ob2.perimetro());
        
    }
}

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
        System.out.println("rectangualo");
        System.out.println("area="+ob1.area());
        System.out.println("perimetro="+ob1.perimetro());

        ClaseCuadrilátero ob2 = new ClaseCuadrilátero(10);
        System.out.println("cuadrado");
        System.out.println("area="+ob2.area());
        System.out.println("perimetro="+ob2.perimetro());
        
    }
}

package clases;

public class ClaseCubo {
int a, h, p;

    public ClaseCubo(int a, int h, int p) {
        this.a = a;
        this.h = h;
        this.p = p;
    }
    public ClaseCubo() {
    }

    public int calculavolumen(int a, int h, int p){
        return a*h*p;
        
    }

    public static void main(String[] args) {
        
        int resultado = 0;
        
        ClaseCubo ob1 = new ClaseCubo();
        resultado = ob1.calculavolumen(3, 2, 6);
        System.out.println("El volumen es = "+resultado);
        
   
        

    }
    
}


package Math;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Mathe {
    private Double raiz;
    private Double angulo;

    public Mathe(){
        this.raiz = 37.0;
        this.angulo = 300.0;
    }
    
    public Double raizCuadrada(Double raiz){
        Double resultado;
        resultado = sqrt(pow(this.raiz,2.0));
        return resultado;
    }

}

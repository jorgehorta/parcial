package puntoa;
public class jh {
    double hipotenusa,areacir,areacua,arearec;
    
    double hallar_hipotenusa(double dato1, double dato2){
        hipotenusa = Math.hypot(dato1, dato2);
        
        return hipotenusa;
        
    }
    
    double hallar_area(double radio){
        areacir = Math.PI *Math.pow(radio, 2);
        return areacir;
        
    }
     double hallar_cuadrado(double lado){
        areacua = lado*lado;
        return areacua;
     }
     double hallar_rectangulo(double base, double alt){
        areacua = base*alt;
        return areacua;
     }

}

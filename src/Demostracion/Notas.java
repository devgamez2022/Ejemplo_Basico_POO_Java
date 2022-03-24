package Demostracion;

public class Notas {
    double nota1;
    double nota2;
    double nota3;

    public Notas() {
    }

    public Notas(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    
    public double promedio(){
        double pm = 0.0;
        pm = (this.nota1 + this.nota2 + this.nota3)/3;
        return pm;
    }
    
    public double promedio(Notas obj){
        double pm = 0.0;
        pm = (obj.getNota1() + obj.getNota2() + obj.getNota3())/3;
        return pm;
    }
    
    public double promedio(double n1, double n2, double n3){
        double pm = 0.0;
        pm = (n1 + n2 + n3)/3;
        return pm;
    }
    
    
}

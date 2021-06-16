package dominio;


public class estudiantes {
    private String nombre;
    private String sexo;
    private double nota;

    public estudiantes(String nombre, String sexo, double nota) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.nota = nota;
    }

    public String getMarca() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public double getNota() {
        return nota;
    }
    
    public String toString(){
        return this.nombre+" "+this.sexo+" "+this.nota;

    }
}
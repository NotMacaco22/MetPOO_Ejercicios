package models;

public class Student {

    private String CIF;
    private String Nombre;
    private String Apellido;
    private String Asignatura;
    private int firstCut;
    private int secondCut;
    private int thirdCut;

    public Student() {
    }

    public Student(int thirdCut, int secondCut, int firstCut, String asignatura, String apellido, String nombre, String CIF) {
        this.thirdCut = thirdCut;
        this.secondCut = secondCut;
        this.firstCut = firstCut;
        this.Asignatura = asignatura;
        this.Apellido = apellido;
        this.Nombre = nombre;
        this.CIF = CIF;
    }

    public String getCIF() {
        return CIF;
    }
    public void setCIF(String CIF) {
        this.CIF = CIF;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getAsignatura() {
        return Asignatura;
    }
    public void setAsignatura(String asignatura) {
        Asignatura = asignatura;
    }
    public int getFirstCut() {
        return firstCut;
    }
    public void setFirstCut(int firstCut) {
        this.firstCut = firstCut;
    }
    public int getSecondCut() {
        return secondCut;
    }
    public void setSecondCut(int secondCut) {
        this.secondCut = secondCut;
    }
    public int getThirdCut() {
        return thirdCut;
    }
    public void setThirdCut(int thirdCut) {
        this.thirdCut = thirdCut;
    }


    public int obtNotaFinal(){
        return (this.firstCut + this.secondCut + this.thirdCut) / 3;
    }

    public String evaluateFinalGrade(){

        int notaFinal = obtNotaFinal();

        if (notaFinal > 100 || notaFinal < 0) {
            return "Nota No Valida";
        } else if (notaFinal >= 70) {
            return "Aprobado";
        } else return "Reprobado";
    }

    public String evaluateConvo(){

        int notaFinal = obtNotaFinal();

        if (notaFinal > 100 || notaFinal < 0) {
            return "Nota No Valida";
        } else if (notaFinal >= 70) {
            return "No Necesita Convocatoria";
        } else if (notaFinal >= 60) {
            return "Aplica para Convocatoria";
        } else return "No Aplica para Convocatoria";

    }

    @Override
    public String toString() {
        return "Student " +
                "CIF='" + CIF + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Asignatura='" + Asignatura + '\'' +
                ", firstCut=" + firstCut +
                ", secondCut=" + secondCut +
                ", thirdCut=" + thirdCut        ;
    }
}

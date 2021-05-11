
package exaprac2;

public class Trabajadores {
    private String nombreEmp;
    private double salarioXhora;
    private int cantHoras;

    public Trabajadores() {
    }

    public Trabajadores(String nombreEmp, double salarioXhora, int cantHoras) {
        this.nombreEmp = nombreEmp;
        this.salarioXhora = salarioXhora;
        this.cantHoras = cantHoras;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public double getSalarioXhora() {
        return salarioXhora;
    }

    public void setSalarioXhora(double salarioXhora) {
        this.salarioXhora = salarioXhora;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }
}

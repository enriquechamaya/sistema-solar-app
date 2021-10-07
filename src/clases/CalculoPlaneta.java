
package clases;
/**
 * @author Saul
 */
public class CalculoPlaneta {

    private String nombre;
    private String apellido;
    private int peso;
    private int planeta;
    
    public String Modelo(){
        String v[]={"","mercurio","venus","jupiter","marte","saturno","urano","neptuno"};
        return v[planeta];  
    }
    
        public double FuerzaG(){
            double f[]={0, .378,.906,2.533,.379,1.066,.905,1.133};
            return f[planeta];
        }
    
    public double resultado(){
        return  Math.round(FuerzaG()*peso);
    }

    public CalculoPlaneta() {
    }

    public CalculoPlaneta(String nombre, String apellido, int peso, int planeta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.planeta = planeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPlaneta() {
        return planeta;
    }

    public void setPlaneta(int planeta) {
        this.planeta = planeta;
    }

    
}

public class Empleado {

    private long idEmpleado;
    private String nombreEmpleado;
    private String correo;
    private String nombreEmpresa;
    private String rolEmpleado;

//CONSTRUCTOR//
    public Empleado(long idEmpleado, String nombreEmpleado, String correo, String nombreEmpresa, String rolEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.nombreEmpresa = nombreEmpresa;
        this.rolEmpleado = rolEmpleado;
    }

//GETTERS Y SETTERS//
    //idempleado
    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    //nombreEmpleado
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    //correo
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    //nombreEmpresa
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }
}

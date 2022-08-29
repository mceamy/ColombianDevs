public class Empresa {

    private long idEmpresa;
    private String nit;
    private String nombreEmpresa;
    private String direccion;
    private String telefono;

//CONSTRUCTOR//
    public Empresa(long idEmpresa, String nit, String nombreEmpresa, String direccion, String telefono) {
        this.idEmpresa = idEmpresa;
        this.nit = nit;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
    }

//GETTERS Y SETTERS//
    //idempresa
    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public long getIdEmpresa() {
        return idEmpresa;
    }

    //NIT
        public void setNit(String nit) {
            this.nit = nit;
        }

        public String getNit() {
            return nit;
        }

    //nombre
        public void setNombreEmpresa(String nombreEmpresa) {
            this.nombreEmpresa = nombreEmpresa;
        }

        public String getNombreEmpresa() {
            return nombreEmpresa;
        }

    //dirección
        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getDireccion() {
            return direccion;
        }

    //teléfono
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getTelefono() {
            return telefono;
        }
}

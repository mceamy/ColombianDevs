public class Empresa {

    private long id;
    private String nit;
    private String nombre;
    private String direccion;
    private String telefono;

//CONSTRUCTOR//
    public Empresa(long id, String nit, String nombre, String direccion, String telefono) {
        this.id = id;
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

//GETTERS Y SETTERS//
    //NIT
        public void setNit(String nit) {
            this.nit = nit;
        }

        public String getNit() {
            return nit;
        }

    //nombre
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
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

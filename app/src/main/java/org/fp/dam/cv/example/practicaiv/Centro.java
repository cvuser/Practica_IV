package org.fp.dam.cv.example.practicaiv;

	public class Centro {

    public String nombre;
    public String direccion;
    public int imagen;

    public Centro(String nombre, String direccion, int imagen) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}

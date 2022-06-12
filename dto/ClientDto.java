package fca.unam.mx.dto;


import org.jdbi.v3.core.mapper.reflect.ColumnName;


public class ClientDto {

	private Long id;
	private String nombre;

	private String apellido_paterno;

	private String apellido_materno;

	private String RFC;

	public Long getId() {

	        return id;
    
	}

    
	public void setId(Long id) {

	        this.id = id;
    
	}

    
	@ColumnName("nombre")
    
	public String getNombre() {

	        return nombre;
    
	}

    
	public void setNombre(String name) {
	
        this.nombre = nombre;
    
	}

    
	@ColumnName("apellido_paterno")
    
	public String getApellido_Paterno() {

	        return apellido_paterno;
    
	}

    
	public void setApellido_Paterno(String apellido_paterno) {
	
        this.apellido_paterno = apellido_paterno;
    
	}

    
	@ColumnName("apellido_materno")
    
	public String getApellido_Materno() {

	        return apellido_materno;
    
	}

    
	public void setApellido_Materno(String apellido_materno) {
	
        this.apellido_materno = apellido_materno;
    
	}

    
	@ColumnName("rfc")
    
	public String getRFC() {

	        return RFC;
    
	}

    
	public void setRFC(String RFC) {
	
        this.RFC = RFC;
    
	}

    
}

package facturacion.api_factura.cliente;

import org.hibernate.annotations.CollectionId;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CustomerDTO {
    private Long id;
    private String nombre;
    private String cedula;
}

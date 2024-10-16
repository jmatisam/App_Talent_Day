package  org.jmat_f5_dbosco.app_talen_day.controller;

import java.util.List;

import org.jmat_f5_dbosco.app_talen_day.dto.EmpresaDTO;
import org.jmat_f5_dbosco.app_talen_day.exceptions.ResourceNotFoundException;
import org.jmat_f5_dbosco.app_talen_day.services.EmpresaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaServiceImpl empresaServiceImpl;

    @GetMapping
    public ResponseEntity<List<EmpresaDTO>> getAllEmpresas() {
        List<EmpresaDTO> empresas = empresaServiceImpl.getAllEmpresas();
        if (empresas.isEmpty()) {
            return ResponseEntity.noContent().build(); // Código 204: No Content si no hay empresas
        }
        return ResponseEntity.ok(empresas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpresaDTO> getEmpresaById(@PathVariable String id) {
        EmpresaDTO empresa = empresaServiceImpl.getEmpresaById(id);
        return ResponseEntity.ok(empresa);  // Código 200: OK si la empresa existe
    }
    
    @GetMapping("/fichaEmpresa")
    public ResponseEntity<List<EmpresaDTO>> searchEmpresasbyName(@RequestParam String enterpriseName) {
        List<EmpresaDTO> empresas = empresaServiceImpl.searchEmpresasbyName(enterpriseName);
        return ResponseEntity.ok(empresas);  // Código 200: OK con lista de empresas encontradas
    }

    @PostMapping
    public ResponseEntity<EmpresaDTO> createEmpresa(@Valid @RequestBody EmpresaDTO empresaDTO) {
        try {
            EmpresaDTO createdEmpresa = empresaServiceImpl.saveEmpresa(empresaDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdEmpresa);  // Código 201: Created si se crea correctamente
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null); // Código 400: Bad Request si hay algún error de validación o en la lógica
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmpresaDTO> updateEmpresa(@PathVariable String empresaId, @Valid @RequestBody EmpresaDTO empresaDTO) {
        try {
            EmpresaDTO updatedEmpresa = empresaServiceImpl.updateEmpresa(empresaId, empresaDTO);
            return ResponseEntity.ok(updatedEmpresa); // Código 200: OK si se actualiza correctamente
        } catch (ResourceNotFoundException ex) {
            throw new ResourceNotFoundException("Empresa not found with id: " + empresaId); // Código 404: Not Found si la empresa no existe
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null); // Código 400: Bad Request si hay un error
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpresa(@PathVariable String empresaId) {
        try {
            empresaServiceImpl.deleteEmpresa(empresaId);
            return ResponseEntity.noContent().build();  // Código 204: No Content si se elimina correctamente
        } catch (ResourceNotFoundException ex) {
            throw new ResourceNotFoundException("Empresa not found with id: " + empresaId);  // Código 404: Not Found si no se encuentra
        }
    }
}

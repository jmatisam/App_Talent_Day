package  org.jmat_f5_dbosco.app_talen_day.services;
  

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  org.jmat_f5_dbosco.app_talen_day.dto.EmpresaDTO;
import  org.jmat_f5_dbosco.app_talen_day.exceptions.ResourceNotFoundException;
import  org.jmat_f5_dbosco.app_talen_day.models.Empresa;
import  org.jmat_f5_dbosco.app_talen_day.repository.IiempresaRepository;

@Service
public class EmpresaServiceImpl {

    @Autowired
    private IiempresaRepository iempresaRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<EmpresaDTO> getAllEmpresas() {
        List<Empresa> empresas = iempresaRepository.findAll();
        return empresas.stream()
                .map(empresa -> modelMapper.map(empresa, EmpresaDTO.class))
                .collect(Collectors.toList());
    }

    public EmpresaDTO getEmpresaById(String empresaId) {
        Empresa empresa = iempresaRepository.findById(empresaId)
                .orElseThrow(() -> new ResourceNotFoundException("Empresa not found with id: " + empresaId));
        return modelMapper.map(empresa, EmpresaDTO.class);
    }

    public EmpresaDTO saveEmpresa(EmpresaDTO empresaDTO) {
        Empresa empresa = modelMapper.map(empresaDTO, Empresa.class);
        Empresa savedEmpresa = iempresaRepository.save(empresa);
        return modelMapper.map(savedEmpresa, EmpresaDTO.class);
    }

    public EmpresaDTO updateEmpresa(String empresaId, EmpresaDTO empresaDTO) {
        Empresa existingEmpresa = iempresaRepository.findById(empresaId)
                .orElseThrow(() -> new ResourceNotFoundException("Empresa not found with id: " + empresaId));
        modelMapper.map(empresaDTO, existingEmpresa);
        Empresa updatedEmpresa = iempresaRepository.save(existingEmpresa);
        return modelMapper.map(updatedEmpresa, EmpresaDTO.class);
    }

    public void deleteEmpresa(String empresaId) {
        Empresa existingEmpresa = iempresaRepository.findById(empresaId)
                .orElseThrow(() -> new ResourceNotFoundException("Empresa not found with id: " + empresaId));
        iempresaRepository.delete(existingEmpresa);
    }

    public List<EmpresaDTO> searchEmpresasbyName(String enterpriseName) {
        List<Empresa> empresas = iempresaRepository.findByEnterpriseNameContainingIgnoreCase(enterpriseName); // Búsqueda insensible a mayúsculas
        if (empresas.isEmpty()) {
            throw new ResourceNotFoundException("No companies found with name: " + enterpriseName);
        }
        return empresas.stream()
                .map(empresa -> modelMapper.map(empresa, EmpresaDTO.class))
                .collect(Collectors.toList());
    }
    
}

    


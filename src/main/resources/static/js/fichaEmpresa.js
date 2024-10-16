document.querySelector('form').addEventListener('submit', function (event) {
    event.preventDefault();
    
    const enterpriseNameInput = document.querySelector('input[name="enterpriseName"]').value;

    // Realizar la solicitud al backend con el query parameter
    fetch(`/api/empresas/fichaEmpresa?enterpriseName=${encodeURIComponent(enterpriseNameInput)}`)
        .then(response => {
            if (!response.ok) {
                throw new Error('Empresa no encontrada');
            }
            return response.json();
        })
        .then(empresas => {
            // Suponiendo que se espera una lista y quieres mostrar el primero
            if (empresas.length > 0) {
                const empresa = empresas[0]; // O maneja según tu lógica
                document.getElementById('enterpriseName').innerText = empresa.enterpriseName;
                document.getElementById('businessSector').innerText = "Sector: " + empresa.businessSector;
                document.getElementById('address').innerText = "Dirección: " + empresa.address;
                document.getElementById('headquarters').innerText = "Sede: " + empresa.headquarters;
                document.getElementById('socialMediaLink').href = empresa.socialNetworks[0].socNetLink; // Asumiendo que la red social principal está en la posición 0
                
                // Mostrar el div oculto
                document.getElementById('fichaEmpresa').style.display = 'block';
            } else {
                alert('No se encontraron empresas con ese nombre.');
            }
        })
        .catch(error => {
            console.error('Error:', error);
            alert('No se pudo encontrar la empresa.');
        });
});

function ejemploGet() {
    fetch('http://localhost:8080/clifrec')
        .then(function(response) {
            return response.json();
        })
        .then(function(data) {
            console.log('data = ', data);
        })
        .catch(function(err) {
            console.error(err);
        });
}

function ejemploPostFormulario() {
    fetch('http://localhost:8080/mi', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
            'Access-Control-Allow-Origin':'*'
        },
        body: 'a=1&b=2'
        })
        .then(function(response) {
            console.log('response =', response);
            return response.json();
        })
        .then(function(data) {
            console.log('data = ', data);
        })
        .catch(function(err) {
            console.error(err);
        });
}

function ejemploPostObject(objEnviar) {
    /*let objEnviar = {
        "idCliente": "e6da55f2-767d-4b30-a0e9-eb2782ab0bf2h",
        "nombre": "Fernando",
        "apellido": "Mediotte",
        "tipoDescuento": 1
    }*/

    fetch('http://localhost:8080/clifrec', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
            'Access-Control-Allow-Origin':'*'
        },
        body: JSON.stringify(objEnviar)
        })
        .then(function(response) {
            if(response.status == 201) {
                alert("Se agrego correctamente")
            }
            //console.log('response =', response);
            //return response.json();
        })
        .then(function(data) {
            console.log('data = ', data);
        })
        .catch(function(err) {
            console.error(err);
        });
}

(function recursivo() {
    $('#txtId').val(uuid.v4());
    setTimeout(function(){
        recursivo();
    }, 2000);
}());

/* Bloque anonimo */
{
    $('#btnAgregar').click(() => {
        let ObjAdd = {
            idCliente: $('#txtId').val(),
            nombre: $('#txtNombre').val(),
            apellido: $('#txtApellido').val(),
            tipoDescuento: $('#selTipoDescuento').val()
        }

        ejemploPostObject(ObjAdd);
    });
}

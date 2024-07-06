function noDisabled() {
    email=document.querySelector("#email").value
    pass=document.querySelector("#pass").value
    if (email.length>0 && pass.length>0) {
        document.querySelector("#btnSubmit").className="btn btn-primary"
    } else {
        document.querySelector("#btnSubmit").className="btn btn-primary disabled"
    }
}

function buscarPeli() {
    
    //    const respuesta = fetch(`https://api.themoviedb.org/3/movie/top_rated`, options);
    titulo=document.getElementById("pelicula")
    const respuesta = fetch(`http://localhost:8080/buscarPelis/`);

    //2 invocar
    respuesta
        .then(response => response.json())
        .then(response => renderPelis(response))//fulfilled
        .catch(error => dibujarError(error))//rejected
    
    
}
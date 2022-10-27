window.onload = function () {
    const IMAGENES = [
        '../static/img/imagen1.jpg',
        '../static/img/imagen4.jpg',
        '../static/img/imagen5.jpg',
    ];
    
    let posicionActual = 0;
    let $botonRetroceder = document.querySelector ('#retroceder');
    let $botonAvanzar = document.querySelector ('#avanzar');
    let $Imagen = document.querySelector('#imagen');

    function pasarFoto () {
        if (posicionActual >= IMAGENES.length - 1){
            posicionActual = 0;
        } else {
            posicionActual++; 
            
        }
        renderizarImagen ();
    }
    function retrocederFoto () {
        if (posicionActual <= 0) {
            posicionActual = IMAGENES.length - 1;
        } else {
            posicionActual--;
        }
        renderizarImagen();
    }
    function renderizarImagen () {
        $Imagen.style.backgroundImage = `url(${IMAGENES[posicionActual]})`;
    }
    
    $botonAvanzar.addEventListener('click', pasarFoto);
    $botonRetroceder.addEventListener('click', retrocederFoto)
    renderizarImagen()
    
}


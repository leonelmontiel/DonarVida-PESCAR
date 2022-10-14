window.onload = function () {
    const IMAGENES = [
        'img/imagen1.jpg',
        'img/imagen4.jpg',
        'img/imagen5.jpg',
    ];
    
    let posicionActual = 0;
    let $botonRetroceder = document.querySelector ('#Retroceder');
    let $botonAvanzar = document.querySelector ('#Avanzar');
    let $Imagen = document.querySelector('#Imagen');

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


const mario = document.querySelector(".mario");
const pipe = document.querySelector(".pipe");

const jump = () => {
    mario.classList.add('jump');
    setTimeout(() => {
        mario.classList.remove('jump')
    }, 500);
}



/*
function jump(){
mario.classList.add('jump');
setTimeout(function(){
mario.classList.remove('jump');
}, 500);
}
*/
//'function' é igual ao simbolo '=>'


   
const loop = setInterval(() => {
    console.log('loop');


const pipePosition = pipe.offsetLeft;
const marioPosition = +window.getComputedStyle(mario).bottom.replace('px', '');

if (pipePosition <= 120 && pipePosition > 0 && marioPosition < 80) {
    pipe.style.animation = "none";
    pipe.style.left = `${pipePosition}px`;
    mario.style.animation = "none";
    mario.style.bottom = `${marioPosition}px`;

    mario.src = './_imagens/game-over.png';
    mario.style.width = '75px';
    mario.style.marginLeft = '50px';

    clearInterval(loop);

}
}, 10)

document.getElementById('startButton').addEventListener('clck', () => {
console.log('Começando o jogo..');

});


const startButton = document.getElementById('meu-botao');
startButton.onclick = function(){
console.log('Ação do botão executada!')    
};



document.getElementById('initButton').addEventListener('click', () => {
console.log("Voltando para o inicio..");    
window.location.reload(true);
});

document.getElementById('exitButton').addEventListener('click', () => {
    console.log('Saindo do jogo...');
    window.close();

});


document.addEventListener('keydown', jump);


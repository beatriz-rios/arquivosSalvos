   const canvas = document.getElementById('gameCanvas');
    const ctx = canvas.getContext('2d');

    // Ajuste a altura e largura do canvas conforme necessário
    canvas.width = 800; // Exemplo de largura
    canvas.height = 600; // Exemplo de altura


    function desenharTelaInicial() {
        // Desenhar o fundo
        ctx.fillStyle = '#333'; // Cor de fundo
        ctx.fillRect(0, 0, canvas.width, canvas.height);

        // Desenhar o título do jogo
        ctx.fillStyle = '#fff'; // Cor do texto
        ctx.font = '50px Arial';
        ctx.textAlign = 'center';
        ctx.fillText('Meu Jogo Incrível', canvas.width / 2, canvas.height / 3);

        // Desenhar o botão "Jogar"
        ctx.fillStyle = '#0f0'; // Cor do botão
        ctx.fillRect(canvas.width / 2 - 100, canvas.height / 2 - 25, 200, 50);
        ctx.fillStyle = '#000';
        ctx.font = '20px Arial';
        ctx.fillText('Jogar', canvas.width / 2, canvas.height / 2 + 5);
    

    canvas.addEventListener('mousemove', (event) => {
        // Lógica para verificar se o mouse está sobre o botão "Jogar"
        // Se estiver, mude a cor do botão ou desenhe uma borda
    });

    canvas.addEventListener('click', (event) => {
        const rect = canvas.getBoundingClientRect();
        const x = event.clientX - rect.left;
        const y = event.clientY - rect.top;

        // Verificar se o clique foi no botão "Jogar"
        if (x > canvas.width / 2 - 100 && x < canvas.width / 2 + 100 &&
            y > canvas.height / 2 - 25 && y < canvas.height / 2 + 25) {
            console.log('Jogo iniciado!');
            // Chame aqui a função que inicia a tela de jogo
        }
    }
   ) };

    // Chamar a função para desenhar a tela inicial quando a página carregar
    desenharTelaInicial();
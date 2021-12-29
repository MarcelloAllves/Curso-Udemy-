# Curso-Udemy-
Cursos realizados na plataforma Udemy
1)- Fazer o download do Git.
2)- Na pasta do projeto, pressionar com o botão direito do mouse, selecionar a opcão Git Bash Here.
3)- Na tela que abrir digitar o comando git init, esse comando irá criar o repositório local na pasta raiz do projeto.
4)- Ainda na tela do Git Bash, executaremos o comando git add nome_do_arquivo, esse comando irá enviar o arquivo 
que se queira armazenar no repositório do Git.
5)- Executando o camando git status, irá aparecer informações dos arquivos que foram adicionados no repositório do Git.
6)- Caso ocorra algum erro, ou algum arquivo da pasta não seja enviado para o repositório, podemos executar o 
comando git add . (git add ponto).
7)- Para realmente finalizarmos o envio desses arquivos, precisaremos execultar um commit, através do comando 
git commit -m " ", dentro das aspas duplas é necessário escrever uma mensagem relacionado ao que se está commitando.
8)- Em sua página do Github, já logada, é necessário criar uma representação desse repositório dentro da página, esse será 
o repositório remoto do projeto.
9)- Assim que criado esse repositório na página do Github, copiar o URl desse repositório.
10)- Dentro da tela do git bash, executar o camando git remote add origin url-copiada.
11)- O ultimo passo pra enviar o projeto para o repositório remoto é executar dentro do git bash o comando
git push origin master, ao executar esse comando irá abrir duas telas para verificação do usuário do github,
a primeira tela será necessário informar o nome do usuário e a segunda tela a senha (usuário e senha do github).
12)- Na página já logada do repositório remoto do github, atualizando-a, irá aparecer todos os commits executados 
do projeto.

---------Resumo-------
Dentro da pasta do projeto abri o git bash e executar :
git init -> O comando git init cria um novo repositório git. Ele pode ser usado para converter um projeto existente e 
não insustado em um repositório git ou inicializar um novo repositório vazio. Só se faz uma vez para cada projeto.

git add -> O git add é um comando, que adiciona mudanças no diretório de trabalho à área de encenação(repositório remoto). 
Com a ajuda deste comando, você diz ao Git que deseja adicionar atualizações a um determinado arquivo no próximo commit.

git commit -m "mensagem relacionada ao que se está commitando" -> toda vez que fizer alguma alteração dentro do projeto.

Os dois próximos comandos é utilizado na configuração do repositório remoto com o repositório local.

git remote add origin url-do-repositório-remoto

git push -> é um comando usado para atualizar todos os seus novos commit locais para o repositório remoto.


-------Fluxo de trabalho do Git quando mais de uma pessoa participa do mesmo projeto.
1. init
2. Adiciona arquivos na pilha de commit
3. Faz o commit.
4. Faz o pull.
5. Faz o push.
O comando pull só é executado quando se trabalha com outras pessoas no mesmo projeto, o pull atualiza algumas partes 
do seu repositório local com alterações do repositório remoto. Visto que, outras pessoas que fazem parte do mesmo
projeto podem também terem alterações no mesmo arquivo.


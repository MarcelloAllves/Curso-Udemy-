# Curso-Udemy-
Cursos realizados na plataforma Udemy

Dentro do projeto, no pacote src/java criamos um pacote com o nome Application, e dentro desse pacote criamos a 
classe VendasApplication. 
package Application;

public class VendasApplication {
    
}

Passo 1 - Dentro da classe criaremos o método main
package Application;

public class VendasApplication {
    public static void main(String[] args) {

    }
}

Passo 2 - Acima de onde a classe é declarada criamos a anotação @SpringBootApplication:

package Application;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VendasApplication {
    public static void main(String[] args) {

    }
}
Essa anotação @SpringBootApplication, indica que essa classe vai inicializar nossa aplicação Spring Boot.

Passo 3 - Colocar o comando SpringApplication.run(VendasApplication.class, args), nota-se que dentro do parentese
passamos nossa classe VendasApplication, como argumento, que é a classe que vai realizar a aplicação Spring Boot.
para inicializar a aplicação Spring Boot.

Passo 4 - Depois de declarado a dependência @RestController no pom.xml, colocaremos essa anotação @RestController,
logo abaixo da anotação @SpringBootApplication, essa nova anotação (@RestController), simplesmente retorna o objeto 
e os dados do objeto gravados diretamente na resposta HTTP como JSON ou XML. Basicamente poderemos mandar mensagem para 
o broswer através dessa classe.
No Framework Spring, um Controller é uma classe responsável pela preparação de um modelo de Map com dados a 
serem exibidos pela view e pela escolha da view correta. 
Basicamente ele é o responsável por controlar as requisições indicando quem deve receber as requisições 
para quem deve responde-las.  O @RestController é apenas o atalho para usar a anotação @Controller e @ResponseBody juntos.
Dessa forma nosso projeto ficará assim:

package Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class VendasApplication {
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}

Para testarmos se nossa aplicação Spring Boot está funcionando, criaremos um método de teste chamado helloWord dentro da 
classe VendasApplication. Acima desse método colocamos a anotação @GetMapping("/nome-do-metodo").
A solicitação GET HTTP é usada para obter um único ou múltiplos recursos e @GetMapping anotação para mapear solicitações HTTP GET 
em métodos específicos de manipulador. Especificamente, @GetMapping é uma anotação composta que funciona como um atalho para 
@RequestMapping (método = RequestMethod.GET).

package Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class VendasApplication {
    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

    @GetMapping("/helloWord")
    public String helloWord(){
        return "Hello World!!!";
    }

}
Para testarmos se nossa aplicação está funcionando corretamente, primeiro devemos executar nosso código na IDE. Depois de executado, 
em um browser colocaremos o seguinte endereço: http://localhost:8080/helloWord, na tela que abrir deverá aparcer o a mensagem Hello World!!!,
que é a mesma mensagem de retorno do método public String helloWord().

package Application.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistemas de Vendas.";
    }
}

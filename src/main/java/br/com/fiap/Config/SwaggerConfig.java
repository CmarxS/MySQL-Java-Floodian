package br.com.fiap.Config;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Floodian")
                        .version("v1")
                        .description("Documentação da API REST para o sistema Floodian" +
                                "— Sistema Inteligente de Monitoramento e Alerta de Enchentes\n" +
                                "\n" +
                                "Sistema IoT para monitoramento em tempo real do nível de água e precipitação em áreas urbanas" +
                                " e rurais, visando prevenção de desastres relacionados a enchentes. Utiliza sensores instalados " +
                                "em pontos estratégicos que enviam dados via MQTT para um gateway que processa as informações e " +
                                "gera alertas conforme regras configuradas. A API RESTful disponibiliza endpoints para consulta " +
                                "de status, cadastro de sensores e gerenciamento de alertas. A solução conta ainda com " +
                                "um aplicativo para notificação imediata, além de alarmes locais para alertar " +
                                "comunidades. O sistema contribui para a segurança pública, engajamento comunitário e apoio a " +
                                "políticas públicas, sendo escalável para ampliação a novas regiões."));
    }
}

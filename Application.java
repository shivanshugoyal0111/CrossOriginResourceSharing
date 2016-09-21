@SpringBootApplication
@ImportResource(locations = "classpath*:application-context.xml")
public class Application {
    /**
     * main method to run the application
     * @param args arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "OPTIONS", "POST", "PUT", "DELETE");
            }
        };
    }
}

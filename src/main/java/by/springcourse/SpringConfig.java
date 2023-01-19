package by.springcourse;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("by.springcourse")
@PropertySource("classpath:musicPlayer.proporties")
public class SpringConfig {

}

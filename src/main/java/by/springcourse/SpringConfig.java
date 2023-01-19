package by.springcourse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:musicPlayer.proporties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic()
{return new ClassicalMusic();}
    @Bean
    public PopMusic popMusic()
    {
        return new PopMusic();
    }
    @Bean
    public MusicPlayer musicPlayer()
    {
        return new MusicPlayer(classicalMusic(), popMusic());
    }
}

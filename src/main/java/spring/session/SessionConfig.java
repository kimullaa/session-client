package spring.session;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

@EnableRedisHttpSession
public class SessionConfig {
    @Bean
    public JedisConnectionFactory connectionFactory(){
        JedisConnectionFactory factory =  new JedisConnectionFactory();
        factory.setPort(6379);
	factory.setHostName("localhost");
        return factory;
    }
}

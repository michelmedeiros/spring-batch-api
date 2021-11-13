package com.br.batch.api.springbatchapi.writer;


import com.br.batch.api.springbatchapi.domain.User;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UserWriterConfig {
  @Bean
  public ItemWriter<User> userWriter() {
    return items -> items.forEach(System.out::println);
  }
}

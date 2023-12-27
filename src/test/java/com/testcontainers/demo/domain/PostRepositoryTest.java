package com.testcontainers.demo.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest(
  properties = {
    "spring.test.database.replace=none",
//    Comment next line out if you want to reuse the testcontainer initially used for the build.
    "spring.datasource.url=jdbc:tc:postgresql:16-alpine:///db",
  }
)
@Sql("/test-data.sql")
class PostRepositoryTest {

  @Autowired
  PostRepository repository;

  @Test
  void shouldGetPostById() {
    Post post = repository.getPostById(1L).orElseThrow();

    assertThat(post.id()).isEqualTo(1L);
    assertThat(post.title()).isEqualTo("Post 1 Title");
    assertThat(post.content()).isEqualTo("Post 1 content");
    assertThat(post.createdBy().id()).isEqualTo(1L);
    assertThat(post.createdBy().name()).isEqualTo("Siva");
    assertThat(post.createdBy().email()).isEqualTo("siva@gmail.com");
    assertThat(post.comments()).hasSize(2);
  }
}

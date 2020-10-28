package ru.vlapin.experiments.vladimirstartproject.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.vlapin.experiments.vladimirstartproject.dao.CatRepository;
import ru.vlapin.experiments.vladimirstartproject.model.Cat;

@Component
@RequiredArgsConstructor
public class DataJpaIniter implements ApplicationRunner {

  CatRepository catRepository;

  @Override
  public void run(ApplicationArguments __) {
    //    String[] catName = "Мурзик, Барсик, Матроскин".split(", ");
    String[] catName = {"Мурзик", "Барсик", "Матроскин"};
    for (String s : catName) {
      Cat cat = new Cat(s);
      catRepository.save(cat);
    }
  }
}

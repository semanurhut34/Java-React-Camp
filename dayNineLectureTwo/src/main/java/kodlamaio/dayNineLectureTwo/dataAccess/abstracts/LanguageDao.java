package kodlamaio.dayNineLectureTwo.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.dayNineLectureTwo.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{


}

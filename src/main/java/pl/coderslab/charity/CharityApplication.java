package pl.coderslab.charity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.coderslab.model.Category;
import pl.coderslab.model.Donation;
import pl.coderslab.model.Institution;
import pl.coderslab.repository.CategoryRepository;
import pl.coderslab.repository.InstitutionRepository;

import java.util.List;

@SpringBootApplication(scanBasePackages = {"pl.coderslab.controller", "pl.coderslab.service"})
@EntityScan(basePackages = "pl.coderslab.model")
@EnableJpaRepositories(basePackages = "pl.coderslab.repository")
public class CharityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharityApplication.class, args);
    }

    @Bean
    CommandLineRunner init(InstitutionRepository institutionRepository, CategoryRepository categoryRepository) {
        return (args) -> {
            List<Institution> allInstitution = institutionRepository.findAll();
            if(allInstitution.isEmpty()) {
                Institution institution1 = new Institution();
                institution1.setName("Dbam o Zdrowie");
                institution1.setDescription("Pomoc dzieciom z ubogich rodzin.");
                institutionRepository.save(institution1);
                Institution institution2 = new Institution();
                institution2.setName("Dla dzieci");
                institution2.setDescription("Pomoc osobom znajdującym się w trudnej sytuacji");
                institutionRepository.save(institution2);
            }
            List<Category> allCategory = categoryRepository.findAll();
            if(allCategory.isEmpty()) {
                Category category1 = new Category();
                category1.setName("ubrania, które nadają się do ponownego użycia");
                categoryRepository.save(category1);
                Category category2 = new Category();
                category2.setName("ubrania, do wyrzucenia");
                categoryRepository.save(category2);
                Category category3 = new Category();
                category3.setName("zabawki");
                categoryRepository.save(category3);
                Category category4 = new Category();
                category4.setName("książki");
                categoryRepository.save(category4);
                Category category5 = new Category();
                category5.setName("inne");
                categoryRepository.save(category5);
            }
        };
    }
}

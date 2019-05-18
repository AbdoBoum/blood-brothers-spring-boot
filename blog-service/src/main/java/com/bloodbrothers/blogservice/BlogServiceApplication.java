package com.bloodbrothers.blogservice;

import com.bloodbrothers.blogservice.Entities.Blog;
import com.bloodbrothers.blogservice.Entities.Donnateur;
import com.bloodbrothers.blogservice.Entities.GroupSang;
import com.bloodbrothers.blogservice.Entities.Ville;
import com.bloodbrothers.blogservice.Repository.DonorRepository;
import com.bloodbrothers.blogservice.Repository.blogRepositiry;
import com.bloodbrothers.blogservice.Repository.sangRepository;
import com.bloodbrothers.blogservice.Repository.villeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.client.RestTemplate;

import java.sql.Timestamp;

@SpringBootApplication
@EnableEurekaClient
public class BlogServiceApplication implements CommandLineRunner {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Autowired
    blogRepositiry mblogRepositiry;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    @Autowired
    DonorRepository donorRepository;

    @Autowired
    sangRepository msangRepository;

    @Autowired
    villeRepository mvilleRepository;

    public static void main(String[] args) {
        SpringApplication.run(BlogServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repositoryRestConfiguration.exposeIdsFor(Blog.class);

        Ville rabat = new Ville( "Rabat", null, null);
        Ville casa = new Ville("Casablanca", null, null);
        Ville kenitra = new Ville("Kenitra", null, null);
        Ville Marrakech = new Ville("Marrakech", null, null);
        mvilleRepository.save(rabat); mvilleRepository.save(casa);
        mvilleRepository.save(kenitra); mvilleRepository.save(Marrakech);

        GroupSang ap = new GroupSang("A+", null, null);
        GroupSang bp = new GroupSang("B+", null, null);
        GroupSang am = new GroupSang("A-", null, null);
        GroupSang bm = new GroupSang("B-", null, null);
        GroupSang abp = new GroupSang("AB+", null, null);
        GroupSang abm = new GroupSang("AB-", null, null);
        GroupSang op = new GroupSang("O+", null, null);
        GroupSang om = new GroupSang("O-", null, null);
        msangRepository.save(ap); msangRepository.save(am); msangRepository.save(abp);
        msangRepository.save(abm); msangRepository.save(bm); msangRepository.save(bp);
        msangRepository.save(om); msangRepository.save(op);

        Donnateur donnateur = new Donnateur("GY35678", "BOUMAHDI", "ABDERRAHIM",
                "boum.abdo@gmail.com", "azerty@20394KJ", "0656458694", rabat, ap, null);

        donorRepository.save(donnateur);
        Blog blog = new Blog(1l, "Blood Brothers", "Dummy Container",
                "localhost://image", new Timestamp(System.currentTimeMillis()), donnateur);

        mblogRepositiry.save(blog);
    }
}

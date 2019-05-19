package com.bloodbrothers.villesangservice;

import com.bloodbrothers.villesangservice.Entities.GroupSang;
import com.bloodbrothers.villesangservice.Entities.Ville;
import com.bloodbrothers.villesangservice.Repositories.SangReposiroty;
import com.bloodbrothers.villesangservice.Repositories.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class VilleSangServiceApplication implements CommandLineRunner {

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    @Autowired
    private VilleRepository villeRepository;

    @Autowired
    private SangReposiroty sangReposiroty;

    public static void main(String[] args) {
        SpringApplication.run(VilleSangServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Ville.class, GroupSang.class);

        Ville rabat = new Ville( "Rabat");
        Ville casa = new Ville("Casablanca");
        Ville kenitra = new Ville("Kenitra");
        Ville Marrakech = new Ville("Marrakech");
        villeRepository.save(rabat); villeRepository.save(casa);
        villeRepository.save(kenitra); villeRepository.save(Marrakech);

        GroupSang ap = new GroupSang("A+");
        GroupSang bp = new GroupSang("B+");
        GroupSang am = new GroupSang("A-");
        GroupSang bm = new GroupSang("B-");
        GroupSang abp = new GroupSang("AB+");
        GroupSang abm = new GroupSang("AB-");
        GroupSang op = new GroupSang("O+");
        GroupSang om = new GroupSang("O-");
        sangReposiroty.save(ap); sangReposiroty.save(am); sangReposiroty.save(abp);
        sangReposiroty.save(abm); sangReposiroty.save(bm); sangReposiroty.save(bp);
        sangReposiroty.save(om); sangReposiroty.save(op);


    }
}

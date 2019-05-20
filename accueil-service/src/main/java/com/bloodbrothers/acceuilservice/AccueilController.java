package com.bloodbrothers.acceuilservice;

import com.bloodbrothers.acceuilservice.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccueilController {
    @Autowired
    private RestTemplate restTemplate;

    //@Autowired
    //private WebClient.Builder webClientBuilder;

    @RequestMapping("/donnateurs")
    public List<Donnateur> getAllDonnateurs() {

        DonnateurWrapper donnateurWrapper = restTemplate.getForObject("http://donor-center-service/donnateurs/", DonnateurWrapper.class);

        return donnateurWrapper.getDonnateurs();
    }

    @RequestMapping("donnateurs/{id}")
    public Donnateur getDonnateur(@PathVariable long id) {
        Donnateur donnateur = restTemplate.getForObject("http://donor-center-service/donnateurs/" + id, Donnateur.class);
        return donnateur;
    }

    @RequestMapping("/blogs")
    public List<Blog> getAllBlogs() {
        BlogWrapper blogWrapper = restTemplate.getForObject("http://blog-request-service/blogs", BlogWrapper.class);
        return blogWrapper.getBlogs();
    }

    @RequestMapping("blogs/{id}")
    public Blog getBlog(@PathVariable long id) {
        Blog blog = restTemplate.getForObject("http://blog-request-service/blogs/" + id, Blog.class);
        return blog;
    }

    @RequestMapping("/demandes")
    public List<Demande> getAllDemandes() {
        DemandeWrapper demandeWrapper = restTemplate.getForObject("http://blog-request-service/demandes", DemandeWrapper.class);
        return demandeWrapper.getDemandes();
    }

    @RequestMapping("demandes/{id}")
    public Demande getDemande(@PathVariable long id) {
        Demande demande = restTemplate.getForObject("http://blog-request-service/demandes/" + id, Demande.class);
        return demande;
    }

    @RequestMapping("/centres")
    public List<Centre> getAllCentres() {
        return restTemplate.getForObject("http://donor-center-service/centres/", CentreWrapper.class).getCentres();
    }

    @RequestMapping("/centres/{id}")
    public Centre getCentre(@PathVariable long id) {
        return restTemplate.getForObject("http://donor-center-service/centres/" + id, Centre.class);
    }

    @RequestMapping("/centres/{id}/demandes")
    public List<Demande> getDemandesOfCentre(@PathVariable long id) {
        List<Demande> demandes = new ArrayList<>();
        DemandeWrapper demandeWrapper = restTemplate.getForObject("http://blog-request-service/demandes", DemandeWrapper.class);
        for (Demande demande : demandeWrapper.getDemandes()) {
            if (demande.getIdCentre() == id) {
                demandes.add(demande);
            }
        }
        return demandes;
    }

    @RequestMapping("/centres/{id}/stocks")
    public List<GroupSangCentre> getAllStocksOfCentre(@PathVariable long id) {

        List<GroupSangCentre> groupSangCentres = new ArrayList<>();

        GroupSangCentreIdsWrapper groupSangCentreIdsWrapper = restTemplate.getForObject("http://donor-center-service/centres/" + id + "/stocks", GroupSangCentreIdsWrapper.class); //Recupération des groupsangs du centres avec leurs quantités

        for (GroupSangCentreIds g : groupSangCentreIdsWrapper.getGroupSangCentreIds()) {
            GroupSang groupSang = restTemplate.getForObject("http://ville-sang-service/groupSangs/" + g.getIdGroupSang(), GroupSang.class);
            GroupSangCentre groupSangCentre = new GroupSangCentre();
            groupSangCentre.setGroupSang(groupSang);
            groupSangCentre.setQuantite(g.getQuantite());

            groupSangCentres.add(groupSangCentre);
        }
        return groupSangCentres;
    }

    @RequestMapping("groupSangs/{id}/demandes") //à completer dans blog service !!!!
    public List<Demande> getAllDemandesOfGroupSang(@PathVariable long id) {
        List<Demande> demandes = new ArrayList<>();
        DemandeWrapper demandeWrapper = restTemplate.getForObject("http://blog-request-service/demandes/", DemandeWrapper.class);
        for (Demande demande : demandeWrapper.getDemandes()) {
            if (demande.getIdGroupSang() == id) {
                demandes.add(demande);
            }
        }
        return demandes;
    }


}

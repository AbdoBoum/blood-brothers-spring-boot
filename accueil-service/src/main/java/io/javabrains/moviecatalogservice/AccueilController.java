package io.javabrains.moviecatalogservice;

import io.javabrains.moviecatalogservice.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AccueilController {
    @Autowired
    private RestTemplate restTemplate;

    //@Autowired
    //private WebClient.Builder webClientBuilder;

    @RequestMapping("/donnateurs")
    public List<Donnateur> getAllDonnateurs() {

        DonnateurWrapper donnateurWrapper = restTemplate.getForObject("http://donnateurcentre-service/donnateurs/",DonnateurWrapper.class);

        return donnateurWrapper.getDonnateurs();
    }

    @RequestMapping("donnateurs/{id}")
    public Donnateur getDonnateur(@PathVariable long id){
        Donnateur donnateur = restTemplate.getForObject("http://donnateurcentre-service/donnateurs/"+id,Donnateur.class);
        return donnateur;
    }

    @RequestMapping("/centres/{id}")
    public Centre getCentre(@PathVariable long id){
        return restTemplate.getForObject("http://donnateurcentre-service/centres/"+id,Centre.class);
    }

    @RequestMapping("/centres/{id}/stocks")
    public List<GroupSangCentre> getAllStocksOfCentre(@PathVariable long id){

        List<GroupSangCentre> groupSangCentres = new ArrayList<GroupSangCentre>();

        GroupSangCentreIdsWrapper groupSangCentreIdsWrapper = restTemplate.getForObject("http://donnateurcentre-service/centres/"+id+"/stocks",GroupSangCentreIdsWrapper.class); //Recupération des groupsangs du centres avec leurs quantités

        for(GroupSangCentreIds g : groupSangCentreIdsWrapper.getGroupSangCentreIds()){
            GroupSang groupSang = restTemplate.getForObject("http://villegroupsang-service/groupSangs/"+g.getIdGroupSang(),GroupSang.class);
            GroupSangCentre groupSangCentre = new GroupSangCentre();
            groupSangCentre.setGroupSang(groupSang);
            groupSangCentre.setQuantite(g.getQuantite());

            groupSangCentres.add(groupSangCentre);
        }
        return groupSangCentres;
    }

}

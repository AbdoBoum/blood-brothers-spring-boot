package com.blooddonation.donorcentrerequest.resources;

import com.blooddonation.donorcentrerequest.Entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private DonnateurRepository repository;

    @Autowired
    private StockRepository stockRepository;

    @RequestMapping("/donnateurs")
    public DonnateurWrapper getAllDonnateurs() {
        List<Donnateur> donnateurs = new ArrayList<>();
        repository.findAll().forEach(donnateurs::add);
        DonnateurWrapper donnateurWrapper = new DonnateurWrapper();
        donnateurWrapper.setDonnateurs(donnateurs);
        return donnateurWrapper;
    }

    @RequestMapping("/centres/{id}/stocks")
    public GroupSangCentreIdsWrapper getAllGroupSangsOfCentreId(@PathVariable long id) {
        GroupSangCentreIdsWrapper groupSangCentreIdsWrapper = new GroupSangCentreIdsWrapper();
        List<GroupSangCentreIds> listGroupSangsCentre = new ArrayList<GroupSangCentreIds>();
        List<Stock> allStocks = new ArrayList<Stock>();
        stockRepository.findAll().forEach(allStocks::add);
        for (Stock s : allStocks) {
            if (s.getCentreId() == id) {
                GroupSangCentreIds groupSangCentreIds = new GroupSangCentreIds();
                groupSangCentreIds.setIdGroupSang(s.getGroupeSangId());
                groupSangCentreIds.setQuantite(s.getQuantiteStock());
                listGroupSangsCentre.add(groupSangCentreIds);
            }
        }
        groupSangCentreIdsWrapper.setGroupSangCentreIds(listGroupSangsCentre);

        return groupSangCentreIdsWrapper;
    }
}

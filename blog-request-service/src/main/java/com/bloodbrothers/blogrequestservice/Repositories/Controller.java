package com.bloodbrothers.blogrequestservice.Repositories;

import com.bloodbrothers.blogrequestservice.Entities.Blog;
import com.bloodbrothers.blogrequestservice.Entities.BlogWrapper;
import com.bloodbrothers.blogrequestservice.Entities.Demande;
import com.bloodbrothers.blogrequestservice.Entities.DemandeWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private RequestRepository requestRepository;

    @RequestMapping("/blogs")
    public BlogWrapper getAllBlogs() {
        List<Blog> blogs = new ArrayList<>();
        blogRepository.findAll().forEach(blogs::add);
        BlogWrapper blogWrapper = new BlogWrapper();
        blogWrapper.setBlogs(blogs);
        return blogWrapper;
    }

    @RequestMapping("/demandes")
    public DemandeWrapper getAllDemandes() {
        List<Demande> demandes = new ArrayList<>();
        requestRepository.findAll().forEach(demandes::add);
        DemandeWrapper demandeWrapper = new DemandeWrapper();
        demandeWrapper.setDemandes(demandes);
        return demandeWrapper;
    }
}

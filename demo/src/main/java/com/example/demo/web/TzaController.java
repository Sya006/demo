package com.example.demo.web;

import com.example.demo.repository.ApplicationRepository;
import com.example.demo.service.ApplicationService;
import com.example.demo.service.ReleaseService;
import com.example.demo.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TzaController {

    private ApplicationService applicationService ;
    private ReleaseService releaseService ;
    private TicketService ticketService ;


    @Autowired
    public void setApplicationService(ApplicationService applicationService){

        this.applicationService = applicationService  ;
    }

    @Autowired
    public void setReleaseService(ReleaseService releaseService){
        this.releaseService = releaseService ;

    }

    @Autowired
   public void setTicketService(TicketService ticketService){
       this.ticketService = ticketService  ;

   }

   @GetMapping("/applications")
   public String retrieveApplications(Model model){

        model.addAttribute("applications", applicationService.ListApplication());

        return "applications" ;
   }

    @GetMapping("/Tickets")
    public String retrieveTickets(Model model ){

        model.addAttribute("tickets", ticketService.ListTicket()) ;
        return "tickets" ;
    }

    @GetMapping("/releases")
    public String retrieveReleases(Model model){

        model.addAttribute("releases", releaseService.ListRelease()) ;
        return "releases" ;
    }


}

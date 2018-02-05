package be.kokw.restclient.controllers;

import be.kokw.restclient.services.BookService;
import be.kokw.restclient.services.MemberService;
import be.kokw.restclient.services.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.ZoneId;

@Controller
public class ReserveController {
    @Autowired
    BookService bookService;
    @Autowired
    MemberService memberService;
    @Autowired
    ReserveService reserveService;

  /*  @GetMapping("reserve")
    public String handleGetReserve(){
        return "reserve/reserve";
    }

    @PostMapping
    public String handlePostReserve(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String title, @RequestParam String volume, @DateTimeFormat(pattern = "yyyy-MM-dd")@RequestParam LocalDate pickUpDate, ModelMap modelMap){
        modelMap.addAttribute("reserved", reserveService.reserveBook(memberService.findMemberByFirstNameAndLastName(firstName, lastName), bookService.findBookByTitleAndVolume(title, Integer.parseInt(volume)), pickUpDate));
        return "reserve/reservedBook";
    }
*/}

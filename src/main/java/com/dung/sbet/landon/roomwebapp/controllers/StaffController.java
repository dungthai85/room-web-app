package com.dung.sbet.landon.roomwebapp.controllers;

import com.dung.sbet.landon.roomwebapp.models.StaffMember;
import com.dung.sbet.landon.roomwebapp.services.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/staffs")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public String getAllStaff(Model model){
        model.addAttribute("staffs", staffService.getAllStaff());
        return "staffs";
    }
}

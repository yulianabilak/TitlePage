package com.bilak.titlepage.controller;

import com.bilak.titlepage.model.CourseProject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Yuliana
 * @version 1.0.0
 * @title Title page
 * @group 243Б(2)
 * @department PZKS
 * @project TitlePage
 * @class TitlePageController
 * @since 5/1/2022 - 20.14
 **/

@Controller
public class TitlePageController {

    @GetMapping("/form")
    public String getForm(Model model) {
        CourseProject courseProject = new CourseProject();

        //дефолтні значення для форми
        courseProject.setUniversity("Чернівецький національний університет імені Юрія Федьковича");
        courseProject.setDepartment("Програмного забезпечення комп'ютерних систем");
        courseProject.setDiscipline("Технології програмування Java");
        courseProject.setTopic("Аналіз динаміки показників фінансової звітності різних підприємств");
        courseProject.setYearOfStudy(2);
        courseProject.setGroup("243");
        courseProject.setSpecialtyCode("121");
        courseProject.setSpecialty("Інженерія програмного забезпечення");
        courseProject.setAuthor("Білак Ю.М.");
        courseProject.setAdvisor("Прохоров Г.В.");
        courseProject.setNormcontroller("Комісарчук В.В.");
        courseProject.setCity("Чернівці");
        courseProject.setYear(2022);

        model.addAttribute("courseProject", courseProject);
        return "form";
    }

    @PostMapping("/your-title-page")
    public String submitForm(@ModelAttribute("courseProject") CourseProject courseProject) {
        return "your-title-page";
    }
}

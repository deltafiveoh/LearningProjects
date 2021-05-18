package org.launchcode.skillstracker.skillscontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping
public class SkillsController {

    String options = "<select name = 'language'>" +
            "<option value = 'java'> Java </option>" +
            "<option value = 'python'> Python </option>" +
            "<option value = 'c++'> C++ </option>" +
            "<select name = 'language'>" +
            "</select>";

    @GetMapping
    public String start(){
        return  "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>List of Skills</h2>" +
                "<ol>" +
                "   <li>Java</li>" +
                "   <li>Python</li>" +
                "   <li>C++</li>" +
                "</ol>" +
                "</html>" +
                "</body>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillForm(){
        return "<form method='post'>" +
                "<input type = 'text' name='name'>" +
                "   Select first option" +
                "        <select name = 'opt1'> \n" +
                "            <option value = 'java'> Java </option> \n" +
                "            <option value = 'python'> Python </option> \n" +
                "            <option value = 'c++'> C++ </option> \n" +
                "            <select name = 'language'> \n" +
                "            </select>" +
                "   Select second option \n" +
                "        <select name = 'opt2'> \n" +
                "            <option value = 'java'> Java </option> \n" +
                "            <option value = 'python'> Python </option> \n" +
                "            <option value = 'c++'> C++ </option> \n" +
                "            <select name = 'language'> \n" +
                "            </select>" +
                "   Select third option \n" +
                "        <select name = 'opt3'> \n" +
                "            <option value = 'java'> Java </option> \n" +
                "            <option value = 'python'> Python </option> \n" +
                "            <option value = 'c++'> C++ </option> \n" +
                "            <select name = 'language'> \n" +
                "            </select>" +
                "<input type = 'submit' value = 'Select order' />" +
                "</form>";
    }

    @PostMapping
    public String skillMessage(@RequestParam String name, @RequestParam String opt1, @RequestParam String opt2, @RequestParam String opt3){

        if (name == null){
            name = "User";
        }

        String html = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>" + name + " List of Skills</h2>" +
                "<ol>" +
                "   <li>" + opt1 + "</li>" +
                "   <li>" + opt2 + "</li>" +
                "   <li>" + opt3 + "</li>" +
                "</ol>" +
                "</html>" +
                "</body>";

        return html;
    }

}

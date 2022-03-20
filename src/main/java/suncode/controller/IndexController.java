package suncode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import suncode.service.TableService;

@Controller
public class IndexController {
    private TableService tableService;

    public IndexController(TableService tableService) {
        this.tableService = tableService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("table", tableService.findDuplicateInColumn(0));
        return "index";
    }

    @PostMapping("/")
    public String select(Model model, @RequestParam("source") int source) {
        model.addAttribute("table", tableService.findDuplicateInColumn(source));
        return "table";
    }
}

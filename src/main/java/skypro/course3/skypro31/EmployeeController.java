package skypro.course3.skypro31;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping()
    public String welcome() {
        return "<span><b>Здарова Двоичные Черти! Создатель до сих пор мучается со спрингом.</b></span><br>" +
                "<img src=\"https://www.google.com/url?sa=i&url=https%3A%2F%2Flenta.ru%2Fnews%2F2021%2F09%2F15%2Ffull_master%2F&psig=AOvVaw05yull_x4kHr97ghTahueG&ust=1665187703540000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCLilj97pzPoCFQAAAAAdAAAAABAY\" alt=\"картинка черта\">";
    }
    @GetMapping(path = "/add")
    public String add(@RequestParam("name") String name, @RequestParam("surname") String surname) {
        return employeeService.addEmployee(name, surname);
    }
}

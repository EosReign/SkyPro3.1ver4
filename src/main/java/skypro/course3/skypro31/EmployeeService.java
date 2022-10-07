package skypro.course3.skypro31;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> arr = new ArrayList<Employee>();

    public String addEmployee(String name, String surname) {
        Employee employee = new Employee(name, surname);
        validateInput(name, surname);
        if (StringUtils.isAllLowerCase(name) || StringUtils.isAllLowerCase(surname)) {
            employee.setName(StringUtils.capitalize(name));
            employee.setSurname(StringUtils.capitalize(surname));
        }
        return employee.getFullName() + " успешно добавлен в лист";
    }

    private void validateInput(String name, String surname) throws BadRequestException {
        if (!(StringUtils.isAlpha(name) && StringUtils.isAlpha(surname))) {
            throw new BadRequestException();
        }
    }
}
//\

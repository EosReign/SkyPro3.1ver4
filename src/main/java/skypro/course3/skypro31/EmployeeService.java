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
        checkName(name);
        checkSurname(surname);
        if (StringUtils.isAllLowerCase(name)) {
            employee.setName(StringUtils.capitalize(name));
        }
        if (StringUtils.isAllLowerCase(surname)) {
            employee.setSurname(StringUtils.capitalize(surname));
        }
        return employee.getFullName() + "успешно добавлен в лист";

    }

    private void checkName(String name) throws BadRequestException {
        if (StringUtils.isWhitespace(name)) {
            throw new BadRequestException("400 Bad Request");
        } else if (StringUtils.isAlphanumericSpace(name)) {
            throw new BadRequestException("400 Bad Request");
        } else if (StringUtils.isAllUpperCase(name)) {
            throw new BadRequestException("400 Bad Request");
        }
    }

    private void checkSurname(String surname) throws BadRequestException {
        if (StringUtils.isWhitespace(surname)) {
            throw new BadRequestException("400 Bad Request");
        } else if (StringUtils.isAlphanumericSpace(surname)) {
            throw new BadRequestException("400 Bad Request");
        } else if (StringUtils.isAllUpperCase(surname)) {
            throw new BadRequestException("400 Bad Request");
        }
    }
}
//\

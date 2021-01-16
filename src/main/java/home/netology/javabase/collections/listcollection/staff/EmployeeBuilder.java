package home.netology.javabase.collections.listcollection.staff;

public class EmployeeBuilder {
    private Employee newEmployee;

    public EmployeeBuilder() {
        newEmployee = new Employee();
    }

    public EmployeeBuilder withName(String name){
        newEmployee.name = name;
        return this;
    }

    public EmployeeBuilder withSurname(String lastName){
        newEmployee.lastName = lastName;
        return this;
    }

    public EmployeeBuilder withAge(byte age){
        newEmployee.age = age;
        return this;
    }

    public EmployeeBuilder withGender(String gender){
        newEmployee.gender = gender;
        return this;
    }

    public EmployeeBuilder withEducation(String education){
        newEmployee.education = education;
        return this;
    }

    public EmployeeBuilder withPosition(String position){
        newEmployee.position = position;
        return this;
    }

    public EmployeeBuilder withDepartment(String department){
        newEmployee.department = department;
        return this;
    }

    public Employee build(){
        return newEmployee;
    }

}

package com.example.model;

public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", departmentId=" + departmentId +
                '}';
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.employee_id
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    private Integer employeeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.name
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.gender
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    private String gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.age
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.department_id
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    private Integer departmentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.employee_id
     *
     * @return the value of employee.employee_id
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.employee_id
     *
     * @param employeeId the value for employee.employee_id
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.name
     *
     * @return the value of employee.name
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.name
     *
     * @param name the value for employee.name
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.gender
     *
     * @return the value of employee.gender
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.gender
     *
     * @param gender the value for employee.gender
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.age
     *
     * @return the value of employee.age
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.age
     *
     * @param age the value for employee.age
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.department_id
     *
     * @return the value of employee.department_id
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.department_id
     *
     * @param departmentId the value for employee.department_id
     *
     * @mbggenerated Wed Jul 24 14:42:56 CST 2024
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod2assigninclass;

/**
 *
 * @author Johnson
 */
public class Employee {
    private String fn;
    private String ln;
    private double salary;

    public Employee(String fn, String ln, double salary) {
        this.fn = fn;
        this.ln = ln;
        this.salary = salary;
    }
    
    public String getFn() {
        return fn;
    }

    public String getLn() {
        return ln;
    }

    public double getSalary() {
        return salary;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public void setSalary(double salary) {
        if(salary > 0 ){
            this.salary = salary;
        }else{
            this.salary = Double.NaN;
        }
    }
    
}

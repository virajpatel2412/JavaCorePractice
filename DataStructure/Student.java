/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataStructure;

/**
 *
 * @author HP
 */
public class Student implements Comparable<Student> {
    private String name;
    private int en;
    
    Student(String name, int en){
        this.name = name;
        this.en = en;
    }
    
    public int getEn(){
        return this.en;
    }
    
    public String getname(){
        return this.name;
    }

    @Override
    public int compareTo(Student o){
        return (this.getEn() - o.getEn());
    }
    
    @Override
    public String toString(){
        return "Student { "+ this.name + ", "+this.en+" }";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass;

/**
 *
 * @author hp
 */
public class as {
    String name;
    int age;
    int phonNumber;

    public as(String name, int age, int phonNumber) {
        this.name = name;
        this.age = age;
        this.phonNumber = phonNumber;
    }
    
     public as(String name, int phonNumber) {
        this.name = name;
        this.phonNumber = phonNumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhonNumber() {
        return phonNumber;
    }

    public void setPhonNumber(int phonNumber) {
        this.phonNumber = phonNumber;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    public String tosString(){
        System.out.println("name :"+name +"age :"+age +"phonNumber :"+phonNumber);
        return null;
        
    }
    
    
    
    
    
    
    
}

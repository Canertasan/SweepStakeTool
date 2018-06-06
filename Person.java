/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nike.run.club;

/**
 *
 * @author canertasan
 */
public class Person {
   
   private String InstaName;

    public String getInstaName() {
        return InstaName;
    }

    

    public void setInstaName(String InstaName) {
        this.InstaName = InstaName;
    }
    public Person() {
        InstaName=" ";
    }

    public Person(String InstaName) {
        this.InstaName = InstaName;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *printing student details
 * @author Rache
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    template[] list=new template[3];//Array of objects
    template s1=new template();
    s1.setName("Rachel");
    s1.setAge(23);
    template s2=new template();
    s2.setName("Christian");
    s2.setAge(22);
    template s3=new template();
    s3.setName("Lucas");
    s3.setAge(24);
    list[0]=s1;
    list[1]=s2;
    list[2]=s3;
    
    for(int i=0; i<list.length; i++){
        System.out.println(list[i].getName()+" "+list[i].getAge());
    }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author elcan
 */
public class MenuUtil {
    public static void ProcressMenu(int inputMenu){
        
            switch (inputMenu) {
                case 1:
                    StudentUtil.registerStudents();
                    break;
                case 2:
                    StudentUtil.printAllStudentsRegistr();
                    break;
                case 3:
                    StudentUtil.findSudentsAndPrint();
                    break;
                case 4:
                    StudentUtil.uptadeStudent2();
                    break;
                default:
                    break;
            }
    }
    
}

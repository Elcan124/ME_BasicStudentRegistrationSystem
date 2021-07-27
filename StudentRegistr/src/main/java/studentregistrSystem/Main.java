/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistrSystem;

import Beans.Student;
import Util.InputUtil;
import Util.MenuUtil;
import Util.StudentUtil;
import java.util.Scanner;

/**
 *
 * @author elcan
 */
public class Main {

    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            menu = InputUtil.requireNumber(
                    "What do you want do do ? "
                    + "\n1. Registr Student:"
                    + "\n2. Show all Students:"
                    + "\n3. Find Student:"
                    + "\n4. Uptade Student");

   MenuUtil.ProcressMenu(menu);
        }
    }
}

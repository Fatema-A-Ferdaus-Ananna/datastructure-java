package staticNonstatic;

import lesson.javaBasic.Main;

public class StaticNonStatic {

    static int static_variable = 1;

    int nonStatic_variable1 = 4;
    int nonStatic_variable2 = 4;


    public static void nonstatic_field_access_by_creating_instance() {

        // static_variable_value_change_by_nonStatic_method(); ERROR
        StaticNonStatic instance_SN = new StaticNonStatic();

        System.out.println("Value of Static Variable[Default] : "+ static_variable );
        System.out.print("......................................."+"\n\n");
        int summation = instance_SN.static_variable_value_change_by_nonStatic_method();
        System.out.println("Summation of NonStatic Variables : "+ summation );
        System.out.print("Value of Static Variable : "+ static_variable + "\n");

    }

    public static void static_access_static(){
        static_variable_value_change_by_static_method();
        System.out.print("Value of Static Variable : "+ static_variable);
    }


    public int static_variable_value_change_by_nonStatic_method(){
        static_variable = 3;
        return (nonStatic_variable1 + nonStatic_variable2);

    }


    public static void static_variable_value_change_by_static_method(){
        static_variable = 5;
        //int = nonStatic_variable1 + nonStatic_variable2; ERROR
    }

}

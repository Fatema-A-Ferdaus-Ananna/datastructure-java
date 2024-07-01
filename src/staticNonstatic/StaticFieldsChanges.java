package staticNonstatic;

public class StaticFieldsChanges {

    static int variable1 = 0; //will get memory only once and retain its value
    int variable2 = 0;  //will get memory each time when the instance is created

    static String variable_string1 = "FAFA"; //will get memory only once and retain its value
    String variable_string2;  //will get memory each time when the instance is created


    public void increment_nonstatic_value(){
        variable2++;
        System.out.print("Incrementing Value of Nonstatic Variable " + variable2 + "\n");
    }

    public static void increment_static_value(){
        variable1++;
        System.out.print("Incrementing Value of Static Variable " + variable1 + "\n");
    }

    public void fieldsChanges(){
        System.out.println("\n#############################################");
        StaticFieldsChanges instance_SF1 = new StaticFieldsChanges(); // instance is created
        instance_SF1.increment_nonstatic_value();
        StaticFieldsChanges instance_SF2 = new StaticFieldsChanges(); // instance is created
        instance_SF2.increment_nonstatic_value();
        StaticFieldsChanges instance_SF3 = new StaticFieldsChanges(); // instance is created
        instance_SF3.increment_nonstatic_value();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

        StaticFieldsChanges instance_static_SF1 = new StaticFieldsChanges(); // instance is created
        instance_static_SF1.increment_static_value();
        StaticFieldsChanges instance_static_SF2 = new StaticFieldsChanges(); // instance is created
        instance_static_SF2.increment_static_value();
        StaticFieldsChanges instance_static_SF3 = new StaticFieldsChanges(); // instance is created
        instance_SF3.increment_static_value();

        System.out.println("#############################################\n");
        System.out.println("\n#############################################");

        StaticFieldsChanges instance_common1 = new StaticFieldsChanges(); // instance is created
        instance_common1.common_value(10, "Ananna");
        StaticFieldsChanges instance_common2 = new StaticFieldsChanges(); // instance is created
        instance_common2.common_value(20, "Fatama");

        System.out.println("#############################################");
    }


    public void common_value(int variable2, String variable_string2){
        //Java static property is shared to all objects.
        //If if there is a common property EX: College, Company etc
        // We can make it static, this field will get the memory only once
        // or else will get memory each time when the object is created.
        this.variable2 = variable2;
        this.variable_string2 = variable_string2;

        System.out.println("UniqueNumber  "  + "  UniqueName  "  + "  Common Value");
        System.out.println("     "+variable2  + "          " + variable_string2  + "          " + variable_string1);
    }

}

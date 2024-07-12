package staticNonstatic;

public class StaticNonstaticMain {
    public static void main(String[] args) {

        StaticNonStatic instance_SN = new StaticNonStatic();
        StaticNonStatic.nonstatic_field_access_by_creating_instance();
        StaticNonStatic.static_access_static();

        StaticFieldsChanges instance_SF = new StaticFieldsChanges();
        instance_SF.fieldsChanges();
    }
}
